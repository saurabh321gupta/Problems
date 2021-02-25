import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FormulaValidator {

	public static void main(String[] args) throws IOException, ScriptException {
		String formula = "(OPTIMISED.gross_profit - CURRENT.gross_profit)/)CURRENT.gross_profit";//"(OPTIMISED.gsv -CURRENT.gsv)/  CURRENT.gsv";
		String delemeters = "(?<=\\-)|(?=\\-)|(?<=\\+)|(?=\\+)|(?<=\\*)|(?=\\*)|(?<=/)|(?=/)|(?<=\\()|(?=\\()|(?<=\\))|(?=\\))";
		String[] strExp = formula.split(delemeters);
		Set<String> acceptedOperators = new HashSet() {
			{
				add("*");
				add("+");
				add("-");
				add("/");
				add("(");
				add(")");
			}
		};
		System.out.println(isFormulaValid(strExp, acceptedOperators));
	}

	static boolean isFormulaValid(String[] elements, Set<String> acceptedOperators) throws ScriptException {
		for (int i = 0; i < elements.length; i++) {
			String element = elements[i].trim();
			if (!isOperator(acceptedOperators, element)) {
				if (element.split("\\s").length != 1) {
					return false;
				}
				element = "1";
			}
			elements[i] = element;
		}

		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");
		try {
			engine.eval(String.join(" ", elements));
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	static boolean isOperator(Set<String> acceptedOperators, String element) {
		return acceptedOperators.contains(element);
	}

}
