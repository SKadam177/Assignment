package uiAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe\\");//invoke the browser
		WebDriver driver = new ChromeDriver();
	    driver.get("https://github.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div[2]/a")).click();//		Thread.sleep(200);
		driver.findElement(By.id("login_field")).sendKeys("sarveshkadam177@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Qaengg@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[12]")).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/summary")).click();
		 Thread.sleep(2000);
		 
		 
		 
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 WebElement profile= driver.findElement(By.xpath("//a[contains(text(),'Your profile')]"));
	 js.executeScript("arguments[0].scrollIntoView();",profile);
     profile.click();
	 
	 String text1= "SKadam177";
	 String text2 = driver.findElement(By.xpath("//div/h1[@class='vcard-names ']/span[@class='p-nickname vcard-username d-block']")).getText();
		
	 if (text1.equals(text2)) {
		 System.out.println("User name is correct");	
	}	 else {
		 System.out.println("failed");
	 }
	 
	 
	 
	 driver.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/summary")).click();
	 Thread.sleep(2000);
	 
	 
	 JavascriptExecutor js1 = (JavascriptExecutor) driver;
     WebElement Element = driver.findElement(By.xpath("//form[@class='logout-form']"));      
     // Scrolling down the page till the element is found		
     js1.executeScript("arguments[0].scrollIntoView();", Element);
	 Element.click();	
		 
	

		
		driver.close();
		
	

	}

}
