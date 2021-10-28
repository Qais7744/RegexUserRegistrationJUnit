package com.bl.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.lastName("Bagwan");
        Assert.assertTrue(userTest);
    }
}
