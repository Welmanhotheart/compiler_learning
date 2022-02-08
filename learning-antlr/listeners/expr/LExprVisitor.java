// Generated from LExpr.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LExprParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(LExprParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link LExprParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(LExprParser.EContext ctx);
}