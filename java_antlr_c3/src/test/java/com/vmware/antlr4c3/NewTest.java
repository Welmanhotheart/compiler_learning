package com.vmware.antlr4c3;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenSource;
import org.junit.Test;

/***
 * TODO
 * @author <a href="zhiwei.wei@bintools.cn">zhiwei.wei</a>
 * @version 1.0.0 2021-07-2021/7/27-下午2:54
 */
public class NewTest {
    public static final char triggerChar = '^';
    protected CodeCompletionCore.CandidatesCollection c3(String sqlWithCaret){
        int pos = sqlWithCaret.indexOf(triggerChar);
        if (-1 == pos){
            throw new IllegalArgumentException("must has trigger character");
        }
        String _new = sqlWithCaret.substring(0, pos)+sqlWithCaret.substring(pos+1);

        CommonTokenStream ts = new CommonTokenStream(new ExprLexer(CharStreams.fromString(_new)));
        ExprParser parser = new ExprParser(ts);
        ExprParser.ExpressionContext root = parser.expression();
//        root.get
        CodeCompletionCore ccc = null;
        return ccc.collectCandidates(pos, root);
        //return null;
    }
    @Test
    public void basic(){
        String s1 = "var a=b^+c";
    }
}