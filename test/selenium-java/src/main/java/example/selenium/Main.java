package example.selenium;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	public static void main(String args[]) throws Exception {
		System.out.println("Hello World!");
		new Main().test();
	}

	@Test
	public void test() throws Exception{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8000/");
		try {
			WebElement elements = driver.findElement(By.name("query"));
			elements.sendKeys("nishipy");
			Thread.sleep(3000);

			WebElement content = driver.findElement(By.className("md-search-result__link"));
			content.click();
			Thread.sleep(3000);

			assertEquals("About - Test Docs", driver.getTitle());
        } catch (Exception e) {
            fail(e.getMessage());
        } finally {
			driver.close();
		}
	}

}