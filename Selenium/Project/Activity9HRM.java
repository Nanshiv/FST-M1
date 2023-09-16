package Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.xmlbeans.impl.xb.xsdschema.All;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity9HRM {

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

        // Find My Info button using id and click it
        driver.findElement(By.linkText("My Info")).click();

        //find the Emergency Contact link and click it
        driver.findElement(By.linkText("Emergency Contacts")).click();

        System.out.println("Assigned Emergency Contacts:");
        driver.close();
    }
}




