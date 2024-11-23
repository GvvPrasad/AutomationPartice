package elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataPicker {
	
		//variable
		static WebDriver driver;
		static DataPicker dp;
	
	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Datepicker/index.html");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		dp = new DataPicker();
		
	//	dp.selectSpecificDate(driver);
	//	dp.selectPresentDate(driver);
		dp.selectMonth(driver);
		driver.quit();
	}

	public void selectSpecificDate(WebDriver driver) throws InterruptedException {
		driver.findElement(By.className("form-control")).click();
		driver.findElement(By.xpath("//td[text()='25']")).click();
		Thread.sleep(2000);
	}
	
	public void selectPresentDate(WebDriver driver) throws InterruptedException {
		driver.findElement(By.className("form-control")).click();
		driver.findElement(By.className("today")).click();
		Thread.sleep(2000);
	}
	
	public void selectMonth(WebDriver driver) throws InterruptedException {
		driver.findElement(By.className("form-control")).click();
		driver.findElement(By.className("datepicker-switch")).click();
		driver.findElement(By.xpath("//span[text()='Sep']")).click();
		driver.findElement(By.xpath("//td[text()='23']")).click();
		Thread.sleep(2000);
	}
}
