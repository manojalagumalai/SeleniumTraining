package week2.day3.Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestData extends SuperClassTestData{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		LoginTestData obj = new LoginTestData();
		
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		//WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		

	}

}
