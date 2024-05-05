package week1.day4.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

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
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstName")).sendKeys("Manoj");
		driver.findElement(By.name("lastName")).sendKeys("Alagumalai");
		driver.findElement(By.name("companyName")).sendKeys("HexaTest");
		driver.findElement(By.name("generalProfTitle")).sendKeys("Selenium Testing");
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();

	}

}
