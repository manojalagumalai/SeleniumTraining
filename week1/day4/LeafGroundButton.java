package week1.day4.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://leafground.com/button.xhtml"); 
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Click on the button with the text ‘Click and Confirm title', 
		//and Verify that the title of the page is ‘dashboard.’
		driver.findElement(By.name("j_idt88:j_idt90")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		if(title.equals("dashboard")){
			System.out.println("The Title is :"+title);
		} else {
			System.out.println("The actual Title is :"+title);
		}
		
		//Check if the button with the text ‘Confirm if the button is disabled’ is disabled. 
		driver.navigate().back();
		Thread.sleep(1000);
		
		boolean isenabled = driver.findElement(By.name("j_idt88:j_idt92")).isEnabled();
		if (isenabled==false) {
			System.out.println("The button is Disabled");
		} else {
			System.out.println("The button is Enabled");
		}
		
		//Find and print the position of the button with the text ‘Submit.’
		Point location = driver.findElement(By.name("j_idt88:j_idt94")).getLocation();
		System.out.println("The location is : "+location);
		
		//Find and print the background color of the button with the text ‘Find the Save button color.’ 
		String cssValue = driver.findElement(By.name("j_idt88:j_idt96")).getCssValue("background-color");
		System.out.println("The CSS value is : "+cssValue);
		
		//Find and print the height and width of the button with the text ‘Find the height and width of this button.’ 
		Dimension size = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]/span[2]")).getSize();
		System.out.println("The Size is : "+size);
		
		driver.close();
	}

}
