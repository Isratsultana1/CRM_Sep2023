package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestJunit {

	 WebDriver driver;
   @BeforeClass
	public static void beforeClass() {
	   System.out.println("before class");	
   }
	@AfterClass	
    public static void afterClass() {
    System.out.println("after Class");
	}
	@Before
    public  void init() {
	 System.out.println("init");
//		set up system property
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\israt\\Sep2023_Selenium\\crm\\driver\\chromedriver.exe");
//	object to evoke browser
    driver= new ChromeDriver();
//    delete cookies
	driver.manage().deleteAllCookies();
//   go to website
    driver.get("https://www.techfios.com/billing/?ng=admin/");
//	maximize
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
  @Test
	public void LoginTest() {
  System.out.println("login test");
		driver.findElement(By.id("username")).sendKeys("demo@techfios32312.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		//driver.close();
	}
   @Test
	public void negLoginTest() {
		System.out.println("neglogintest");
	   driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		//driver.close();
	}
  
	@After
	public void tearDown() {
	System.out.println("teardown");
		driver.close();
	}

}
	
	
	
	

