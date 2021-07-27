package cloudquery.bintools.cn.error;

import mysql.MySQLStatementLexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.LexerNoViableAltException;

/***
 * TODO
 * @author <a href="zhiwei.wei@bintools.cn">zhiwei.wei</a>
 * @version 1.0.0 2021-07-2021/7/26-下午8:24
 */
public class BailSimpleLexer extends MySQLStatementLexer {

    public BailSimpleLexer(CharStream input) {
        super(input);
    }

    @Override
    public void recover(LexerNoViableAltException e) {
//        super.recover(e);
    }
}