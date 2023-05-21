package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class launchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    
    // To avoid handle connectionFailedException
       ChromeOptions co=new ChromeOptions();
       co.addArguments("--romote-allow-origins=*");
       
       // launch chromebrowser
       WebDriver driver =new ChromeDriver();
       driver.manage().window().maximize();
       Thread.sleep(2000);
       driver.close();
       
       
	}

}
