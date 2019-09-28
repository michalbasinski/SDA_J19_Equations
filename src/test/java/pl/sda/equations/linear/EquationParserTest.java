package pl.sda.equations.linear;

import org.junit.Test;
import pl.sda.equations.EquationSolver;

import static org.junit.Assert.*;

public class EquationParserTest {

    private final EquationParser parser = new EquationParser();

    @Test
    public void shouldReturnAEq1BEq1CEq1() {
        //given
        final String equation = "x+1=1";
        LinearEquation expectedResult = new LinearEquation();
        expectedResult.setA(1d);
        expectedResult.setB(1d);
        expectedResult.setC(1d);

        //when
        LinearEquation result = parser.parse(equation);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    public void shouldReturnAEqMinus1BEq1CEq1() {
        //given
        final String equation = "-x+1=1";
        LinearEquation expectedResult = new LinearEquation();
        expectedResult.setA(-1d);
        expectedResult.setB(1d);
        expectedResult.setC(1d);

        //when
        LinearEquation result = parser.parse(equation);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    public void shouldReturnAEqMinus2BEqMinus111CEqMinus21() {
        //given
        final String equation = "-2x-111=-21";
        LinearEquation expectedResult = new LinearEquation();
        expectedResult.setA(-2d);
        expectedResult.setB(-111d);
        expectedResult.setC(-21d);

        //when
        LinearEquation result = parser.parse(equation);

        //then
        assertEquals(expectedResult, result);
    }
}