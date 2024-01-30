import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public void VerifyCheckBoxCorrectly(){
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


		//Click tab Check Box
		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
		//Click vào check box Home
		driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
		//Click icon '>'
		driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']")).click();

		//Kiểm tra đầu ra
		//Văn bản được hiển thị


		//Kiểm tra tất cả các check box được hiển thị và kiểm tra Desktop, Documents, Downloads

	}
	
	

}
