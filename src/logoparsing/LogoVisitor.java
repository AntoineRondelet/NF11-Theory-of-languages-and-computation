// Generated from grammar/Logo.g4 by ANTLR 4.6

  package logoparsing;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LogoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LogoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LogoParser#programme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramme(LogoParser.ProgrammeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#liste_instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListe_instructions(LogoParser.Liste_instructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#fonction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFonction(LogoParser.FonctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#liste_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListe_variables(LogoParser.Liste_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#liste_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListe_expr(LogoParser.Liste_exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code av}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAv(LogoParser.AvContext ctx);
	/**
	 * Visit a parse tree produced by the {@code td}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTd(LogoParser.TdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tg}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTg(LogoParser.TgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lc}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLc(LogoParser.LcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bc}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBc(LogoParser.BcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ve}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVe(LogoParser.VeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code re}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRe(LogoParser.ReContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fcc}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFcc(LogoParser.FccContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fpos}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFpos(LogoParser.FposContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repete}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepete(LogoParser.RepeteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code donne}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDonne(LogoParser.DonneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code si}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSi(LogoParser.SiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tantque}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTantque(LogoParser.TantqueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code appelproc}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppelproc(LogoParser.AppelprocContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rends}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRends(LogoParser.RendsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code appelfonc}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppelfonc(LogoParser.AppelfoncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(LogoParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nb}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNb(LogoParser.NbContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(LogoParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(LogoParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthese}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthese(LogoParser.ParentheseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sum}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(LogoParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code power}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(LogoParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hasard}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHasard(LogoParser.HasardContext ctx);
	/**
	 * Visit a parse tree produced by {@link LogoParser#exprbool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprbool(LogoParser.ExprboolContext ctx);
}