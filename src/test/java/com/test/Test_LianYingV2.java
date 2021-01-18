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

public class Test_LianYingV2 {
	private static ChromeDriver chromeDriver;
	public static void main(String[] args) throws InterruptedException {
		openChrome();
		// 设置显示等待
		WebDriverWait webDriverWait = new WebDriverWait(chromeDriver, 10);
		// 找到div标签并等待能被点击
		webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='van-tab van-tab--active']")));
		// 点击div标签显示密码登录tab
		chromeDriver.findElement(By.xpath("//div[@class='van-tab van-tab--active']")).click();
	}
	public static void openChrome() {
		// 设置谷歌浏览器驱动位置
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		// 打开谷歌浏览器
		chromeDriver = new ChromeDriver();
		// 打开连营经纪人端测试网址
		chromeDriver.get("http://agent.innonly.com");
	}
}
