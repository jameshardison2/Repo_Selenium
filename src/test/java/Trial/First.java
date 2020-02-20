package Trial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class First {

    public static void main(String[] args) {
        // setChromedriver using a key value pair. I'm trying to use a chrome driver and here is my path
        System.setProperty("webdriver.chrome.driver", "/Users/owner/Desktop/chromedriver");
        //init webdriver object
        WebDriver driver = new ChromeDriver();
        //Set url
        String url = "https://www.facebook.com";
        //navigate to the url
        driver.navigate().to(url);
        //Get current URL
        String currentUrl = driver.getCurrentUrl();
        // Verify if URL is correct
        Assert.assertEquals(currentUrl, url); // Import the TestNG library
        //quit the browser
        driver.quit();

    }
}
