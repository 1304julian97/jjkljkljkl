import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class Testt {


    WebDriver webDriver = null;

    @Before
    public void inicializarDriver()
    {
        System.setProperty("webdriver.chrome.driver","/home/s4n/practicaAutomatizacion/chromedriver");
        webDriver = new ChromeDriver();
    }

    @After
    public void cerrarNavegador()
    {
        webDriver.close();
    }


    @Test
    public void abrirNavegador()
    {

        webDriver.manage().window().maximize();
        webDriver.get("http://www.uco.edu.co/");
        WebElement cabecera = webDriver.findElement(By.id("menufixed"));
        List<WebElement> servicios_en_línea = cabecera.findElements(By.linkText("Servicios En Línea"));
        servicios_en_línea.get(0).click();
        assertTrue(true);
    }

}
