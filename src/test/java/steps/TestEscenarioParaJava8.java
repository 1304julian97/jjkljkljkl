package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java8.En;

public class TestEscenarioParaJava8 implements En {


    /*
    NOTA:
        Cuando inicialmente no funcione el los tests con java8 Eliiminar ARchivos de configuración
        Cahcé del Ide, reconstruir el proyecto, y finalmente reiniciar el IDE.
     */

    public TestEscenarioParaJava8()
    {
        Given("^un (\\d+)$", (Integer arg1) -> {
            System.out.println("El numero es: "+arg1);
        });

        When("^se suma con otro (\\d+)$", (Integer arg1) -> {
            System.out.println("El segundo número es: "+arg1);
        });

        Then("^me debe de arrojar la respuestaa correcta (\\d+)$", (Integer arg1) -> {
            System.out.println("La respuesta es: "+arg1);
        });


    }

}

