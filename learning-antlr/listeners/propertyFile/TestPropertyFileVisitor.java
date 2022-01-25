import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.misc.OrderedHashMap;
import java.util.*;
public class TestPropertyFileVisitor  {
    public static void main(String[] args) throws Exception{
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        PropertyFileLexer lexer = new PropertyFileLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PropertyFilePrinter parser = new PropertyFilePrinter(tokens);
        ParseTree tree= parser.file(); // launch our special version of the parser
        PropertyFileVisitor loader = new PropertyFileVisitor();
        loader.visit(tree);
        System.out.println(loader.props);
    }


    public static class PropertyFileVisitor extends
            PropertyFileBaseVisitor<Void>
    {
        Map<String,String> props = new OrderedHashMap<String, String>();
        public Void visitProp(PropertyFileParser.PropContext ctx) {
            String id = ctx.ID().getText(); // prop : ID '=' STRING '\n' ;
            String value = ctx.STRING().getText();
            props.put(id, value);
            return null; // Java says must return something even when Void
        }
    }

}