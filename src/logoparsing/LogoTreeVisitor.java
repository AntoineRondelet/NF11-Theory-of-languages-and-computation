package logoparsing;

import javafx.scene.Group;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import logogui.Log;
import logogui.Traceur;
import logoparsing.LogoParser.AppelfoncContext;
import logoparsing.LogoParser.AppelprocContext;
import logoparsing.LogoParser.AvContext;
import logoparsing.LogoParser.BcContext;
import logoparsing.LogoParser.DonneContext;
import logoparsing.LogoParser.ExprContext;
import logoparsing.LogoParser.ExprboolContext;
import logoparsing.LogoParser.FccContext;
import logoparsing.LogoParser.FonctionContext;
import logoparsing.LogoParser.FposContext;
import logoparsing.LogoParser.HasardContext;
import logoparsing.LogoParser.LcContext;
import logoparsing.LogoParser.Liste_instructionsContext;
import logoparsing.LogoParser.Liste_variablesContext;
import logoparsing.LogoParser.LoopContext;
import logoparsing.LogoParser.MultContext;
import logoparsing.LogoParser.NbContext;
import logoparsing.LogoParser.ParentheseContext;
import logoparsing.LogoParser.PowerContext;
import logoparsing.LogoParser.ProgrammeContext;
import logoparsing.LogoParser.ReContext;
import logoparsing.LogoParser.RendsContext;
import logoparsing.LogoParser.RepeteContext;
import logoparsing.LogoParser.SiContext;
import logoparsing.LogoParser.SumContext;
import logoparsing.LogoParser.TantqueContext;
import logoparsing.LogoParser.TdContext;
import logoparsing.LogoParser.TgContext;
import logoparsing.LogoParser.VarContext;
import logoparsing.LogoParser.VeContext;
import logoparsing.LogoVarManager;


public class LogoTreeVisitor extends LogoBaseVisitor<Integer> {
	Traceur traceur;
	ParseTreeProperty<Double> atts = new ParseTreeProperty<Double>();
	private List<Integer> loopValues = new ArrayList<>();
	Stack<LogoVarManager> pileTabVar = new Stack<LogoVarManager>();
	Map<String, Procedure> tableProcedures = new HashMap<String, Procedure>();

	
	public LogoTreeVisitor() {
		super();
	}
	
	public void initialize(Group g) {
	      traceur = new Traceur();
	      traceur.setGraphics(g);
	      
	      // -- Premier niveau de portée (portée globale) -- //
	      pileTabVar.push(new LogoVarManager());
    }
	
	public void setAttValue(ParseTree node, Double value) { 
		atts.put(node, value);
	}
	
	public Double getAttValue(ParseTree node) { 
		return atts.get(node); 
	}
	
	@Override
	public Integer visitAv(AvContext ctx) {
		System.out.println("Visiting AV node");
		visitChildren(ctx);
		traceur.avance(getAttValue(ctx.expr()));
		Log.appendnl("visitAv");
		return 0;
	}
	
	@Override
	public Integer visitTd(TdContext ctx) {
		System.out.println("Visiting TD node");
		visitChildren(ctx);
		traceur.td(getAttValue(ctx.expr()));
		Log.append("visitTd\n" );
		return 0;
	}
	
	@Override
	public Integer visitTg(TgContext ctx) {
		System.out.println("Visiting TG node");
		visitChildren(ctx);
		traceur.tg(getAttValue(ctx.expr()));
		Log.append("visitTg\n" );
		return 0;
	}
	
	
	@Override
	public Integer visitLc(LcContext ctx) {
		System.out.println("Visiting LC node");
		visitChildren(ctx);
		traceur.lc();
		Log.append("visitLc\n" );
		return 0;
	}
	
	@Override
	public Integer visitBc(BcContext ctx) {
		System.out.println("Visiting BC node");
		visitChildren(ctx);
		traceur.bc();
		Log.append("visitBc\n" );
		return 0;
	}

	@Override
	public Integer visitVe(VeContext ctx) {
		System.out.println("Visiting VE node");
		visitChildren(ctx);
		traceur.ve();
		Log.append("visitVe\n" );
		return 0;
	}

	@Override
	public Integer visitRe(ReContext ctx) {
		System.out.println("Visiting RE node");
		visitChildren(ctx);
		traceur.re(getAttValue(ctx.expr()));
		Log.append("visitRe\n" );
		return 0;
	}

