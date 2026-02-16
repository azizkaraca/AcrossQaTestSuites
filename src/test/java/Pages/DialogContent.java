package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class DialogContent extends _Parent {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[name='username']")
    private WebElement username;

    @FindBy(css = "[type='Password']")
    private WebElement password;

    @FindBy(id = "kc-login")
    private WebElement loginButton;

    @FindBy(id = "proceed-button")
    private WebElement sendAnyway;

    @FindBy(css = "[aria-controls='language-switcher']")
    private WebElement languageButton;

    @FindBy (xpath = "//h4[text()='English']/parent::div")
    private WebElement languageSwitch;

    @FindBy(css = "[data-testid='MenuIcon']")
    private WebElement burgerMenu;

    @FindBy(css = "[data-testid='ExpandMoreIcon']")
    private WebElement downArrow;

    @FindBy(xpath = "//div[@class='scrollbar-container jss9 ps ps--active-x']")
    private WebElement menuBar;

    @FindBy(xpath = "//*[@data-testid='ExitToAppIcon']")
    private WebElement logout;

    @FindBy(xpath = "//div[text()='Admin View']")
    private WebElement adminView;

    @FindBy(xpath = "//span[text()='Customer Menu']")
    private WebElement customerMenu;

    @FindBy(xpath = "//*[text()='Icon']/following-sibling::div//*[@title='icon']")
    private WebElement menuIcon;

    @FindBy(xpath = "//*[text()='Feature']/following-sibling::div//*[@title='feature']")
    private WebElement menuFeature;

    @FindBy(xpath = "//*[@data-testid='FolderIcon']/following-sibling::h6[text()='System Pages']")
    private WebElement menuSystemPages;

    @FindBy(xpath = "//*[text()='abc']")
    private WebElement iconABC;

    @FindBy(xpath = "//*[text()='Page Designer']")
    private WebElement pageDesigner;

    @FindBy(xpath = "//*[@data-testid='FolderIcon']/following-sibling::h6[text()='Custom Data']")
    private WebElement menuCustomData;

    @FindBy(xpath = "//*[@data-testid='FolderIcon']/following-sibling::h6[text()='Data Template Cat_1']")
    private WebElement menuDataTemplate;

    @FindBy(xpath = "//*[text()='TestCustomDataTemplate1']")
    private WebElement TestCustomDataTemplate1;

    @FindBy(xpath = "//*[text()='Info Page']")
    private WebElement infoPage;

    @FindBy(xpath = "//label[text()='First Name']/following-sibling::div//input")
    private WebElement firstName;

    @FindBy(xpath = "(//label[text()='Name']/following-sibling::div//input)[2]")
    private WebElement name;

    @FindBy(xpath = "//span[text()='Devices']")
    private WebElement devices;

    @FindBy(xpath = "//button[text()='Hide']")
    private WebElement hide;

    @FindBy(xpath = "//span[text()='edit']")
    private WebElement edit;

    @FindBy(xpath = "//span[text()='category']")
    private WebElement category;

    @FindBy(xpath = "//*[text()='Category']/following-sibling::div//*[@title='category']")
    private WebElement deviceCategory;

    @FindBy(xpath = "//label[text()='Installation Year']/following-sibling::div//input")
    private WebElement installationYear;

    @FindBy(xpath = "//label[text()='Ip Address']/following-sibling::div//input")
    private WebElement ipAddress;

    @FindBy(xpath = "//label[text()='Port Number']/following-sibling::div//input")
    private WebElement portNumber;

    @FindBy(css = "span[title='Categories']")
    private WebElement categories;

    @FindBy(css = "span[title='Entities']")
    private WebElement entities;

    @FindBy(css = "span[title='Custom Data Templates Category']")
    private WebElement customDataCategory;

    @FindBy(xpath = "//div[@title='TestCustomEntityCategory']/following-sibling::button[2]")
    private WebElement deletecatdata;

    @FindBy(css = "span[title='Custom Entity Templates Category']")
    private WebElement customEntityCategory;

    @FindBy(xpath = "//p[text()='Customer Categories']")
    private WebElement customerCategories;

    @FindBy(xpath = "//span[contains(text(),'add')]")
    private WebElement plusIcon;

    @FindBy(xpath = "(//*[contains(text(),'Create')])[2]")
    private WebElement create;

    @FindBy (xpath = "//*[contains(text(),'Import')]")
    private WebElement importButton;
    @FindBy(xpath = "//span[text()='Active']")
    private WebElement active;

    @FindBy(xpath = "//div[text()='Solar Panel']")
    private WebElement solarPanel;

    @FindBy(xpath = "//button[text()='Confirm']")
    private WebElement confirm;

    @FindBy(xpath = "//button[text()='Yes']")
    private WebElement yes;

    @FindBy(xpath = "//button[text()='No']")
    private WebElement no;

    @FindBy(xpath = "//span[text()='Library']")
    private WebElement library;

    @FindBy(xpath = "//label[text()='Model']/following-sibling::div//input")
    private WebElement model;

    @FindBy(xpath = "//label[text()='Website']/following-sibling::div//input")
    private WebElement webSite;

    @FindBy(xpath = "//label[text()='Description']//following::input[2]")
    private WebElement description;

    @FindBy(xpath = "//label[text()='Manufacturer']//following::div")
    private WebElement manufacturer;

    @FindBy(xpath = "//span[text()='MAS']/parent::li")
    private WebElement mas;

    @FindBy(xpath = "(//label[text()='Protocol']/following::div)[1]")
    private WebElement protocol;

    @FindBy(xpath = "//span[contains(text(),'Modbus')]")
    private WebElement modbus;

    @FindBy(xpath = "//h6[text()='Engine']")
    private WebElement engine;

    @FindBy(xpath = "//p[text()='Heat Engine']")
    private WebElement heatEngine;

    @FindBy(xpath = "//button[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//label[contains(text(),'Search')]/following-sibling::div//input")
    private WebElement search;

    @FindBy(xpath = "//span[text()='search']")
    private WebElement searchButton;

    @FindBy(xpath = "//div[text()='TestDEVICE']")
    private WebElement TestDEVICE;

    @FindBy(xpath = "//span[text()='delete']")
    private WebElement delete; // in table views

    @FindBy(xpath = "//span[text()='arrow_forward']")
    private WebElement arrowButton; // in table views

    @FindBy(xpath = "//button[text()='Delete']")
    private WebElement delete2; // in custom data template delete button, there is func with that

    @FindBy(xpath = "//label[text()='Display Name']//following::input[2]")
    private WebElement displayName; // in registers creation or editing

    @FindBy(xpath = "//label[text()='Register Name']/following-sibling::div//input")
    private WebElement registerName;

    @FindBy(xpath = "//label[text()='Address']//following::input[1]")
    private WebElement registerAddress;

    @FindBy(xpath = "//label[text()='Scan Rate']//following::input[1]")
    private WebElement scanRate; // in registers creation or editing

    @FindBy(xpath = "(//p[text()='Alarms'])")
    private WebElement alarms;

    @FindBy(xpath = "//label[text()='Type']/following-sibling::div")
    private WebElement type;

    @FindBy(xpath = "//li[text()='Digital']")
    private WebElement digital;

    @FindBy(xpath = "//label[text()='Category']/following-sibling::div")
    private WebElement categorySelect;

    @FindBy(xpath = "//span[text()='Category 1']/parent::li")
    private WebElement category1;

    @FindBy(xpath = "//label[text()='Focus Register']/following-sibling::div//button")
    private WebElement focusRegister;

    @FindBy(xpath = "//label[text()='Register']/following-sibling::div//button")
    private WebElement registerEdit;

    @FindBy(xpath = "//label[text()='Severity']/following-sibling::div")
    private WebElement severity;

    @FindBy(xpath = "//*[contains(text(),'uccess')]") // contains of success is uccess bcs of upper lower case of "S-s"
    private WebElement success;

    @FindBy(xpath = "//*[contains(text(),'exists')]")
    private WebElement exists;

    @FindBy(xpath = "//label[contains(text(),'Connections')]/following-sibling::div//input")
    private WebElement connections;

    @FindBy(xpath = "//label[contains(text(),'Reason')]/following::textarea[1]")
    private WebElement reason;

    @FindBy(xpath = "//p[text()='Registers']")
    private WebElement registers;

    @FindBy(xpath = "//p[text()='Calculated Registers']")
    private WebElement calculated;

    @FindBy(xpath = "(//div[contains(@data-field,'ame')])[2]//div") // contains of name is "ame"
    private WebElement nameContains;

    @FindBy(xpath = "//p[text()='Info']")
    private WebElement info;

    @FindBy(id = "rglContainer")
    private WebElement mainBoard;

    @FindBy(xpath = "//p[text()='Button']/parent::div/parent::div/parent::div")
    private WebElement buttonDrag;

    @FindBy(xpath = "//p[text()='Wind Direction']/parent::div/parent::div")
    private WebElement windDrag;

    @FindBy(xpath = "//img[@alt='User Logo']")
    private WebElement userLogo;

    @FindBy(xpath = "(//label[text()='Name']/following-sibling::div//i)")
    private WebElement english1;

    @FindBy(xpath = "//li[@data-value='el']")
    private WebElement greek;

    @FindBy(xpath = "(//i[@class='flag flag-24 flag-gb'])[2]")
    private WebElement english;

    @FindBy (xpath = "//span[text()='Shareable']")
    private WebElement shareable;

    @FindBy(xpath = "//*[text()='Next']")
    private WebElement next;

    @FindBy(xpath = "//div[@data-id='ACROSS_QA']//div[@data-field='__check__']")
    private WebElement installation;

    @FindBy(xpath = "(//div[@data-field='__check__'])[2]")
    private WebElement importInstanceElement;

    @FindBy (xpath = "//*[@value='2026']")
    private WebElement year2026;

    // List Elements locate below this line

    @FindBy(xpath = "//div[contains(@class,'MuiDataGrid-row')]//div[@data-field='name']")
    public List<WebElement> customDataTableList;

    @FindBy(xpath = "//div[contains(@class,'MuiDataGrid-row')]/div[2]")
    public List<WebElement> allList;

    @FindBy(xpath = "//div[contains(@class,'MuiDataGrid-row')]//div[@data-field='id']")
    public List<WebElement> idList;

    @FindBy(xpath = "//div[@data-field='name']")
    public List<WebElement> nameList;

    WebElement source; // it is created for drag and drop.
    WebElement target; // it is created for drag and drop.
    WebElement myElement;

//    List<WebElement> myElementList; --> I dont need it since I am not going to use any method in dc class


    public void findAndSend(String strElement, String value)
    {
        switch (strElement) {
            case "username": myElement = username;break;
            case "password": myElement = password;break;
            case "firstName": myElement = firstName;break;
            case "name": myElement = name;break;
            case "model": myElement = model;break;
            case "webSite": myElement = webSite;break;
            case "description": myElement = description;break;
            case "search": myElement = search;break;
            case "displayName": myElement = displayName;break;
            case "registerName": myElement = registerName;break;
            case "registerAddress": myElement = registerAddress;break;
            case "scanRate": myElement = scanRate;break;
            case "connections": myElement = connections;break;
            case "reason": myElement = reason;break;
            case "installationYear": myElement = installationYear;break;
            case "ipAddress": myElement = ipAddress;break;
            case "portNumber": myElement = portNumber;break;


        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement)
    {
        switch (strElement) {
            case "loginButton": myElement = loginButton;break;
            case "languageButton": myElement = languageButton;break;
            case "burgerMenu": myElement = burgerMenu;break;
            case "downArrow": myElement = downArrow;break;
            case "logout": myElement = logout;break;
            case "devices": myElement = devices;break;
            case "edit": myElement = edit;break;
            case "category": myElement = category;break;
            case "solarPanel": myElement = solarPanel;break;
            case "confirm": myElement = confirm;break;
            case "yes": myElement = yes;break;
            case "no": myElement = no;break;
            case "library": myElement = library;break;
            case "manufacturer": myElement = manufacturer;break;
            case "mas": myElement = mas;break;
            case "protocol": myElement = protocol;break;
            case "modbus": myElement = modbus;break;
            case "engine": myElement = engine;break;
            case "heatEngine": myElement = heatEngine;break;
            case "save": myElement = saveButton;break;
            case "alarms": myElement = alarms;break;
            case "type": myElement = type;break;
            case "digital": myElement = digital;break;
            case "category1": myElement = category1;break;
            case "focusRegister": myElement = focusRegister;break;
            case "delete": myElement = delete;break;
            case "delete2": myElement = delete2;break;
            case "registerEdit": myElement = registerEdit;break;
            case "severity": myElement = severity;break;
            case "info": myElement = info;break;
            case "registers": myElement = registers;break;
            case "calculated": myElement = calculated;break;
            case "windDrag": myElement = windDrag;break;
            case "searchButton": myElement = searchButton;break;
            case "arrowButton": myElement = arrowButton;break;
            case "plusIcon": myElement = plusIcon;break;
            case "languageSwitch": myElement = languageSwitch;break;
            case "displayName": myElement = displayName;break;
            case "description": myElement = description;break;
            case "sendAnyway": myElement = sendAnyway;break;
            case "userLogo": myElement = userLogo;break;
            case "menuBar": myElement = menuBar;break;
            case "english": myElement = english;break;
            case "greek": myElement = greek;break;
            case "categories": myElement = categories;break;
            case "customDataCategory": myElement = customDataCategory;break;
            case "customerCategories": myElement = customerCategories;break;
            case "create": myElement = create;break;
            case "active": myElement = active;break;
            case "customEntityCategory": myElement = customEntityCategory;break;
            case "deletecatdata": myElement = deletecatdata;break;
            case "adminView": myElement = adminView;break;
            case "customerMenu": myElement = customerMenu;break;
            case "deviceCategory": myElement = deviceCategory;break;
            case "menuIcon": myElement = menuIcon;break;
            case "iconABC": myElement = iconABC;break;
            case "menuFeature": myElement = menuFeature;break;
            case "menuSystemPages": myElement = menuSystemPages;break;
            case "pageDesigner": myElement = pageDesigner;break;
            case "menuCustomData": myElement = menuCustomData;break;
            case "menuDataTemplate": myElement = menuDataTemplate;break;
            case "TestCustomDataTemplate1": myElement = TestCustomDataTemplate1;break;
            case "installation": myElement = installation;break;
            case "next": myElement = next;break;
            case "importButton": myElement = importButton;break;
            case "importInstanceElement": myElement = importInstanceElement;break;
//            case "installationYear": myElement = installationYear;break;
            case "year2026": myElement = year2026;break;


        }
        clickFunction(myElement);
    }

    public void findAndVerify(String strElement)
    {
        switch (strElement) {
            case "loginButton": myElement = loginButton;break;
            case "userLogo": myElement = userLogo;break;

        }
        verifyElementDisplayed(myElement);
    }

    public void findAndClickLong(String strElement)
    {
        switch (strElement)
        {
            case "sendAnyway": myElement = sendAnyway;break;
            case "saveButton": myElement = saveButton;break;
        }
        clickLongFunction(myElement);
    }

    public void findAndVerify(String strElement, String text)
    {
        switch (strElement) {
            case "solarPanel": myElement = solarPanel;break;
            case "TestDEVICE": myElement = TestDEVICE;break;
            case "success": myElement = success;break;
            case "nameContains": myElement = nameContains;break;
            case "exists": myElement = exists;break;


        }
        verifyContainsText(myElement, text);
    }

    public void rightClick(String strElement)
    {
        switch (strElement) {
//            case "blankArea": myElement = blankArea;break;

        }
        rightClickActions(myElement);
    }

    public void deleteItem()
    {
        clickFunction(delete2);

    }

    public void waitUntilProgressFinish(String strElement)
    {
        switch (strElement) {
            case "confirm": myElement = confirm;break;
        }
        waitUntilClickable(myElement);
    }

    public void verifyNotDisplayed(String strElement, String value)
    {
        switch (strElement) {
            case "nameContains": myElement = nameContains;break;

        }
        verifyElementNotDisplayed(myElement,value);
    }

    public void dragAndDrop(String sourceElement, String targetElement)
    {
        switch (sourceElement)
        {
            case "buttonDrag":source = buttonDrag;break;
            case "windDrag":source = windDrag;break;
        }
        switch (targetElement)
        {
            case "mainBoard":target = mainBoard;break;
//            case "blankArea":target = blankArea;break;
        }

        dragAndDropFunction(source, target);
    }

    public void clickElementIfExist(String strElement)
    {
        switch (strElement) {
            case "hide": myElement = hide;break;
        }
        skipClickIfElementNotExist(myElement);
    }

}
