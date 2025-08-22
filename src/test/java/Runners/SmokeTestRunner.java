package Runners;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(

        tags = "@SmokeTest",
        features = {"src/test/java/Features"},
        glue = {"Steps"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class SmokeTestRunner extends AbstractTestNGCucumberTests {

//        @BeforeClass
//        @Parameters("browser")
//        public void beforeClass(String browser)
//        {
//            GWD.threadBrowser.set(browser);
//        }

}
