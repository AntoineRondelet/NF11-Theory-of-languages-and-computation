package logoparsing;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class LogoVarManager {
	Map<String, Double> varMap = new HashMap<String, Double>();

	public void setVariable(String name, Double value) {
		varMap.put(name, value);
	}
	
	public Double getVariable(String name) { 
		return varMap.get(name); 
	}
}
