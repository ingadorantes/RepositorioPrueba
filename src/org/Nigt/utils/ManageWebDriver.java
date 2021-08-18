package org.Nigt.utils;

import org.openqa.selenium.WebDriver;


public class ManageWebDriver {
    //Declara variable de tipo Webdriver llamada driver
    public static WebDriver driver;
    //Declara varibale de tipo WebDrivers llamada Driver
    private static WebDrivers Driver;
    //Declarar varibales de tipo String con nombres de ejecutables
    public static String ChromeDriver_win ="chromedriver.exe";
    public static String FirefoxDriver_win = "geckodriver.exe";

    //Constructor de la clase ManageWebDriver
    public ManageWebDriver (WebDrivers Driver){
        this.Driver = Driver;
    }
    public WebDriver getDriver(){
        switch (Driver){
            case CHROME:
                System.setProperty("webdriver.chrome.driver" , Paths.DRIVER_PATH_WIN + ChromeDriver_win);
            break;
            case FIREFOX:
                System.setProperty("webdriver.chrome.driver", Paths.DRIVER_PATH_WIN + FirefoxDriver_win);
            break;
        }
        return driver;
    }
}
