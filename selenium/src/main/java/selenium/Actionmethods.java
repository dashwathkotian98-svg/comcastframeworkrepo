package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionmethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement x = driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
        Actions act=new Actions(driver);
        act.moveToElement(x).perform();
       WebElement y = driver.findElement(By.xpath("(//a[contains(text(),'Desktop')])[1]"));
       act.moveToElement(y).click().perform();
	}

}