	@Override
	public Integer visitFcc(FccContext ctx) {
		System.out.println("Visiting FCC node");
		visitChildren(ctx);
		try {
			traceur.fcc(getAttValue(ctx.expr()));
		} catch (IllegalArgumentException e) {
			Log.append(String.format("visitFcc ERROR: %s \n", e.toString()));
			return 1;
		}
		Log.append("visitFcc\n" );
		return 0;
	}

	@Override
	public Integer visitFpos(FposContext ctx) {
		System.out.println("Visiting FPOS node");
		visitChildren(ctx);
		traceur.fpos(getAttValue(ctx.expr(0)), getAttValue(ctx.expr(1)));
		Log.append("visitFpos\n" );
		return 0;
	}

	@Override
	public Integer visitSum(SumContext ctx) {
		System.out.println("Visiting SUM node");
		visit(ctx.expr(0));
		visit(ctx.expr(1));
		Double left = getAttValue(ctx.expr(0)); 
		Double right = getAttValue(ctx.expr(1)); 
		Double result =
		ctx.getChild(1).getText().equals("+") ?
		left + right : left - right;
		setAttValue(ctx, result);
		Log.append("visitSum\n" );
		return 0;
	}
	
	@Override
	public Integer visitMult(MultContext ctx) {
		System.out.println("Visiting MULT node");
		visit(ctx.expr(0));
		visit(ctx.expr(1));
		Double left = getAttValue(ctx.expr(0));
		Double right =  getAttValue(ctx.expr(1));
		Double result =
		ctx.getChild(1).getText().equals("*") ?
		left * right : left / right;
		setAttValue(ctx, result);
		Log.append("visitMult\n" );
		return 0;
	}
	
	@Override
	public Integer visitHasard(HasardContext ctx) {
		System.out.println("Visiting HASARD node");
		visitChildren(ctx);
		Random r = new Random();
		String intText = ctx.NB().getText();
		Double val = Double.valueOf(intText);
		double randomNb = r.nextDouble() * val;
		setAttValue(ctx, randomNb);
		Log.append("visitHasard\n" );
		return 0;
	}
	
	@Override
	public Integer visitNb(NbContext ctx) {
		System.out.println("Visiting NB node");
		String intText = ctx.NB().getText();
		Double r = Double.valueOf(intText);
		setAttValue(ctx, r);
		Log.append("visitNb\n" );
		return 0;
	}

	@Override
	public Integer visitPower(PowerContext ctx) {
		System.out.println("Visiting POWER node");
		visit(ctx.expr(0));
		visit(ctx.expr(1));
		Double left = getAttValue(ctx.expr(0));
		Double right =  getAttValue(ctx.expr(1));
		Double result = Math.pow(left, right);
		setAttValue(ctx, result);
		Log.append("visitPower\n" );
		return 0;
	}
	
	@Override
	public Integer visitParenthese(ParentheseContext ctx) {
		System.out.println("Visiting PARENTHESE node");
		visit(ctx.expr());
		if (ctx.getChild(0).getText().equals("(") && ctx.getChild(2).getText().equals(")")) {
			Double result = getAttValue(ctx.expr());
			setAttValue(ctx, result);
		}
		Log.append("visitParenthese\n" );
		return 0;
	}

	@Override
	public Integer visitRepete(RepeteContext ctx) {
		System.out.println("Visiting REPETE node");
		visit(ctx.expr());
		Double nbRepete = getAttValue(ctx.expr());
		
		// -- Index de la valeur du loop de ce 'repete' -- //
		int index = loopValues.size();
		
		// On creer une entree pour stocker la valeur de loop du
		// repete dans lequel on est. Necessite d'avoir une liste de
		// valeurs pour loop en cas d'instruction repete imbriquees
		// (chaque repete a la valeur de son loop (local scope))
		loopValues.add(0);
		
		for (int i = 0; i < nbRepete; i++) {
			// On ecrase l'ancienne valeur de "loop" par sa valeur incrementee
			// au lieu de faire cette incrementation au sens propre du terme
			// ici on utilise la variable d'iteration 'i', ce qui revient au meme
			loopValues.set(index, i+1);
			visit(ctx.liste_instructions());
		}
		
		// -- Avant de sortir du repete, on supprime son entrée dans la liste des valeurs de loop -- //
		loopValues.remove(index);
		
		Log.append("visitRepete\n" );
		return 0;
	}

