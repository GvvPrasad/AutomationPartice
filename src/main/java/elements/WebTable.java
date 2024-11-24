package elements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));
		System.out.println(rows.size());
		List<WebElement> columns = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th"));
		System.out.println(columns.size());

		for (int i = 2; i <= rows.size(); i++) {
			for (int j = 1; j <= columns.size(); j++) {
				String cellvalue = driver
						.findElement(By.xpath("//table[@name='courses']/tbody/tr[" + i + "]/td[" + j + "]")).getText();
				System.out.print(cellvalue+" ");
			}
			System.out.println();
		}

		driver.quit();
	}

}
