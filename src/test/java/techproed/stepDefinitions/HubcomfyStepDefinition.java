package techproed.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import techproed.pages.HubcomfyPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class HubcomfyStepDefinition {
    HubcomfyPage hubcomfyPage = new HubcomfyPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("kullanici {string} ve {string} girerek login olur")
    public void kullanici_ve_girerek_login_olur(String string, String string2) {
        hubcomfyPage.signInButton.click();
        hubcomfyPage.userNameTexti.sendKeys(ConfigReader.getProperty(string),
                Keys.TAB, ConfigReader.getProperty(string2), Keys.ENTER);
    }

    @Given("signOut butonu gorunurmu dogrula")
    public void sign_out_butonu_gorunurmu_dogrula() {
        Assert.assertTrue(hubcomfyPage.signOut.isDisplayed());

    }

    @Given("kullanici signOut butonuna tiklar")
    public void kullanici_sign_out_butonuna_tiklar() {

        ReusableMethods.click(hubcomfyPage.signOut);
    }

    @Given("kullanici store manager butonuna tiklar")
    public void kullanici_store_manager_butonuna_tiklar() {
        ReusableMethods.click(hubcomfyPage.storeManager);
    }

    @Given("kullanici coupons butonunda add new secenegine tiklar")
    public void kullanici_coupons_butonunda_add_new_secenegine_tiklar() {
        actions.moveToElement(hubcomfyPage.coupons);
        ReusableMethods.click(hubcomfyPage.add);

    }

    @Given("kullanici code textine {string} girer")
    public void kullanici_code_textine_girer(String code) {
        hubcomfyPage.codeTexti.sendKeys(code);
    }

    @Given("kullanci desc textine {string} girer")
    public void kullanci_desc_textine_girer(String description) {
        hubcomfyPage.description.sendKeys(description);
    }

    @Given("kullanici discount type dmm'den {string} secer")
    public void kullanici_discount_type_dmm_den_secer(String ddm) {
        Select select = new Select(hubcomfyPage.discount_typeDDM);
        select.selectByVisibleText(ddm);
    }

    @Given("kullanici coupon amaount textine {string} girer")
    public void kullanici_coupon_amaount_textine_girer(String amaount) {
        hubcomfyPage.coupon_amounTexti.sendKeys(amaount);
    }

    @Given("kullanici expiry date textine {string} girer")
    public void kullanici_expiry_date_textine_girer(String date) {
        hubcomfyPage.expiry_dateTexti.sendKeys(date);
    }

    @Given("kullanici Allow free shipping radio butonunu secer")
    public void kullanici_allow_free_shipping_radio_butonunu_secer() {
        ReusableMethods.click(hubcomfyPage.free_shippingRadioButton);
    }

    @Given("kullanici Show on store radio butonunu secer")
    public void kullanici_show_on_store_radio_butonunu_secer() {
        ReusableMethods.click(hubcomfyPage.show_on_storeRadioButton);
    }

    @Given("kullanici submit butonuna tiklar")
    public void kullanici_submit_butonuna_tiklar() {
        ReusableMethods.click(hubcomfyPage.submitButton);
    }

    @Then("coupon basarili bir sekilde uretildigine dair mesaji dogrular")
    public void coupon_basarili_bir_sekilde_uretildigine_dair_mesaji_dogrular() {
        Assert.assertTrue(hubcomfyPage.verifyMessage.isDisplayed());
    }

    @Then("kullanici coupons secenegine tiklar couponslari gorur")
    public void kullanici_coupons_secenegine_tiklar_couponslari_gorur() {
        Assert.assertTrue(hubcomfyPage.coupons.isDisplayed());
    }


}
