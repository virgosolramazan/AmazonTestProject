package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.AddCart;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchProduct;

public class AddCart_TC1 {
    public static WebDriver driver;
    @BeforeTest
    public void setUpTest(){
        String PATH = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",PATH+"/driver/chrome/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void addCartCase(){
        driver.get("http://www.amazon.com.tr");
        driver.manage().window().maximize();
        HomePage home = new HomePage(driver);

        LoginPage login = new LoginPage(driver);

        SearchProduct searchProduct = new SearchProduct(driver);
        AddCart addCart = new AddCart(driver);

        home.clickLogin();

        login.enterEmail("ramazankocademir@gmail.com");
        login.clickContinue();
        login.enterPassword("12047754594");
        login.clickLogin();

        searchProduct.search("Redmi Note 8");
        searchProduct.clickSearchBtn(true);// True butona tıklar False Enter tuşuna basar.
        searchProduct.sort();
        searchProduct.select_sort();

        addCart.clickProduct();
        addCart.addCartProduct();
        addCart.getCart();
        addCart.quantitySelector();
        addCart.quantitySelect();
        addCart.deleteItem();
    }
    @AfterTest
    public void tearDownTest() {
        driver.close();
        driver.quit();

    }
}
