package Maven_Project_01.Maven_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium_Test {
	
	@Test
	public void tc_01(){
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.google.com");
		System.out.println("browser Launched..");
	}
	

}
