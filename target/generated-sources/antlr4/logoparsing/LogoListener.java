// Generated from Logo.g4 by ANTLR 4.4

  package logoparsing;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogoParser}.
 */
public interface LogoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code bc}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterBc(@NotNull LogoParser.BcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bc}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitBc(@NotNull LogoParser.BcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMult(@NotNull LogoParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMult(@NotNull LogoParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fcc}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterFcc(@NotNull LogoParser.FccContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fcc}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitFcc(@NotNull LogoParser.FccContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthese}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenthese(@NotNull LogoParser.ParentheseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthese}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenthese(@NotNull LogoParser.ParentheseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sum}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSum(@NotNull LogoParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sum}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSum(@NotNull LogoParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#liste_variables}.
	 * @param ctx the parse tree
	 */
	void enterListe_variables(@NotNull LogoParser.Liste_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#liste_variables}.
	 * @param ctx the parse tree
	 */
	void exitListe_variables(@NotNull LogoParser.Liste_variablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code donne}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterDonne(@NotNull LogoParser.DonneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code donne}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitDonne(@NotNull LogoParser.DonneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sup}
	 * labeled alternative in {@link LogoParser#exprbool}.
	 * @param ctx the parse tree
	 */
	void enterSup(@NotNull LogoParser.SupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sup}
	 * labeled alternative in {@link LogoParser#exprbool}.
	 * @param ctx the parse tree
	 */
	void exitSup(@NotNull LogoParser.SupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repete}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterRepete(@NotNull LogoParser.RepeteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repete}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitRepete(@NotNull LogoParser.RepeteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code si}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterSi(@NotNull LogoParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code si}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitSi(@NotNull LogoParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loop}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull LogoParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loop}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull LogoParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code power}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPower(@NotNull LogoParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code power}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPower(@NotNull LogoParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#programme}.
	 * @param ctx the parse tree
	 */
	void enterProgramme(@NotNull LogoParser.ProgrammeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#programme}.
	 * @param ctx the parse tree
	 */
	void exitProgramme(@NotNull LogoParser.ProgrammeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fpos}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterFpos(@NotNull LogoParser.FposContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fpos}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitFpos(@NotNull LogoParser.FposContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infegal}
	 * labeled alternative in {@link LogoParser#exprbool}.
	 * @param ctx the parse tree
	 */
	void enterInfegal(@NotNull LogoParser.InfegalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infegal}
	 * labeled alternative in {@link LogoParser#exprbool}.
	 * @param ctx the parse tree
	 */
	void exitInfegal(@NotNull LogoParser.InfegalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inf}
	 * labeled alternative in {@link LogoParser#exprbool}.
	 * @param ctx the parse tree
	 */
	void enterInf(@NotNull LogoParser.InfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inf}
	 * labeled alternative in {@link LogoParser#exprbool}.
	 * @param ctx the parse tree
	 */
	void exitInf(@NotNull LogoParser.InfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code egal}
	 * labeled alternative in {@link LogoParser#exprbool}.
	 * @param ctx the parse tree
	 */
	void enterEgal(@NotNull LogoParser.EgalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code egal}
	 * labeled alternative in {@link LogoParser#exprbool}.
	 * @param ctx the parse tree
	 */
	void exitEgal(@NotNull LogoParser.EgalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#liste_expr}.
	 * @param ctx the parse tree
	 */
	void enterListe_expr(@NotNull LogoParser.Liste_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#liste_expr}.
	 * @param ctx the parse tree
	 */
	void exitListe_expr(@NotNull LogoParser.Liste_exprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVar(@NotNull LogoParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVar(@NotNull LogoParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code diff}
	 * labeled alternative in {@link LogoParser#exprbool}.
	 * @param ctx the parse tree
	 */
	void enterDiff(@NotNull LogoParser.DiffContext ctx);
	/**
	 * Exit a parse tree produced by the {@code diff}
	 * labeled alternative in {@link LogoParser#exprbool}.
	 * @param ctx the parse tree
	 */
	void exitDiff(@NotNull LogoParser.DiffContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#procedure}.
	 * @param ctx the parse tree
	 */
	void enterProcedure(@NotNull LogoParser.ProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#procedure}.
	 * @param ctx the parse tree
	 */
	void exitProcedure(@NotNull LogoParser.ProcedureContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ve}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterVe(@NotNull LogoParser.VeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ve}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitVe(@NotNull LogoParser.VeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code td}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterTd(@NotNull LogoParser.TdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code td}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitTd(@NotNull LogoParser.TdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#liste_instructions}.
	 * @param ctx the parse tree
	 */
	void enterListe_instructions(@NotNull LogoParser.Liste_instructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#liste_instructions}.
	 * @param ctx the parse tree
	 */
	void exitListe_instructions(@NotNull LogoParser.Liste_instructionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tg}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterTg(@NotNull LogoParser.TgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tg}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitTg(@NotNull LogoParser.TgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code re}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterRe(@NotNull LogoParser.ReContext ctx);
	/**
	 * Exit a parse tree produced by the {@code re}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitRe(@NotNull LogoParser.ReContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tantque}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterTantque(@NotNull LogoParser.TantqueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tantque}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitTantque(@NotNull LogoParser.TantqueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nb}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNb(@NotNull LogoParser.NbContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nb}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNb(@NotNull LogoParser.NbContext ctx);
	/**
	 * Enter a parse tree produced by {@link LogoParser#appelproc}.
	 * @param ctx the parse tree
	 */
	void enterAppelproc(@NotNull LogoParser.AppelprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogoParser#appelproc}.
	 * @param ctx the parse tree
	 */
	void exitAppelproc(@NotNull LogoParser.AppelprocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code av}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAv(@NotNull LogoParser.AvContext ctx);
	/**
	 * Exit a parse tree produced by the {@code av}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAv(@NotNull LogoParser.AvContext ctx);
	/**
	 * Enter a parse tree produced by the {@code supegal}
	 * labeled alternative in {@link LogoParser#exprbool}.
	 * @param ctx the parse tree
	 */
	void enterSupegal(@NotNull LogoParser.SupegalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code supegal}
	 * labeled alternative in {@link LogoParser#exprbool}.
	 * @param ctx the parse tree
	 */
	void exitSupegal(@NotNull LogoParser.SupegalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lc}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterLc(@NotNull LogoParser.LcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lc}
	 * labeled alternative in {@link LogoParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitLc(@NotNull LogoParser.LcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fonction}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFonction(@NotNull LogoParser.FonctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fonction}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFonction(@NotNull LogoParser.FonctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hasard}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterHasard(@NotNull LogoParser.HasardContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hasard}
	 * labeled alternative in {@link LogoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitHasard(@NotNull LogoParser.HasardContext ctx);
}