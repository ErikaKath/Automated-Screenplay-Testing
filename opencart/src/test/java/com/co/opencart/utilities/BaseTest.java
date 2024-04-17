package com.co.opencart.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    //Declarando el driver
    protected WebDriver driver;
    @BeforeClass
    public void beforeClass() {
        ///inicializar driver
        Logs.debug("Inicializar mi driver");
        driver = new ChromeDriver();

        new WebDriverProvider().set(driver);
    }

    @AfterClass
    public void afterClass() {
        ///finalizar driver
        Logs.debug("Finalizar driver");
        driver.quit();
    }
}
