package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DynamicRecord extends _Parent {
    //check

    // storage: key -> generatedValue
    private final Map<String, String> storedValues = new HashMap<>();

    // random generator
    private final Random rnd = new Random();

    // -----------------------
    //  Utility: generate random numeric suffix and return base+suffix
    // -----------------------
    public String generateRandomName(String base) {
        int randomNumber = 1000 + rnd.nextInt(9000); // 1000-9999
        return base + randomNumber;
    }

    // -----------------------
    //  Store a generated name under a key and return it
    //  key: an arbitrary identifier you will use later to retrieve the same value
    //  base: the base name (from feature)
    // -----------------------
    public String generateAndStore(String key, String base) {
        String generated = generateRandomName(base);
        storedValues.put(key, generated);
//        System.out.println("Stored dynamic value: key=" + key + " value=" + generated);
        return generated;
    }

    // -----------------------
    //  Retrieve stored value by key (returns null if not found)
    // -----------------------
    public String getStored(String key) {
        return storedValues.get(key);
    }

    // -----------------------
    //  Resolve input: if input starts with "$" treat the rest as a storage key and return stored value;
    //  otherwise return input as-is.
    //  Example: "$entity1" -> lookup storedValues.get("entity1")
    // -----------------------
    public String resolveValue(String input) {
        if (input == null) return null;
        input = input.trim();
        if (input.startsWith("$")) {
            String key = input.substring(1);
            String val = getStored(key);
            if (val == null) {
                throw new IllegalStateException("No stored value for key: " + key);
            }
            return val;
        }
        return input;
    }

    // -----------------------
    //  The dynamic click method that uses resolved values
    //  action: delete/edit/confirm/...
    //  record: either literal text (e.g. "TestCustomEntityCategory") or a storage token "$myKey"
    // -----------------------
    public void findAndClickDynamicRecord(String action, String record) {
        String resolvedTarget = resolveValue(record); // if user passed "$myKey", get stored name
        WebElement element;
        String dynamicXpath;

        switch (action.toLowerCase()) {

            case "delete":
                // delete icon near the resolved record
                dynamicXpath = String.format("//*[normalize-space(text())=" + record + "]/following-sibling::button//*[@data-testid='DeleteIcon']",
                        resolvedTarget);
                element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXpath)));
                break;

            case "edit":
                dynamicXpath = String.format("//*[normalize-space(text())=" + record + "]/following-sibling::button//*[@data-testid='EditIcon']",
                        resolvedTarget);
                element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXpath)));
                break;

            case "confirm":
            case "yes":
                dynamicXpath = String.format("//button[normalize-space()=" + record + "]", resolvedTarget);
                element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXpath)));
                break;

            default:
                // fallback: click the element that contains the text
                dynamicXpath = String.format("//*[normalize-space(text())=" + record + " or contains(normalize-space(text())," + record + ")]",
                        resolvedTarget, resolvedTarget);
                element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXpath)));
                break;
        }
        clickFunction(element);
    }

    public void findAndVerifyDynamicRecord(String strElement, String text) {
        String resolved = resolveValue(strElement);
        String dynamicXpath = String.format("//*[normalize-space(text())=" + strElement + "]", resolved);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dynamicXpath)));
        verifyContainsText(element, text);
    }
}
