package Project;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;


public class Activity1HRM {

        public static void main(String[] args) {
            // Set up Firefox driver
            WebDriverManager.firefoxdriver().setup();

            // Create a new instance of the Firefox driver
            WebDriver driver = new FirefoxDriver();

            // Open the page
            driver.get("http://alchemy.hguy.co/orangehrm");

            // Print the title of the page
            System.out.println("Home page title: " + driver.getTitle());

            //Assertion for page title
            //Assert.assertEquals(driver.getTitle(), "Home page title");

            // Close the browser
            driver.close();
        }
    }