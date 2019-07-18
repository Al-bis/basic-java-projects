package pl.coderstrust.figures;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static junit.framework.TestCase.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class TrapezoidTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    @Parameters({"0, 0, 0", "-1, -1, -1", "0, 1, 1", "1, 0, 1", "1, 1, 0"})
    public void shouldThrownExceptionForInvalidArgumentInTrapezoidConstructor(double lowerBase, double higherBase, double height) {
        thrown.expect(IllegalArgumentException.class);
        new Trapezoid(lowerBase, higherBase, height);
    }

    @Test
    @Parameters({"0", "-1"})
    public void shouldThrownExceptionForInvalidArgumentInTrapezoidHeightSetter(double height) {
        thrown.expect(IllegalArgumentException.class);
        Trapezoid trapezoid = new Trapezoid(1, 1, 1);
        trapezoid.setHeight(height);
    }

    @Test
    @Parameters({"0", "-1"})
    public void shouldThrownExceptionForInvalidArgumentInTrapezoidLowerBaseSetter(double lowerBase) {
        thrown.expect(IllegalArgumentException.class);
        Trapezoid trapezoid = new Trapezoid(1, 1, 1);
        trapezoid.setLowerBase(lowerBase);
    }

    @Test
    @Parameters({"0", "-1"})
    public void shouldThrownExceptionForInvalidArgumentInTrapezoidHigherBaseSetter(double higherBase) {
        thrown.expect(IllegalArgumentException.class);
        Trapezoid trapezoid = new Trapezoid(1, 1, 1);
        trapezoid.setHigherBase(higherBase);
    }

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
