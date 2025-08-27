package Runners;

import Utilities.GWD;
import io.cucumber.testng.*;
import org.testng.Reporter;
import org.testng.annotations.*;

@CucumberOptions(

        tags = "@SmokeTest",
        features = {"src/test/java/Features"},
        glue = {"Steps"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class SmokeTestRunner {

    private TestNGCucumberRunner testNGCucumberRunner;

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

    @Test(dataProvider = "scenarios", description = "Runs Cucumber Scenarios")
    public void runScenario(PickleWrapper pickleWrapper, FeatureWrapper featureWrapper) {
        Reporter.log("Scenario: " + pickleWrapper.getPickle().getName(), true);
        testNGCucumberRunner.runScenario(pickleWrapper.getPickle());
    }

    @DataProvider
    public Object[][] scenarios() {
        return testNGCucumberRunner.provideScenarios();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        testNGCucumberRunner.finish();
    }
}

//public class SmokeTestRunner extends AbstractTestNGCucumberTests {

    // below block should be open if the job runs by in XML Files, so it can take the browser from there

//    @BeforeClass
//    @Parameters("browser")
//    public void beforeClass(String browser)
//    {
//        GWD.setBrowser(browser);
//    }

//}
