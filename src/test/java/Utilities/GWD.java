package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GWD {
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
    private static ThreadLocal<String> threadBrowserName = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (threadBrowserName.get() == null) {
            // default chrome
            threadBrowserName.set("chrome");
        }

        if (threadDriver.get() == null) {
            String browser = threadBrowserName.get();

            if (browser.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();

                ChromeOptions options = new ChromeOptions();

                // Eğer Jenkins ortamında çalışıyorsa headless + window-size
                if (isRunningOnJenkins()) {
                    options.addArguments("--headless=new");
                    options.addArguments("--window-size=1920,1080");
                } else {
                    // Localde normal tarayıcı açılır
                    options.addArguments("--start-maximized");
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
            threadBrowserName.remove();
        }
    }

    private static boolean isRunningOnJenkins() {
        // Jenkins ortamı genelde "JENKINS_HOME" env variable ile anlaşılır
        return System.getenv("JENKINS_HOME") != null;
    }

    public static void setBrowser(String browser) {
        threadBrowserName.set(browser);
    }
}
