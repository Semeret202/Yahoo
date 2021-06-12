import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Signuppage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create?specId=yidReg");
		System.out.println(driver.getTitle());
		//maximize widndow
		driver.manage().window().maximize();
		//locate first name and type
		driver.findElement(By.xpath("//input[@id='usernamereg-firstName']")).sendKeys("Ron");
		//locate last name and type
		driver.findElement(By.xpath("//input[@id='usernamereg-lastName']")).sendKeys("Miller");
		//locate email address and type
		driver.findElement(By.xpath("//input[@name='yid']")).sendKeys("Ron2347");
		//locate password and type
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("#Sunday1");
		//locate Mobile number and type
		driver.findElement(By.xpath("//input[@id='usernamereg-phone']")).sendKeys("2347");
		
	}

}
