package techproed.pages;

import io.netty.buffer.ByteBuf;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class BlueRentalPage {


        public BlueRentalPage(){
                PageFactory.initElements(Driver.getDriver(),this);
        }


        @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
        public WebElement login;

        @FindBy(id = "formBasicEmail")
        public WebElement email;

        @FindBy(xpath = "//*[@id='formBasicPassword']")
        public WebElement pass;
        @FindBy(id = "dropdown-basic-button")
        public WebElement verify;
        @FindBy( xpath = "//*[@class='invalid-feedback']")
        public WebElement hataMesaji;
        @FindBy(id = "dropdown-basic-button")
        public WebElement logOutDdm;
        @FindBy(xpath = "(//*[@class='dropdown-item'])[3]")
        public WebElement logOut;
        @FindBy(xpath = "//*[@class='ajs-button ajs-ok']")
        public WebElement areYouSure;


//-------------------------------------------------------------------------------


        @FindBy(xpath = "//*[@name='car']")
        public WebElement aracSecimi;
        @FindBy (xpath = "(//*[@class='form-control is-invalid'])[1]")
        public WebElement pickUp;

        @FindBy (xpath = "(//*[@class='form-control is-invalid'])[2]")
        public WebElement dropOff;
        @FindBy (xpath = "(//*[@class='form-control is-invalid'])[3]")
        public WebElement pickUpDate;
        @FindBy (xpath = "(//*[@class='form-control is-invalid'])[4]")
        public WebElement dropOffDate;
        @FindBy (xpath = "(//*[@class='form-control'])[2]")
        public WebElement dropOffTime;
        @FindBy (xpath = "(//*[@class='form-control is-invalid'])[3]")
        public WebElement pickUpTime;

        @FindBy(xpath = "//*[@class='w-100 btn btn-primary btn-lg']")
        public  WebElement continueReservation;

        @FindBy(xpath = "//*[@role='alert']")
        public  WebElement uyariMesaji;

        @FindBy(xpath = "//*[text()='Profile']")
        public WebElement profile;

        @FindBy(xpath = "//em")
        public WebElement verifyEmail;
}
