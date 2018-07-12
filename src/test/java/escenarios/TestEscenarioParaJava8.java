package escenarios;

import cucumber.api.CucumberOptions;
import cucumber.api.java8.En;
import cucumber.api.java8.Es;

@CucumberOptions(
        tags = {"@ejemploJava8"})
public class TestEscenarioParaJava8 implements En {

    public void TestEscenarioParaJava8()
    {
        Given("^un (\\d+)$", (Integer arg1) -> {
            System.out.println("Given");
        });

        When("^se suma con otro (\\d+)$", (Integer arg1) -> {
            System.out.println("When");
        });

        Then("^me debe de arrojar la respuestaa correcta (\\d+)$", (Integer arg1) -> {
            System.out.println("Then");
        });
  /*      Integer[] numero1= {};
        Integer[] numero2 = {};
        Given("^un numeroo (\\d+)$", (Integer numero) -> {
            numero1[0] = numero;
            System.out.println("el primer numero es un: "+numero);
        });

        Given("^se suma con otro numerooss (\\d+)$", (Integer numero) -> {
            numero2[0] = numero;
        });

        Given("^me debe de arrojar la respuesta correcta (\\d+)$", (Integer respuesta) -> {
            if (numero1[0]+numero2[0] != respuesta) throw new Exception("Respuesta incorrecta");
            System.out.println("la suma de: "+ numero1[0] + " y "+numero2[0]+" "+respuesta);
        });
*/
    }


}
