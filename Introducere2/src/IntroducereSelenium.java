import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroducereSelenium {

	public static void main(String[] args) {
		//Invoking Browser
		//chromedriver.exe -> Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\leven\\Downloads\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://myelectrica.ro/");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.name("email")).sendKeys("mail@example.com");
		driver.findElement(By.id(":r1:")).sendKeys("parola123");
		driver.findElement(By.xpath("/html/body/div/main/div[2]/div/div/div[2]/div[1]/div/form/div[2]/button")).click();
		
		//driver.close();
	}

}
