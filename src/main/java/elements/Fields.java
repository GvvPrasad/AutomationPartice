package elements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fields {

	static WebDriver driver;
	static Fields fl;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		fl = new Fields();

		fl.radioButton(driver);
		fl.checkBox(driver);
		fl.dropDown(driver);
		fl.autoSuggestion(driver);

		driver.quit();
	}

	public void radioButton(WebDriver driver) {
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
	}

	public void checkBox(WebDriver driver) {
		driver.findElement(By.xpath("//label[@for='benz']//input")).click();
	}

	public void dropDown(WebDriver driver) {
		Select dropSection = new Select(driver.findElement(By.xpath("//select[@name='dropdown-class-example']")));
		dropSection.selectByValue("option3");
	}

	public void autoSuggestion(WebDriver driver) {
		driver.findElement(By.cssSelector(".inputs.ui-autocomplete-input")).sendKeys("sa");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		List<WebElement> options = driver.findElements(By.cssSelector(".ui-menu-item-wrapper"));
		for (WebElement counrtyList : options) {
			if (counrtyList.getText().equalsIgnoreCase("Samoa")) {
				counrtyList.click();
				break;
			}
		}
	}

}
