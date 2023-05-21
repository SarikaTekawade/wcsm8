package HandlingPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/saruu07/OneDrive/Documents/Confirmation%20popup.html");
		
		// generate the confirmation Popup
		driver.findElement(By.tagName("input")).click();
		
		// switch the controls to confirmation Popup
	      Alert al = driver.switchTo().alert();
	      
	      // accept confirmation popup
	      Thread.sleep(2000);
	      al.accept();
	      
	      // dismiss confirmation Popup
	     // Thread.sleep(2000);
	      al.dismiss();
	      
	      // gettext confirmation Popup
	     // Thread.sleep(2000);
	      al.getText();
	      
	      
	      

	}

}
