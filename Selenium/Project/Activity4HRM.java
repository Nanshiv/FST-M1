package Project;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4HRM {

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

        // Find PIM button using id and click it
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        //Click on Add Button
        driver.findElement(By.id("btnAdd")).click();

        //Fill the required fields and click save
        driver.findElement(By.id("firstName")).sendKeys("Ra");
        driver.findElement(By.id("lastName")).sendKeys("Si");

        //click on save
        driver.findElement(By.id("btnSave")).click();

        //Navigate back to PIM Employee page
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        //Search for the user created
        driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Ra Si");
        driver.findElement(By.id("searchBtn")).click();

        //close the browser
        driver.close();
    }
}