package pl.coderstrust.figures;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class SquareTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    @Parameters({"0", "-1"})
    public void shouldThrownExceptionForInvalidArgumentInSquareConstructor(double side) {
        thrown.expect(IllegalArgumentException.class);
        new Square(side);
    }

    @Test
    @Parameters({"0", "-1"})
    public void shouldThrownExceptionForInvalidArgumentInSquareSetter(double side) {
        thrown.expect(IllegalArgumentException.class);
        Square square = new Square(1);
        square.setSide(side);
    }

    @Test
    @Parameters({
            "8.4, 70.56",
            "2, 4",
            "5.51, 30.3601"})
    public void shouldCalculateCorrectSquareArea(double side, double expected) {
        //given
        Figure square = new Square(side);

        //when
        double actual = square.calculateArea();

        //then
        assertEquals(expected, actual, 1e-15);
    }
}
