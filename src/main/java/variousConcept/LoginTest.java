package variousConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	static WebDriver driver;

	public static void main(String[] args) {
		init();
		loginTest();
		tearDown();

		init();
		negloginTest();
		tearDown();
	}
    public static void init() {
//	 set up system property
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\israt\\Sep2023_Selenium\\crm\\driver\\chromedriver.exe");
//	object to evoke browser
    driver= new ChromeDriver();
//    delete cookies
	driver.manage().deleteAllCookies();
//   go to website
    driver.get("https://www.techfios.com/billing/?ng=admin/");
//	maximize
	driver.manage().window().maximize();
    }
	

	public static void loginTest() {

		driver.findElement(By.id("username")).sendKeys("demo@techfios32312.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		driver.close();
	}

	public static void negloginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		driver.close();
	}

	public static void tearDown() {
		driver.close();
	}

}