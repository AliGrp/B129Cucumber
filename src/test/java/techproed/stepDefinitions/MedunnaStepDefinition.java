package techproed.stepDefinitions;

import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import techproed.pages.MedunnaPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class MedunnaStepDefinition {
    MedunnaPage medunnaPage = new MedunnaPage();
    @Given("{string} adresine git")
    public void adresine_git(String url) {
        Driver.getDriver().get(url);
    }
    @When("kullanici simgesini tikla")
    public void kullanici_simgesini_tikla() {
        medunnaPage.kullaniciSimgesi.click();

    }
    @When("sign in secenegini tikla")
    public void sign_in_secenegini_tikla() {
        medunnaPage.signIn.click();

    }
    @When("username kutusuna {string} gir")
    public void username_kutusuna_gir(String kullanici_Adi) {
        medunnaPage.userName.sendKeys(ConfigReader.getProperty(kullanici_Adi));

    }
    @When("password kutusuna {string} gir")
    public void password_kutusuna_gir(String kullanici_Sifre) {
        medunnaPage.password.sendKeys(ConfigReader.getProperty(kullanici_Sifre));

    }
    @When("remember me radio button'a tikla")
    public void remember_me_radio_button_a_tikla() {
        if (!medunnaPage.rememberMe.isSelected()) {
            medunnaPage.rememberMe.click();
        }


    }
    @When("sign in button'a tikla")
    public void sign_in_button_a_tikla() {
        medunnaPage.girisYap.click();

    }
    @When("items&titles sekmesine tikla")
    public void items_titles_sekmesine_tikla() {
        medunnaPage.itemsTitles.click();

    }
    @When("room secenegine tikla")
    public void room_secenegine_tikla() {
        medunnaPage.roomSecenegi.click();

    }
    @When("create a new room butonunu tikla")
    public void create_a_new_room_butonunu_tikla() {
        medunnaPage.createRoom.click();

    }
    @When("room number kutusuna {string}")
    public void room_number_kutusuna(String string) {
        medunnaPage.roomNumber.sendKeys(string);

    }
    @When("room type drop down'dan {string} sec")
    public void room_type_drop_down_dan_sec(String string) {
        Select select = new Select(medunnaPage.roomType);
        select.selectByVisibleText(string);

    }
    @When("price kutusuna {string}")
    public void price_kutusuna(String string) {
        medunnaPage.roomPrice.sendKeys(string);
    }
    @When("description kutusuna {string} gir")
    public void description_kutusuna_gir(String string) {
        medunnaPage.roomdescription.sendKeys(string);
    }
    @When("save button'a tikla")
    public void save_button_a_tikla() {
        medunnaPage.saveButton.sendKeys(Keys.ENTER);
    }
    @Then("kaydedildi alertini dogrula")
    public void kaydedildi_alertini_dogrula() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(medunnaPage.alert.getText().contains("A new Room is created"));
    }





}
