package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
	 String exePath = "./driver/chromedriver.exe" ; //especificar la ruta del Chrome driver
	 System.setProperty("webdriver.chrome.driver", exePath); //agregando las propiedades con la ruta de chrome driver 
	 WebDriver driver = new ChromeDriver(); //objeto de webdriver
	 driver.get("https://www.google.com");// TODO Auto-generated method stub

	}

}
