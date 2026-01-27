package Steps;

import AcrossJDBC.DBase;
import Pages.DialogContent;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class sqlQueryStep { //check
    @And("Send The query to the database {string} and control match")
    public void sendTheQueryToTheDatabaseAndControlMatch(String query) {

        // Data from DB
        ArrayList<ArrayList<String>> dbList= DBase.getListData(query);

        // Data from UI
        DialogContent dc=new DialogContent();
        List<WebElement> UIList= dc.waitVisibleListAllElement(dc.allList);

        for (WebElement e: UIList)
            System.out.println(e.getText());

        for (int i = 0; i < dbList.size(); i++) {
            System.out.print(dbList.get(i).get(1).trim());
            System.out.println("\t"+UIList.get(i).getText().trim());

            Assert.assertEquals(
                    dbList.get(i).get(1).trim(),
                    UIList.get(i).getText().trim()
            );
        }

    }
}
