package StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class LoginTests extends BaseTest {
    @Given("New Tours Login page is displayed")
    public void new_tours_login_page_is_displayed() {
        loginPage.verifyLoginPageIsDisplayed();
    }

    @And("user enters username and password")
    public void user_enters_username_and_password() {
        loginPage.enterUsernameAndPassword();

    }

    @And("user click submit button")
    public void user_click_submit_button() {
        loginPage.clickSubmit();
    }

    @Then("Home page is displayed")
    public void home_page_is_displayed() {
        loginPage.verifyLoginSuccess();
    }

    @And("Browser is closed")
    public void browserIsClosed() {
        driver.quit();
    }
}
