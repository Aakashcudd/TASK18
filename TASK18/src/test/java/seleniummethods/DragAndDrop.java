package seleniummethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws Exception {
       
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/droppable/");

            // Switch to the iframe that contains the drag and drop elements
            driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));

            // Locate the source element
            WebElement source = driver.findElement(By.id("draggable"));

            // Locate the target element
            WebElement target = driver.findElement(By.id("droppable"));

            // Perform the drag and drop action
            Actions actions = new Actions(driver);
            Thread.sleep(3000);
            actions.dragAndDrop(source, target).perform();  
        
	}
}
	


