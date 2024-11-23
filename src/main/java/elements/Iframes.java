package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/IFrame/index.html");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.id("frame")));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"button-find-out-more\"]/b")).click();
		driver.quit();
	}

}
