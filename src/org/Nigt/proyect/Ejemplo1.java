package org.Nigt.proyect;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo1 {
    public static void main(String [] args){
        //instanciar un objeto WebDriver
        WebDriver driver;

        //Declarar Variables
        String baseURL ="https://petstore.octoperf.com/actions/Catalog.action";
        String actualResul ="";
        String expecteResul = "JPetStore Demo";


        //Indicar la locacion del archivo selenium (WebDriver.exe)
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
        //abrir el navegador
        driver=new ChromeDriver();

        driver.get(baseURL);

        actualResul = driver.getTitle();

        System.out.print(actualResul);



        driver.close();

    }

}
