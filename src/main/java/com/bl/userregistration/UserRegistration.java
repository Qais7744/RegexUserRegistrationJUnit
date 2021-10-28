package com.bl.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    public static final String EMAIL_PATTERN = "^[A-Za-z._]+[@][a-zA-Z]+[.a-z]{4}([.a-zA-Z]{3})*$";

    public boolean email(String gmail) {
        boolean matchesString = Pattern.matches(EMAIL_PATTERN, gmail);
        return matchesString;
    }
}
