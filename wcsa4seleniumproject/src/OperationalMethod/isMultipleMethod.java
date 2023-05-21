package OperationalMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultipleMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("file:///C:/Users/saruu07/OneDrive/Documents/Single%20Selected%20DropDown.html");
	    WebElement dropDown = driver.findElement(By.name("menu"));

		Select sel = new Select (dropDown);
		boolean verify = sel.isMultiple();
		System.out.println(verify);


	}

}
