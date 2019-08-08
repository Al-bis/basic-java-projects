package pl.coderstrust.regex;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class IpAddressValidatorTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldThrowExceptionForIllegalArgument() {
        thrown.expect(IllegalArgumentException.class);
        IpAddressValidator.isIpAddress(null);
    }

    @Test
    @Parameters(method = "correctIpAddresses")
    public void shouldReturnTrueForValidIpAddress(String ipAddress) {
        assertTrue(IpAddressValidator.isIpAddress(ipAddress));
    }

    public Object[] correctIpAddresses() {
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
    @Parameters(method = "incorrectIPAddresses")
    public void shouldReturnFalseForInvalidIpAddress(String ipAddress) {
        assertFalse(IpAddressValidator.isIpAddress(ipAddress));
    }

    public Object[] incorrectIPAddresses() {
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

    @Ignore
    @Test
    public void shouldReturnTrueForAllCombinationsOfIpAddresses() {
        for (int i = 0; i < 256; i++) {
            for (int j = 0; j < 256; j++) {
                for (int k = 0; k < 256; k++) {
                    for (int l = 0; l < 256; l++) {
                        assertTrue(IpAddressValidator.isIpAddress(String.format("%d.%d.%d.%d", i, j, k, l)));
                    }
                }
            }
        }
    }

    @Test
    @Parameters({"%d.1.1.1", "1.%d.1.1", "1.1.%d.1", "1.1.1.%d"})
    public void smartTestForValidIpAddress(String ipAddressTemplate) {
        for (int i = 0; i < 256; i++) {
            assertTrue(IpAddressValidator.isIpAddress(String.format(ipAddressTemplate, i)));
        }
    }
}
