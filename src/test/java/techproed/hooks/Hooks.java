package techproed.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.Assert;
import org.junit.BeforeClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;
import techproed.utilities.ReusableMethods;

public class Hooks {

    /*
    Herbir senaryodan once ya da sonra calismasini istedigimiz metotlari @Before ve @After
kullanarak bu classin icine koyuyoruz. Burada daha cok raporlama icin kodlar kullacagiz.
     */

    @Before
    public void setUp(){
        System.out.println("Before methodu");
    }
    @Before("@Excel")
    public void setUp2(){
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        ExcelUtils excelUtils = new ExcelUtils("src/test/resources/mysmoketestdata.xlsx", "customer_info");
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

    @After
    public void tearDown(Scenario scenario){
        final byte[] failedScreenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()){
            scenario.attach(failedScreenShot,"image/png","faile_scenario"+scenario.getName());
            Driver.closeDriver();
        }

    }
}
