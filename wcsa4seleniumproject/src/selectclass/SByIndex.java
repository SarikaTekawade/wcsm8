package selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SByIndex {

	private static WebElement dropDownElement;

	public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

            driver.get("file:///C:/Users/saruu07/OneDrive/Documents/multiselect.html");
            
             dropDownElement = driver.findElement(By.id("menu"));
            
           Select sel = new Select(dropDownElement);
            
            
	}

}
