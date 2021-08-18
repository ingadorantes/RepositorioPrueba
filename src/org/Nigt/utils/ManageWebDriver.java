package org.Nigt.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ManageWebDriver {
    //Declara variable de tipo Webdriver llamada driver
    public static WebDriver driver;
    //Declara varibale de tipo WebDrivers llamada Driver
    public static WebDrivers Driver;
    //Declarar varibales de tipo String con nombres de ejecutables
    public static String ChromeDriver ="chromedriver";
    public static String FirefoxDriver = "geckodriver";


    //Constructor de la clase ManageWebDriver
    public ManageWebDriver (WebDrivers Driver) {this.Driver = Driver;}

    public WebDriver getDriver(){
        switch (Driver){
            case CHROME:
                System.setProperty("webdriver.chrome.driver" , Paths.DRIVER_PATH + ChromeDriver);
                driver = new ChromeDriver();
            break;
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", Paths.DRIVER_PATH + FirefoxDriver);
                driver = new FirefoxDriver();
            break;
        }
        return driver;
    }


}
