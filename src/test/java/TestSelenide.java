import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.vavr.collection.List;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.allMatch;
import static com.codeborne.selenide.CollectionCondition.anyMatch;
import static com.codeborne.selenide.CollectionCondition.noneMatch;
import static com.codeborne.selenide.Condition.match;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;


public class TestSelenide {

    public TestSelenide()
    {
        System.out.println("helloo");
    }


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
        sleep(6000);
        $(byXpath("/html[1]/body[1]/form[1]/div[5]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[35]/a[1]/img[1]")).click();
        switchTo().window(2).findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]")).click();
        //$(byXpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]")).click();
        sleep(10000);
        switchTo().window("calendario-tributario-2018");
        sleep(7000);
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
        open("https://demoqa.com/automation-practice-table/");
        SelenideElement selenideElement = $x("//tr[4]//td[6]/a");
        $x("//tr[4]//td[6]").$x("tr").should(match("all should be the same", x-> {
            System.out.println(x.toString());
            return x.getText().equals("details");
        }));

    }

    @Test
    public void search3(){
        open("https://demoqa.com/automation-practice-table/");
        SelenideElement selenideElement = $x("//td");
        $x("//td").should(match("all should be the same", x-> {
            System.out.println(x.getText());
            return x.getText().equals("details");
        }));

    }

    @Test
    public void sibling(){
        open("https://demoqa.com/automation-practice-table/");
        SelenideElement selenideElement = $x("//table[@class='tsc_table_s13']/tbody/tr/th").sibling(0);
        List<SelenideElement> lista = List.range(0, 7).map(x-> $x("//table[@class='tsc_table_s13']/tbody/tr/th").sibling(x));
        List.range(0,7).zip(lista).forEach(x-> System.out.println(x._1+" -> "+x._2.getText()));


    }

    @Test
    public void parent(){
        open("https://demoqa.com/automation-practice-table/");
        SelenideElement selenideElement = $x("//table[@class='tsc_table_s13']/tbody/tr/th").parent().parent().parent();
        selenideElement.shouldHave(Condition.cssClass("tsc_table_s13"));

    }

    @Test
    public void preceding(){
        open("https://demoqa.com/automation-practice-table/");
        List<SelenideElement> map = List.range(0, 4).map(x -> $x("//table[@class='tsc_table_s13']/tbody/tr/td[5]").preceding(x));
        List.range(0,4).zip(map).forEach(x-> System.out.println(x._1+" -> "+x._2.getText()));

    }


}
