package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
		driver.get("https://demowebshop.tricentis.com/");
		
		
		//typcasting to get ScreenShot methods
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//temporary location
		File fs=ts.getScreenshotAs(OutputType.FILE);
		
		//Destination file
		File dest=new File("./Ts/Homepage.png");
		FileHandler.copy(fs, dest);
		driver.close();
		
		
		
	}

}
