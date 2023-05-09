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
@CucumberOptions(
                    plugin = {
                            "pretty",
                            "html:target/default-cucumber-reports.html",
                            "json:target/json-reports/cucumber.json",
                            "junit:target/xml-report/cucumber.xml"

                    },
                        monochrome = true,
                    features = "src/test/resources/features/",
                    glue = {"techproed/stepDefinitions"}, //glue parametresi ile kodlarimzi yazdigimiz step definition classinin packageni belirtiriz
                    tags = "@MedunnaRoom",
                    dryRun = false )
/*
features ===> features'ların olduğu packega'ın yolunu ver(ContentRoot)
glue ====> stepDefinition'ların olduğu packega'ın yolunu ver(Source Root)
tags ====> çalıştırmak istediğin grubu yaz
dryRun = true  ===> Missing Strep Definitions(Eksik) tespiti için kullanılır. Testi çalıştırmaz.
 */

public class Runner {

}
