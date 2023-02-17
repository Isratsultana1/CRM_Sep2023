package variousConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customizedxpath {

	public static void main(String[]args) {

		System.setProperty("webdriver.chrome.driver\", \"drivers\\\\chromedriver.exe\");", null);

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
//		dynamic wait
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.half.ebay.com");
		
	}	
		
		
	
}
