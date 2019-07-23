package pages;

import org.jsoup.Connection;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

    protected WebDriver driver;

    public BasePage()
    {
        new BasePage(driver);
    }

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
