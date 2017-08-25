package testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop=new Properties();
	File f;
	 FileInputStream fi;

	public void init() throws IOException, InterruptedException {
		loadProperties();
		selectBrowser(prop.getProperty("browser"));
		driver.get(prop.getProperty("url"));
		Thread.sleep(100);

	}

	private void loadProperties() throws IOException {
		//f=new File("D:\\Nari\\work space\\gcrshop\\src\\main\\java\\config\\config.Properties");
		f = new File(System.getProperty("user.dir") + "//src//main//java//config//config.Properties");
		fi = new FileInputStream(f);
		prop.load(fi);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
	}

	private WebDriver selectBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("it isssss"+browser);
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//drivers//chromedriver.exe");
			driver = new ChromeDriver();
			return driver;
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "/drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			return driver;
		}

		return null;
	}
	public void closeBrowser(){
		driver.quit();
	}

}
