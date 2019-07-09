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
        //when
        double actual = figure.calculateArea();

        //then
        assertEquals(expected, actual);
    }

    public Object[] figureArguments() {
        return new Object[]{
                new Object[]{new Circle(2.0), 12.566370614359172},
                new Object[]{new Rectangle(2.0, 2.0), 4.00},
                new Object[]{new Square(2.0), 4.00},
                new Object[]{new Trapezoid(2.0, 2.0, 2.0), 4.00},
                new Object[]{new Triangle(2.0, 2.0), 2.00}
        };
    }
}
