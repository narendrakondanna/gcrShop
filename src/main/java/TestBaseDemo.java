import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBaseDemo {
	public static WebDriver driver;
	public static Properties prop=new Properties();;
	static File f;
	static FileInputStream fi;

	public static void main(String[] args) throws IOException {

		loadProperties();

	}

	private static void loadProperties() throws IOException {
		//f = new File("D:\\Nari\\work space\\gcrshop\\src\\main\\java\\config\\config.Properties");
		 f = new File(System.getProperty("user.dir") +
		 "//src//main//java//config//config.Properties");
		fi = new FileInputStream(f);
		prop.load(fi);
System.out.println(prop.getProperty("browser"));
	}
}
