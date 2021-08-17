package org.Nigt.Basico;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    static WebDriver driver;
    public static String ChromeDriver_win ="chromedriver.exe";
    public static void main(String[] args) {

        //instanciar un objeto WebDriver
        try {

            //Declarar Variables
            String baseURL = "https://petstore.octoperf.com/actions/Catalog.action";
            String actualResul = "";
            String expecteResul = "$16.50";

            //Indicar la locacion del archivo selenium (WebDriver.exe)
            System.setProperty("webdriver.chrome.driver" , Constantes.DRIVER_PATH_WIN + ChromeDriver_win);

            //abrir el navegadorS
            driver = new ChromeDriver();
            driver.get(baseURL);
            // es para maximar la pantalla solo aplica para windows
            driver.manage().window().maximize();

            //WebElement

            WebElement mycontent = driver.findElement(By.xpath("//img[@src='../images/fish_icon.gif']"));
            ////*[@id="SidebarContent"]/a[1]
            mycontent.click();

            WebElement mycontent2 = driver.findElement(By.cssSelector("#Catalog>table>tbody>tr:nth-child(2)>td:nth-child(1)>a"));
            mycontent2.click();

            WebElement mycontent3 = driver.findElement(By.cssSelector("#Catalog>table>tbody>tr:nth-child(2)>td:nth-child(4)"));
            actualResul = mycontent3.getText();


            if (actualResul.contentEquals(expecteResul)) {
                System.out.print("La prueba es correcta");
            } else {
                System.out.print("La prueba es incorrecta");
            }




        }catch (NoSuchElementException me){

            System.err.println("No se encontro el WebElemen: "+ me.getMessage());

        }catch (WebDriverException we){

            System.err.println("WebElemen falló: "+ we.getMessage());

        }catch (Exception ne){
            System.err.println(ne.getMessage());
        }

        finally {
            driver.close();
        }

    }

}
