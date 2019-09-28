package pl.sda.equations.linear;

import java.util.ArrayList;
import java.util.List;

//parsowanie równań postaci ax+b=c
public class EquationParser {

    public LinearEquation parse(String equation) {
        LinearEquation parsedEquation = new LinearEquation();

        parsedEquation.setA(getA(equation));
        parsedEquation.setB(getB(equation));
        parsedEquation.setC(getC(equation));

        return parsedEquation;
    }

    private Double getC(String equation) {
        int eqPos = equation.indexOf("=");
        String c = equation.substring(eqPos + 1);
        return Double.parseDouble(c);
    }

    private Double getB(String equation) {
        int eqPos = equation.indexOf("=");
        int xPos = equation.indexOf("x");
        String b = equation.substring(xPos+1, eqPos);

        return Double.parseDouble(b);
    }

    private Double getA(String equation) {
        int xPos = equation.indexOf("x");
        String a = equation.substring(0, xPos);
        Double result = 1d;
        if ("-".equals(a)) {
            result = -1d;
        } else if (a.length() >= 1) {
            result = Double.parseDouble(a);
        }
        return result;
    }


}
