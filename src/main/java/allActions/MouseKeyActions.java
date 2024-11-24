package allActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseKeyActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/index.html");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("scrolling-around"))).perform();
	/*	action.click(driver.findElement(By.id("click-box"))).perform();
		action.moveToElement(driver.findElement(By.xpath("//button[text()='Hover Over Me Third!']"))).perform();
		//action.moveToElement(driver.findElement(By.xpath("//div/a[@href='#'][2]"))).click().perform();
		action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).perform();
		action.doubleClick(driver.findElement(By.id("double-click"))).perform();
		action.clickAndHold(driver.findElement(By.id("click-box"))).perform();
		action.release().perform(); */
	}

}
