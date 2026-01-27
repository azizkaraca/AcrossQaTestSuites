package Steps;

import Pages.DialogContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;


import java.util.List;

public class DragDropSteps {

    DialogContent dc = new DialogContent();
    @And("User drag and drop")
    public void userDragAndDrop(DataTable elements) {

        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.dragAndDrop(listElement.get(i).get(0), listElement.get(i).get(1));
        }

    }

}
