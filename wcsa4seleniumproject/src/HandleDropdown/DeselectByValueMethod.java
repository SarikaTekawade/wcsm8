package HandleDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByValueMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/saruu07/OneDrive/Documents/multiselect.html");
		
		WebElement dropdownElement = driver.findElement(By.id("i1"));
		Select sel = new  Select (dropdownElement);
		
		sel.selectByValue("v9");
		Thread.sleep(2000);
		sel.deselectByValue("v9");
		

	}

}
