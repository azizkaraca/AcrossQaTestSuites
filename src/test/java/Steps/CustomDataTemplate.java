package Steps;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class CustomDataTemplate {
    DialogContent dc = new DialogContent();
    List<String> normalList;

    @And("User Takes the all created Custom Data Template Name lists")
    public void userTakesTheAllCreatedCustomDataTemplateNameLists() {

        List<WebElement> elementList = dc.waitVisibleListAllElement(dc.customDataTableList);
        normalList = new ArrayList<>();

        for (WebElement element : elementList) {
            normalList.add(element.getText());
        }
        System.out.println(normalList);

    }

    @Then("Assert that {string} in the List")
    public void assertThatInTheList(String text) {

        Assert.assertTrue(normalList.contains(text));
        System.out.println("Text: " + text);

//        Boolean expected = true;
//        Boolean actual = normalList.contains(text);
//        Assert.assertEquals(expected,actual);
//        System.out.println("Text: " + text);

    }
}
