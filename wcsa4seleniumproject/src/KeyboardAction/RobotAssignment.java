package KeyboardAction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotAssignment {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        
        driver.get("https://www.selenium.dev/downloads/");
        
        driver.findElement(By.xpath("//h1[.='Downloads']"));
        
     Actions act = new Actions(driver);
     act.contextClick(
     


	}

}
