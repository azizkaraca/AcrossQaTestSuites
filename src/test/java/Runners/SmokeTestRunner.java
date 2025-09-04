package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        tags = "@SmokeTest",
        features = {"src/test/java/Features"},
        glue = {"Steps"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class SmokeTestRunner extends AbstractTestNGCucumberTests {

    // Below code block for cross browser tests which is run from XML Files
    // It should be open if the job runs by in XML Files with, so it can take the browser from there

//    @BeforeClass
//    @Parameters("browser")
//    public void beforeClass(String browser)
//    {
//        GWD.setBrowser(browser);
//    }

}
