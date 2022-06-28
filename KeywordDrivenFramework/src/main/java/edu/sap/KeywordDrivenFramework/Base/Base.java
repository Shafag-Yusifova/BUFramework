package edu.sap.KeywordDrivenFramework.Base;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.*;
import java.io.FileNotFoundException;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.*;

public class Base{

	public WebDriver driver;
	public static Properties prop;
	String dirPath = System.getProperty("user.dir");

	/**
	 * This method is to initialize the webDriver
	 * 
	 * @param browserName
	 * @return WebDriver
	 * @author syusifov
	 */
	public WebDriver initDriver(String browserName) {
		String fullPath = dirPath + "\\src\\main\\java\\edu\\sap\\KeywordDrivenFramework\\Drivers\\";
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", fullPath + "chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", fullPath + "geckodriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}
	/**
	 * This method is to initialize properties
	 * @return Properties
	 * @author syusifov
	 */
	public Properties initProperties() {
		prop = new Properties();

		try {
			FileInputStream ip = new FileInputStream(dirPath + "\\src\\main\\java\\edu\\sap\\KeywordDrivenFramework\\Resources\\config.properties");
			prop.load(ip);
		} 
		catch(IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

}
