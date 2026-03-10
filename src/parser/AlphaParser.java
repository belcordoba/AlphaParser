package parser;

import generated.AlphaLexer;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class AlphaParser {
    private AlphaLexer theScanner;
    private Token actualToken;
    private List<String> errors;

    public AlphaParser(AlphaLexer theScanner) {
        this.theScanner = theScanner;
        this.actualToken = this.theScanner.nextToken();
        this.errors = new ArrayList<>();
    }

    private void acceptToken(int expectedToken) {
        if (this.actualToken.getType() != expectedToken) {
            reportError(expectedToken);
        }
        this.actualToken = this.theScanner.nextToken();
    }

    public void program() {
        singleCommand();
    }

    private void command() {
        singleCommand();
        while (this.actualToken.getType() == AlphaLexer.SEMI){
            acceptToken(AlphaLexer.SEMI);
            singleCommand();
        }
    }

    private void singleCommand() {
        if (this.actualToken.getType()==AlphaLexer.ID) {
            acceptToken(AlphaLexer.ID);
            if (this.actualToken.getType() == AlphaLexer.ASSIGN) {
                acceptToken(AlphaLexer.ASSIGN);
                expression();
            } else if (this.actualToken.getType() == AlphaLexer.LEFTP) {
                acceptToken(AlphaLexer.LEFTP);
                expression();
                acceptToken(AlphaLexer.RIGHTP);
            } else {
                reportError(AlphaLexer.ASSIGN, AlphaLexer.LEFTP);
            }
        } else if (this.actualToken.getType()==AlphaLexer.IF) {
            acceptToken(AlphaLexer.IF);
            expression();
            acceptToken(AlphaLexer.THEN);
            singleCommand();
            // lo siguiente se podría hacer opcional si el siguiente token es ELSE, pero en este caso se hace obligatorio, porque la gramática así lo solicita
            acceptToken(AlphaLexer.ELSE);
            singleCommand();
        } else if (this.actualToken.getType()==AlphaLexer.WHILE) {
            acceptToken(AlphaLexer.WHILE);
            expression();
            acceptToken(AlphaLexer.DO);
            singleCommand();
        } else if (this.actualToken.getType()==AlphaLexer.LET) {
            acceptToken(AlphaLexer.LET);
            declaration();
            acceptToken(AlphaLexer.IN);
            singleCommand();
        } else if (this.actualToken.getType()==AlphaLexer.BEGIN) {
            acceptToken(AlphaLexer.BEGIN);
            command();
            acceptToken(AlphaLexer.END);
        } else {
            reportError(
                    AlphaLexer.ID,
                    AlphaLexer.IF,
                    AlphaLexer.WHILE,
                    AlphaLexer.LET,
                    AlphaLexer.BEGIN
            );
        }
    }

    private void declaration() {
        singleDeclaration();
        while (this.actualToken.getType() == AlphaLexer.SEMI) {
            acceptToken(AlphaLexer.SEMI);
            singleDeclaration();
        }
    }

    private void singleDeclaration() {
        if (this.actualToken.getType()==AlphaLexer.CONST) {
            acceptToken(AlphaLexer.CONST);
            acceptToken(AlphaLexer.ID);
            acceptToken(AlphaLexer.TILDE);
            expression();
        } else if (this.actualToken.getType()==AlphaLexer.VAR) {
            acceptToken(AlphaLexer.VAR);
            acceptToken(AlphaLexer.ID);
            acceptToken(AlphaLexer.COLON);
            typeDenoter();
        } else {
            reportError(AlphaLexer.CONST, AlphaLexer.VAR);
        }
    }

    private void typeDenoter() {
        acceptToken(AlphaLexer.ID);
    }

    private void expression() {
        primaryExpression();
        while (isOperator(this.actualToken.getType())) {
            operator();
            primaryExpression();
        }
    }

    private boolean isOperator(int tokenType) {
        return tokenType == AlphaLexer.ADD ||
                tokenType == AlphaLexer.SUB ||
                tokenType == AlphaLexer.MUL ||
                tokenType == AlphaLexer.DIV ||
                tokenType == AlphaLexer.MOD ||
                tokenType == AlphaLexer.EQEQ ||
                tokenType == AlphaLexer.NOTEQ ||
                tokenType == AlphaLexer.LESS ||
                tokenType == AlphaLexer.MORET ||
                tokenType == AlphaLexer.LESSEQ ||
                tokenType == AlphaLexer.MOREEQ;
    }

    private void primaryExpression() {
        if (this.actualToken.getType() == AlphaLexer.INTLIT) {
            acceptToken(AlphaLexer.INTLIT);

        } else if (this.actualToken.getType() == AlphaLexer.ID) {
            acceptToken(AlphaLexer.ID);

        } else if (this.actualToken.getType() == AlphaLexer.LEFTP) {
            acceptToken(AlphaLexer.LEFTP);
            expression();
            acceptToken(AlphaLexer.RIGHTP);

        } else {
            reportError(AlphaLexer.INTLIT, AlphaLexer.ID, AlphaLexer.LEFTP);
        }
    }

     private void operator() {
         switch (this.actualToken.getType()) {
             case AlphaLexer.ADD:
                 acceptToken(AlphaLexer.ADD);
                 break;
             case AlphaLexer.SUB:
                 acceptToken(AlphaLexer.SUB);
                 break;
             case AlphaLexer.MUL:
                 acceptToken(AlphaLexer.MUL);
                 break;
             case AlphaLexer.DIV:
                 acceptToken(AlphaLexer.DIV);
                 break;
             case AlphaLexer.MOD:
                 acceptToken(AlphaLexer.MOD);
                 break;
             case AlphaLexer.EQEQ:
                 acceptToken(AlphaLexer.EQEQ);
                 break;
             case AlphaLexer.NOTEQ:
                 acceptToken(AlphaLexer.NOTEQ);
                 break;
             case AlphaLexer.LESS:
                 acceptToken(AlphaLexer.LESS);
                 break;
             case AlphaLexer.MORET:
                 acceptToken(AlphaLexer.MORET);
                 break;
             case AlphaLexer.LESSEQ:
                 acceptToken(AlphaLexer.LESSEQ);
                 break;
             case AlphaLexer.MOREEQ:
                 acceptToken(AlphaLexer.MOREEQ);
                 break;
             default:
                 reportError(
                         AlphaLexer.ADD,
                         AlphaLexer.SUB,
                         AlphaLexer.MUL,
                         AlphaLexer.DIV,
                         AlphaLexer.MOD,
                         AlphaLexer.EQEQ,
                         AlphaLexer.NOTEQ,
                         AlphaLexer.LESS,
                         AlphaLexer.MORET,
                         AlphaLexer.LESSEQ,
                         AlphaLexer.MOREEQ
                 );
         }
    }

    private void reportError(int expectedToken) {
        String expected = tokenName(expectedToken);
        String found = tokenName(this.actualToken.getType());
        String text = this.actualToken.getText();

        errors.add(
                "Error en fila " + this.actualToken.getLine() +
                        ", columna " + this.actualToken.getCharPositionInLine() +
                        ": se esperaba " + expected +
                        " pero se encontró \"" + text + "\" (" + found + ")"
        );
    }

    private void reportError(int... expectedTokens) {
        StringBuilder expectedList = new StringBuilder();

        for (int i = 0; i < expectedTokens.length; i++) {
            expectedList.append(tokenName(expectedTokens[i]));
            if (i < expectedTokens.length - 1) {
                expectedList.append(", ");
            }
        }

        String found = tokenName(this.actualToken.getType());
        String text = this.actualToken.getText();

        errors.add(
                "Error en fila " + this.actualToken.getLine() +
                        ", columna " + this.actualToken.getCharPositionInLine() +
                        ": se esperaba uno de [" + expectedList + "]" +
                        " pero se encontró \"" + text + "\" (" + found + ")"
        );
    }

    private String tokenName(int tokenType) {
        if (tokenType == Token.EOF) {
            return "EOF";
        }

        String symbolic = theScanner.getVocabulary().getSymbolicName(tokenType);
        if (symbolic != null) {
            return symbolic;
        }

        String literal = theScanner.getVocabulary().getLiteralName(tokenType);
        if (literal != null) {
            return literal;
        }

        return "TOKEN_DESCONOCIDO";
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public List<String> getErrors() {
        return errors;
    }

    public int getErrorCount() {
        return errors.size();
    }
}