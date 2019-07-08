package pl.coderstrust.figures;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class CircleTest {

    @Test
    @Parameters({
            "12.5, 490.8738521234052",
            "10, 314.1592653589793",
            "8.96, 252.21208477843436"})
    public void shouldCalculateCorrectCircleArea(double radius, double expected) {
        //given
        Figure circle = new Circle(radius);

        //when
        double actual = circle.calculateArea();

        //then
        assertEquals(expected, actual);
    }
}
