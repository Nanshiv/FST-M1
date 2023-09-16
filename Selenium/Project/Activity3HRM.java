package Project;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3HRM {

        public static void main(String[] args) throws InterruptedException {
            // Set up Firefox driver
            WebDriverManager.firefoxdriver().setup();
           WebDriver driver = new FirefoxDriver();

            // Open the page
            driver.get("http://alchemy.hguy.co/orangehrm");

            // Print the title of the page
            System.out.println("Home page title: " + driver.getTitle());

            // Find the username field and enter the username
            driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("orange");

            // Find the password field and enter the password
            driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("orangepassword123");

            // Find the login button and click it
            driver.findElement(By.id("btnLogin")).click();
            Thread.sleep(3000);

            String HomePageTitle = driver.getTitle();
            System.out.println(HomePageTitle);

            // Close the browser
            driver.close();
        }
    }

