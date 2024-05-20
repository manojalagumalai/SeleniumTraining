package week5.day1.assignment;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import week5.day1.ReadExcel2;

public class BaseClass3 {
	public RemoteWebDriver driver;
	@BeforeMethod
	public void precondition() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_checkout_form");
		WebElement newFrame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(newFrame);
	}

	@DataProvider(name="sendData")
	public String[][] sendData() throws IOException {
		ReadExcel3 excel=new ReadExcel3();
		String[][] data=excel.readDatafromExcel();
		return data;
	}
	
	@AfterMethod
	public void postCondition(){
		driver.close();
	}

}
