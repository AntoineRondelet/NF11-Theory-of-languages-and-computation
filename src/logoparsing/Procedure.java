package logoparsing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.tree.ParseTree;

import logoparsing.LogoParser.ExprContext;
import logoparsing.LogoParser.Liste_instructionsContext;

public class Procedure {
	private String name;
	private List<String> arguments = new ArrayList<String>();
	private Liste_instructionsContext code;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<String> getArguments() {
		return arguments;
	}
	
	public void setArguments(List<String> args) {
		this.arguments = args;
	}
	
	public int getNbArgs() {
		return arguments.size();
	}
	
	public Liste_instructionsContext getCode() {
		return code;
	}
	
	public void setCode(Liste_instructionsContext code) {
		this.code = code;
	}
}