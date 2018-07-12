package escenarios;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

@CucumberOptions(tags = {"@ejemplo1"}
)
public class TestCucumberEscenario1 {

    @Given("^Dado que yo soy algo$")
    public void dado_que_yo_soy_algo(){
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^tenga el \"([^\"]*)\" valido$")
    public void tenga_el_valido(String arg1){
        System.out.println(arg1);
    }

    @Then("^buscar el \"([^\"]*)\" en google$")
    public void buscar_el_en_google(String arg1) throws Exception {
        open("http://www.google.com");
        $("#lst-ib").setValue(arg1).pressEnter();
        ElementsCollection rtyrtyrty = $$("#ires");
        $$("#ires").findBy(text("Selenide: concise UI tests in Java")).click();
       /* String xpathTitulo = "//article[@class='markdown-body entry-content']//h1";
        $(By.xpath(xpathTitulo)).waitUntil(Condition.exist,5000);
        */close();
    }



    @Given("^dado el nombre \"([^\"]*)\"$")
    public void dado_el_nombre(String nombre) {
        System.out.println(nombre);
    }

    @When("^Ingrese a \"([^\"]*)\"$")
    public void ingrese_a(String direccionUrl){
        open(direccionUrl);
    }

    @Then("^deseo buscar el nombre \"([^\"]*)\"$")
    public void deseo_buscar_el_nombre(String nombreABuscar) {
        $("#lst-ib").setValue(nombreABuscar).pressEnter();
    }


}

