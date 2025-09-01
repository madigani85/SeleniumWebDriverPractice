package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjectModel.loginPage;


public class day1 {

		

static WebDriver driver =new ChromeDriver();	


@Test
public static void test() throws InterruptedException {
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	String pageTitle= driver.getTitle();
	System.out.println("Title of the page is " +pageTitle);

	Thread.sleep(5000);
	
	loginPage lp = new loginPage(driver);

	lp.setUserName("Admin");
	lp.setPassword("admin123");
			
		}
	
}


