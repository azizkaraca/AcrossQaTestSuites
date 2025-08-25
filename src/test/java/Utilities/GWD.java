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
    private static ThreadLocal<String> threadBrowser = new ThreadLocal<>(); // public yaparsam runnerslardan browser set edebilirim

    public static WebDriver getDriver() {

        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language", "EN");

        Logger.getLogger("").setLevel(Level.SEVERE);
        System.setProperty(SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");

        if (threadBrowser.get() == null) {
            threadBrowser.set("chrome"); // default chrome
        }

        if (threadDriver.get() == null) {
            String browser = threadBrowser.get();

            if (browser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();

                if (isRunningOnJenkins()) {
                    options.addArguments("--headless=new");
                    options.addArguments("--window-size=1920,1080");
                } else {
                    options.addArguments("--start-maximized");
                    options.addArguments("--incognito");
                }
                threadDriver.set(new ChromeDriver(options));
            }
        }
        return threadDriver.get();
    }

    public static void quitDriver() {

        if (threadDriver.get() != null) {
            threadDriver.get().quit();
            threadDriver.remove();
            threadBrowser.remove();
        }
        waitForCheck(2);
    }

    public static void waitForCheck(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isRunningOnJenkins() {
        return System.getenv("JENKINS_HOME") != null;
    }

    public static void setBrowser(String browser) {
        threadBrowser.set(browser);
    }
}
