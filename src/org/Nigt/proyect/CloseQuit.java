package org.Nigt.proyect;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseQuit {
   static String baseURL = "https://petstore.octoperf.com/actions/Catalog.action";
   static WebDriver driver;
   static String PathChorme = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";

   public static void close() {

      ChromeDriver driver = new ChromeDriver();
      driver.navigate().to(baseURL);
      driver.close();

   }

   public static void quit() throws InterruptedException {
      ChromeDriver driver = new ChromeDriver();
      driver.get(baseURL);
      Thread.sleep(2000);
      driver.quit();

   }
   public static void main (String[] arg) throws InterruptedException{

      System.setProperty("webdriver.chrome.driver",PathChorme);
      //close();
      quit();

   }

}
