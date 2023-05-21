package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SwiggyLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins");
	
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.findElement(By.id("mobile")).sendKeys("1234567891");
		driver.findElement(By.id("button")).click();
		Thread.sleep(3000);

	}

}
