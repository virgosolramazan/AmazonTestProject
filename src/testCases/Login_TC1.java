package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;

public class Login_TC1 {
    public static void main(String[] args) {
        String PATH = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",PATH+"/driver/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com.tr");

        HomePage home = new HomePage(driver);

        LoginPage login = new LoginPage(driver);

        home.clickLogin();

        login.enterEmail("ramazankocademir@gmail.com");
        login.clickContinue();
        login.enterPassword("12047754594");
        login.clickLogin();
        driver.quit();
    }
}
