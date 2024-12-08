package selenium.commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Sendkeys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//button[@onclick='myFunctionf()']"));
		 button.click(); 
		 Thread.sleep(2000);
	
	    Alert alert = driver.switchTo().alert();
	   String actualText = alert.getText();
	   String expectedText = "Your Name Please";
	  boolean result = expectedText.equals(actualText);
	  System.out.println(result);
	alert.getText();
	System.out.println(alert.getText());
	alert.sendKeys("navya");
	alert.accept();
	if(result) {
		  System.out.println("your text is pass");
	  }
	  else {
		  System.out.println("your text is fail");
	  }
	  
	  }
	}

	


