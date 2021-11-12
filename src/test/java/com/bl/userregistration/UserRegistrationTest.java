package com.bl.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userDetails = new UserRegistration();

    @Test
    public void givenFirstNameWhenPropertiesReturnTrue() {
        boolean testStatus = userDetails.validateDetails(Regex.FIRST_NAME_PATTERN.pattern, "Altamash", "FIRST_NAME_PATTERN");
        Assert.assertTrue(testStatus);
    }

    @Test
    public void givenLastNameWhenPropertiesReturnTrue() {
        boolean testStatus = userDetails.validateDetails(Regex.LAST_NAME_PATTERN.pattern, "Bagwan", "LAST_NAME_PATTERN");
        Assert.assertTrue(testStatus);

    }

    @Test
    public void givenPasswordShouldReturnTrueWhenSpecialCharacterAnyOne() {
        boolean testStatus = userDetails.validateDetails(Regex.PASSWORD_PATTERN.pattern, "Altamash@93", "PASSWORD_PATTERN");
        Assert.assertTrue(testStatus);
    }

    @Test
    public void givenInputMobiliserReturnTrueWhenSpaceAfterSpace() {
        boolean testStatus = userDetails.validateDetails(Regex.MOBILE_NO_PATTERN.pattern, "91 7744918893", "MOBILE_NO_PATTERN");
        Assert.assertTrue(testStatus);
    }

    @Test
    public void givenEmailShouldReturnTrueWheatenConditionSatisfied() {
        boolean testStatus = userDetails.validateDetails(Regex.EMAIL_PATTERN.pattern, "altamashbagwan.xyz@qais.com.in", "EMAIL_PATTERN");
        Assert.assertTrue(testStatus);
    }
}
