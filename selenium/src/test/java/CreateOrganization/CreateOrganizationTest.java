package CreateOrganization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.objectrepositoryUtility.LogIn;

public class CreateOrganizationTest {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost:8888");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
LogIn l1=new LogIn(driver);
l1.LogInToApp("name","pass");

}
}
