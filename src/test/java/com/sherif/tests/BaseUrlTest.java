package com.sherif.tests;

import com.sherif.config.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BaseUrlTest {

    @Test
    public void verifyBaseUrlIsLoaded() {
        String baseUrl = ConfigReader.get("base.url");
        String env = ConfigReader.get("environment");
        String browser = ConfigReader.get("browser");

        System.out.println("Environment: " + env);
        System.out.println("Base URL: " + baseUrl);
        System.out.println("Browser is: " + browser);

        Assert.assertNotNull(baseUrl);
    }
}