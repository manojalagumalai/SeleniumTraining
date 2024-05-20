package week5.day1.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import week5.day1.BaseClass;

public class Registration extends BaseClass3{
	@Test(dataProvider="sendData")
	public void runRegistration(String FN, String Email, String Address, String City, String State, String Zip, String CVV, String CCN, String NoC) {
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(FN);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys(Address);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(City);
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(State);
		driver.findElement(By.xpath("//input[@name='zip']")).sendKeys(Zip);
		driver.findElement(By.xpath("//input[@name='expyear']")).sendKeys("2018");
		driver.findElement(By.xpath("//input[@name='cvv']")).sendKeys(CVV);
		driver.findElement(By.xpath("//input[@name='expmonth']")).sendKeys("Oct");
		driver.findElement(By.xpath("//input[@name='cardnumber']")).sendKeys(CCN);
		driver.findElement(By.xpath("//input[@name='cardname']")).sendKeys(NoC);
	}
}