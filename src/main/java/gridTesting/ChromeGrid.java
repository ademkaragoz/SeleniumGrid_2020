package gridTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGrid {

	public static void main(String[] args) throws MalformedURLException {
		
		// 1 defined DesiredCapabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.MAC);
		
		// 2. Chrome Options
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		String hubURL = "http://192.168.1.10:4444/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubURL), options);
		
		// 3. Define your URL
		driver.get("https://learnsdet.com/");
		System.out.println("Your title " + driver.getTitle());
		
		//driver.quit();
		
		
		
		
		
		

	}

}