	@Override
	public Integer visitLoop(LoopContext ctx) {
		System.out.println("Visiting LOOP node");
		// Quand on visite loop on vet connaitre sa valeur
		// Or, sa valeur depend du repete dans lequel il est.
		// Ainsi comme on remplit loopValues de la gauche vers la 
		// droite a mesure que l'on rentre dans des repete successifs
		// quand on evalue la valeur de loop, on veut connaitre sa valeur
		// dans le repete le plus "recent", donc dans l'entree la plus a droite
		// (donc l'index le plus eleve) de loopValues. D'ou l'instruction "loopValues.get(loopValues.size() - 1)"
		setAttValue(ctx, (double)loopValues.get(loopValues.size() - 1));
		Log.append("visitLoop \n");
		return 0;
	}

	@Override
	public Integer visitDonne(DonneContext ctx) {
		System.out.println("Visiting DONNE node");
		visitChildren(ctx);
		String varName = ctx.VAR().getText().substring(1);
		Double varValue = getAttValue(ctx.expr());
		pileTabVar.peek().setVariable(varName, varValue);
		Log.append("visitDonne \n");
		return 0;
	}

	@Override
	public Integer visitVar(VarContext ctx) {
		System.out.println("Visiting VAR node");
		String varName = ctx.VUSE().getText().substring(1);
		System.out.println("Accessing variable: " + "'" + varName + "'");
		Double varValue = pileTabVar.peek().getVariable(varName);
		setAttValue(ctx, varValue);
		Log.append("visitVar \n");
		return 0;
	}

	@Override
	public Integer visitExprbool(ExprboolContext ctx) {
		System.out.println("Visiting EXPRBOOL node");
		// -- Nous faisons une seule et unique visite pour les expressions booleennes pour eviter de leur donner une priorite -- //
		visitChildren(ctx);
		Double left = getAttValue(ctx.expr(0));
		Double right = getAttValue(ctx.expr(1));
		Double result = (double)0;
		String op = ctx.BOOLEAN().getText();
		if(op.equals("<")){
			result = (double) (left < right ? 1 : 0);
		}
		else if(op.equals(">")){
			result = (double) (left > right ? 1 : 0);
		}
		else if(op.equals("==")){
			result = (double) (left == right ? 1 : 0);
		}
		else if(op.equals("!=")){
			result = (double) (left != right ? 1 : 0);
		}
		else if(op.equals( "<=")){
			result = (double) (left <= right ? 1 : 0);
		}
		else if(op.equals(">=")){
			result = (double) (left >= right ? 1 : 0);
		}
		else {
			System.err.println("Erreur booleen");
		}
		
		setAttValue(ctx, (double)result);
		
		Log.append("visitExprBool \n");
		return 0;
	}

	

	@Override
	public Integer visitSi(SiContext ctx) {
		System.out.println("Visiting SI node");
		visit(ctx.exprbool());
		Double boolValue = getAttValue(ctx.exprbool());
		if (boolValue == (double)1) {
			if(visit(ctx.liste_instructions(0)) != 0) {
				return 1;
			}
		} else if (ctx.liste_instructions().size() > 1) {
			if(visit(ctx.liste_instructions(1)) != 0) {
				return 2;
			}
		}
		
		Log.append("visitSi \n");
		return 0;
	}

	@Override
	public Integer visitTantque(TantqueContext ctx) {
		System.out.println("Visiting TANTQUE node");
		visit(ctx.exprbool());
		Double boolValue = getAttValue(ctx.exprbool());
		
		while (boolValue == (double)1) {
			if(visit(ctx.liste_instructions()) != 0) {
				return 1;
			}
			visit(ctx.exprbool());
			boolValue = getAttValue(ctx.exprbool());
		}
		
		Log.append("visitTantque \n");
		return 0;
	}
	

	@Override
	public Integer visitRends(RendsContext ctx) {
		System.out.println("Visiting RENDS node");
		visitChildren(ctx);
		Double rendsValue = getAttValue(ctx.expr());
		pileTabVar.peek().setVariable("rends", rendsValue);
		System.out.println("Settings RENDS value: " + rendsValue);
		return 0;
	}
	
