package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class DemoQAPage {
    public DemoQAPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//*[@class='card mt-4 top-card'])[3]")
    public WebElement aFWButonu;
    @FindBy(xpath = "//*[text()='Please select an item from left to start practice.']")
    public WebElement message;


}
