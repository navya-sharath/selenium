package selenium.command;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEST1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com/");
	     Thread.sleep(2000);
		driver.navigate().back();
		 Thread.sleep(2000);
		driver.navigate().forward();
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		//driver.quit();
		String title=driver.getTitle();
		System.out.println(title);
		//String source=driver.getPageSource();
	    //System.out.println(source);
		String currentwindow=driver.getWindowHandle();
		Set<String> multiplewindows=driver.getWindowHandles();
	}


		
	

}
