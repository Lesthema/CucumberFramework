package StepsDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginTests extends BaseTest {
    @Given("New Tours Login page is displayed")
    public void new_tours_login_page_is_displayed() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://demo.guru99.com/test/newtours/");

    }
    @And("user enters username and password")
    public void user_enters_username_and_password() {
        driver.findElement(By.xpath("//input[contains(@name,'userName')]")).sendKeys("test");
        driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("test");

    }
    @And("user click submit button")
    public void user_click_submit_button() {
        driver.findElement(By.xpath("//input[contains(@name,'submit')]")).click();

    }
    @Then("Home page is displayed")
    public void home_page_is_displayed() {
        WebElement loginSuccess = driver.findElement(By.xpath("//h3[contains(.,'Login Successfully')]"));
        Assert.assertEquals(loginSuccess.getText(),"Login Successfully");

    }

}
