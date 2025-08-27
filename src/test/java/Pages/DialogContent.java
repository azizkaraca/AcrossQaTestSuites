package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    @FindBy(css = "[alt='DEH-logo']")
    private WebElement assertLogo;
    @FindBy(id = "proceed-button")
    private WebElement sendAnyway;
    @FindBy(css = "[aria-controls='language-switcher']")
    private WebElement languageButton;
    @FindBy(css = "[role='progressbar']")
    private WebElement progressbar;
    @FindBy(xpath = "//h4[text()='En']")
    private WebElement en;
    @FindBy (xpath = "//h4[text()='En']/parent::div")
    private WebElement languageSwitch;
    @FindBy (xpath = "(//h4[text()='En']/parent::div)[3]")
    private WebElement languageSwitch2;
    @FindBy (xpath = "//h4[text()='El']/parent::div")
    private WebElement languageEl;
    @FindBy (xpath = "(//h4[text()='El']/parent::div)[2]")
    private WebElement languageEl2;
    @FindBy(css = "[data-testid='MenuIcon']")
    private WebElement burgerMenu;
    @FindBy(css = "[data-testid='ExpandMoreIcon']")
    private WebElement downArrow;
    @FindBy(xpath = "(//*[@data-testid='PersonIcon'])[1]")
    private WebElement personIcon;
