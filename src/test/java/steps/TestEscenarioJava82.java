package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java8.En;

public class TestEscenarioJava82 implements En {

    public TestEscenarioJava82()
    {
        Given("^un dia (\\d+)$", (Integer arg1) -> {
            System.out.println("Hoy es 13");
        });

        When("^sea el mes de \"([^\"]*)\"$", (String arg1) -> {
            System.out.println("Estamos en abril");
        });

        Then("^imprima la fecha de cumpleaños$", () -> {
            System.out.println("Estamos a 13 de abril");
        });


    }

}
