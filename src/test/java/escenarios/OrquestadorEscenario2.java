package escenarios;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"/home/s4n/practicaAutomatizacion/practicaAutomatizacion/src/test/java/escenarios"},
        features = {"/home/s4n/practicaAutomatizacion/practicaAutomatizacion/src/test/java/escenarios"}
        )
public class OrquestadorEscenario2 {

}
