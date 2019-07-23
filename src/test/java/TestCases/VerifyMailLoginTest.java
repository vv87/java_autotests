package TestCases;

import Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class VerifyMailLoginTest
{

    @Test
    public void verifyValidLogin()
    {
        System.out.println("Starting a browser");
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver75.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        System.out.println("Go to the site");
        driver.get("https://mail.ru/");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("mailbox:submit")));

        LoginPage login=new LoginPage(driver);
        System.out.println("Enter username");
        login.typeUserName();
        System.out.println("Enter password");
        login.typePassword();
        System.out.println("Clicking login button");
        login.clickOnLoginButton();

        System.out.println("Quit driver");
        driver.quit();
    }
}
