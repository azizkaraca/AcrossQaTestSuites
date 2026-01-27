package Steps;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.awt.*;
import java.util.List;

public class ActionsStep {
    //check
    DialogContent dc = new DialogContent();

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

    @When("User delete selected item")
    public void userDeleteSelectedItem() {

        dc.deleteItem();
        dc.findAndClick("yes");

    }
    @And("User clicks hide button if the alert exist")
    public void userClicksHideButtonIfTheAlertExist(DataTable element) {

        List<String> listElement = element.asList(String.class);

        if (!listElement.isEmpty()) {
            for (int i = 0; i < listElement.size(); i++)
                dc.clickElementIfExist(listElement.get(i));
        }
    }

    @And("User choose folder from PC")
    public void userChooseFolderFromPC(String text) throws AWTException {

        dc.chooseFolder(text);

    }

    @And("User switch to edit mode")
    public void userSwitchToEditMode() {
        // dc.switchToEditMode(); in QA env there is no "view" to swith it "edit"
        dc.ctrlMM();
    }
    @And("User uses ctrl MM combination to open edit mode")
    public void userUsesCtrlMMCombinationToOpenEditMode() {

        dc.ctrlMM();
        //dc.switchToEditMode();
    }

    @And("User switch to mode")
    public void userSwitchToMode(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.switchToMode(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }

    @And("User switch to mode from {string} to {string}")
    public void userSwitchToModeFromTo(String mode1, String mode2) {
        dc.switchToMode(mode1,mode2);
    }
}