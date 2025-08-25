package Runners;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = {"src/test/java/Features/TC01_Login.feature",
                    "src/test/java/Features/???.feature"}, //I add here what I want to make as parallel test
        glue = {"Steps"}
)

public class _05_ParallelTestRunner extends AbstractTestNGCucumberTests {

    @BeforeClass//(alwaysRun = true)
    @Parameters("browser")
    public void beforeClass(String browser)
    {
//        GWD.threadBrowser.set(browser);
    }


}
