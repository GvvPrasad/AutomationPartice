package allActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DialogBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/howto/howto_css_modals.asp");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(".ws-btn.w3-dark-grey")).click();
		Thread.sleep(3000);
		//driver.switchTo().activeElement();
		String text= driver.findElement(By.xpath("//p[contains(text(),'Modals are awesome!')]")).getText();
		System.out.println(text);
	}

}
