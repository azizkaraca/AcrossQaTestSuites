package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class DynamicContent extends _Parent {
    public void findAndClickDynamic(String action, String strElement) {
        WebElement element;
        String dynamicXpath;
        //check

        switch (action.toLowerCase()) {

            case "delete":
                // it finds and execute delete button according to near dynamic element
                dynamicXpath = String.format("//*[text()='" + strElement + "']/following-sibling::button//*[@data-testid='DeleteIcon']", strElement);
                element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXpath)));
                break;

//            case "edit":
//                // it executes according to edit actions with its locator and it can be updated according to button near dynamic element
//                dynamicXpath = String.format("//*[text()='" + strElement + "']", strElement);
//                element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXpath)));
//                break;

            default:
                // it finds other all actions according to text given on Features
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
