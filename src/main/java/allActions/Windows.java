package allActions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		String parentID = driver.getWindowHandle();

		driver.findElement(By.cssSelector(".cart-header-navlink.blinkingText")).click();

		Set<String> wh = driver.getWindowHandles();
		for (String allID : wh) {
			if (!allID.equalsIgnoreCase(parentID)) {
				driver.switchTo().window(allID);
				break;
			}
		}
		String fulltext = driver.findElement(By.xpath("//h3/span")).getText();
		System.out.println(fulltext);
		driver.quit();
	}

}
