package cloudquery.bintools.cn.error;

import mysql.MySQLStatementLexer;
import mysql.MySQLStatementParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/***
 * TODO
 * @author <a href="zhiwei.wei@bintools.cn">zhiwei.wei</a>
 * @version 1.0.0 2021-07-2021/7/26-下午5:54
 */
public class MysqlParser {

    public MySQLStatementParser.ExecuteContext parse(String createTableSql) {
        CharStream stream = CharStreams.fromString(createTableSql);
        BailSimpleLexer lexer = new BailSimpleLexer(stream);
        CommonTokenStream token = new CommonTokenStream(lexer);
        MySQLStatementParser parser = new MySQLStatementParser(token);
        parser.setErrorHandler(new BailErrorRecoverStrategy());
        parser.removeErrorListeners();
        MySQLStatementParser.ExecuteContext execute = parser.execute();
        return execute;

    }
}