package com.bl.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    public static final String LAST_NAME_PATTERN = "^[A-Z][a-zA-Z]{3,10}$";

    public boolean lastName(String name) {
        boolean matchesString = Pattern.matches(LAST_NAME_PATTERN, name);
        return matchesString;
    }
}
