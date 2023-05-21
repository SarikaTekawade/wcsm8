package HandleDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndexMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/saruu07/OneDrive/Documents/Single%20Selected%20DropDown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement dropDownElement = driver.findElement(By.id("i1"));
		Select sel = new Select(dropDownElement);
		Thread.sleep(2000);
		sel.selectByIndex(6);
		
		
		
		
	}

}
