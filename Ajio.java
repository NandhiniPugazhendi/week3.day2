package week3.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Ajio {

	public static void main(String[] args) {
		ChromeDriverManager.chromiumdriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String itemCount = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Count of items are:" + itemCount);
		System.out.println("***Brand Name***");
		List <WebElement> brandName= driver.findElements(By.xpath("//div[@class='brand']"));
		for (int i = 0; i < brandName.size(); i++) {
			System.out.println(brandName.get(i).getText());
		}
		List <WebElement> nameOfBags= driver.findElements(By.xpath("//div[@class='name']"));
		for (int j = 0; j < nameOfBags.size(); j++) {
			System.out.println(nameOfBags.get(j).getText());
		}
	
	}
}
