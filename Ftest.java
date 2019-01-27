package testFB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestFB {

	@Test
	public void atest() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:/Users/Dev/WebDriver All/ChromeDriver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.navigate().to("https://www.facebook.com/"); 

Thread.sleep(6000);


//email
driver.findElement(By.id("email")).sendKeys("jewelu1988@gmail.com");
//pass 
driver.findElement(By.id("pass")).sendKeys("Dinajpur1"); 
//login
//driver.findElement(By.id("u_0_2")).click();


//Fname
driver.findElement(By.id("u_0_c")).sendKeys("Mohammed");
//Lname
driver.findElement(By.id("u_0_e")).sendKeys("Islam");
//Mobile#
driver.findElement(By.id("u_0_h")).sendKeys("+1-347-421-9765");
//Npass
driver.findElement(By.id("u_0_o")).sendKeys("abcd1234");
//Dbirth
WebElement month= driver.findElement(By.id("month"));
Select s1 = new Select(month);
s1.selectByIndex(2);

//Day
WebElement day= driver.findElement(By.id("day"));
Select s2 =new Select(day);
s2.selectByIndex(5);

//Year
WebElement year =driver.findElement(By.id("year"));
Select s3 = new Select(year);
s3.selectByVisibleText("1988");

//gender radio button

Thread.sleep(6000);

driver.findElement(By.xpath("//input[@id='u_0_a']")).click();

//signup button
//driver.findElement(By.id("u_0_u")).click();

//window will close all stay active page	
//driver.close();

//create page open
//Thread.sleep(6000);
//driver.findElement(By.xpath("//a[text()='Create a Page']")).click();


//window will close entirely
//driver.quit();



}

}
