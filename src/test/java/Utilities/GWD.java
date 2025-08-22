package Utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.slf4j.impl.SimpleLogger;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {

    private static WebDriver driver;
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    public static ThreadLocal<String> threadBrowser = new ThreadLocal<>();
    public static WebDriver getDriver()
    {
            Locale.setDefault(new Locale("EN"));
            System.setProperty("user.language", "EN");

            Logger.getLogger("").setLevel(Level.SEVERE);
            System.setProperty(SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");

            if (threadBrowser.get()==null)
                threadBrowser.set("chrome");

            if (threadDriver.get() == null) {

                String browserName=threadBrowser.get();

                switch (browserName){

                    case "chrome":
//                        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
//                        ChromeOptions chromeOptions = new ChromeOptions(); // if incognito not desired so delete this raw and delete below which include "opt"
//                        chromeOptions.addArguments("--incognito"); // incognito mode
//                        threadDriver.set(new ChromeDriver(chromeOptions)); // chromeOptions for incognito
//                        break;

                        if(!runningFromIntelliJ()){
                        WebDriverManager.chromedriver().setup();
//                                .cachePath("C:\\Users\\AzizKaraca\\.cache\\selenium") // Java string içinde doğru
//                                .setup();

                        ChromeOptions chromeOptions = new ChromeOptions();
//                        chromeOptions.addArguments("--incognito");
                        chromeOptions.addArguments("--headless=new");
                        chromeOptions.addArguments("--no-sandbox");
                        chromeOptions.addArguments("--disable-dev-shm-usage");
                        chromeOptions.addArguments("--disable-gpu");
                        chromeOptions.addArguments("--window-size=1400,2400");
                        threadDriver.set(new ChromeDriver(chromeOptions));
                        break; }

                        else
                            threadDriver.set(new ChromeDriver());

                    case "firefox":
                        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
                        FirefoxOptions firefoxOptions = new FirefoxOptions(); // for private mode
                        firefoxOptions.addArguments("-private"); // private mode
                        threadDriver.set(new FirefoxDriver(firefoxOptions)); // firefoxOptions fo private mode
                        break;

                    case "safari":
                        threadDriver.set(new SafariDriver());
                        break;

                }
                threadDriver.get().manage().window().maximize();
            }
            return threadDriver.get();
    }

    public static void quitDriver() {

        waitForCheck(2);

        if (threadDriver.get() != null)
        {
            threadDriver.get().quit();

            WebDriver driver = threadDriver.get();
            driver = null;
            threadDriver.set(driver);
        }
    }
    public static void waitForCheck(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    public static boolean runningFromIntelliJ()
    {
        String classPath = System.getProperty("java.class.path");
        return classPath.contains("idea_rt.jar");
    }
}