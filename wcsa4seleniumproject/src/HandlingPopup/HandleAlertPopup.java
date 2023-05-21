package HandlingPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/saruu07/OneDrive/Documents/Alert%20popup.html");
		
		// generate the Alert poplup
		driver.findElement(By.xpath("//button[text()='Click me!']")).click();
		 
		// switch the controls to Alert Popup
	   // Thread.sleep(2000);
		Alert a1 = driver.switchTo().alert();
		
		//1) Accept the Alert Popup
		Thread.sleep(2000);
		//a1.accept();
		
		// 2) Dismiss the Alert popup
		//a1.dismiss();
		
		// 3) gettext the Alert Popup
		System.out.println(a1.getText());
		
		// pass the characters to alert popup
		a1.sendKeys("aaaaaaa");
		
		
		
		

	}

}
