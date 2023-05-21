package MethodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class closeMethod {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      
       driver.get("https://omayo.blogspot.com/");
      Thread.sleep(2000);
      driver.close();
      
      
      
	}

}
