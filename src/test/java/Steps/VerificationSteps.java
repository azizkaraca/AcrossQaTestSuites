package Steps;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class VerificationSteps {
    DialogContent dc = new DialogContent();

    @Then("User should see verify message")
    public void userShouldSeeVerifyMessage(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndVerify(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }

    @Then("User verify the necessary element is displayed")
    public void userVerifyTheNecessaryElementDisplayed(DataTable element) {
        List<String> listElement = element.asList(String.class);

        for (int i = 0; i < listElement.size(); i++)
            dc.findAndVerify(listElement.get(i));

    }

    @And("User should wait until url contains")
    public void userShouldWaitUntilUrlContains(String element) {
        dc.waitUntilUrlContains(element);
    }
}
