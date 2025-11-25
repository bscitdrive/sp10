/*
Create a test class that performs cross-browser testing for a simple web 
application. Also configure an XML file to specify which browsers to test against.
*/
package que3;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	WebDriver driver;

	@Test
    @Parameters("browser")
    public void launchApp(String browser) throws InterruptedException {
        System.out.println("Launching test on browser: " + browser);

        // Set up the driver based on parameter
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "E:\\Setup\\Selenium_setup\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
            
        } 
        else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "E:\\Sem_3\\STQA\\Selenium_setup\\geckodriver.exe");
            driver = new FirefoxDriver();
        } 
        else {
            throw new IllegalArgumentException("Invalid browser name: " + browser);
        }

        driver.get("https://www.example.com");
        System.out.println("Opened https://www.example.com successfully on " + browser);

        // Wait for observation
        Thread.sleep(5000);

        // Close browser
        driver.quit();
        System.out.println(browser + " browser closed successfully.\n");
	}
}
