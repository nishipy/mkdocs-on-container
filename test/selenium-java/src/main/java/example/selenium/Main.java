package example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	public static void main(String args[]) throws Exception {
		System.out.println("Hello World!");
		new Main().test();
	}
	public void test() throws Exception{
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
		//driver.get("http://www.google.com");
		driver.get("http://localhost:8000/");

		WebElement elements = driver.findElement(By.name("query"));
		elements.sendKeys("nishipy");
		Thread.sleep(5000);

		WebElement content = driver.findElement(By.className("md-search-result__link"));
		content.click();
		Thread.sleep(5000);

		// Close browser
		driver.close();
	}

}