import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.misc.OrderedHashMap;
import java.util.*;
public class TestPropertyFile {
    public static void main(String[] args) throws Exception{
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        PropertyFileLexer lexer = new PropertyFileLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PropertyFilePrinter parser = new PropertyFilePrinter(tokens);
        ParseTree tree= parser.file(); // launch our special version of the parser
        ParseTreeWalker walker = new ParseTreeWalker();
// create listener then feed to walker
        PropertyFileLoader loader = new PropertyFileLoader();
        walker.walk(loader, tree); // walk parse tree
        System.out.println(loader.props); // print results
    }


    public static class PropertyFileLoader extends PropertyFileBaseListener {
        Map<String,String> props = new OrderedHashMap<String, String>();
        public void exitProp(PropertyFileParser.PropContext ctx) {
            String id = ctx.ID().getText(); // prop : ID '=' STRING '\n' ;
            String value = ctx.STRING().getText();
            props.put(id, value);
        }
    }

}







class PropertyFilePrinter extends PropertyFileParser {
    public PropertyFilePrinter(TokenStream input) {
        super(input);
    }
    void defineProperty(Token name, Token value) {
        System.out.println(name.getText()+"="+value.getText());
    }
}


class PropertyFileLoader extends PropertyFileParser {
    public PropertyFileLoader(TokenStream input) {
        super(input);
    }
    Map<String,String> props = new OrderedHashMap<String, String>();
    void defineProperty(Token name, Token value) {
        props.put(name.getText(), value.getText());
    }
}