package week2.day1.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("demosalesmanager");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'CRM/')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("HexaTest");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Manoj");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Alagumalai");
		
		Select source = new Select(driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']")));
		source.selectByIndex(4);
		
		Select marketing = new Select(driver.findElement(By.xpath("//select[@name='marketingCampaignId']")));
		marketing.selectByVisibleText("Automobile");
		
		Select ownership = new Select(driver.findElement(By.xpath("//select[@name='ownershipEnumId']")));
		ownership.selectByValue("OWN_CCORP");
		
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
		String title = driver.getTitle();
		System.out.println("The tilte of the page is : "+title);
		
		driver.close();
	}

}
