package com.bl.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenAnyEmail_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.emailTest("abc+100@gmail.com");
        Assert.assertTrue(userTest);
    }
}
