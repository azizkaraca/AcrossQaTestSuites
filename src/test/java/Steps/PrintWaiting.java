package Steps;

import Pages.DialogContent;
import io.cucumber.java.en.And;


public class PrintWaiting {
    DialogContent dc = new DialogContent();
    @And("User wait until element clickable to export print")
    public void userWaitUntilElementClickableToExportPrint(String element) {
        dc.waitUntilProgressFinish(element);
    }
}
