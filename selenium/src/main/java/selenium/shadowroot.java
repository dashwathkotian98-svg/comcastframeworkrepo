package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.OutputStream;
import java.time.Duration;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class shadowroot {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		//open shadowroot element
		
//		SearchContext x = driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();
//		
//		x.findElement(By.cssSelector("input[type='text']")).sendKeys("dashwath");
		
		//closed shadowroot elemenet
		WebElement x = driver.findElement(By.xpath("//h1[text()='Login']"));
		x.click();
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("hi").perform();
	}

}
