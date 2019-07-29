package pl.coderstrust.regex;

import java.util.regex.Pattern;

public class IPValidator {

    private Pattern pattern;
    private static final String IP_PATTERN =
            "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                    "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public IPValidator() {
        pattern = Pattern.compile(IP_PATTERN);
    }

    public boolean isIpAddress(String input) {
        return pattern.matcher(input).matches();
    }
}
