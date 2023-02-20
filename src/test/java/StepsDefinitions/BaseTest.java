package StepsDefinitions;

import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome","https://demo.guru99.com/test/newtours/");
}
