import org.antlr.v4.runtime.*;
import generated.*;
import parser.AlphaParser;

public class Main {
    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromFileName("test.txt");
            AlphaLexer lexer = new  AlphaLexer(input);

            AlphaParser parser = new AlphaParser(lexer);

            parser.program();

            // TODO:
            System.out.println("Compilation ended!");

            /*Token token;
            while ((token = lexer.nextToken()).getType() != Token.EOF) {
                System.out.println(
                        "Token: " + lexer.getVocabulary().getSymbolicName(token.getType()) +
                                " | Text: \"" + token.getText() + "\"");
            };
            */
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}