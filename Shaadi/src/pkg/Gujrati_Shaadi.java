package pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gujrati_Shaadi {
	@Test
	public void shaadi_marathi() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Jars\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gujaratishaadi.com/");
		driver.manage().window().maximize();
		System.out.println("Browser Launch ");

		WebElement lets_begin = driver
				.findElement(By.xpath("//*[@id='___gatsby']/div/div[1]/div[2]/div/div/form/div/div[3]/button"));
		lets_begin.click();

		WebElement mail = driver.findElement(By.xpath("//*[@id='___gatsby']/div/div[7]/form/div[2]/div[1]/input"));
		mail.sendKeys("abc@gmail.com");

		WebElement password = driver.findElement(By.xpath("//*[@id='___gatsby']/div/div[7]/form/div[2]/div[2]/input"));
		password.sendKeys("A@1a");

		WebElement Create_password = driver
				.findElement(By.xpath("//*[@id='___gatsby']/div/div[7]/form/div[2]/div[2]/input"));
		Create_password.sendKeys("Admin@1");

		WebElement dropdown = driver
				.findElement(By.xpath("//*[@id='___gatsby']/div/div[7]/form/div[2]/div[3]/div/div/div[1]"));
		dropdown.click();

		WebElement select_son = driver
				.findElement(By.xpath("//*[@id='___gatsby']/div/div[7]/form/div[2]/div[3]/div/div[2]/div[1]"));
		select_son.click();

		WebElement clickon_radiobutton = driver.findElement(By.xpath("//*[@id='gender_male']"));
		clickon_radiobutton.click();

		WebElement clickon_next = driver.findElement(By.xpath("//*[@id='___gatsby']/div/div[7]/form/div[3]/button"));
		clickon_next.click();

		WebElement Firstname = driver.findElement(By.name("first_name"));
		Firstname.sendKeys("Shadi");

		WebElement Lastname = driver.findElement(By.name("last_name"));
		Lastname.sendKeys("marathi");

		WebElement day = driver
				.findElement(By.xpath("//*[@id='___gatsby']/div/div[7]/form/div[3]/div[1]/div/div/div[1]"));
		day.click();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)", "");

		WebElement day1 = driver
				.findElement(By.xpath("//*[@id='___gatsby']/div/div[7]/form/div[3]/div[1]/div/div[2]/div[25]"));
		day1.click();

		WebElement month = driver
				.findElement(By.xpath("//*[@id='___gatsby']/div/div[7]/form/div[3]/div[2]/div/div/div[1]"));
		month.click();

		WebElement month4 = driver
				.findElement(By.xpath("//*[@id='___gatsby']/div/div[7]/form/div[3]/div[2]/div/div[2]/div[11]"));
		month4.click();

		WebElement year = driver
				.findElement(By.xpath("//*[@id='___gatsby']/div/div[7]/form/div[3]/div[3]/div/div/div[1]"));
		year.click();

		WebElement year91 = driver
				.findElement(By.xpath("//*[@id='___gatsby']/div/div[7]/form/div[3]/div[3]/div/div[2]/div[9]"));
		year91.click();

		WebElement Religion = driver
				.findElement(By.xpath("//*[@id='___gatsby']/div/div[7]/form/div[4]/div/div/div/div[1]"));
		Religion.click();

		WebElement Hindu = driver
				.findElement(By.xpath(" //*[@id='___gatsby']/div/div[7]/form/div[4]/div/div/div[2]/div[1]"));
		Hindu.click();

		String Community = driver.getPageSource();
		if (Community.contains("Gujarati")) {
			System.out.println("community name and mother tongue is the same for Gujarati site is same");
		}
		driver.close();
  }
}
