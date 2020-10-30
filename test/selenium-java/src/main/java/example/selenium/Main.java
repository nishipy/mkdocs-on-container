package example.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
	public static void main(String args[]) throws Exception {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		System.out.println("Hello World!");
		new Main().test();
	}
	public void test() throws Exception{
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		// Open Google
		driver.get("http://www.google.com");
		Thread.sleep(1000);
		// Close browser
		driver.close();
	}

}