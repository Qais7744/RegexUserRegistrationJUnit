package com.bl.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    public static final String PASSWORD_PATTERN = "^[a-z]{8}$";

    public boolean passwordTest(String password) {
        boolean codeMatch = Pattern.matches(PASSWORD_PATTERN, password);
        return codeMatch;
    }
}
