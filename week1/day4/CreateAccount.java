package week1.day4.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/"); 
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("demosalesmanager");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'CRM/')]")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("TestSeleniumManoj");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.name("numberEmployees")).sendKeys("50");
		driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
	}
}
