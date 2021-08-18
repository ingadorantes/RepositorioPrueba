package org.Nigt.proyect;

import org.Nigt.utils.BaseClase;
import org.Nigt.utils.ManageWebDriver;
import org.Nigt.utils.Paths;
import org.Nigt.utils.WebDrivers;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    static WebDriver driver;
    static BaseClase baseClase;
    public static ManageWebDriver manageWebDriver;
   // public static String ChromeDriver_win ="chromedriver.exe";
    public static void main(String[] args) {

        //instanciar un objeto WebDriver
        try {

            //Declarar Variables
            String baseURL = "https://petstore.octoperf.com/actions/Catalog.action";
            String actualResul = "";
            String expecteResul = "$16.50";

            //Indicar la locacion del archivo selenium (WebDriver.exe)
           // System.setProperty("webdriver.chrome.driver" , Paths.DRIVER_PATH_WIN + ChromeDriver_win);


            manageWebDriver = new ManageWebDriver(WebDrivers.CHROME);
            driver = manageWebDriver.getDriver();

            //abrir el navegador

            //driver = new ChromeDriver();
            driver.get(baseURL);

            // es para maximar la pantalla solo aplica para windows
            driver.manage().window().maximize();

            //WebElement
            Thread.sleep(5000);
            baseClase.clic("//img[@src='../images/fish_icon.gif']");
           //baseClase.Espera(5);

            baseClase.clic("//*[@id=Catalog]/table/tbody/tr[2]/td[1]/a/font/font");
            baseClase.Espera(3);

            //WebElement mycontent = driver.findElement(By.xpath("//img[@src='../images/fish_icon.gif']"));
            ////*[@id="SidebarContent"]/a[1]
          //  mycontent.click();

            //WebElement mycontent2 = driver.findElement(By.cssSelector("#Catalog>table>tbody>tr:nth-child(2)>td:nth-child(1)>a"));
            //mycontent2.click();

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
