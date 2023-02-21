package StepsDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.runner.RunWith;

@Feature("New Tours")
@Story("Login to New Tours")
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features",
        glue = {"StepsDefinitions"},
        monochrome = true,
        plugin = {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})
public class testRunner {



}
