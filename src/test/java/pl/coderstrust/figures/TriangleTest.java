package pl.coderstrust.figures;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TriangleTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    @Parameters({"0, 0", "-1, -1", "0, 1", "1, 0"})
    public void shouldThrownExceptionForInvalidArgumentInTriangleConstructor(double base, double height) {
        thrown.expect(IllegalArgumentException.class);
        new Triangle(base, height);
    }

    @Test
    @Parameters({"0", "-1"})
    public void shouldThrownExceptionForInvalidArgumentInTriangleHeightSetter(double height) {
        thrown.expect(IllegalArgumentException.class);
        Triangle triangle = new Triangle(1, 1);
        triangle.setHeight(height);
    }

    @Test
    @Parameters({"0", "-1"})
    public void shouldThrownExceptionForInvalidArgumentInTriangleBaseSetter(double base) {
        thrown.expect(IllegalArgumentException.class);
        Triangle triangle = new Triangle(1, 1);
        triangle.setBase(base);
    }

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
