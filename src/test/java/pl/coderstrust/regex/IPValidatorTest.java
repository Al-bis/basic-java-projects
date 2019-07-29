package pl.coderstrust.regex;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class IPValidatorTest {

    @Test
    @Parameters(method = "CorrectIPArguments")
    public void ValidationOfCorrectIPAddress(String ip) {
        // given
        IPValidator ipValidator = new IPValidator();

        // when
        boolean valid = ipValidator.isIpAddress(ip);

        // then
        assertTrue(valid);
    }

    public Object[] CorrectIPArguments() {
        return new Object[]{
                new Object[]{"1.1.1.1"},
                new Object[]{"10.20.30.40"},
                new Object[]{"25.1.9.199"},
                new Object[]{"127.0.0.1"},
                new Object[]{"192.168.0.1"},
                new Object[]{"255.255.255.255"}
        };
    }

    @Test
    @Parameters(method = "IncorrectIPArgument")
    public void ValidationOfIncorrectIPAddress(String ip) {
        // given
        IPValidator ipValidator = new IPValidator();

        // when
        boolean valid = ipValidator.isIpAddress(ip);

        //then
        assertFalse(valid);
    }

    public Object[] IncorrectIPArgument() {
        return new Object[]{
                new Object[]{"1.1.1"},
                new Object[]{"25.35"},
                new Object[]{"5"},
                new Object[]{"a.b.c.d"},
                new Object[]{"10.20.30.z"},
                new Object[]{"256.1.1.1"},
                new Object[]{"1111.11.11.11"}
        };
    }

    @Test
    public void ValidationOfCorrectIPAddressWithManyCombinations() {
        //given
        IPValidator ipValidator = new IPValidator();

        for (int i = 0; i < 256; i++) {
            boolean valid1 = ipValidator.isIpAddress(i + ".1.1.1");
            assertTrue(valid1);
            boolean valid2 = ipValidator.isIpAddress("1." + i + ".1.1");
            assertTrue(valid2);
            boolean valid3 = ipValidator.isIpAddress("1.1." + i + ".1");
            assertTrue(valid3);
            boolean valid4 = ipValidator.isIpAddress("1.1.1." + i);
            assertTrue(valid4);
        }
    }
}