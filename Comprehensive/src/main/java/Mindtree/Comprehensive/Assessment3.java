package Mindtree.Comprehensive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assessment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.marriott.com/default.mi");
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@href='https://clean.marriott.com']"))).click().build().perform();
		driver.findElement(By.xpath("//*[@href='https://www.marriott.com/travel-deals/vacation-packages.mi']")).click();
		Thread.sleep(2000);
		
		
	}

}
