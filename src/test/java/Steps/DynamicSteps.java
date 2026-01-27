package Steps;

import Pages.DialogContent;
import Pages.DynamicContent;
import Pages.DynamicRecord;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class DynamicSteps {

    DialogContent dc = new DialogContent();
    DynamicContent dyc = new DynamicContent();
    DynamicRecord dr = new DynamicRecord();

    @And("User edits the record with name")
    public void userEditsTheRecordWithName(DataTable table) {

        List<List<String>> data = table.asLists(String.class);

        for (List<String> row : data) {
            String key = row.get(0);
            String baseValue = row.get(1);
            String generatedValue = dr.generateAndStore(key, baseValue);
            dc.findAndSend(key, generatedValue);
        }
    }

    @And("User clicks following dynamic records")
    public void userClicksFollowingDynamicRecords(DataTable table) {
        List<List<String>> rows = table.asLists(String.class);
        for (List<String> row : rows) {
            String action = row.get(0);
            String target = row.get(1);
            dr.findAndClickDynamicRecord(action, target);
        }
    }

    @And("User clicks following dynamic elements")
    public void userClicksFollowingDynamicElements(DataTable elements) {
        List<List<String>> rows = elements.asLists(String.class);
        for (List<String> row : rows) {
            String action = row.get(0);
            String target = row.get(1);
            dyc.findAndClickDynamic(action, target);
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
}