package Steps;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class GraphEditSteps {
    //check
    DialogContent dc = new DialogContent();

    @And("User right click to reach edit")
    public void userRightClickToReachEdit(DataTable elements) {


        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
            dc.rightClick(listElement.get(i));
            dc.findAndClick("pencilIcon");
        }

//        dc.findAndClick("blankAreaGraph");
//        dc.rightClick("blankAreaGraph");
//        dc.findAndClick("edit");

    }
}
