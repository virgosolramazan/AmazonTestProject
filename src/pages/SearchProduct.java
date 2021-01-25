package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchProduct {
    WebDriver driver;
    public SearchProduct(WebDriver driver){
        this.driver = driver;
    }
    By search_input = By.id("twotabsearchtextbox");
    By search_btn = By.id("nav-search-submit-button");
    By sort_btn = By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[2]/div/div/form/span");
    By select_sort_btn = By.xpath("//*[@id=\"s-result-sort-select_1\"]");
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

        driver.findElement(sort_btn).click();
    }
    public void select_sort(){
        WebDriverWait wait = new WebDriverWait(driver,60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(select_sort_btn));
        driver.findElement(select_sort_btn).click();
    }
}
