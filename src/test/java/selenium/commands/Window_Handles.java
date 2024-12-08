package selenium.commands;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Window_Handles {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	WebElement button = driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
	Thread.sleep(2000);
	button.click();

	Set<String> window = driver.getWindowHandles();
	Iterator<String> w = window.iterator();
	String parentwindow = w.next();
	String childwindow = w.next();
	driver.switchTo().window(childwindow);
	driver.findElement(By.id("firstName")).sendKeys("navya");

	
	
	
		}

}
