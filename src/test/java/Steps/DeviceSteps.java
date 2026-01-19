package Steps;

import Pages.DialogContent;
import Pages.DynamicContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class DeviceSteps {

    DialogContent dc = new DialogContent();
    DynamicContent dyc = new DynamicContent();

    @And("User clicks following dynamic elements")
    public void userClicksFollowingDynamicElements(DataTable elements) {

        List<List<String>> rows = elements.asLists(String.class);

        DynamicContent dc = new DynamicContent();

        for (List<String> row : rows) {
            String action = row.get(0);   // delete, edit, confirm, etc.
            String target = row.get(1);   // element name or label
            dc.findAndClickDynamic(action, target);
        }

//        List<String> listElement = elements.asList(String.class);
//
//        for (String el : listElement) {
//            dyc.findAndClickDynamic(el);
//        }
    }
    @And("User clicks following Items")
    public void userClicksFollowingItems(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for (String el : listElement) {
            dc.findAndClick(el);
        }
    }

    @And("User changes languages of relevant fields")
    public void userChangesLanguagesOfRelevantFields(DataTable element) {

        List<String> listElement = element.asList(String.class);

        for (String el : listElement) {
            dc.findAndClick(el);
        }

    }

    @And("User confirms the selection")
    public void userConfirmsTheSelection(DataTable elements) {

        List<String> listElement = elements.asList(String.class);

        for (String el : listElement) {
            dc.findAndClick(el);
        }
    }

    @Then("User should to find the item in field")
    public void userShouldToFindTheItemInField(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndVerify(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }

    @Then("User should to find the Dynamic item in field")
    public void userShouldToFindTheDynamicItemInField(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);
        DynamicContent dc = new DynamicContent();

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndVerifyDynamic(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }

    @And("User enters data to necessary areas")
    public void userEntersDataToNecessaryAreas(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));

    }

    @And("User edits the some data")
    public void userEditsTheSomeData(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }

    @And("User selects necessary areas")
    public void userSelectsNecessaryAreas(DataTable element) {

        List<String> listElement = element.asList(String.class);

        for (String el : listElement) {
            dc.findAndClick(el);
        }

    }

    @And("User search the item")
    public void userSearchTheItem(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {

            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));

        }
    }

    @Then("User should not find item")
    public void userShouldNotFindItem(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.verifyNotDisplayed(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }
}