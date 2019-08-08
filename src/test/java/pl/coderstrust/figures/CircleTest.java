package pl.coderstrust.figures;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class CircleTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    @Parameters({"0", "-1"})
    public void shouldThrownExceptionForInvalidArgumentInCircleConstructor(double radius) {
        thrown.expect(IllegalArgumentException.class);
        new Circle(radius);
    }

    @Test
    @Parameters({"0", "-1"})
    public void shouldThrownExceptionForInvalidArgumentInCircleSetter(double radius) {
        thrown.expect(IllegalArgumentException.class);
        Circle circle = new Circle(1);
        circle.setRadius(radius);
    }

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
        assertEquals(expected, actual, 1e-15);
    }
}
