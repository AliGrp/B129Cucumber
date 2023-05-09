package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class MedunnaPage {

    public MedunnaPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "account-menu")
    public WebElement kullaniciSimgesi;
    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signIn;
    @FindBy(xpath = "//*[@name='username']")
    public WebElement userName;
    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "rememberMe")
    public WebElement rememberMe;

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement girisYap;

    @FindBy(xpath = "//*[text()='Items&Titles']")
    public WebElement itemsTitles;

    @FindBy(linkText = "Room")
    public WebElement roomSecenegi;
    @FindBy(id = "jh-create-entity")
    public WebElement createRoom;

    @FindBy(id = "room-roomNumber")
    public WebElement roomNumber;
    @FindBy(id = "room-roomType")
    public WebElement roomType;

    @FindBy(id = "room-price")
    public WebElement roomPrice;

    @FindBy(id = "room-description")
    public WebElement roomdescription;

    @FindBy(id = "save-entity")
    public WebElement saveButton;
    @FindBy(xpath = "//div[@role='alert']")
    public WebElement alert;



}
