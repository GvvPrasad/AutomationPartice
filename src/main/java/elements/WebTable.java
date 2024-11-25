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
		System.out.println("No of rows: "+rows.size());
		List<WebElement> columns = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th"));
		System.out.println("No of columns: "+columns.size());

		// diaplayAlldata(rows, columns, driver);
		sumOfPrice(rows, columns, driver);

		driver.quit();
	}

	// display all cell values in tabel
	public static void diaplayAlldata(List<WebElement> rows, List<WebElement> columns, WebDriver driver) {
		for (int i = 2; i <= rows.size(); i++) {
			for (int j = 1; j <= columns.size(); j++) {
				String cellvalue = driver
						.findElement(By.xpath("//table[@name='courses']/tbody/tr[" + i + "]/td[" + j + "]")).getText();
				System.out.print(cellvalue + " ");
			}
			System.out.println();
		}
	}

	// sum of prices
	public static void sumOfPrice(List<WebElement> rows, List<WebElement> columns, WebDriver driver) {
		int price =0;
		for (int i = 2; i <= rows.size(); i++) {
			String cellvalue = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[" + i + "]/td[3]"))
					.getText();
			price = price + Integer.parseInt(cellvalue);
		}
		System.out.println(price);

	}
}
