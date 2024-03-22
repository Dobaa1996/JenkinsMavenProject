package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrganizationsTest {

	@Test
	public void createOrganizationsTest() {
		WebDriver d= new ChromeDriver();
		d.get("http://localhost:8888/");
		//lagin to application 
		d.findElement(By.name("user_name")).sendKeys("admin");
		d.findElement(By.name("user_password")).sendKeys("admin");
		d.findElement(By.id("submitButton")).click();
		//click on organization
	}
	
}
