package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class Login_TC1 {
    public static WebDriver driver;
    @BeforeTest
    public void setUpTest(){
        String PATH = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",PATH+"/driver/chrome/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public  void loginCase() {
        driver.get("http://www.amazon.com.tr");

        HomePage home = new HomePage(driver);

        LoginPage login = new LoginPage(driver);

        home.clickLogin();

        login.enterEmail("ramazankocademir@yandex.com");

        login.clickContinue();

        login.enterPassword("bNY7JACBg-M_Xx@");

        login.clickLogin();
    }
    @AfterTest
    public void tearDownTest(){
        driver.close();
        driver.quit();
        System.out.println("Test Success");
    }
}
