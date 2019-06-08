package selnium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchchrom {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "J:\\Google_Chrome_(32bit)_v55.0.2883.87.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 Thread.sleep(10000);
		// Open facebook
		driver.get("http://www.facebook.com");
		 
		// Maximize browser
		 
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	}

}
