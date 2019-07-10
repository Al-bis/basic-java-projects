package pl.coderstrust.figures;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class RectangleTest {

    @Test
    @Parameters({
            "4.6, 8.9, 40.94",
            "8.88, 7, 62.160000000000004",
            "5, 4, 20"})
    public void shouldCalculateCorrectRectangleArea(double length, double width, double expected) {
        //given
        Figure rectangle = new Rectangle(length, width);

        //when
        double actual = rectangle.calculateArea();

        //then
        assertEquals(expected, actual, 1e-15);
    }
}
