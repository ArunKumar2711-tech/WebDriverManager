package basicsOfSelenium;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartBrowser2 {
	
	static WebDriver driver ;
	public static String browser="firwmhdgfefox";
	
	public static void main(String[] args) {
		 
		if(browser.equalsIgnoreCase("CHROME")) {
			driver = WebDriverManager.chromedriver().create();
		}
	
		else if(browser.equalsIgnoreCase("FIREFOX")) {
			driver = WebDriverManager.firefoxdriver().create();
			
		}
		
		
		else {
			driver = WebDriverManager.edgedriver().create();
	
		}
		driver.get("https://google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println("Test Case Passed");
		
	
	}

}
