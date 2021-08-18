package org.Nigt.utils;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BaseClase {

    public static WebDriver driver;

    public void clic (String Identificador){

        driver.findElement(By.xpath(Identificador)).click();

    }

    public  void Espera (int seg) throws InterruptedException {

        Thread.sleep(seg * 1000);
    }
    public void scroll(int x, int y) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,250)", "");
            js.executeScript("window.scrollBy("+ x + "," + y + ") ", "");
        } catch (Exception e) {
            System.out.println("Error en scroll() method" + e.getMessage());
        }
    }

}

