package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.impl.SimpleLogger;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    private static ThreadLocal<String> threadBrowser = new ThreadLocal<>();

    public static WebDriver getDriver() {

        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        Logger.getLogger("").setLevel(Level.SEVERE);
        System.setProperty(SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");

        if (threadBrowser.get() == null) {
            threadBrowser.set("chrome"); // default chrome
        }

        if (threadDriver.get() == null) {
            String browser = threadBrowser.get();

            if (browser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();

                ChromeOptions options = new ChromeOptions();

                // if Jenkins works
                if (isRunningOnJenkins()) {
                    options.addArguments("--headless=new");
                    options.addArguments("--window-size=1920,1080");
                } else {
                    // if Intelij works
                    options.addArguments("--start-maximized");
                }

                threadDriver.set(new ChromeDriver(options));
            }
//            threadDriver.get().manage().window().maximize();
        }

        return threadDriver.get();
    }

    public static void quitDriver() {
        if (threadDriver.get() != null) {
            threadDriver.get().quit();
            threadDriver.remove();
            threadBrowser.remove();
        }
    }

    private static boolean isRunningOnJenkins() {
        // Jenkins gets Env with "JENKINS_HOME" env variable
        return System.getenv("JENKINS_HOME") != null;
    }

    public static void waitForCheck(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void setBrowser(String browser) {
        threadBrowser.set(browser);
    }
}
