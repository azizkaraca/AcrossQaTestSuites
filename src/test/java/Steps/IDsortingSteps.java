package Steps;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.*;

public class IDsortingSteps {
    DialogContent dc = new DialogContent();

    @And("User check if the ID sorting working correct")
    public void userCheckIfTheIdSortingWorkingCorrect() {

        List <WebElement> elementList = dc.waitVisibleListAllElement(dc.idList);
        List<String> normalList = new ArrayList<>();
        List<String> sortedList = new ArrayList<>();

        for (WebElement element : elementList) {
            normalList.add(element.getText()); // took the UI IDs
        }
        System.out.println(normalList);

        for (WebElement element : elementList) {
            sortedList.add(element.getText()); // added the new list to make sort and assertion of appeared IDs
        }

        Collections.sort(sortedList,Collections.reverseOrder()); // first sorting (Z to A) if something comes wrong form UI
        Collections.reverse(sortedList); // after reverse (A to Z) to check if UI and reversed ID list is correct
        System.out.println(sortedList);

        Assert.assertEquals(normalList,sortedList);
    }


}
