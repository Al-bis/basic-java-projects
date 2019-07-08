package pl.coderstrust.figures;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class FigureTest {

    @Test
    @Parameters(method = "figureArguments")
    public void shouldCalculateCorrectFigureArea(Figure figure, double expected) {
        //given
        Figure givenFigure = figure;

        //when
        double actual = givenFigure.calculateArea();

        //then
        assertEquals(expected, actual);
    }

    public Object[] figureArguments() {
        return new Object[]{
                new Object[]{0, 0},
                new Object[]{1, 1},
        };
    }
}
