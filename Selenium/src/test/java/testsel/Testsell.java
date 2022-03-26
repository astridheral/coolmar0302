package testsel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testsell {
  @Test
  public void f() {
	  String exePath = "./driver/chromedriver.exe" ; //especificar la ruta del Chrome driver
		 System.setProperty("webdriver.chrome.driver", exePath); //agregando las propiedades con la ruta de chrome driver 
		 WebDriver driver = new ChromeDriver(); //objeto de webdriver
		 driver.get("https://www.google.com");// TODO Auto-generated method stub
  }
}
