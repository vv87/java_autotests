package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By username=By.id("mailbox:login");
    By password=By.id("mailbox:password");
    By loginButton=By.id("mailbox:submit");

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void typeUserName()
    {
        driver.findElement(username).sendKeys("test_testov_1970");
    }

    public void typePassword()
    {
        driver.findElement(password).sendKeys("gracekelly12345");
    }

    public void clickOnLoginButton()
    {
        driver.findElement(loginButton).click();

    }
}
