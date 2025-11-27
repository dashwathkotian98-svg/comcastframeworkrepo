package practice;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvoiceTest  {
	@Test
	public void createinvoice()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://amazon.in");
		driver.findElement(By.xpath("//button[contains(text(),'Continue shopping')]")).click();
	@Nullable
	String title = driver.getTitle();
	Assert.assertEquals(title, "login");
	System.out.println("step 2");
	System.out.println("step 3");
	System.out.println("step 3");
		
	}
@Test
	public void createinvoicewithContactTest() {
		
	}
}
