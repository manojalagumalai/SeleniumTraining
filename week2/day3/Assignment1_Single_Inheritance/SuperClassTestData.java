package week2.day3.Assignment2;

import org.openqa.selenium.WebElement;

public class SuperClassTestData {
	
	public void enterCredentials(WebElement user, WebElement pass) {
		String username="demosalesmanager";
		String password = "crmsfa";
		
		user.sendKeys(username);
		pass.sendKeys(password);
		
	}
	
	public void navigateToHomePage() {
		
	}

}

