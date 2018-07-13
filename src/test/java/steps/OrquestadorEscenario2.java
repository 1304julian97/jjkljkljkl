package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "classpath: ./src/test/java/steps",
        features = "classpath: /Users/julian/git/practicaAutomatizacion/src/test/java/features")
public class OrquestadorEscenario2 {

}
