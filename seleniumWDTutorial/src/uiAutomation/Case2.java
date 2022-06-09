package uiAutomation;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Case2 {

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
		driver.findElement(By.xpath("//a[contains(text(),'Create repository')]")).click();
		Thread.sleep(2000);
		
		
		WebElement Wb= driver.findElement(By.xpath("//input[@name='repository[name]']"));
		 Wb.sendKeys("qa-assignment");
		 String txt= Wb.getAttribute("value");
		 System.out.println(txt);
		             
		              //TO validate text entered or not in textbox
		              if  (txt.contains("qa-assignment"))
		              {
		                     System.out.println("Yes text is entered ");
		              }
		              else
		              {
		                     System.out.println("Text is not entered ");
		              }
		
		driver.findElement(By.xpath("//input[@id='repository_visibility_public']")).click();
	
		
		driver.findElement(By.xpath("//span[contains(text(),'None')]")).click();
		              Thread.sleep(5000);

		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement option= driver.findElement(By.xpath("//div[@class='SelectMenu-list']/label[72]"));
		 js.executeScript("arguments[0].scrollIntoView();",option);
	     option.click();
	     
	     
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
