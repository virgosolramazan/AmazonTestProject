package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchProduct {
    WebDriver driver;
    public SearchProduct(WebDriver driver){
        this.driver = driver;
    }
    By search_input = By.id("twotabsearchtextbox");
    By search_btn = By.id("nav-search-submit-button");

    public void search(String searchText){
        driver.findElement(search_input).sendKeys(searchText);
    }
    public void clickSearchBtn(Boolean ClickMethod){
        if(ClickMethod){
            driver.findElement(search_btn).click();
        }
        else if(!ClickMethod){
            driver.findElement(search_btn).sendKeys(Keys.RETURN);
        }
    }
    public void sort(){
        driver.findElement(By.id("a-autoid-0-announce")).click();
    }
    public void select_sort(){
        driver.findElement(By.id("s-result-sort-select_1")).click();
    }
}
