import io.vavr.control.Try;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;

public class TestFireFox {

    WebDriver webDriverFireFox = null;

    @Before
    public void inicializarDriver()
    {
        System.setProperty("webdriver.gecko.driver","/home/s4n/practicaAutomatizacion/geckodriver");
        webDriverFireFox = new FirefoxDriver();
        webDriverFireFox.manage().window().maximize();
    }

    //@After
    public void cerrarNavegador()
    {
        webDriverFireFox.close();
    }


    @Test
    public void abrirNavegador()
    {
        webDriverFireFox.get("http://s4n.co/");
        WebElement botonesIdioma =  webDriverFireFox.findElement(By.xpath("//a[@class='btn-idioma']"));
        botonesIdioma.click();
        String titulo = webDriverFireFox.getTitle();
        System.out.println(titulo);
    }

    @Test
    public void verificarCambioDeIdiomaDeInglesAEspaniol()
    {
        webDriverFireFox.get("http://s4n.co/");
        WebElement botonIdiomaEspaniol =  webDriverFireFox.findElement(By.xpath("//a[@class='btn-idioma']"));
        botonIdiomaEspaniol.click();
        WebElement nuestraOferta = webDriverFireFox.findElement(By.xpath("//a[contains(text(),'Nuestra Oferta')]"));
        nuestraOferta.click();
    }

    @Test(expected = NoSuchElementException.class)
    public void verificarBotonesEnIngles()
    {
        webDriverFireFox.get("http://s4n.co/");
        WebElement nuestraOferta = webDriverFireFox.findElement(By.xpath("//a[contains(text(),'Nuestra Oferta')]"));
        nuestraOferta.click();
    }

    @Test
    public void enviarCorreo()
    {
        webDriverFireFox.get("https://mail.google.com/mail/u/0/#inbox");
        String idTxtCorreo = "identifierId";
        WebElement campoTxtCorreo = webDriverFireFox.findElement(By.id(idTxtCorreo+"dskjldsafkjldsafjkl"));
        campoTxtCorreo.sendKeys("juliancarvajal@seven4n.com");
        String xPathBotonNext = "//span[contains(text(),'Next')]";
        WebElement botonNextLogin = webDriverFireFox.findElement(By.xpath(xPathBotonNext));
        botonNextLogin.click();
        String xPathContrasenia = "//div[@id='password']//input[@class='whsOnd zHQkBf']";
        Try<WebElement> txtContrasenia= Try.of(()->{
            Thread.sleep(5000);
            return webDriverFireFox.findElement(By.xpath(xPathContrasenia));
        });
        txtContrasenia.get().sendKeys("juli1304");
        String xPathBotonNextContrasenia = "//span[contains(text(),'Next')]";
        WebElement botonNextContrasenia = webDriverFireFox.findElement(By.xpath(xPathBotonNextContrasenia));
        botonNextContrasenia.click();
        String xPathBotonCompose = "//div[@class='T-I J-J5-Ji T-I-KE L3']";
        Try<WebElement> botonCompose = Try.of(()->{
            Thread.sleep(7000);
            return webDriverFireFox.findElement(By.xpath(xPathBotonCompose));
        });
        botonCompose.get().click();

        String xPathPara = "/html[1]/body[1]/div[10]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/textarea[1]";
        Try<WebElement> txtPara = Try.of(()->{
            Thread.sleep(5000);
            return webDriverFireFox.findElement(By.xpath(xPathPara));
        });
        txtPara.get().sendKeys("julian.t97@hotmail.com");
        String idAsunto = "/html[1]/body[1]/div[10]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[3]/input[1]";
        WebElement txtAsunto = webDriverFireFox.findElement(By.xpath(idAsunto));
        txtAsunto.sendKeys("Asunto de pruebaAutomatizada");
        String idBotonSend = ":kk";
        WebElement botonSend = webDriverFireFox.findElement(By.id(idBotonSend));
        botonSend.click();

    }
}
