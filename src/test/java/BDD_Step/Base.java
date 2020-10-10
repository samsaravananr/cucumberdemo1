package BDD_Step;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
	public static WebDriver myD;
	public static Properties props;
	
	public static WebDriver getDriver() throws Exception
	{
		props=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\SARAVANAN R\\Mobile\\cucumberdemo\\src\\test\\java\\BDD_Step\\global.properties");
		props.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Jars\\Chrome86\\chromedriver.exe");
        myD=new ChromeDriver();
        myD.get(props.getProperty("URL"));
        return myD;
	}
}
