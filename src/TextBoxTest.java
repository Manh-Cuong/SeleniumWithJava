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
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom = '80%'");
		//Gõ url
		driver.get("https://demoqa.com/");
		
		//Click element
		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		
		//Click vào menu Textbox
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		//Nhập input data
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Duyệt Mõm");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("mom@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("HN");
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("HCM");
		
		//Click submit
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		//Verify All values are displayed in text
	}

}
