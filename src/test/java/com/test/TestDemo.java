package com.test;

import java.security.cert.PKIXRevocationChecker.Option;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Position;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestDemo {
	private static ChromeDriver chromeDriver;
	private static FirefoxDriver firefoxDriver;

	public static void main(String[] args) throws InterruptedException {
		openChrome();
//		openFireFox();
//		chromeDriver.findElement(By.id("kw")).sendKeys("����̳�");// ͨ��id��Ԫ�� - Ψһ��
//		chromeDriver.findElement(By.name("wd")).sendKeys("����̳�");// ͨ��name������Ԫ�� - ���ܻ��ظ�
//		chromeDriver.findElement(By.tagName("input")).sendKeys("����̳�");// ����element not interactable ��Ԫ���ڵ�ǰҳ�治�ɼ�����ΪtagName���ܻ᷵�ض������sendKeysʱ������һ���ҵ���Ԫ������ֵ����ǰԪ�ز��ɼ�����������ֵ�������Ե�ǰ��ʽ���Ƽ�ʹ��
//		chromeDriver.findElement(By.className("s_ipt")).sendKeys("����̳�");
//		chromeDriver.findElement(By.className("s_btn")).click();// ���ٶ�һ�¡���ťclass�����ڰٶ��˺�δ��¼���������������bg s_btn��������������������ճ����ᱨ��no such element: Unable to locate element��һ��Ҫ�ҵ�Ψһ���Ǹ�classֵ
//		chromeDriver.findElement(By.linkText("����")).click();// ͨ�������ӵ��ı���Ԫ��
//		firefoxDriver.findElement(By.partialLinkText("��")).click();// ͨ�������Ӳ����ı�Ѱ��Ԫ��	partialLinkText("����") - ͬ������

//		firefoxDriver.findElement(By.cssSelector("input")).sendKeys("����̳�");// cssͨ��tagName��λ,�ͻ�����Ԫ�ض�λһ��������ʹ��
//		firefoxDriver.findElement(By.cssSelector("#kw")).sendKeys("����̳�");// cssѡ������Ҫ����#����css�е�ѡ����һ��
//		firefoxDriver.findElement(By.cssSelector(".s_ipt")).sendKeys("����̳�");// css-classѡ������css�е�ѡ����һ��
//		firefoxDriver.findElement(By.cssSelector(".bg.s_btn")).click();// ��ʱ�ø����������в��ᱨ�����ǵü���.������ո�

		// css��ȷ��λ("input[name='xxxx']");
//		firefoxDriver.findElement(By.cssSelector("input[maxlength='255']")).sendKeys("����̳�");
		// �����Ծ�ȷ��λ
//		firefoxDriver.findElement(By.cssSelector("input[maxlength='255'][autocomplete='off']")).sendKeys("����̳�");
		// ���Զ�λ��Ԫ��
//		firefoxDriver.findElement(By.cssSelector("input[maxlength='255']")).sendKeys("����̳�");
//		firefoxDriver.findElement(By.xpath("/html/body/div/div/div[5]/div/div/form/span[2]/input")).click();
		// ��Զ�λ��Ԫ��
//		firefoxDriver.findElement(By.xpath("//input[@maxlength='255']")).sendKeys("����̳�");
		// ��Զ�λ��Ԫ�� - ������
//		firefoxDriver.findElement(By.xpath("//input[@maxlength='255' and @autocomplete='off']")).sendKeys("����̳�");
		// ͨ��Ԫ�ص��ı����ж�λ
//		firefoxDriver.findElement(By.xpath("//a[text()='����']")).click();
		// ���������ı�ֵ
//		firefoxDriver.findElement(By.xpath("//a[contains(text(),'��')]")).click();

		// ����Ԫ�ز���API
//		WebElement webElement1 = chromeDriver.findElement(By.id("kw"));
//		System.out.println("Ԫ�ر�ǩ��Ϊ" + webElement1.getTagName());
//		System.out.println("maxlength����Ϊ" + webElement1.getAttribute("maxlength"));
//		WebElement webElement2 = chromeDriver.findElement(By.xpath("//a[text()='����']"));
//		System.out.println("Ԫ���ı�ֵΪ" + webElement2.getText());
//		System.out.println("Ԫ���Ƿ���ʾ" + webElement2.isDisplayed());

//		chromeDriver.findElement(By.id("kw")).sendKeys("����̳�");
//		chromeDriver.findElement(By.id("su")).click(); Thread.sleep(2000);
//		chromeDriver.findElement(By.xpath("//a[text()=' - ѧ�Ĳ����Ǽ���,��������!']")).click();
//		Thread.sleep(2000); chromeDriver.close();//��ر�һ��ʼ�İٶ���ҳ����Ϊһ��ʼ���Ǵ��Ǹ���ַ��ת�����ģ������رյ�ǰ��ҳ��Ҫ�õ������л�
//
//
//		Options options = chromeDriver.manage(); 
//		Dimension dimension = options.window().getSize(); 
//		System.out.println(dimension.getHeight());// ���ڸ߶�
//		System.out.println(dimension.getWidth());// ���ڿ�� 
//		Point point =options.window().getPosition(); 
//		System.out.println(point.getX());// ����X������
//		System.out.println(point.getY());// ����Y������


//		Navigation navigation = chromeDriver.navigate();// ����
//		navigation.to("https://www.jd.com");// ���ʾ���
//		navigation.refresh();// ˢ��ҳ��
//		navigation.back();// ����
//		navigation.forward();// ǰ��
		
//		// ���UIԪ��û�ܼ�ʱ���س���������Ҫҳ��ȴ������������xpath��Ԫ�ص�ʱ���쳣���Ҳ���Ԫ�أ�
//		chromeDriver.get("https://www.baidu.com");
//		chromeDriver.findElement(By.id("kw")).sendKeys("����̳�");
//		chromeDriver.findElement(By.id("su")).click();
//		Thread.sleep(1000);
//		chromeDriver.findElement(By.xpath("//a[text()=' - ѧ�Ĳ����Ǽ���,��������!']")).click();
//		// ��������̵߳ȴ���ֱ�ӱ���no such element: Unable to locate element
//		// ������Ϊ���a��ǩ���ִ��̫�죬��UIԪ����ȫ��ʾ����֮ǰ���Ѿ�ִ�У��ͻᵼ���Ҳ���Ԫ��
//		// �������������Ӳ�Եȴ�����
		
//		// ��ʽ�ȴ���������ʱ���ڲ���Ѱ��Ԫ��ֱ���ҵ�Ϊֹ���߳�ʱ
//		// ȱ�㣺�������ȫ�ֵ����ã��൱��ÿ��һ��Ԫ�ض���ȥ�ȴ�����ʵ���ϲ������в��趼��Ҫ�ȴ�
//		// ��driverʵ����֮���ٽ������ã�ȫ��ֻҪ����һ�μ��ɣ�����Ҫ��ÿ��Ѱ��Ԫ��֮ǰ����������
//		// �����б�ʾ��5��֮���ҵ����ɣ�����һ����Ҫ����5��
//		chromeDriver.get("https://www.baidu.com");
//		chromeDriver.findElement(By.id("kw")).sendKeys("����̳�");
//		chromeDriver.findElement(By.id("su")).click();
//		chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		chromeDriver.findElement(By.xpath("//a[text()=' - ѧ�Ĳ����Ǽ���,��������!']")).click();
		
		// ��ʾ�ȴ��������ȴ�ĳ�������������ټ���ִ�к������루���ҵ�Ԫ�ء��ҵ���Ԫ�ؿɵ�����ҵ���Ԫ������ʾ�ȵ�������
//		chromeDriver.get("https://www.baidu.com");
//		chromeDriver.findElement(By.id("kw")).sendKeys("����̳�");
//		chromeDriver.findElement(By.id("su")).click();
//		WebDriverWait webDriverWait = new WebDriverWait(chromeDriver, 5);
//		WebElement webElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' - ѧ�Ĳ����Ǽ���,��������!']")));
//		chromeDriver.findElement(By.xpath("//a[text()=' - ѧ�Ĳ����Ǽ���,��������!']")).click();
//		WebElement webElement1 = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));// ҳ��Ԫ����ҳ����ڲ��ҿɼ�
//		WebElement webElement1 = webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));// ҳ��Ԫ���Ƿ���ҳ���Ͽ��úͿɱ�����
//		WebElement webElement1 = webDriverWait.until(ExpectedConditions.elementToBeSelected(locator));// ҳ��Ԫ�ش��ڱ�ѡ��״̬
//		WebElement webElement1 = webDriverWait.until(ExpectedConditions.textToBePresentInElement(locator));// ��ҳ��Ԫ�����Ƿ�����ض����ı�
//		WebElement webElement1 = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(locator));// ҳ��Ԫ����ҳ���д���
		
		// �ҵ����ص�html�ļ������������
		chromeDriver.get("D:\\Sublime Text 3x86\\file\\demo\\auto_test.html");
		
		// �ҵ���ťԪ�ز��������������
		chromeDriver.findElement(By.id("button_alert")).click();
		Thread.sleep(3000);
		// ��.switchTo().alert()�ҵ�ҳ���ϵ�alert���򣬷���Alert����
		Alert alert = chromeDriver.switchTo().alert();
		// ��accept()����ȷ��
		alert.accept();
		// ��dismiss()����ȡ��
		alert.dismiss();
		// ��getText()������ȡ�ı���Ϣ
		System.out.println(alert.getText());
		
		// confirm�����д����֮����
		chromeDriver.findElement(By.id("button_confirm")).click();
		Thread.sleep(3000);
		chromeDriver.switchTo().alert().accept();
		chromeDriver.switchTo().alert().dismiss();
		System.out.println(chromeDriver.switchTo().alert().getText());
	}

	public static void openChrome() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");// ָ���ȸ������������λ��
		chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.baidu.com");
	}

	public static void openFireFox() {
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");// ����������У�����Ϊ�����װû��Ĭ��λ�ö���������Ѿ�����������װ��Ĭ���ļ��У�����Ҫ����Ҳ����ִ��
		System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");// ָ�����������λ��
		firefoxDriver = new FirefoxDriver();
		firefoxDriver.get("https://www.baidu.com");
	}

	public static void openIE() {
		// �����������ģʽ�ı�������Ҫ�Ƚ���ie������е��internetѡ����밲ȫҳ������ñ���ģʽ��ѡ��ȫ����ѡ�ϼ���
		// �������Unexpected error launching Internet Explorer. Browser zoom level was set
		// to 114%. It should be set to 100%
		// ��ie�������ҳ�����������100%����
		// ������ʾ��κ��Ա���ģʽ��ҳ���������
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);// ���д����ʾ�����˱���ģʽ
		desiredCapabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);// ���д����ʾ�������ű�������
		System.setProperty("webdriver.ie.driver", "src/test/resources/IEDriverServer.exe");
		InternetExplorerDriver internetExplorerDriver = new InternetExplorerDriver(desiredCapabilities);// �����ô���selenium
		internetExplorerDriver.get("https://www.baidu.com");// ��ʱ��ʹie�����internetѡ�δ���ñ���ģʽ��ҳ��Ҳ����100%��Ҳ�ܹ�˳������������ɹ��򿪶�Ӧ��վ
	}
}
