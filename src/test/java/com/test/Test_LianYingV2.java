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
		// ������ʾ�ȴ�
		WebDriverWait webDriverWait = new WebDriverWait(chromeDriver, 10);
		// �ҵ�div��ǩ���ȴ��ܱ����
		webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='van-tab van-tab--active']")));
		// ���div��ǩ��ʾ�����¼tab
		chromeDriver.findElement(By.xpath("//div[@class='van-tab van-tab--active']")).click();
	}
	public static void openChrome() {
		// ���ùȸ����������λ��
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		// �򿪹ȸ������
		chromeDriver = new ChromeDriver();
		// ����Ӫ�����˶˲�����ַ
		chromeDriver.get("http://agent.innonly.com");
	}
}
