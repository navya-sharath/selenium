package selenium.command;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
		driver.manage().window().maximize();
		WebElement d = driver.findElement(By.xpath("//input[@onclick='myFunction1()']"));
		d.click();
	  Alert dr = driver.switchTo().alert();
	}

}
