package selenium_Topics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// browser launch
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// URL launch
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");

		// User clicks on confirm alert box
		WebElement showMeConfirm = driver.findElement(By.xpath("//button[text()='Show Me Confirmation']"));
		showMeConfirm.click();

		Alert al = driver.switchTo().alert();

		// Validating the alert text
		String alertText = al.getText();
		String expetedText = "Press 'OK' or 'Cancel' button!";
		boolean result = expetedText.equalsIgnoreCase(alertText);
		System.out.println(result);

		// user clicks on ok button---accept
		al.accept();

		// user validate 'You pressed OK!' msg present in below alert button
		String actualResult = driver.findElement(By.xpath("//div[@id='demo']")).getText();// You pressed OK!
		String expectedResult = "You pressed OK!";

		boolean testResult = expectedResult.equalsIgnoreCase(actualResult);

		if(testResult) {
			System.out.println("You Test is Pass");
		}

	}

}
