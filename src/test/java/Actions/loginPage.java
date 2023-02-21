package Actions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {

    private WebDriver driver;

    @FindBy(xpath = "//input[@name='userName']")
    WebElement username_xpath;

    @FindBy(xpath = "//input[@name='password']")
    WebElement password_xpath;

    @FindBy(xpath = "//input[@value='Submit']")
    WebElement submitButton_xpath;

    @FindBy(xpath = "//h3[contains(.,'Login Successfully')]")
    WebElement logInSuccessLabel_xpath;


    public loginPage(WebDriver driver) {
        this.driver = driver;
    }

    public loginPage verifyLoginPageIsDisplayed() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://demo.guru99.com/test/newtours/index.php");

        return this;
    }

    public loginPage enterUsernameAndPassword() {
        username_xpath.sendKeys("test");
        password_xpath.sendKeys("test");

        return this;

    }

    public void clickSubmit() {
        submitButton_xpath.click();

    }

    public loginPage verifyLoginSuccess() {
        Assert.assertEquals(logInSuccessLabel_xpath.getText(), "Login Successfully");

        return this;
    }
}

