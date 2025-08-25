package Runners;

import Utilities.GWD;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        features = {"src/test/java/Features/TC01_Login.feature"},
        glue = {"Steps"},
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class _04_CrossBrowserRunner extends AbstractTestNGCucumberTests {

//    @BeforeClass
//    @Parameters("browser")
//    public void beforeClass(String browser)
//    {
//        GWD.setBrowser(browser);
//    }


}
