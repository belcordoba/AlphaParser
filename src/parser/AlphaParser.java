package parser;

import generated.AlphaLexer;
import org.antlr.v4.runtime.Token;

public class AlphaParser {
    private AlphaLexer theScanner;
    private Token actualToken;

    public AlphaParser(AlphaLexer theScanner) {
        this.theScanner = theScanner;
        this.actualToken = this.theScanner.nextToken();
    }

    private void acceptToken(int expectedToken) {
        if (this.actualToken.getType() != expectedToken) {
            System.out.println("Error significativo con fila y columna");
            // TODO: para todos los errores, en vez de sout agregarlos a una lista de errores que se usará luego para imrpirimirlos, como un método privado reportError. En otro tipo de errores a veces si se va a hacer un método para reportar el error, ese método espera que venga el expectedToken, y puede suceder que no sea solo un expected, si no múltiples, por lo que va a necesitar una lista de todos los expected para poder crear un string con toda esta lista y poder crear el error.
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
                System.out.println("Reporte de error como los otros");
                // TODO: cambiar el reporte de error
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
            System.out.println("Reportar un error con la función a crear");
            // TODO: este error puede llevar varios tokens esperados
        }
    }

    private void declaration() {
        // TODO: terminar este y el resto de reglas
    }

    private void singleDeclaration() {

    }

    private void typeDenoter() {

    }

    private void expression() {

    }

    private void primaryExpression() {

    }

     private void operator() {

    }
}