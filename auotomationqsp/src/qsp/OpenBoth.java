package qsp;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class OpenBoth {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		ChromeDriver c=new ChromeDriver();
		Thread.sleep(5000);
		c.close();
		new FirefoxDriver();
}
}
