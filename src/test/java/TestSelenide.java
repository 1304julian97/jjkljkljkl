import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.conditions.Text;
import com.codeborne.selenide.impl.Navigator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import java.util.Arrays;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;


public class TestSelenide {

    @Before
    public void configurarNavegador()
    {
        System.setProperty("webdriver.gecko.driver","./src/drivers/geckodriver");
        System.setProperty("webdriver.chrome.driver","./src/drivers/chromedriver");
       System.setProperty("selenide.browser", "Chrome");
    }

    @Test
    public void search2(){
        open("http://www.rionegro.gov.co/Paginas/calendario-tributario-2018.aspx");
        sleep(4000);
        System.out.println("El título es: "+title());
        $(byXpath("/html[1]/body[1]/form[1]/div[5]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[35]/a[1]/img[1]")).click();
        sleep(10000);
        //switchTo().window("Colombia Compra Eficiente | Colombia Compra Eficiente");;
        System.out.println("El título 2 es: "+title());
        sleep(5000);
        switchTo().window("calendario-tributario-2018");
        System.out.println("El título 3 es: "+title());
        $(byXpath("/html[1]/body[1]/form[1]/div[5]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[32]/a[1]/img[1]")).click();
        sleep(5000);
    }

    @Test
    public void enviarCorreo()
    {
        open("https://mail.google.com/mail/u/0/#inbox");
        $("#identifierId").setValue("juliancarvajal@seven4n.com").pressEnter();
        String xPathContrasenia = "//div[@id='password']//input[@class='whsOnd zHQkBf']";
        $(By.xpath(xPathContrasenia)).waitUntil(Condition.exist,5000).setValue("juli1304").pressEnter();
        String xPathBotonCompose = "//div[@class='T-I J-J5-Ji T-I-KE L3']";
        $(By.xpath(xPathBotonCompose)).waitUntil(Condition.exist,5000).click();
        String xPathPara = "/html[1]/body[1]/div[10]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/textarea[1]";
        $(By.xpath(xPathPara)).setValue("julian.t97@hotmail.com");
        String xPathAsunto = "/html[1]/body[1]/div[10]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[3]/input[1]";
        $(By.xpath(xPathAsunto)).setValue("Holaaa Prueba Automatización");

        String xPathBotonSend = "/html[1]/body[1]/div[10]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[2]";
        $(By.xpath(xPathBotonSend)).waitUntil(Condition.exist,5000).click();
        $(By.xpath(xPathBotonSend)).waitUntil(Condition.not(Condition.exist
        ),5000).shouldBe(Condition.not(Condition.exist));
    }

    @Test
    public void search(){
        open("http://www.google.com");
        $("#lst-ib").setValue("Selenide").pressEnter();
        ElementsCollection rtyrtyrty = $$("#ires");
        $$("#ires").findBy(text("Selenide: concise UI tests in Java")).click();
        String xpathTitulo = "//article[@class='markdown-body entry-content']//h1";
        $(By.xpath(xpathTitulo)).waitUntil(Condition.exist,5000);
    }


}
