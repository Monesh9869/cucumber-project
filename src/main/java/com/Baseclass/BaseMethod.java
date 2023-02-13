package com.Baseclass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class BaseMethod {

	public static WebDriver driver;

	public static void browserLaunch(String browsername) {

		if (browsername.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\TGS CONS\\eclipse-workspace\\CucumberLearn\\BrowserDriver\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		} else if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".//BrowserDriver//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

	}

	public static void idWithSendKeys(String idValue, String TextValue) {
		driver.findElement(By.id(idValue)).sendKeys(TextValue);
	}

	public static void nameWithSendKeys(String idValue, String TextValue) {
		driver.findElement(By.id(idValue)).sendKeys(TextValue);
	}

	public static void websiteLaunch(String Url) {
		driver.get(Url);
	}

	public static void browserClose() throws InterruptedException {
		Thread.sleep(10000L);
		driver.close();
	}

	public static void sendKeysElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void sendKeysElement(double value, String value1, Alert element) {
		element.sendKeys(value1);
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void clearOnElement(WebElement element) {
		element.clear();
	}

	public static void webPageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void webPageUrl(String string) {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void simpleAlertDemo(WebElement element) throws InterruptedException {
		element.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}

	public static void confirmAlert(WebElement element, String okOrCancel) throws InterruptedException {
		element.click();
		Thread.sleep(3000);
		if (okOrCancel.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
		} else if (okOrCancel.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().dismiss();
		} else {
			System.out.println("choose ok or cancel");
		}

	}

	public static void promptAlert(WebElement element, String Text, String okOrCancel) throws InterruptedException {
		element.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(Text);
		Thread.sleep(2000);
		if (okOrCancel.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
		} else if (okOrCancel.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().dismiss();
		} else {
			System.out.println("choose ok or cancel");
		}
	}

	public static void shotscreen(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Target = new File(path);
		Files.copy(source, Target);

	}

	public static void dropDown() {
		Select sele = new Select(null);
		sele.deselectByValue("jquery");

	}

}
