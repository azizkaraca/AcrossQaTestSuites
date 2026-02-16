package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class DynamicContent extends _Parent {
    public void findAndClickDynamic(String action, String strElement) {
        WebElement element;
        String dynamicXpath;

        switch (action.toLowerCase()) {

            case "delete":
                // it finds and execute delete button according to near dynamic element
                dynamicXpath = String.format("//*[text()='" + strElement + "']/following-sibling::button//*[@data-testid='DeleteIcon']", strElement);
                element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXpath)));
                break;

            case "title":
                // it executes according to titles inside custom entity template structure
                dynamicXpath = String.format("//p[@title='" + strElement + "']", strElement);
                element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXpath)));
                break;

            default:
                // it finds other all actions according to text given on Features // in the system it can be found as "click" on features
                dynamicXpath = String.format("//*[text()='" + strElement + "']", strElement);
                element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXpath)));
                break;
        }
        clickFunction(element);
    }

    public void findAndVerifyDynamic(String strElement, String text) {
        String dynamicXpath = "//*[text()='" + strElement +"']";
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXpath)));
        verifyContainsText(element, text);

    }


}
