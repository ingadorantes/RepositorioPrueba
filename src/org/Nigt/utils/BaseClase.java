package org.Nigt.utils;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseClase {

    public static WebDriver driver;

    public void clic (String Identificador){

        driver.findElement(By.xpath(Identificador)).click();

    }

    public  void Espera (int seg) throws InterruptedException {

        Thread.sleep(seg * 1000);
    }
}

