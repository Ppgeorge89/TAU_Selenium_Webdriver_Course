package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By hotSpotBox = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver){
        this.driver = driver;
    }

    public void rightClickHotSpotBox(){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(hotSpotBox)).perform();
    }

    public String getPopUpText(){
        return driver.switchTo().alert().getText();
    }

    public void clickOkButton(){
        driver.switchTo().alert().accept();
    }

}
