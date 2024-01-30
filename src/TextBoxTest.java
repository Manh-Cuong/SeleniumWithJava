import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxTest {
	//TC01
	public void SubmitSuccessfully() {
		//Mở trình duyệt
		System.setProperty("webdriver.chrome.driver", "E:\\01Automation\\03Tools\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//zoom nhỏ màn hình
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("document.body.style.zoom = '50%'");

		//Gõ url
		driver.get("https://demoqa.com/");
		
		//maximize màn hình
		driver.manage().window().maximize();
		
		//scroll màn hình đến cuối trang
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		//Click element
		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		
		//Click vào menu Textbox
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		//Nhập input data
		driver.findElement(By.id("userName")).sendKeys("Duyệt Mõm");
		driver.findElement(By.id("userEmail")).sendKeys("mom@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("HN");
		driver.findElement(By.id("permanentAddress")).sendKeys("HCM");
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		//Click submit
		driver.findElement(By.id("submit")).click();
		//Verify All values are displayed in text
		//Get text hiển thị , So sánh với text nhập vào => giống nhau => pass
		//Get text: Name:fdsfa
		String originFullName = driver.findElement(By.id("name")).getText();
		//Cắt chuỗi từ phải đến dấu ':'
		int index = originFullName.indexOf(":");
		String actualFullName = originFullName.substring(index + 1);
				
		assertEquals(actualFullName, "Duyệt Mõm");
	}
	
	//TC02
	public void EmailFormatIsWrong() {
		//Mở trình duyệt
				System.setProperty("webdriver.chrome.driver", "E:\\01Automation\\03Tools\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				//zoom nhỏ màn hình
				//JavascriptExecutor js = (JavascriptExecutor) driver;
				//js.executeScript("document.body.style.zoom = '50%'");

				//Gõ url
				driver.get("https://demoqa.com/");
				
				//maximize màn hình
				driver.manage().window().maximize();
				
				//scroll màn hình đến cuối trang
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				
				//Click element
				driver.findElement(By.xpath("//h5[text()='Elements']")).click();
				
				//Click vào menu Textbox
				driver.findElement(By.xpath("//span[text()='Text Box']")).click();
				//Nhập input data
				driver.findElement(By.id("userName")).sendKeys("Duyệt Mõm");
				driver.findElement(By.id("userEmail")).sendKeys("momgmail.com");
				driver.findElement(By.id("currentAddress")).sendKeys("HN");
				driver.findElement(By.id("permanentAddress")).sendKeys("HCM");
				
				js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				//Click submit
				driver.findElement(By.id("submit")).click();
				//Verify All values are displayed in text
				//Get text hiển thị , So sánh với text nhập vào => giống nhau => pass
				//Get text: Name:fdsfa
				//String originFullName = driver.findElement(By.id("name")).getText();
				//Cắt chuỗi từ phải đến dấu ':'
				//int index = originFullName.indexOf(":");
				//String actualFullName = originFullName.substring(index + 1);
						
				//assertEquals(actualFullName, "Duyệt Mõm");
		
	}

}
