package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchActiTime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://laptop-4plgmivc/login.do");
		
		 String loginPageActualTitle = driver.getTitle();
		 if(loginPageActualTitle.equals("actiTime - Login"))
			 
			 {  
			     System.out.println("Test is pass  Login page verified");
			 }
		 else
		     {
			     System.out.println("Test is falis login page not verified");

		     }
			  driver.findElement(By.name("Username")).sendKeys("admin");
			  driver.findElement(By.name("password")).sendKeys("manager");
			  driver.findElement(By.id("loginButton")).click();
			  Thread.sleep(2000);
			  String homePageActualTitle = driver.getTitle();
			  if(homePageActualTitle.equals("actiTIME- Enter Time-Track"));
			     {
				     System.out.println("Test is passed Home page verified");
			     }
			     
			     else
			     {
				     System.out.println("Test is fails  Home page not verified");
				     
			     }
	}  
	
}

