package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.java8.En;
import cucumber.api.java8.Es;


public class TestEscenarioParaJava8 implements En {

    public void TestEscenarioParaJava8()
    {
        Given("^un (\\d+)$", (Integer arg1) -> {

        });

        When("^se suma con otro (\\d+)$", (Integer arg1) -> {

        });

        Then("^me debe de arrojar la respuestaa correcta (\\d+)$", (Integer arg1) -> {

        });

    }


}
