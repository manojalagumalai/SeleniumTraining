package week2.day1.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Local");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Test");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("test@test.com");
		Select state = new Select(driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']")));
		state.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		System.out.println("The title is "+driver.getTitle());
		
		driver.close();
	}

}
