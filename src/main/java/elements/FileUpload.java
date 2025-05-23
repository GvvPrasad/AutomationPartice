package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.findElement(By.id("myFile"))
				.sendKeys("D:\\WorkSpace\\AutomationPartice\\src\\test\\resources\\testata\\Xdoc.txt");
		driver.findElement(By.id("submit-button")).click();

	}

}
