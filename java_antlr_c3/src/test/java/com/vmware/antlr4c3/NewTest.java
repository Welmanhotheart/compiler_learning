package com.vmware.antlr4c3;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.Test;

/***
 * TODO
 * @author <a href="zhiwei.wei@bintools.cn">zhiwei.wei</a>
 * @version 1.0.0 2021-07-2021/7/27-下午2:54
 * //error stragety : https://github.com/tunnelvisionlabs/antlrworks2/blob/master/works.editor.antlr4/src/org/antlr/works/editor/antlr4/completion/CodeCompletionErrorStrategy.java
 *
 */
public class NewTest {
    public static final char triggerChar = '^';
    protected CodeCompletionCore.CandidatesCollection c3(String sqlWithCaret){
        int pos = sqlWithCaret.indexOf(triggerChar);
        if (-1 == pos) {
            throw new IllegalArgumentException("must has trigger character");
        }
        String _new = sqlWithCaret.substring(0, pos)+sqlWithCaret.substring(pos+1);
        System.out.println("expr:" + _new);
        CommonTokenStream ts = new CommonTokenStream(new ExprLexer(CharStreams.fromString(_new)));

        ExprParser parser = new ExprParser(ts);
        parser.setErrorHandler(new BailErrorRecoverStrategy());
        ExprParser.ExpressionContext root = parser.expression();
        CodeCompletionCore ccc = new CodeCompletionCore(parser, null, null);
        CodeCompletionCore.CandidatesCollection candidatesCollection = ccc.collectCandidates(pos-1, root);

        System.out.println("find candidates");
        return candidatesCollection;
    }

//    private

    @Test
    public void basic(){
        String s1 = "var a=bcd()^+ c";
        CodeCompletionCore.CandidatesCollection candidatesCollection = c3(s1);
        System.out.println(candidatesCollection.rulePositions);
    }
}