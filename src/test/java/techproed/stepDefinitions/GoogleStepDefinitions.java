package techproed.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class GoogleStepDefinitions {
    GooglePage googlePage = new GooglePage();
    @Given("kullanici_google_anasayfaya_gider")
    public void kullanici_google_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("google_Url"));
        //throw new io.cucumber.java.PendingException();
    }
    @When("kullanici googleda {string} aratir")
    public void kullanici_googleda_aratir(String aranacakKelime) {
       googlePage.aramaKutusu.sendKeys(aranacakKelime,Keys.ENTER);

    }
    @Then("title'in {string} icerdigini dogrula")
    public void title_in_icerdigini_dogrula(String titleDegeri) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(titleDegeri));

    }

    @And("kullanici_{int}_saniye_bekler")
    public void kullanici__saniye_bekler(int saniye) {
        try{
            Thread.sleep(1000*saniye);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }

    }

    @When("kullanici verilen bilgileri aratir")
    public void kullaniciVerilenBilgileriAratir(DataTable dataTable) {

        for (int i = 1; i <dataTable.asList().size() ; i++) {
            googlePage.aramaKutusu.sendKeys(dataTable.asList().get(i),Keys.ENTER);
            googlePage.aramaKutusu.clear();
        }

    }
}
