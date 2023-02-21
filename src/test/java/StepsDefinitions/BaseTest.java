package StepsDefinitions;

import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import Actions.loginPage;
import org.openqa.selenium.support.PageFactory;

import javax.swing.*;

public class BaseTest {
    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome","https://demo.guru99.com/test/newtours/index.php");
    loginPage loginPage = PageFactory.initElements(driver, loginPage.class);
}
