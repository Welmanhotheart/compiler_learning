package cloudquery.bintools.cn.error;

import mysql.MySQLStatementParser;

/***
 * TODO
 * @author <a href="zhiwei.wei@bintools.cn">zhiwei.wei</a>
 * @version 1.0.0 2021-07-2021/7/26-下午5:58
 */
public class TestErrorRecoverStrategy {
    public static void main(String[] args) {
        MysqlParser parser = new MysqlParser();
        MySQLStatementParser.ExecuteContext parse = parser.parse("select aa.");
        System.out.println("klasjdf");
    }
}