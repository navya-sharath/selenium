package selenium.command;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public interface Webdriver {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	driver.findElement(By.id("firstName")).sendKeys("nava");
	Thread.sleep(2000);
	driver.findElement(By.id("lastName")).sendKeys("krishna");
	Thread.sleep(2000);
	driver.findElement(By.id("firstName")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("firstName")).clear();
	Thread.sleep(2000);
	driver.findElement(By.id("firstName")).sendKeys("navya");
	Thread.sleep(2000);
	WebElement check = driver.findElement(By.id("submit"));
	if(check.isDisplayed()) {
		if(check.isEnabled()) {
			check.click();
		}
	}
}
}
