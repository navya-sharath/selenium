package selenium.commands;

import java.util.Iterator;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;





public class Windows_2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
		driver.manage().window().maximize();
		//WebElement pintrest = driver.findElement(By.xpath("//a[@class='goog-inline-block share-button sb-pinterest']"));
		WebElement facebook = driver.findElement(By.xpath("//a[@class='goog-inline-block share-button sb-facebook']"));
		WebElement pintrest = driver.findElement(By.xpath("//a[@class='goog-inline-block share-button sb-pinterest']"));
		Actions ac= new Actions(driver);
		ac.scrollToElement(pintrest).build().perform();
		Thread.sleep(2000);
		pintrest.click();
		//driver.manage().window().maximize();
		//pintrest.click();
		String title=driver.getTitle();
		System.out.println(title);
		//String title = driver.getTitle();
		//System.out.println(title);
		Set<String> gw = driver.getWindowHandles();
		Iterator<String> i = gw.iterator();
		String parentWindow = i.next();
		String pintrestWindow= i.next();
		driver.switchTo().window(pintrestWindow);
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Navyakrishna@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Sharath@2508");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='KS5 hs0 mQ8 un8 b23 TB_']")).click();
		
	}

}