	@Override
	public Integer visitFonction(FonctionContext ctx) {
		// -- VisitFonction sert a visiter la DECLARATION d'une fonction. On stocke cette declaration dans une table -- //
		System.out.println("Visiting FONCTION node");
		
		Procedure procedure = new Procedure();
		procedure.setName(ctx.NAME().getText());
		
		List<String> arguments = new ArrayList<String>();
		if (ctx.liste_variables() != null) {
			for (int i = 0; i < ctx.liste_variables().VUSE().size(); i++) {
				arguments.add(ctx.liste_variables().VUSE(i).getText().substring(1));
			}
		}
		
		procedure.setArguments(arguments);
		procedure.setCode(ctx.liste_instructions());
		
		// -- Affichage des args de la fonction pour le debug -- //
		List<String> argumentsList = procedure.getArguments();
		System.out.println(" --------- Argument list ----------");
		for (int i=0; i < procedure.getNbArgs(); i++){
			System.out.println("Arg_name = " + argumentsList.get(i));
		}
		
		// -- Stockage de la procedure/fonction dans la table des procedures -- //
		tableProcedures.put(procedure.getName(), procedure);
		
		Log.append("DEBUG visitFonction \n");
		return 0;
	}
	
	
	@Override
	public Integer visitAppelproc(AppelprocContext ctx) {
		// -- VisitAppelProc sert a visiter l'APPEL d'une procedure -- //
		System.out.println("Visiting APPELPROC node");
		Procedure procedure = tableProcedures.get(ctx.NAME().getText());
		
		// -- Si la procedure appelée n'a pas ete declarée, on retourne 1 -- //
		if(procedure == null){
			System.err.println("Procedure inexistante");
			return 1;
		}
		
		// -- Si on appelle la procedure avec le mauvais nombre d'arguments, on retourne 2 -- //
		if (procedure.getNbArgs() != ctx.liste_expr().getChildCount()){
			return 2;
		}
		
		// -- Création d'une table de variables correspondant a la portée de la procedure -- //
		LogoVarManager procedureTabVar = new LogoVarManager();
		
		// On recupere les valeurs des arguments de la procedure pour les ajouter a la table
		// de variables de la procedure (si on a: f(a, 20) par exemple, il faut pouvoir connaitre
		// la valeur de 'a' et l'ajouter a la table des variables de la fonction f() pour pouvoir utiliser 'a' a l'interieur de f() )
		List<String> argumentsNames = procedure.getArguments();
		for (int i=0; i < procedure.getNbArgs(); i++){
			ExprContext variable = ctx.liste_expr().expr(i);
			visit(variable);
			procedureTabVar.setVariable(argumentsNames.get(i), getAttValue(variable));
		}
		
		
		// -- On empile la table des variables une fois qu'elle est prete (absolument necessaire !) -- //
		pileTabVar.push(procedureTabVar);
		
		// -- On visite le code de la procedure -- //
		visit(procedure.getCode());
		
		// -- On pop la table des variables de la procedure (suppression de la portée quand on sort de la procedure) -- //
		pileTabVar.pop();
		
		Log.append("DEBUG visitAppelProc \n");
		return 0;
	}
	
	@Override
	public Integer visitAppelfonc(AppelfoncContext ctx) {
		// -- VisitAppelProc sert a visiter l'APPEL d'une fonction -- //
		System.out.println("Visiting APPELFUNC node");
		Procedure procedure = tableProcedures.get(ctx.NAME().getText());
		
		// -- Si la fonction appelée n'a pas ete declarée, on retourne 1 -- //
		if(procedure == null){
			return 1;
		}
		
		// -- Si on appelle la fonction avec le mauvais nombre d'arguments, on retourne 2 -- //
		if (procedure.getNbArgs() != ctx.liste_expr().getChildCount()){
			return 2;
		}
		
		// -- On créer une table de variables correspondant a la portée de la fonction -- //
		LogoVarManager procedureTabVar = new LogoVarManager();
		
		// On recupere les valeurs des arguments de la fonction pour les ajouter a la table
		// de variables de la fonction (si on a: f(a, 20) par exemple, il faut pouvoir connaitre
		// la valeur de 'a' et l'ajouter a la table des variables de la fonction f() pour pouvoir utiliser 'a' a l'interieur de f() )
		List<String> argumentsNames = procedure.getArguments();
		for (int i=0; i < procedure.getNbArgs(); i++){
			ExprContext variable = ctx.liste_expr().expr(i); 
			visit(variable);
			procedureTabVar.setVariable(argumentsNames.get(i), getAttValue(variable));
		}
		
		
		// -- On empile la table des variables une fois qu'elle est prete (absolument necessaire !) -- //
		pileTabVar.push(procedureTabVar);
		
		// -- On visite le code de la procedure (l'arbre de la fonction) -- //
		visit(procedure.getCode());
		Double rendsValue = pileTabVar.peek().getVariable("rends");
		if (rendsValue != null) {
			System.out.println("Exit function with return value: " + rendsValue);
			setAttValue(ctx, rendsValue);
		} else {
			System.out.println("Error: exiting function without return value found in local scope");
		}
		
		// -- On pop la table des variables de la procedure (suppression de la portée quand on sort de la procedure) -- //
		pileTabVar.pop();
		
		Log.append("DEBUG visitAppelProc \n");
		return 0;
	}
}
