package pl.coderstrust.figures;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TriangleTest {

    @Test
    @Parameters({
            "6.6, 3.7, 12.209999999999999",
            "3, 5, 7.5",
            "4.57, 8.32, 19.011200000000002"})
    public void shouldCalculateCorrectTriangleArea(double base, double height, double expected) {
        //given
        Figure triangle = new Triangle(base, height);

        //when
        double actual = triangle.calculateArea();

        //then
        assertEquals(expected, actual, 1e-15);
    }
}