//    @FindBy(xpath = "//div[(text()='Logout')]")
    @FindBy(xpath = "//*[@data-testid='ExitToAppIcon']")
    private WebElement logout;
    @FindBy(xpath = "//div[text()='My Account']")
    private WebElement myAccount;
    @FindBy(xpath = "//label[text()='First Name']/following-sibling::div//input")
    private WebElement firstName;
    @FindBy(xpath = "(//label[text()='Name']/following-sibling::div//input)[2]")
    private WebElement name;
    @FindBy(xpath = "//span[text()='MANAGEMENT']")
    private WebElement management;
    @FindBy(xpath = "//span[text()='Devices']")
    private WebElement devices;
    @FindBy(xpath = "//button[text()='Hide']")
    private WebElement hide;
    @FindBy(xpath = "(//*[text()='Message']/following-sibling::div//textarea)")
    private WebElement message;
    @FindBy(id = "item_ejv2svq3e3wft3dtu9")
    private WebElement blankArea;
    @FindBy(id = "item_wncind3faemhkswqn")
    private WebElement blankAreaGraph;
    @FindBy(xpath = "//p[text()='DASHBOARD']")
    private WebElement dashboard;
    @FindBy(xpath = "//alt[text()='User Logo']")
    private WebElement acrossLogo;
    @FindBy(xpath = "//span[text()='edit']")
    private WebElement edit;
    @FindBy(css = "//span[text()='category']")
    private WebElement category;
    @FindBy (xpath = "//label[text()='Register']/following-sibling::div//button")
    private WebElement edit2;
    @FindBy(xpath = "//button[contains(text(),'Add')]")
    private WebElement addButton;
    @FindBy(css = "[data-testid='AddIcon']")
    private WebElement addIcon;
    @FindBy(xpath = "//span[contains(text(),'add')]")
    private WebElement newAdd;
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
    @FindBy(xpath = "//span[text()='MAS']")
    private WebElement mas;
    @FindBy(xpath = "(//label[text()='Protocol']/following::div)[1]")
    private WebElement protocol;
    @FindBy(xpath = "//span[contains(text(),'Modbus')]")
    private WebElement modbus;
    @FindBy(xpath = "//h6[text()='Engine']")
    private WebElement engine;
    @FindBy(xpath = "//p[text()='Heat Engine']")
    private WebElement heatEngine;
    @FindBy(xpath = "(//label[text()='Country Origin']/following::input)[1]")
    private WebElement country;
    @FindBy(xpath = "//*[text()='Ukraine']")
    private WebElement ukraine;
    @FindBy(xpath = "(//label[text()='Year']/following::input)[1]")
    private WebElement year;
    @FindBy(xpath = "//*[text()='2023']")
    private WebElement y2023;
    @FindBy(xpath = "//button[text()='Save']")
    private WebElement saveButton;
    @FindBy(xpath = "//label[contains(text(),'Search')]/following-sibling::div//input")
    private WebElement search;
    @FindBy(xpath = "//span[text()='search']")
    private WebElement searchButton;
    @FindBy(xpath = "//div[text()='TestDEVICE']")
    private WebElement TestDEVICE;
    @FindBy(xpath = "//span[text()='delete']")
    private WebElement delete;
    @FindBy(xpath = "//button[text()='Delete']")
    private WebElement delete2;
    @FindBy(xpath = "(//*[@data-testid='DeleteIcon'])[3]")
    private WebElement delete3;
    @FindBy(xpath = "//span[text()='Assets']")
    private WebElement assetsMas;
    @FindBy(css = "[data-testid='ArrowForwardIcon']")
    private WebElement arrowButton;
    @FindBy(xpath = "//span[text()='arrow_forward']")
    private WebElement arrowForward;
    @FindBy(xpath = "//label[text()='Display Name']//following::input[2]")
    private WebElement displayName;
    @FindBy(xpath = "//label[text()='Register Name']/following-sibling::div//input")
    //    @FindBy(id="edit-register-name")
    private WebElement registerName;
    @FindBy(xpath = "//label[text()='Address']//following::input[1]")
    private WebElement registerAddress;
    @FindBy(xpath = "//label[text()='Scan Rate']//following::input[1]")
    private WebElement scanRate;
    @FindBy(xpath = "(//p[text()='Alarms'])[2]")
    private WebElement alarms;
    @FindBy(xpath = "//label[text()='Type']/following-sibling::div")
    private WebElement type;
    @FindBy(xpath = "//li[text()='Digital']")
    private WebElement digital;
    @FindBy(xpath = "//label[text()='Category']/following-sibling::div//input")
    private WebElement categoryA;
    @FindBy(xpath = "//span[text()='Category 1']/parent::li")
    private WebElement category1;
    @FindBy(xpath = "//label[text()='Focus Register']/following-sibling::div//button")
    private WebElement focusRegister;
    @FindBy(xpath = "//h6[text()='Across Library']")
    private WebElement acrossLibrary;
    @FindBy(xpath = "//h6[text()='TestDEVICE']")
    private WebElement TestDEVICEin;
    @FindBy(xpath = "//h6[text()='TestNameDisplayEdit']")
    private WebElement TestNameDevice;
    @FindBy(xpath = "//label[text()='Register']/following-sibling::div//button")
    private WebElement registerEdit;
    @FindBy(xpath = "//label[text()='Severity']/following-sibling::div")
    private WebElement severity;
    @FindBy(xpath = "//*[contains(text(),'uccess')]") // contains of success is uccess bcs of upper lower case of "S-s"
    private WebElement success;
    @FindBy(xpath = "//*[text()='Alarm']")
    private WebElement alarmA;
    @FindBy(xpath = "//label[contains(text(),'Connections')]/following-sibling::div//input")
    private WebElement connections;
    @FindBy(xpath = "//a[contains(@href,'unit')]")
    private WebElement units;
    @FindBy(xpath = "(//p[text()='Dashboard'])[2]")
    private WebElement dashboard2;
    @FindBy(xpath = "//p[text()='Events']")
    private WebElement events;
    @FindBy(xpath = "//p[text()='Data']")
    private WebElement data;
    @FindBy(xpath = "//p[text()='Graphs']")
    private WebElement graphs;
    @FindBy(xpath = "//p[text()='Availability']")
    private WebElement availability;
    @FindBy(xpath = "//p[text()='Devices']")
    private WebElement devices2;
    @FindBy(xpath = "//p[text()='Registers']")
    private WebElement registers;
    @FindBy(xpath = "//p[text()='System Registers']")
    private WebElement systemRegisters;
    @FindBy(xpath = "//p[text()='Process']")
    private WebElement process;
    @FindBy(xpath = "//p[text()='Images']")
    private WebElement images;
    @FindBy(xpath = "//p[text()='Specifications']")
    private WebElement specifications;
    @FindBy(xpath = "//p[text()='Aggregations']")
    private WebElement aggregations;
    @FindBy(xpath = "//p[text()='Remote Control']")
    private WebElement remoteControl;
    @FindBy(xpath = "//*[contains(text(),'REPORTS')]")
    private WebElement reports;
    @FindBy(xpath = "//p[text()='Reports']")
    private WebElement reports2;
    @FindBy(xpath = "//span[text()='Reports']")
    private WebElement reportsInMenu;
    @FindBy(xpath = "//p[text()='Calculated Registers']")
    private WebElement calculated;
    @FindBy(xpath = "(//div[contains(@data-field,'ame')])[2]//div") // contains of name is "ame"
    private WebElement nameContains;
    @FindBy(xpath = "//input[@value='test11']")
    private WebElement inputName;
    @FindBy(xpath = "//span[text()='Drop Image']")
    private WebElement dropImage;
    @FindBy (xpath = "//label[text()='Nominal Power']/following-sibling::div//input")
    private WebElement nominalPowerNum;
    @FindBy (xpath = "//label[text()='Nominal Power']/following-sibling::div//div//div")
    private WebElement nominalPowerArr;
    @FindBy (xpath = "[aria-label='Kilowatt']")
    private WebElement powerKW;
    @FindBy (xpath = "//label[text()='Potential Power']/following-sibling::div//input")
    private WebElement potentialPowerNum;
    @FindBy (xpath = "//label[text()='Potential Power']/following-sibling::div//div")
    private WebElement potentialPowerArr;
    @FindBy (xpath = "//label[text()='Tech Minimum']/following-sibling::div//input")
    private WebElement techMinimumNum;
    @FindBy (xpath = "//label[text()='Tech Minimum']/following-sibling::div//div")
    private WebElement techMinimumNArr;
    @FindBy (xpath = "//label[text()='Variable Running Costs']/following-sibling::div//input")
    private WebElement variableCostNum;
    @FindBy (xpath = "//label[text()='Variable Running Costs']/following-sibling::div//div")
    private WebElement variableCostArr;
    @FindBy (xpath = "//li[text()='Kilowatt-hour (kWh)']")
    private WebElement costKWh;
    @FindBy(xpath = "//a[contains(@href,'assets')]")
    private WebElement assets;
    @FindBy(xpath = "//span[text()='ASSETS']")
    private WebElement assetsUnderInfrastructure;
    @FindBy(css = "[data-testid='DesktopWindowsIcon']")
    private WebElement screenIcon;
    @FindBy(xpath = "//span[text()='Feeders']")
    private WebElement feedersMas;
    @FindBy(xpath = "//p[text()='feeders']")
    private WebElement feeders;
    @FindBy(xpath = "//span[text()='Capacitors']")
    private WebElement capacitorsMas;
    @FindBy(xpath = "//p[text()='Capacitors']")
    private WebElement capacitors;
    @FindBy(xpath = "//p[text()='Info']")
    private WebElement info;
    @FindBy(xpath = "//div[text()='Split Air Condition']")
    private WebElement splitAirCondition;
    @FindBy(xpath = "//button[text()='NEW GROUP']")
    private WebElement newGroup;
    @FindBy(xpath = "//div[text()='ID']")
    private WebElement idColumn;
    @FindBy(xpath = "//button[text()='New Report']")
    private WebElement newReport;
    @FindBy(css = "[data-testid='BorderColorIcon']")
    private WebElement generalTool;
    @FindBy(id = "rglContainer")
    private WebElement mainBoard;
    @FindBy(xpath = "//p[text()='Button']/parent::div/parent::div/parent::div")
    private WebElement buttonDrag;
    @FindBy(xpath = "//p[text()='Wind Direction']/parent::div/parent::div")
    private WebElement windDrag;
    @FindBy(id = "item_22pun2rjjwkki78ns5j")
    private WebElement buttonOn;
    @FindBy(xpath = "//button[text()='Import JSON']")
    private WebElement importJson;
    @FindBy(xpath = "//span[text()='Import Json']")
    private WebElement importJsonInImport;
    @FindBy(xpath = "//p[text()='Alarms']")
    private WebElement alarmsInBreadCrumbs;
    @FindBy(xpath = "//p[text()='Events']")
    private WebElement eventsInBreadCrumbs;
    @FindBy(xpath = "//span[text()='Tas']")
    private WebElement tasMas;
    @FindBy(xpath = "//span[text()='Interconnectors']")
    private WebElement interconnectors;
    @FindBy(xpath = "//span[text()='Pair Interconnectors']")
    private WebElement pairInterconnectors;
    @FindBy(xpath = "//span[text()='Internal Consumption']")
    private WebElement internalConsumption;
    @FindBy(css = "[data-testid='CancelIcon']")
    private WebElement discard;
    @FindBy(css = "[data-testid='PrintIcon']")
    private WebElement printIcon;
    @FindBy(css = "[value='Gen 02']")
    private WebElement infoName;
    @FindBy(css = "[data-testid='ChromeReaderModeOutlinedIcon']")
    private WebElement valueTool;
    @FindBy(xpath = "//p[text()='Complex Value']")
    private WebElement complexValueIn;
    @FindBy(xpath = "//p[text()='Complex Value']/parent::div/parent::div")
    private WebElement complexValue;
    @FindBy(xpath = "(//*[@data-testid='EditIcon'])[2]")
    private WebElement editCheckedRule;
    @FindBy(id = "#blockly-c")
    private WebElement timeBlockly;
    @FindBy(xpath = "//*[text()='seconds']")
    private WebElement seconds;
    @FindBy(xpath = "//span[text()='Custom Data Template']")
    private WebElement customDataTemplate;
    @FindBy(xpath = "//span[text()='Templates']")
    private WebElement Templates;
    @FindBy(xpath = "//img[@alt='User Logo']")
    private WebElement userLogo;
    @FindBy(xpath = "(//label[text()='Name']/following-sibling::div//i)")
    private WebElement english;
    @FindBy(xpath = "//i[@class='flag flag-24 flag-gr']")
    private WebElement greek;
    @FindBy (xpath = "//span[text()='Shareable']")
    private WebElement shareable;

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


    public void findAndSend(String strElement, String value) {
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
            case "message": myElement = message;break;
            case "connections": myElement = connections;break;
            case "nominalPowerNum": myElement = nominalPowerNum;break;
            case "potentialPowerNum": myElement = potentialPowerNum;break;
            case "techMinimumNum": myElement = techMinimumNum;break;
            case "variableCostNum": myElement = variableCostNum;break;

        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "loginButton": myElement = loginButton;break;
            case "languageButton": myElement = languageButton;break;
            case "burgerMenu": myElement = burgerMenu;break;
            case "downArrow": myElement = downArrow;break;
            case "logout": myElement = logout;break;
            case "myAccount": myElement = myAccount;break;
            case "management": myElement = management;break;
            case "devices": myElement = devices;break;
            case "dashboard": myElement = dashboard;break;
            case "edit": myElement = edit;break;
            case "category": myElement = category;break;
            case "edit2": myElement = edit2;break;
            case "addButton": myElement = addButton;break;
            case "addIcon": myElement = addIcon;break;
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
            case "country": myElement = country;break;
            case "ukraine": myElement = ukraine;break;
            case "year": myElement = year;break;
            case "2023": myElement = y2023;break;
            case "save": myElement = saveButton;break;
            case "assetsMas": myElement = assetsMas;break;
            case "arrowButton": myElement = arrowButton;break;
            case "blankArea": myElement = blankArea;break;
            case "blankAreaGraph": myElement = blankAreaGraph;break;
            case "alarms": myElement = alarms;break;
            case "alarmsInBreadCrumbs": myElement = alarmsInBreadCrumbs;break;
            case "type": myElement = type;break;
            case "digital": myElement = digital;break;
            case "categoryA": myElement = categoryA;break;
            case "category1": myElement = category1;break;
            case "focusRegister": myElement = focusRegister;break;
            case "acrossLibrary": myElement = acrossLibrary;break;
            case "TestDEVICEin": myElement = TestDEVICEin;break;
            case "TestNameDevice": myElement = TestNameDevice;break;
            case "delete": myElement = delete;break;
            case "delete2": myElement = delete2;break;
            case "delete3": myElement = delete3;break;
            case "registerEdit": myElement = registerEdit;break;
            case "severity": myElement = severity;break;
            case "alarmA": myElement = alarmA;break;
            case "units": myElement = units;break;
            case "dropImage": myElement = dropImage;break;
            case "nominalPowerArr": myElement = nominalPowerArr;break;
            case "powerKW": myElement = powerKW;break;
            case "potentialPowerArr": myElement = potentialPowerArr;break;
            case "techMinimumNArr": myElement = techMinimumNArr;break;
            case "variableCostArr": myElement = variableCostArr;break;
            case "costKWh": myElement = costKWh;break;
            case "assets": myElement = assets;break;
            case "assetsUnderInfrastructure": myElement = assetsUnderInfrastructure;break;
            case "screenIcon": myElement = screenIcon;break;
            case "feedersMas": myElement = feedersMas;break;
            case "feeders": myElement = feeders;break;
            case "capacitorsMas": myElement = capacitorsMas;break;
            case "capacitors": myElement = capacitors;break;
            case "info": myElement = info;break;
            case "splitAirCondition": myElement = splitAirCondition;break;
            case "newGroup": myElement = newGroup;break;
            case "idColumn": myElement = idColumn;break;
            case "reports": myElement = reports;break;
            case "newReport": myElement = newReport;break;
            case "generalTool": myElement = generalTool;break;
            case "buttonOn": myElement = buttonOn;break;
            case "dashboard2": myElement = dashboard2;break;
            case "events": myElement = events;break;
            case "data": myElement = data;break;
            case "graphs": myElement = graphs;break;
            case "availability": myElement = availability;break;
            case "devices2": myElement = devices2;break;
            case "registers": myElement = registers;break;
            case "systemRegisters": myElement = systemRegisters;break;
            case "process": myElement = process;break;
            case "images": myElement = images;break;
            case "specifications": myElement = specifications;break;
            case "aggregations": myElement = aggregations;break;
            case "remoteControl": myElement = remoteControl;break;
            case "reports2": myElement = reports2;break;
            case "calculated": myElement = calculated;break;
            case "importJson": myElement = importJson;break;
            case "importJsonInImport": myElement = importJsonInImport;break;
            case "eventsInBreadCrumbs": myElement = eventsInBreadCrumbs;break;
            case "tasMas": myElement = tasMas;break;
            case "interconnectors": myElement = interconnectors;break;
            case "pairInterconnectors": myElement = pairInterconnectors;break;
            case "internalConsumption": myElement = internalConsumption;break;
            case "reportsInMenu": myElement = reportsInMenu;break;
            case "discard": myElement = discard;break;
            case "printIcon": myElement = printIcon;break;
            case "windDrag": myElement = windDrag;break;
            case "valueTool": myElement = valueTool;break;
            case "complexValue": myElement = complexValue;break;
            case "editCheckedRule": myElement = editCheckedRule;break;
            case "timeBlockly": myElement = timeBlockly;break;
            case "seconds": myElement = seconds;break;
            case "complexValueIn": myElement = complexValueIn;break;
            case "searchButton": myElement = searchButton;break;
            case "arrowForward": myElement = arrowForward;break;
            case "newAdd": myElement = newAdd;break;
            case "languageSwitch": myElement = languageSwitch;break;
            case "languageSwitch2": myElement = languageSwitch2;break;
            case "languageEl": myElement = languageEl;break;
            case "languageEl2": myElement = languageEl2;break;
            case "displayName": myElement = displayName;break;
            case "description": myElement = description;break;
            case "customDataTemplate": myElement = customDataTemplate;break;
            case "Templates": myElement = Templates;break;
            case "sendAnyway": myElement = sendAnyway;break;
            case "userLogo": myElement = userLogo;break;
            case "personIcon": myElement = personIcon;break;
            case "english": myElement = english;break;
            case "greek": myElement = greek;break;
            case "shareable": myElement = shareable;break;
            case "hide": myElement = hide;break;


        }
        clickFunction(myElement);
    }

    public void findAndVerify(String strElement) {
        switch (strElement) {
            case "assertLogo": myElement = assertLogo;break;
            case "loginButton": myElement = loginButton;break;
            case "inputName": myElement = inputName;break;
            case "infoName": myElement = infoName;break;
            case "acrossLogo": myElement = acrossLogo;break;

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

    public void findAndVerify(String strElement, String text) {
        switch (strElement) {
            case "solarPanel": myElement = solarPanel;break;
            case "TestDEVICE": myElement = TestDEVICE;break;
            case "success": myElement = success;break;
            case "nameContains": myElement = nameContains;break;
            case "inputName": myElement = inputName;break;


        }
        verifyContainsText(myElement, text);
    }

    public void rightClick(String strElement) {
        switch (strElement) {
            case "blankArea": myElement = blankArea;break;
            case "blankAreaGraph": myElement = blankAreaGraph;break;
            case "buttonOn": myElement = buttonOn;break;

        }
        rightClickActions(myElement);
    }

    public void deleteItem(){
        clickFunction(delete2);
    }

    public void waitUntilProgressFinish(String strElement){
        switch (strElement) {
            case "confirm": myElement = confirm;break;
        }
        waitUntilClickable(myElement);
    }

    public void verifyNotDisplayed(String strElement, String value) {
        switch (strElement) {
            case "nameContains": myElement = nameContains;break;

        }
        verifyElementNotDisplayed(myElement,value);
    }

    public void dragAndDrop(String sourceElement, String targetElement) // put into Dialog
    {
        switch (sourceElement)
        {
            case "buttonDrag":source = buttonDrag;break;
            case "windDrag":source = windDrag;break;
        }
        switch (targetElement)
        {
            case "mainBoard":target = mainBoard;break;
            case "blankArea":target = blankArea;break;
        }

        dragAndDropFunction(source, target);
    }
}
