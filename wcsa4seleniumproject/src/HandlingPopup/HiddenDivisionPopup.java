package HandlingPopup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HiddenDivisionPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=")
		driver.manage().window().maximize();
		

	}

}
