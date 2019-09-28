package pl.sda.equations.linear;

import pl.sda.equations.EquationSolver;

import java.util.Arrays;
import java.util.List;

public class LinearEquationSolver implements EquationSolver {

    final EquationParser parser = new EquationParser();

    @Override
    public List<Double> solve(String equation) {
        LinearEquation parsedEquation = parser.parse(equation);


        Double equationSolution = (parsedEquation.getC() - parsedEquation.getB())
                / parsedEquation.getA();

        List<Double> result = Arrays.asList(equationSolution);
        return result;
    }

}
