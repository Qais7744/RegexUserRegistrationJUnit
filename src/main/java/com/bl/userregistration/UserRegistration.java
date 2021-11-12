package com.bl.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean validateDetails(String validate, String matcherWithRejex, String pattern) {

        switch (pattern) {
            case "EMAIL_PATTERN":
                boolean forTestEmail = Pattern.matches(validate, matcherWithRejex);
                return forTestEmail;
            case "FIRST_NAME_PATTERN":
                boolean forTestFirstName = Pattern.matches(validate, matcherWithRejex);
                return forTestFirstName;
            case "LAST_NAME_PATTERN":
                boolean forTestLastName = Pattern.matches(validate, matcherWithRejex);
                return forTestLastName;
            case "MOBILE_NO_PATTERN":
                boolean forTestmobileNumber = Pattern.matches(validate, matcherWithRejex);
                return forTestmobileNumber;
            case "PASSWORD_PATTERN":
                boolean forTestPassword = Pattern.matches(validate, matcherWithRejex);
                return forTestPassword;
            default:
                System.out.println("invalid input");
                return false;
        }
    }
}
