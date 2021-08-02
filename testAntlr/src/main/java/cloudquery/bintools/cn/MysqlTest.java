package cloudquery.bintools.cn;

import com.vmware.antlr4c3.CodeCompletionCore;
import mysql.MySQLStatementLexer;
import mysql.MySQLStatementParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

/***
 * TODO
 * @author <a href="zhiwei.wei@bintools.cn">zhiwei.wei</a>
 * @version 1.0.0 2021-08-2021/8/2-下午8:11
 */
public class MysqlTest {
    public static final char triggerChar = '^';
    protected CodeCompletionCore.CandidatesCollection c3(String sqlWithCaret){
        int pos = sqlWithCaret.indexOf(triggerChar);
        if (-1 == pos) {
            throw new IllegalArgumentException("must has trigger character");
        }
        String _new = sqlWithCaret.substring(0, pos)+sqlWithCaret.substring(pos+1);
        System.out.println("expr:" + _new);
        CommonTokenStream ts = new CommonTokenStream(new MySQLStatementLexer(CharStreams.fromString(_new)));

        MySQLStatementParser parser = new MySQLStatementParser(ts);
//        parser.setErrorHandler(new BailErrorRecoverStrategy());
//        ExprParser.ExpressionContext root = parser.expression();
//        CodeCompletionCore ccc = new CodeCompletionCore(parser, null, null);
//        CodeCompletionCore.CandidatesCollection candidatesCollection = ccc.collectCandidates(pos-1, root);
//
//        System.out.println("find candidates");
//        return candidatesCollection;
        return null;
    }

//    private

    @Test
    public void basic(){
        String s1 = "select * from t";
        CodeCompletionCore.CandidatesCollection candidatesCollection = c3(s1);
        System.out.println(candidatesCollection.rulePositions);
    }
}