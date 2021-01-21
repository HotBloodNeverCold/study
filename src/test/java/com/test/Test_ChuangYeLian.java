package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test_ChuangYeLian {
	private static ChromeDriver chromeDriver;
	public static void main(String[] args) throws InterruptedException {
		openChrome();
		chromeDriver.findElement(By.id("username")).sendKeys("shuwen");
		chromeDriver.findElement(By.id("password")).sendKeys("shuwen1234");
		chromeDriver.findElement(By.id("protocol")).click();
		chromeDriver.findElement(By.className("submitBtn")).click();
		WebDriverWait webDriverWait = new WebDriverWait(chromeDriver, 5);
		webDriverWait.until(ExpectedConditions.elementToBeClickable(chromeDriver.findElement(By.xpath("//span[text()='租赁管理']"))));
		chromeDriver.findElement(By.xpath("//span[text()='租赁管理']")).click();
		chromeDriver.findElement(By.xpath("//li[text()='租赁应收管理']")).click();
	}
	public static void openChrome() {
		// 设置谷歌浏览器驱动位置
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		// 打开谷歌浏览器
		chromeDriver = new ChromeDriver();
		// 打开测试网址
		chromeDriver.get("http://www.innonly.com");
	}
}
