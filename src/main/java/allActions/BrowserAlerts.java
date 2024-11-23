package allActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserAlerts {
	
	//variables
	static WebDriver driver;
	static BrowserAlerts ba;
	Alert alert;
	String alertText;
	

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		ba = new BrowserAlerts();
		
		ba.alerts(driver);
		ba.alertDismiss(driver);
		
		driver.quit();
	}
	
	
	public void alerts(WebDriver driver) {
		driver.findElement(By.xpath("//input[contains(@value,'Alert')]")).click();
		alert = driver.switchTo().alert();
		alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
	}
	
	public void alertDismiss(WebDriver driver) {
		driver.findElement(By.xpath("//input[contains(@value,'Confirm')]")).click();
		alert = driver.switchTo().alert();
		alertText = alert.getText();
		System.out.println(alertText);
		alert.dismiss();
	}
}
