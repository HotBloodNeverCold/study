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
		webDriverWait.until(ExpectedConditions.elementToBeClickable(chromeDriver.findElement(By.xpath("//span[text()='���޹���']"))));
		chromeDriver.findElement(By.xpath("//span[text()='���޹���']")).click();
		chromeDriver.findElement(By.xpath("//li[text()='����Ӧ�չ���']")).click();
	}
	public static void openChrome() {
		// ���ùȸ����������λ��
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		// �򿪹ȸ������
		chromeDriver = new ChromeDriver();
		// �򿪲�����ַ
		chromeDriver.get("http://www.innonly.com");
	}
}
