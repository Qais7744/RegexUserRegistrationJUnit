package com.bl.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    public static final String ANY_EMAIL_PATTERN = "^[a-zA-Z0-9+_.-]+[@][a-zA-Z0-9]+[.a-z]{4}([.a-zA-Z,]{3})*$";

    public boolean emailTest(String gmail) {
        boolean MatchesCode = Pattern.matches(ANY_EMAIL_PATTERN, gmail);
        return MatchesCode;
    }
}
