package Steps;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginSteps {
    DialogContent dc =new DialogContent();

    @Given("Navigate to Web Page {string}")
    public void navigateToWebPage(String url)
    {
        GWD.getDriver().get(url);
    }
    @Given("Navigate to QA Environment")
    public void navigateToQAEnvironment() {GWD.getDriver().get("https://across-qa-v3.demo.i4.energy");}
    @Given("Navigate to Testing Environment")
    public void navigateToTestingEnvironment() {GWD.getDriver().get("https://across-testing-v3.demo.i4.energy/");}

    @When("User Enters Email {string} and Password {string} and Click Button")
    public void userEntersEmailAndPasswordAndClickButton(String username, String password)
    {
        dc.pageSizeZoomOut();
        dc.findAndSend("username",username);
        dc.findAndSend("password",password);

        do {    //it might be changed as up to a certain number of trials.
            try {
                dc.findAndClick("loginButton");
                if (GWD.getDriver().getCurrentUrl().contains("dashboard"))
                    break;
            }catch (Exception e){break;}
        }while (true);

    }

    @When("Login with MAS user credentials")
    public void loginWithMASUserCredentials()
    {
        dc.pageSizeZoomOut();
        dc.findAndSend("username","mas@maseurope.com");
        dc.findAndSend("password","CurlsUsherSellsRecapMustangMesh");
        dc.findAndClick("loginButton");
    }

    @When("Login with QA user credentials")
    public void loginWithQAUserCredentials()
    {
        dc.pageSizeZoomOut();
        dc.findAndSend("username","qualityassurance");
        dc.findAndSend("password","qa123456!");
        dc.findAndClick("loginButton");
    }

    @Then("Login should be successfully")
    public void loginShouldBeSuccessfully()
    {
        //dc.verifyCurrentUrl("home-page");
        dc.waitUntilTitleIs("Across i4Energy");


    }

    // this can be use when language chages as defaul Greek
//    @And("Change language to English")
//    public void changeLanguageToEnglish() {
//
//        dc.findAndClick("languageButton");
//        dc.findAndClick("english");
//    }

    @And("User should accept secure alert")
    public void userShouldAcceptSecureAlert()
    {
        dc.findAndClickLong("sendAnyway"); // this is for long click to perform the click with action method
    }
}
