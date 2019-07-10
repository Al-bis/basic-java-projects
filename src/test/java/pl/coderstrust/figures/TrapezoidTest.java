package pl.coderstrust.figures;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TrapezoidTest {

    @Test
    @Parameters({
            "4.3, 6.1, 5.3, 27.559999999999995",
            "2.5, 4.44, 7.32, 25.4004",
            "2, 2, 2, 4"})
    public void shouldCalculateCorrectTrapezoidArea(double lowerBase, double higherBase, double height, double expected) {
        //given
        Figure trapezoid = new Trapezoid(lowerBase, higherBase, height);

        //when
        double actual = trapezoid.calculateArea();

        //then
        assertEquals(expected, actual, 1e-15);
    }
}
