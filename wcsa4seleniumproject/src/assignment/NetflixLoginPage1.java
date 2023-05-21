package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NetflixLoginPage1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
          WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/Login");
	 driver.findElement(By.id("id_userLoginId")).sendKeys("Sarika");
	 Thread.sleep(3000);
	 driver.findElement(By.id("id_password")).sendKeys("sarika@123");
	 	Thread.sleep(3000);
	 driver.findElement( By.tagName("button"));
	 Thread.sleep(3000);
 
	}

}
