package Mindtree.Comprehensive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assessment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.marriott.com/default.mi");
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//*[@data-description='Sign In']"))).click().build().perform();
		driver.findElement(By.xpath("//*[@id='signin-userid']")).sendKeys("svmnarayanareddy@gmail.com");
		driver.findElement(By.id("signin-user-password")).sendKeys("Mindtree@4334");
		driver.findElement(By.xpath("//*[@id='container-26d2e6af1a']/div/div/header/div[2]/div[2]/div/div[2]/div/ul/li[6]/div/div[2]/form/div[3]/button")).click();
		/*Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='field-user-id']")).sendKeys("svmnarayanareddy@gmail.com");
		driver.findElement(By.id("field-password")).sendKeys("Mindtree@4334");
		driver.findElement(By.xpath("//*[@id='LogInForm130d']/div/form/div[2]/div[3]/div/button")).click();
		*/
		
	}

}
