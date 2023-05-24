package techproed.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;
import techproed.utilities.ReusableMethods;

import java.util.List;
import java.util.Map;

public class BlueRentalCarStepDefinition {
    BlueRentalPage blueRentalPage = new BlueRentalPage();

    @Given("kullanci Blue rental car sayfasina gider")
    public void kullanci_blue_rental_car_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));
    }

    @When("login olur")
    public void login_olur(DataTable dataTable) {
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        blueRentalPage.login.click();

        for (int i = 1; i < dataTable.asLists().size(); i++) {
            blueRentalPage.email.sendKeys(dataTable.row(i).get(0));
            blueRentalPage.pass.sendKeys(dataTable.row(i).get(1), Keys.ENTER);

            blueRentalPage.logOutDdm.click();
            blueRentalPage.logOut.click();
            blueRentalPage.areYouSure.click();

            blueRentalPage.login.click();
        }

    }

    @When("login olur map")
    public void loginOlurMap(DataTable table) throws InterruptedException {
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        //Datayı birinci satırı Key olarak kabul eden List<Map> data türüne çavirdik.
        List<Map<String, String>> bilgiler = table.asMaps();//[{emailadress=jack@gmail.com, password=12345}, {emailadress=sam.walker@bluerentalcars.com, password=c!fas_art}]
        System.out.println("bilgiler = " + bilgiler);

        for (Map<String, String> w : bilgiler) {//Her bir Map'i alarak "Key değerlerini kullanarak "Value" değerlerini çağırdık ve testimizde kullandık.

            blueRentalPage.login.click();
            blueRentalPage.email.sendKeys(w.get("emailadress"));
            blueRentalPage.pass.sendKeys(w.get("password"), Keys.ENTER);
            Thread.sleep(1000);

            //Çıkış yapıp diğer data ile giriş yapacağız
            blueRentalPage.logOutDdm.click();
            blueRentalPage.logOut.click();
            blueRentalPage.areYouSure.click();
            Thread.sleep(1000);

        }
    }


    @Then("Verilen_kullanicilar_ile_login_olunur")
    public void verilen_kullanicilar_ile_login_olunur(DataTable data) {
        System.out.println(data.asMaps());//maplerden olusan bir list olusturlur
//fearture file'daki olusturmus oldugumuz tabloyu map olarak listeler.
        //basligi key olarak alir altindaki verileri value olarak alir.
        for (Map<String, String> w : data.asMaps()) {
            blueRentalPage.login.click();
            blueRentalPage.email.sendKeys(w.get("emailAdress"),
                    Keys.TAB, w.get("password"), Keys.ENTER);
            blueRentalPage.logOutDdm.click();
            blueRentalPage.logOut.click();
            blueRentalPage.areYouSure.click();

        }


    }

    @And("kullanici exceldeki {string} sayfasindaki kullanici bilgileri ile login olur")
    public void kullaniciExceldekiSayfasindakiKullaniciBilgileriIleLoginOlur(String sayfaAdi) {

        ExcelUtils excelUtils = new ExcelUtils("src/test/resources/mysmoketestdata.xlsx", sayfaAdi);
        for (int i = 1; i <=excelUtils.rowCount(); i++) {
            String email = excelUtils.getCellData(i, 0);
            String password = excelUtils.getCellData(i, 1);
            blueRentalPage.login.click();
            blueRentalPage.email.sendKeys(email, Keys.TAB, password, Keys.ENTER);
            blueRentalPage.logOutDdm.click();
            blueRentalPage.profile.click();
            ReusableMethods.bekle(3);
            Assert.assertEquals(blueRentalPage.verifyEmail.getText(), email);
            blueRentalPage.logOutDdm.click();
            blueRentalPage.logOut.click();
            blueRentalPage.areYouSure.click();

        }

    }


    @Given("kullanici_blueRentACarUrl_sayfasina_gider_exceldeki_verilerle_login_olur")
    public void kullanici_bluerentacarurl_sayfasina_gider_exceldeki_verilerle_login_olur() {
        System.out.println("BlueRentalPage Sayfasına Gidildi Exceldeki Veriler ile login olundu");
    }
}
