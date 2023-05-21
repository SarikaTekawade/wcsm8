package HandleDropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class ClassException {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/saruu07/OneDrive/Documents/Single%20Selected%20DropDown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='single']"));
		ISelect sel = new Select (dropdownElement);
		sel.selectByVisibleText("Maggi");
		Thread.sleep(2000);
		sel.deselectByVisibleText("Maggi");
		
		
	}
}		

	
