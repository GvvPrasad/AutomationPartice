package streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StreamSort {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//table/thead/tr/th[2]")).click();
		
		List<WebElement> originalList = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		
		List<String> clickSortedList =  originalList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> streamSortedList = originalList.stream().map(s->s.getText()).sorted().collect(Collectors.toList());
		System.out.println("click Sorted List: "+clickSortedList);
		System.out.println("stream Sorted List: "+streamSortedList);
		
		
		if(clickSortedList.equals(streamSortedList)==true) {
			System.out.println("same");
		}
		driver.quit();
	}

}
