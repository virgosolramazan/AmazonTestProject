package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    By LoginBtn = By.xpath("//*[@id=\"nav-link-accountList\"]");
    public void clickLogin(){
        driver.findElement(LoginBtn).click();

    }
}
