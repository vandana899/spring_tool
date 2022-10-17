package vandanademo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class my_try {
	//public static String vandana= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	//public static void main(String[]args) throws InterruptedException
//		{
//			System.setProperty("webdriver.chrome.driver", "C://Users//hp//Downloads//chromedriver.exe");
		//@Test
//		public void test() throws InterruptedException {
//
//				WebDriverManager.chromedriver().setup();
//			WebDriver driver=new ChromeDriver();
//			driver.get(vandana);
//			Thread.sleep(3000);
//			driver.findElement(By.name("username")).sendKeys("Admin");
//			driver.findElement(By.linkText("username")).sendKeys("Admin");
//			driver.findElement(By.name("password")).sendKeys("admin123");
//			driver.findElement(By.xpath("//*[@type='submit']")).click();
//			driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
//			
//			driver.findElement(By.xpath("//*[@class='oxd-grid-item oxd-grid-item--gutters']//div//div//input")).sendKeys("van");
//			driver.findElement(By.xpath("//*[@type='submit']")).click();
//			driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[6]")).click();
//			driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
//			
//			driver.close();
//			//driver.findElement(By.xpath("//*[@class='oxd-input-group oxd-input-field-bottom-space']")).sendKeys("bbb");
//	}
//		
	public static String van= "https://demo.guru99.com/test/newtours/";
	WebDriver driver;
	@BeforeTest public void BT() {
		WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.navigate().to(van);
		//driver.get(van);
	}
	@Test(priority = 0)
	
	public void test1() throws InterruptedException
	{
		
		
		WebElement biba=driver.findElement(By.name("userName"));
		biba.sendKeys("user");
		biba.clear();
		biba.sendKeys("user");
	//	boolean status = biba.isDisplayed();
		driver.findElement(By.name("password")).sendKeys("user");
		WebElement element= driver.findElement(By.xpath("//*[@type='submit']"));
		element.click();
		Thread.sleep(8000);
//		driver.findElement(By.xpath("//*[@class='collapse navbar-collapse']/ul/li[1]/a")).click();
//		Thread.sleep(5000);
//		 driver.navigate().back();
//		 driver.navigate().refresh();
//		 driver.navigate().forward();
		 
		//Select s=new Select(driver.findElement(By.name("country")));
		//s.selectByIndex(4);
		
	}
	
		//s.selectByIndex(4);
//		s.selectByVisibleText("AUSTRALIA");
//		driver.findElement(By.name("password")).sendKeys("dontknow111");
//		driver.findElement(By.name("confirmPassword")).sendKeys("dontknow111");
//		driver.findElement(By.xpath("//*[@type='submit']")).click();
//	  //	driver.findElement(By.xpath("//*[@type='submit']")).click();
        
	}
		
//	@AfterTest
//    public void aftertest() throws InterruptedException
//		{
//		String  title = driver.getTitle();
//		System.out.println("name of the title is " +title);
//String url = driver.getCurrentUrl();
//		System.out.print("url is" +url);
		//driver.close();


