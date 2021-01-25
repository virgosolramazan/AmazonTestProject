package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCart {
    WebDriver driver;
    public AddCart(WebDriver driver){this.driver = driver;}

    By product = By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div[1]/span[3]/div[2]/div[2]/div[1]/span[1]/div[1]/div[1]/div[2]/h2[1]/a[1]/span[1]");
    By add_cart_product = By.id("add-to-cart-button");
    By view_cart = By.id("hlb-view-cart");
    By quantity_selector = By.id("a-autoid-0");
    By quantity_select = By.xpath("//*[@id=\"a-popover-1\"]/div/div/ul/li[3]");
    By delete = By.xpath("/html/body/div[1]/div[4]/div/div[7]/div/div[2]/div[2]/div/form/div[2]/div[3]/div[4]/div/div[1]/div/div/div[2]/div[1]/span[2]/span/input");

    public void clickProduct(){

        WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(product));
        driver.findElement(product).click();
    }
    public void addCartProduct(){
        driver.findElement(add_cart_product).click();
    }
    public void getCart(){
        driver.findElement(view_cart).click();
    }
    public void quantitySelector(){
        driver.findElement(quantity_selector).click();
    }
    public void quantitySelect(){
        driver.findElement(quantity_select).click();
    }
    public void deleteItem(){

        WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.elementToBeClickable(delete));
        driver.findElement(delete).click();
    }

}
