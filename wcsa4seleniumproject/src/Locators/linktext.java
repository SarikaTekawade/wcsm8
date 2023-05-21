package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://laptop-4plgmivc/login.do");
		
		driver.findElement(By.linkText("License for using this software")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(null))
		
		

	}

}
