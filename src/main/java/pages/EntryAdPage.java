package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage {

    private WebDriver driver;
    private By closeButton = By.className("modal-footer");

    public EntryAdPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickCloseButton(){
        driver.findElement(closeButton).click();
    }
}
