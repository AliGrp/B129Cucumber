package techproed.pages;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class GooglePage {
    public GooglePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[@id='APjFqb']")
    public WebElement aramaKutusu;

    @FindBy(id = "result-stats")
    public WebElement domatesVerify;
    @FindBy(id = "result-stats")
    public WebElement patatesVerify;

}
