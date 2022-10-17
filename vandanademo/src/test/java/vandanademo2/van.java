package vandanademo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class van {
	 
	public static String vandana= "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	@Test
public void test() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get(vandana);
	Thread.sleep(3000);
	
	//if i want to enter username
	String beforelogin=driver.getTitle();
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	String afterlogin= driver.getTitle();
	if (beforelogin.equals(afterlogin)){
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
		Thread.sleep(5000);
		
	driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
		System.out.print("title is same");
		
	}
	else
	 {
		System.out.print("title is not same");
	}driver.close();
}

}

