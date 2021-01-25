package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    By email_input = By.id("ap_email");
    By continue_btn = By.id("continue");
    By password_input = By.id("ap_password");
    By login_btn = By.id("signInSubmit");


    public void enterEmail(String email){
        driver.findElement(email_input).sendKeys(email);
    }

    public void enterPassword(String password){
        driver.findElement(password_input).sendKeys(password);
    }

    public void clickContinue(){
        driver.findElement(continue_btn).click();
    }

    public void clickLogin(){
        driver.findElement(login_btn).click();
    }
}
