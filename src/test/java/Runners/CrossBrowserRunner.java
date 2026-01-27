package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/Features/TC01_Login.feature"},
        glue = {"Steps"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)


public class CrossBrowserRunner extends AbstractTestNGCucumberTests {

    // it should be open if the job runs by xml so it can take the browser from there
//    @BeforeClass
//    @Parameters("browser")
//    public void beforeClass(String browser)
//    {
//        GWD.setBrowser(browser);
//    }


}
