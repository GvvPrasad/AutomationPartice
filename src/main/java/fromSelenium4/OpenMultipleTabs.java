package fromSelenium4;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenMultipleTabs {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://rahulshettyacademy.com/");
		
		Set<String> allwindows= driver.getWindowHandles();
		Iterator<String> it= allwindows.iterator();
		
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		
		Thread.sleep(3000);
		String courseName = driver.findElements(By.xpath("//a[contains(@href,'https://courses.rahulshettyacademy.com/p')]")).get(1).getText();
		System.out.println(courseName);
		
		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys(courseName);
		
		driver.quit();
	}

}
