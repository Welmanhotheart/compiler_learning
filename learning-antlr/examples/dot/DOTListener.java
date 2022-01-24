// Generated from DOT.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface DOTListener extends ParseTreeListener {
	void enterNode_stmt(DOTParser.Node_stmtContext ctx);
	void exitNode_stmt(DOTParser.Node_stmtContext ctx);

	void enterEdge_stmt(DOTParser.Edge_stmtContext ctx);
	void exitEdge_stmt(DOTParser.Edge_stmtContext ctx);

	void enterGraph(DOTParser.GraphContext ctx);
	void exitGraph(DOTParser.GraphContext ctx);

	void enterA_list(DOTParser.A_listContext ctx);
	void exitA_list(DOTParser.A_listContext ctx);

	void enterAttr_list(DOTParser.Attr_listContext ctx);
	void exitAttr_list(DOTParser.Attr_listContext ctx);

	void enterAttr_stmt(DOTParser.Attr_stmtContext ctx);
	void exitAttr_stmt(DOTParser.Attr_stmtContext ctx);

	void enterEdgeRHS(DOTParser.EdgeRHSContext ctx);
	void exitEdgeRHS(DOTParser.EdgeRHSContext ctx);

	void enterEdgeop(DOTParser.EdgeopContext ctx);
	void exitEdgeop(DOTParser.EdgeopContext ctx);

	void enterPort(DOTParser.PortContext ctx);
	void exitPort(DOTParser.PortContext ctx);

	void enterSubgraph(DOTParser.SubgraphContext ctx);
	void exitSubgraph(DOTParser.SubgraphContext ctx);

	void enterStmt_list(DOTParser.Stmt_listContext ctx);
	void exitStmt_list(DOTParser.Stmt_listContext ctx);

	void enterId(DOTParser.IdContext ctx);
	void exitId(DOTParser.IdContext ctx);

	void enterStmt(DOTParser.StmtContext ctx);
	void exitStmt(DOTParser.StmtContext ctx);

	void enterNode_id(DOTParser.Node_idContext ctx);
	void exitNode_id(DOTParser.Node_idContext ctx);
}