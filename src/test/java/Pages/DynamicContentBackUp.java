package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class DynamicContentBackUp extends _Parent {
    public void findAndClick(String strElement) {

        String dynamicXpath;

//        if (strElement.toLowerCase().contains("category")) {
//            dynamicXpath = String.format("//*[text()='" + strElement + "']/following-sibling::button//*[@data-testid='DeleteIcon']", strElement);
//        } else {
//            dynamicXpath = String.format("//*[text()='" + strElement + "']");
//        }

        dynamicXpath = "//*[text()='" + strElement +"']";
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXpath)));
        clickFunction(element);

    }

    public void findAndVerify(String strElement, String text) {
        String dynamicXpath = "//*[text()='" + strElement +"']";
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXpath)));
        verifyContainsText(element, text);

    }


}
