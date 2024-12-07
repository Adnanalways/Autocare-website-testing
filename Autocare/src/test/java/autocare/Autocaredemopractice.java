package autocare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autocaredemopractice {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver-win64 (130)\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://autocare.com.bd/");
	}
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/header[1]/div/div/div[2]/div[2]/div[1]/button[1]/span")).click();
		driver.findElement(By.xpath("//input[@id=\"phoneNumber\"]")).sendKeys("01752243984");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit' and contains(@class, 'bg-[#0F766D]') and text()='Login']")).click();
	}
	
	@Test
	public void search() throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='text' and @id='first_name' and @placeholder='Search anything']")).sendKeys("car");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("body > header.sticky.top-0.py-4.bg-white.menu.shadow.hidden.lg\\:block > div > div > div.flex.gap-10.items-center.w-\\[62\\%\\] > div.relative.flex-grow > div > form > button > svg > path")).submit();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"search-section\"]/div/div/div[2]/div[2]/div/a[3]/div/div[2]/div[2]/h2")).click();	
	}
	@Test
	public void addtocart() throws InterruptedException {
		Thread.sleep(4000);
	
		driver.findElement(By.xpath("/html/body/main/div[1]/section/div/div[2]/div[5]/button[2]")).click();
		
	}

}
