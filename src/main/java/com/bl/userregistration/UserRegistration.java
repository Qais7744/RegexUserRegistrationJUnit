package com.bl.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    public static final String EMAIL_PATTERN = "^[a-zA-Z0-9+_.-]+[@][a-zA-Z0-9]+[.a-z]{3,4}([.a-zA-Z,]{3})*$";

    public boolean emailTest(String gmail, boolean value) {
        boolean matchesCode = Pattern.matches(EMAIL_PATTERN, gmail);
        if(matchesCode == value)
            return value;
        else
            return false;
    }
}
