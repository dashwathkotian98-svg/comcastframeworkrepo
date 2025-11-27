package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_multiple_window {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(3000);
	
	String parent=driver.getWindowHandle();
	System.out.println(parent);
	
	driver.findElement(By.partialLinkText("Facebook")).click();
	Thread.sleep(3000);
	Set<String> window=driver.getWindowHandles();
	for (String string : window) {
	driver.switchTo().window(string)	;
	if(driver.getTitle().contains("Facebook")) {
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("dashwath");
	
	driver.close();
	}
	driver.switchTo().window(parent);
	driver.close();
	}
	
	
	
	
}
}
