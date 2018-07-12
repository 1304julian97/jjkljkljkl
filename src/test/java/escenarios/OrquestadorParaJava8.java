package escenarios;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:reports/cucumber-html-report","json:cucumber.json"})
public class OrquestadorParaJava8 {
}
