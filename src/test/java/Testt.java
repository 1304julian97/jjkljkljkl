import io.vavr.control.Try;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Testt {


    WebDriver webDriverChrome = null;
    WebDriver webDriverFireFox = null;

    @Before
    public void inicializarDriver()
    {
        System.setProperty("webdriver.chrome.driver","/home/s4n/practicaAutomatizacion/chromedriver");
        webDriverChrome = new ChromeDriver();
        webDriverChrome.manage().window().maximize();
    }

    //@After
    public void cerrarNavegador()
    {
        webDriverChrome.close();
    }


    @Test
    public void abrirNavegador()
    {
        webDriverChrome.get("http://s4n.co/");
        WebElement botonesIdioma =  webDriverChrome.findElement(By.xpath("//a[@class='btn-idioma']"));
        botonesIdioma.click();
        String titulo = webDriverChrome.getTitle();
        System.out.println(titulo);
    }

    @Test
    public void verificarCambioDeIdiomaDeInglesAEspaniol()
    {
        webDriverChrome.get("http://s4n.co/");
        WebElement botonIdiomaEspaniol =  webDriverChrome.findElement(By.xpath("//a[@class='btn-idioma']"));
        botonIdiomaEspaniol.click();
        WebElement nuestraOferta = webDriverChrome.findElement(By.xpath("//a[contains(text(),'Nuestra Oferta')]"));
        nuestraOferta.click();
    }

    @Test(expected = NoSuchElementException.class)
    public void verificarBotonesEnIngles()
    {
        webDriverChrome.get("http://s4n.co/");
        WebElement nuestraOferta = webDriverChrome.findElement(By.xpath("//a[contains(text(),'Nuestra Oferta')]"));
        nuestraOferta.click();
    }

    @Test
    public void enviarCorreo()
    {
        webDriverChrome.get("https://mail.google.com/mail/u/0/#inbox");
        String idTxtCorreo = "identifierId";
        WebElement campoTxtCorreo = webDriverChrome.findElement(By.id(idTxtCorreo));
        campoTxtCorreo.sendKeys("juliancarvajal@seven4n.com");
        String xPathBotonNext = "//span[contains(text(),'Next')]";
        WebElement botonNextLogin = webDriverChrome.findElement(By.xpath(xPathBotonNext));
        botonNextLogin.click();
        String xPathContrasenia = "//div[@id='password']//input[@class='whsOnd zHQkBf']";
        Try<WebElement> txtContrasenia= Try.of(()->{
            Thread.sleep(5000);
            return webDriverChrome.findElement(By.xpath(xPathContrasenia));
        });
        txtContrasenia.get().sendKeys("juli1304");
        String xPathBotonNextContrasenia = "//span[contains(text(),'Next')]";
        WebElement botonNextContrasenia = webDriverChrome.findElement(By.xpath(xPathBotonNextContrasenia));
        botonNextContrasenia.click();
        String xPathBotonCompose = "//div[@class='T-I J-J5-Ji T-I-KE L3']";
        Try<WebElement> botonCompose = Try.of(()->{
            Thread.sleep(7000);
            return webDriverChrome.findElement(By.xpath(xPathBotonCompose));
        });
        botonCompose.get().click();

        String xPathPara = "/html[1]/body[1]/div[10]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/textarea[1]";
        Try<WebElement> txtPara = Try.of(()->{
            Thread.sleep(5000);
            return webDriverChrome.findElement(By.xpath(xPathPara));
        });
        txtPara.get().sendKeys("julian.t97@hotmail.com");
        String idAsunto = "/html[1]/body[1]/div[10]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[3]/input[1]";
        WebElement txtAsunto = webDriverChrome.findElement(By.xpath(idAsunto));
        txtAsunto.sendKeys("Asunto de pruebaAutomatizada");
        String idBotonSend = ":kk";
        WebElement botonSend = webDriverChrome.findElement(By.id(idBotonSend));
        botonSend.click();
    }

}