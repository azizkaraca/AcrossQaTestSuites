package Steps;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Date;
import java.util.List;

public class CreateDeviceStep {

    DialogContent dc = new DialogContent();

    @And("User selects a Station")
    public void userSelectsAStation(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("User clicks following Buttons")
    public void userClicksFollowingButtons(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("User press the Tab Button on Keyboard Times")
    public void userPressTheTabButtonOnKeyboardTimes(int times) {
        for (int i = 0; i < times; i++)
            dc.TAB();
    }

    @And("User press the Enter Button on Keyboard Times")
    public void userPressTheEnterButtonOnKeyboardTimes(int times) {
        for (int i = 0; i < times; i++)
            dc.ENTER();
    }

    @And("User press the Esc Button on Keyboard Times")
    public void userPressTheEscButtonOnKeyboardTimes(int times) {
        for (int i = 0; i < times; i++)
            dc.ESC();
    }

    @And("User changes languages of relevant fields")
    public void userChangesLanguagesOfRelevantFields(DataTable element) {

        List<String> listElement = element.asList(String.class);

        for (int i = 0; i < listElement.size(); i++)
            dc.findAndClick(listElement.get(i));

    }

    @And("User confirms the selection")
    public void userConfirmsTheSelection(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @Then("User should to find the item in field")
    public void userShouldToFindTheItemInField(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndVerify(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }

    @And("User enters data to necessary areas")
    public void userEntersDataToNecessaryAreas(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));

    }

    @And("User selects necessary areas")
    public void userSelectsNecessaryAreas(DataTable element) {

        List<String> listElement = element.asList(String.class);

        for (int i = 0; i < listElement.size(); i++)
            dc.findAndClick(listElement.get(i));

    }

    @And("User goes to devices")
    public void userGoesToDevices(DataTable element) {

        List<String> listElement = element.asList(String.class);

        for (int i = 0; i < listElement.size(); i++)
            dc.findAndClick(listElement.get(i));

    }

    @And("User search the item")
    public void userSearchTheItem(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {

            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));

        }
    }

    @When("User delete selected item")
    public void userDeleteSelectedItem() {

        dc.deleteItem();
        dc.findAndClick("yes");

    }

    @Then("User should not find item")
    public void userShouldNotFindItem(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.verifyNotDisplayed(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }

    @And("User clicks hide button if the alert exist")
    public void userClicksHideButtonIfTheAlertExist(DataTable element) {

        List<String> listElement = element.asList(String.class);

        if (!listElement.isEmpty()) {
            for (int i = 0; i < listElement.size(); i++)
                dc.clickElementIfExist(listElement.get(i));
        }
    }
}