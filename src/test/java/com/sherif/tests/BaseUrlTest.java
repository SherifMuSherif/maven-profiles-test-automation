package com.sherif.tests;

import com.sherif.config.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseUrlTest {

    @Test
    public void verifyBaseUrlIsLoaded() {
        String baseUrl = ConfigReader.get("base.url");
        String env = ConfigReader.get("environment");

        System.out.println("Environment: " + env);
        System.out.println("Base URL: " + baseUrl);

        Assert.assertNotNull(baseUrl);
    }
}