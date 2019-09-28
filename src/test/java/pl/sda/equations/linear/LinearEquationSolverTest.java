package pl.sda.equations.linear;

import org.junit.Test;
import pl.sda.equations.EquationSolver;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LinearEquationSolverTest {

    final EquationSolver solver = new LinearEquationSolver();

    @Test
    public void shouldReturn5() {
        //given
        final String equation = "x-5=0";
        final List<Double> expectedResult = Arrays.asList(5d);

        //when
        List<Double> result = solver.solve(equation);

        //then
        assertEquals(expectedResult, result);
    }

    @Test
    public void shouldReturn6() {
        //given
        final String equation = "2x-2=10";
        final List<Double> expectedResult = Arrays.asList(6d);

        //when
        List<Double> result = solver.solve(equation);

        //then
        assertEquals(expectedResult, result);
    }
}