package basicsOfSelenium;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartBrowser {
	
	
	
	public static void main(String[] args) {
		 
		
			WebDriver driver = WebDriverManager.chromedriver().create();
		
	
		
			//WebDriver driver = WebDriverManager.firefoxdriver().create();
		
		
		
		
			//WebDriver driver = WebDriverManager.edgedriver().create();
	
		
		
		driver.get("https://google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println("Test Case Passed");
	
	}

}
