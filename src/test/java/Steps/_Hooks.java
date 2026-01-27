package Steps;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class _Hooks {
    //check
    @Before
    public void before()
    {
        System.out.println("Scenario Start");

    }

    @After
    public void after(Scenario scenario)
    {
        System.out.println("Scenario Finished");

        if (scenario.isFailed()){

            TakesScreenshot ts=(TakesScreenshot) GWD.getDriver();
            final byte[] InMemory=ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(InMemory, "image/png","screenshot name");

        }

        GWD.quitDriver();
    }

}
