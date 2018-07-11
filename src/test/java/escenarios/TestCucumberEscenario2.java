package escenarios;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;

@CucumberOptions(features={"/home/s4n/practicaAutomatizacion/practicaAutomatizacion/src/test/java/escenarios"})
public class TestCucumberEscenario2 {


    private void buscarEnGoogle(String busqueda)
    {
        $("#lst-ib").setValue(busqueda).pressEnter();
        close();
    }
    @Given("^Yo compro un Camisa deportiva Nike en una tienda$")
    public void yo_compro_un_Camisa_deportiva_Nike_en_una_tienda() throws Exception {
        System.out.println("Parcee, me compré esta camisa");

    }

    @When("^Cuando ingrese a \"([^\"]*)\"$")
    public void cuando_ingresssssssssssssssssssssssse_a(String url) throws Exception {
        open(url);
    }

    @Then("^yo busco su descripción PoliesterXYZ$")
    public void yo_busco_su_descripción_PoliesterXYZ() throws Exception {
        buscarEnGoogle("PoliesterXYZ");
    }

    @Given("^Yo compro un iPhone en una tienda$")
    public void yo_compro_un_iPhone_en_una_tienda() throws Exception {
        System.out.println("parceeee me compré un Iphone");
    }

    @Then("^yo busco su descripción X$")
    public void yoLaDescripcionDeUnIphoneX() throws Exception {
        buscarEnGoogle("IphoneX");
    }

    @Given("^Yo compro un Huawei en una tienda$")
    public void yo_compro_un_Huawei_en_una_tienda() throws Exception {
        System.out.println("Parceeee me compré un Huawei P10 Lite");
    }

    @Then("^yo busco su descripción P(\\d+)Lite$")
    public void yo_busco_su_descripción_P_Lite(int arg1) throws Exception {
        buscarEnGoogle("P"+arg1+"Lite");
    }


}
