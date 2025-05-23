package partice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetText {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://groww.in/etfs?filter=Gold");
		List<WebElement> etf= driver.findElements(By.xpath("//table/tbody/tr/td/a"));
		
		for (int i = 0; i < etf.size(); i++) {
			System.out.println(etf.get(i).getText());
			
		}

	}

}
