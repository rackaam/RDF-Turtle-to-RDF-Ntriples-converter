import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
 
public class Main {
    public static void main(String[] args) throws Exception {
    	System.out.println("RDF/Turtle + CtrlD:");
        
    	// v1
    	/*ANTLRInputStream input = new ANTLRInputStream(System.in);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);
        parser.doc();*/
    	
    	// v2
        /*ANTLRInputStream input = new ANTLRInputStream(System.in);
        ExprASTLexer lexer = new ExprASTLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprASTParser parser = new ExprASTParser(tokens);
        ExprASTParser.doc_return r = parser.doc();
        
        CommonTree t = (CommonTree)r.getTree();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
        ExprASTWalker walker = new ExprASTWalker(nodes);
        walker.doc();*/
        
    	// v2.1
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        ExprASTLexer lexer = new ExprASTLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprASTParser parser = new ExprASTParser(tokens);
        ExprASTParser.doc_return r = parser.doc();
        
        CommonTree t = (CommonTree)r.getTree();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
        ExprASTWalkerNbDescription walker = new ExprASTWalkerNbDescription(nodes);
        walker.doc();
    }
}
