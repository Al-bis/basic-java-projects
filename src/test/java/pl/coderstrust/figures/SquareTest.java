package pl.coderstrust.figures;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class SquareTest {

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
        assertEquals(expected, actual);
    }
}
