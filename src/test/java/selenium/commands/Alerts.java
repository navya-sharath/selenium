package selenium.commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
		driver.manage().window().maximize();
	    WebElement alert = driver.findElement(By.xpath("//input[@onclick='myFunction1()']"));
	    alert.click();
	   Alert al = driver.switchTo().alert();
	  String alerttext = al.getText();
	String expectedtext = "Hi.. This is alert message!";
	boolean result = expectedtext.equals(alerttext);
	System.out.println(result);
	if(result ) {
		System.out.println("your text is pass");
	}
	else {
		System.out.println("your text is fail");
	}
	 
	
	
	}
	

}
