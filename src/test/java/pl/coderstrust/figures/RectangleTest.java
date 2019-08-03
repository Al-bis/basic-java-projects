package pl.coderstrust.figures;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class RectangleTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    @Parameters({"0, 0", "-1, -1", "0, 1", "1, 0"})
    public void shouldThrownExceptionForInvalidArgumentInRectangleConstructor(double height, double width) {
        thrown.expect(IllegalArgumentException.class);
        new Rectangle(height, width);
    }

    @Test
    @Parameters({"0", "-1"})
    public void shouldThrownExceptionForInvalidArgumentInRectangleHeightSetter(double height) {
        thrown.expect(IllegalArgumentException.class);
        Rectangle rectangle = new Rectangle(1, 1);
        rectangle.setHeight(height);
    }

    @Test
    @Parameters({"0", "-1"})
    public void shouldThrownExceptionForInvalidArgumentInRectangleWidthSetter(double width) {
        thrown.expect(IllegalArgumentException.class);
        Rectangle rectangle = new Rectangle(1, 1);
        rectangle.setWidth(width);
    }

    @Test
    @Parameters({
            "4.6, 8.9, 40.94",
            "8.88, 7, 62.160000000000004",
            "5, 4, 20"})
    public void shouldCalculateCorrectRectangleArea(double height, double width, double expected) {
        //given
        Figure rectangle = new Rectangle(height, width);

        //when
        double actual = rectangle.calculateArea();

        //then
        assertEquals(expected, actual, 1e-15);
    }
}
