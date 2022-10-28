package vandanademo2;

import java.io.IOException;
import java.security.PublicKey;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class construction_links {
	public static  String url="https://demo.guru99.com/test/newtours/";
    WebDriver driver;
    @BeforeTest
    public void bd() throws InterruptedException, IOException{
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        Thread.sleep(2000);
        driver.get(url);
        driver.manage().window().maximize();
        
    }
        @Test
        public void bd2() throws InterruptedException {
        	
        String beforelogin =driver.getTitle();
        Thread.sleep(5000);
        //lists of all links
        List<WebElement> my_link= driver.findElements(By.tagName("a"));
        // total number of links
        System.out.println(my_link.size());
        
        // getting under construction links and the working links
        for(int i=0;i<my_link.size();i++)
        {
        	
        String link1=my_link.get(i).getAttribute("href");
        String link2="https://demo.guru99.com/test/newtours/support.php";
        if(link1.equals(link2))
        {
            System.out.println("under construction links "+my_link.get(i).getText());
        }
        else
        {
            System.out.println("links working properly"+my_link.get(i).getText());
        }
        driver.close();
}
}
}

