package vandanademo2;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tar_task {
	public static String vandana= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
	@BeforeTest
	public void BT() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get(vandana);
		
	}
	@Test(priority = 0)
	public void test() throws InterruptedException {
		Thread.sleep(3000);

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(2000);
}
	@Test(priority = 1)
	public void test2() throws InterruptedException {
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[10]/a")).click();
		driver.findElement(By.xpath("//*[@class='oxd-form-row'][2]//div//div[2]//input")).sendKeys("van");
		
		
//		driver.findElement(By.xpath("//*[@type='button']")).click();
//		driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
//	
//	}
//	@AfterTest(enabled=false)
//	public void AT() throws InterruptedException {
//		Thread.sleep(2000);
//		driver.close();
//	}
}
}
