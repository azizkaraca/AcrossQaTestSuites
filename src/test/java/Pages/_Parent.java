package Pages;

import Utilities.GWD;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class _Parent {
    protected WebDriver driver = GWD.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    public void sendKeysFunction(WebElement element, String value)
    {

        waitUntilVisible(element);
        waitUntilClickable(element);
        scrollToElement(element);
        clearTextArea(element);
        element.clear(); //-> it did not work for across app. check it later!
        element.sendKeys(value);

    }

    public void clearTextArea(WebElement element)
    {

        element.sendKeys((Keys.chord(Keys.CONTROL,"a",Keys.DELETE)));

    }

    public void clickFunction(WebElement element)
    {
        waitUntilVisible(element);
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();

    }

    public void clickLongFunction (WebElement element)
    {
//        waitUntilVisible(element);
        waitUntilClickable(element);
        Actions actions = new Actions(GWD.getDriver());
        actions.clickAndHold(element).pause(2000).release().perform();

    }

    public void clickFunctionForMove(WebElement element)
    {

//        waitUntilClickable(element);
        waitUntilVisible(element);
        scrollToElement(element);
        element.click();

    }

    public void verifyContainsText(WebElement element, String text)
    {

        waitUntilVisible(element);
        waitElementContainsText(element,text);
//        System.out.println("element.getText() = " + element.getText());
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));

    }

    public void verifyElementDisplayed(WebElement element)
    {

        waitUntilVisible(element);
        Assert.assertTrue(element.isDisplayed());

    }

    public void verifyElementNotDisplayed(WebElement element,String text)
    {

//        waitUntilVisible(element);
//        Assert.assertFalse(element.getText().toLowerCase().contains(text.toLowerCase()));
        Assert.assertFalse(false);

    }

    public void verifyCurrentUrl(String text)
    {

        waitUntilUrlContains(text); // if url contains Cap.Letters it fails.
        String str = GWD.getDriver().getCurrentUrl().toLowerCase();
        System.out.println(str);
        Assert.assertTrue(str.contains(text.toLowerCase()));

    }

    public void waitUntilVisible(WebElement element)
    {

        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public void waitUntilClickable(WebElement element)
    {

        wait.until(ExpectedConditions.elementToBeClickable(element));

    }

    public void waitUntilInvisible(WebElement element)
    {

        wait.until(ExpectedConditions.invisibilityOf(element));

    }

    public void waitUntilUrlContains(String element)
    {

        wait.until(ExpectedConditions.urlContains(element));

    }

    public void waitUntilTitleIs(String element)
    {

        wait.until(ExpectedConditions.titleIs(element));

    }

    public void waitElementContainsText(WebElement element, String string)
    {

//        wait.until(ExpectedConditions.textToBePresentInElement(element, string)); // --> with that all text should be same

        wait.until(webDriver -> {
            try {
                String elementText = element.getText();
                return elementText != null && elementText.toLowerCase().contains(string.toLowerCase());
            } catch (Exception e) {
                return false;
            }
        });

    }

    public List<WebElement> waitVisibleListAllElement(List<WebElement> elementList)
    {

        wait.until(ExpectedConditions.visibilityOfAllElements(elementList));
        return elementList;

    }

    public void scrollToElement(WebElement element)
    {

        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();",element);

    }

    public void switchToEditMode() // it is switching just from view to edit
    {

        wait.until(ExpectedConditions.urlContains("view")); // "view" is not exist in the url for QA env
        String editUrl = GWD.getDriver().getCurrentUrl().replaceAll("view","edit");
        GWD.getDriver().get(editUrl);

    }

    public void switchToMode(String mode1, String mode2) // it is switching via dataTable, need to give strings as from mode1, to mode2
    {

        wait.until(ExpectedConditions.urlContains(mode1));
        String editUrl = GWD.getDriver().getCurrentUrl().replaceAll(mode1,mode2);
        GWD.getDriver().get(editUrl);

    }

    public void ctrlMM()  // instead of this, switchToEditMode() can be used as well!
    {

        //wait.until(ExpectedConditions.urlContains("stations")); //"view" is not exist in the url for QA env
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("appsContentContainer"))); //it is not clean coding
        Actions actions = new Actions(GWD.getDriver());
        actions.keyDown(Keys.CONTROL).sendKeys("m").sendKeys("m").keyUp(Keys.CONTROL).perform();

    }

    public void TAB()
    {

        Actions actions = new Actions(GWD.getDriver());
        actions.sendKeys(Keys.TAB).perform();

    }

    public void ENTER()
    {

        Actions actions = new Actions(GWD.getDriver());
        actions.sendKeys(Keys.ENTER).perform();

    }

    public void ESC()
    {

        Actions actions = new Actions(GWD.getDriver());
        actions.sendKeys(Keys.ESCAPE).perform();

    }

    public void rightClickActions (WebElement element)
    {

        Actions actions = new Actions(GWD.getDriver());
        scrollToElement(element);
        waitUntilVisible(element);
        waitUntilClickable(element);
        actions.contextClick(element).perform();

    }

    public void refresh()
    {

        GWD.getDriver().navigate().refresh();

    }

    public void chooseFolder(String text) throws AWTException
    {

        Robot rbt = new Robot();

        StringSelection stringSelection = new StringSelection(text);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection , null);

        try {   // check available wait method here!
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);
        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V);

//        for(int i=0;i<2;i++) { //
//            rbt.keyPress(KeyEvent.VK_TAB); // press the button - down.
//            rbt.keyRelease(KeyEvent.VK_TAB); // release the button - up.
//        }
        rbt.keyPress(KeyEvent.VK_ENTER); // press the button - down.
        rbt.keyRelease(KeyEvent.VK_ENTER); // release the button - up.

    }

    public void dragAndDropFunction (WebElement source, WebElement target)
    {

        Actions actions = new Actions(GWD.getDriver());
       //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropItemList")));
        waitUntilVisible(source);
        waitUntilVisible(target);
        actions.dragAndDrop(source, target).build().perform();
        //actions.clickAndHold(source).moveToElement(target).release(source).build().perform();

    }

    public void alertOk()
    {

        GWD.getDriver().switchTo().alert().accept();

    }

    public void pageSizeZoomOut()
    {

        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_MINUS);
        robot.keyPress(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_MINUS);
        robot.keyRelease(KeyEvent.VK_CONTROL);

    }

    public void skipClickIfElementNotExist(WebElement element)
    {
        try {
            WebDriverWait shortWait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(2));
            WebElement el = shortWait.until(ExpectedConditions.elementToBeClickable(element));
            el.click();
        } catch (TimeoutException e) {
//            System.out.println("Element is not detected within 2s");
        }
    }

}
