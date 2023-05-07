package techproed.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
/*
Runner classini testNGde ki gibi .xml file'larda belirttigimiz classlari packagelari veya methodlari nasil calistiriyorsak
Cucumber frameworkunde de Runner Classindaki tags parametresi ile belirttigimiz senaryoyu calistirabiliriz.
 */

//Cucumber ile JUnit'in entegre olmasini saglayan test calistirici notasyondur
@RunWith(Cucumber.class)

//Seneryolarin nerede ve nasil calisacagi, hangi raporu kullanacagiyla alakali secenekleri ayarlariz
@CucumberOptions(features = "src/test/resources/features/day30_ilkFeature",
                    glue = {"techproed/stepDefinitions"}, //glue parametresi ile kodlarimzi yazdigimiz step definition classinin packageni belirtiriz
                     tags = "@gr1 and @gr2" )

public class Runner {

}
