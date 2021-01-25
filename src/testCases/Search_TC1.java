package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchProduct;

public class Search_TC1 {
    public static void main(String[] args) {
        String PATH = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",PATH+"/driver/chrome/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com.tr");


        HomePage home = new HomePage(driver);

        LoginPage login = new LoginPage(driver);

        SearchProduct searchProduct = new SearchProduct(driver);

        home.clickLogin();

        login.enterEmail("ramazankocademir@gmail.com");
        login.clickContinue();
        login.enterPassword("12047754594");
        login.clickLogin();

        searchProduct.search("Redmi Note 8");
        searchProduct.clickSearchBtn(true);// True butona tıklar False Enter tuşuna basar.
        searchProduct.sort();
        searchProduct.select_sort();
        driver.quit();
    }


}
