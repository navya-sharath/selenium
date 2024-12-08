package selenium.command;





import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class Dropdowns {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		/* WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	     Select select=new Select(dropdown);
	     select.selectByVisibleText("USD");
	     select.selectByIndex(2);
	     select.selectByValue("INR");
	     Thread.sleep(2000);*/
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		WebElement adult = driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));
		Thread.sleep(2000);
		for(int i=0;i<=2;i++) {
			adult.click();
		}
	      
		
		
		
	}

}