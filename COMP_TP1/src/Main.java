import org.antlr.runtime.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
    	System.out.println("Start");
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        parser.doc();
    }
}
