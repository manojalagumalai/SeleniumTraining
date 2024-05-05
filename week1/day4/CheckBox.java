package week1.day4.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://leafground.com/checkbox.xhtml"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on the "Basic Checkbox.” 
		driver.findElement(By.id("j_idt87:j_idt89")).click();
		System.out.println("'Basic Checkbox' Clicked");
		
		//Click on the "Notification Checkbox."
		driver.findElement(By.id("j_idt87:j_idt91")).click();
		System.out.println("'Notification Checkbox' Clicked");

		//Verify that the expected message is displayed.
		//String text = driver.switchTo().alert().getText();
		String popup = driver.findElement(By.className("ui-growl-title")).getText();
		if(popup.equals("Checked")){
			System.out.println("The message from Notification Checkbox is :"+popup );
		}
		
		//Click on your favorite language (assuming it's related to checkboxes). 
		driver.findElement(By.xpath("//label[text()='Python']")).click();
		System.out.println("favoritte langate is Python");
		
		//Click on the "Tri-State Checkbox."
		//Verify which tri-state option has been chosen.
		driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[2]")).click();
		String popup2=driver.findElement(By.className("ui-growl-title")).getText();
		if(popup2.equals("State has been changed.")){
			System.out.println("The message from Tri-State Checkbox :"+popup2 );
		}
		
		//Click on the "Toggle Switch." 
		//Verify that the expected message is displayed. 
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		popup=driver.findElement(By.className("ui-growl-title")).getText();
		if(popup.equals("Checked")){
			System.out.println("The message from Toggle Switch :"+popup );
		}
		
		//Verify if the Checkbox is disabled.
		String attribute = driver.findElement(By.xpath("//input[@id='j_idt87:j_idt102_input']")).getAttribute("disabled");
		System.out.println("The checkbox statsu is : "+attribute);
		
		driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple\"]/div[3]")).click();
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-items-wrapper']/ul/li/label[1]")).click();
		
		//driver.close();
	}

}
