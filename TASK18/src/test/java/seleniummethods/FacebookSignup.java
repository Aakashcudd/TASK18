package seleniummethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignup {

	public static void main(String[] args) throws Exception {
		
		// Setup WebDriver
		WebDriverManager.chromedriver().setup();

		// Launching Chrome Browser
		WebDriver driver = new ChromeDriver();

		// Navigate to Website
		driver.navigate().to("https://www.facebook.com/");
		
		// Verify the Website
        System.out.println(driver.getCurrentUrl());
        System.out.println("Test Passed: Redirected to Facebook Homepage");
        
        // Maximize the Webpage
        driver.manage().window().maximize();

        // Click on Create New Account
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
       
        // Enter the First name 
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
        
        // Enter the Last name
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("User");
        
        // Enter Email
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("testuser@test.com");
        
        // Re - Enter Email 
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("testuser@test.com");
        
        // Enter Password
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Sundaraakash@123");
        
        // Drop Down Handling for BirthYear
        List<WebElement> BirthYear = driver.findElements(By.xpath("//select[@id='year']/option"));
        BirthYear.get(39).click();
        
        // Drop Down Handling for BirthMonth
        List<WebElement> BirthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
        BirthMonth.get(4).click();
        
        // Drop Down Handling for BirthDate
        List<WebElement> BirthDate = driver.findElements(By.xpath("//select[@id='day']/option"));
        BirthDate.get(10).click();
        
        // Gender using Radio Button
        driver.findElement(By.xpath("//input[@value='2']")).click();
        
        // Sign Up
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();
        
        // Verify the user is successful
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals("https://www.facebook.com/")) {
            System.out.println("User successfully registered and redirected to Facebook homepage");
        } else {
            System.out.println("Registration failed or not redirected to Facebook homepage");
        }
        
	}

}
