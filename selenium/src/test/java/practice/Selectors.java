package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectors {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		//Css selector
//		driver.findElement(By.cssSelector("input[id='small-searchterms']")).sendKeys("hi how are you");
//		driver.findElement(By.cssSelector("input[type='submit']")).click();
//		Thread.sleep(2000);
		
		//Xpath absolute
		//driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("hi");
	
	driver.findElement(By.xpath("//a[text()='Register']")).click();
	
		
		
		
		Thread.sleep(2000);
		driver.quit();
		}

}
