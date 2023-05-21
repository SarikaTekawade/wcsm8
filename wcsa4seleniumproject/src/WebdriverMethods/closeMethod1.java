package WebdriverMethods;

public class closeMethod1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers.chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}
