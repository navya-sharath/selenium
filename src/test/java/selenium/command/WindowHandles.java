package selenium_Topics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandles {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// browser launch
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		// URL launch
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");

		// element capture
		WebElement email_Icon = driver.findElement(By.xpath("//span[normalize-space()='Email This']"));
		WebElement penterest = driver.findElement(By.xpath("//span[normalize-space()='Share to Pinterest']"));
		WebElement twitter = driver.findElement(By.xpath("//span[normalize-space()='Share to X']"));

		// scroll to element
		Actions ac = new Actions(driver);
		ac.scrollToElement(twitter).build().perform();

		// multiple windows open
		penterest.click();
		Thread.sleep(5000);

		// Capture window ids in Set of string
		Set<String> wh = driver.getWindowHandles(); // win1, win2
		System.out.println(wh); // print window id's
		Iterator<String> s = wh.iterator(); // using Iterator interface to captu each index value from Set collection

		String parent_Window = s.next(); // only testing
		String pinterest = s.next(); // pinterest

		driver.switchTo().window(pinterest); // web driver will switch to pinterest
		System.out.println(driver.getTitle()); // print title of the active window
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("navya");

	}

}
