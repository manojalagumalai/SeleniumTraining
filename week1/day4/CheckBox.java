package week1.day4.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://leafground.com/checkbox.xhtml"); 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Click on the "Basic Checkbox.” 
		driver.findElement(By.id("j_idt87:j_idt89")).click();
		Thread.sleep(2000);
		
		//Click on the "Notification Checkbox."
		driver.findElement(By.id("j_idt87:j_idt91")).click();
		//Thread.sleep(1000);
		//Verify that the expected message is displayed.
		String text = driver.switchTo().alert().getText();
		System.out.println("The message is :"+text );
		
		//Click on your favorite language (assuming it's related to checkboxes). 

	}

}
