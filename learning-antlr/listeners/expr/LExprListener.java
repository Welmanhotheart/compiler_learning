// Generated from LExpr.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LExprParser}.
 */
public interface LExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LExprParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(LExprParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link LExprParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(LExprParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link LExprParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(LExprParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link LExprParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(LExprParser.EContext ctx);
}