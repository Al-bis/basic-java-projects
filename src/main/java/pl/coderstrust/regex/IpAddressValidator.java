package pl.coderstrust.regex;

import java.util.regex.Pattern;

public class IpAddressValidator {

    private static final String IP_ADDRESS_PATTERN =
            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    private static Pattern pattern = Pattern.compile(IP_ADDRESS_PATTERN);

    public static boolean isIpAddress(String input) {
        if (input == null) {
            throw new NullPointerException();
        }
        return pattern.matcher(input).matches();
    }
}
