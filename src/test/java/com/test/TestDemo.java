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
//		chromeDriver.findElement(By.id("kw")).sendKeys("菜鸟教程");// 通过id找元素 - 唯一的
//		chromeDriver.findElement(By.name("wd")).sendKeys("菜鸟教程");// 通过name属性找元素 - 可能会重复
//		chromeDriver.findElement(By.tagName("input")).sendKeys("菜鸟教程");// 报错：element not interactable 该元素在当前页面不可见，因为tagName可能会返回多个，而sendKeys时会忘第一个找到的元素里塞值，当前元素不可见，则塞不了值报错，所以当前方式不推荐使用
//		chromeDriver.findElement(By.className("s_ipt")).sendKeys("菜鸟教程");
//		chromeDriver.findElement(By.className("s_btn")).click();// “百度一下”按钮class属性在百度账号未登录的情况下有两个“bg s_btn”（复合类名），如果照抄，会报错：no such element: Unable to locate element，一定要找到唯一的那个class值
//		chromeDriver.findElement(By.linkText("新闻")).click();// 通过超链接的文本找元素
//		firefoxDriver.findElement(By.partialLinkText("新")).click();// 通过超链接部分文本寻找元素	partialLinkText("新闻") - 同样可以

//		firefoxDriver.findElement(By.cssSelector("input")).sendKeys("菜鸟教程");// css通过tagName定位,和基本的元素定位一样不建议使用
//		firefoxDriver.findElement(By.cssSelector("#kw")).sendKeys("菜鸟教程");// css选择器需要加上#，和css中的选择器一样
//		firefoxDriver.findElement(By.cssSelector(".s_ipt")).sendKeys("菜鸟教程");// css-class选择器与css中的选择器一致
//		firefoxDriver.findElement(By.cssSelector(".bg.s_btn")).click();// 此时用复合类名运行不会报错，但是得加上.来代替空格

		// css精确定位("input[name='xxxx']");
//		firefoxDriver.findElement(By.cssSelector("input[maxlength='255']")).sendKeys("菜鸟教程");
		// 多属性精确定位
//		firefoxDriver.findElement(By.cssSelector("input[maxlength='255'][autocomplete='off']")).sendKeys("菜鸟教程");
		// 绝对定位找元素
//		firefoxDriver.findElement(By.cssSelector("input[maxlength='255']")).sendKeys("菜鸟教程");
//		firefoxDriver.findElement(By.xpath("/html/body/div/div/div[5]/div/div/form/span[2]/input")).click();
		// 相对定位找元素
//		firefoxDriver.findElement(By.xpath("//input[@maxlength='255']")).sendKeys("菜鸟教程");
		// 相对定位找元素 - 多属性
//		firefoxDriver.findElement(By.xpath("//input[@maxlength='255' and @autocomplete='off']")).sendKeys("菜鸟教程");
		// 通过元素的文本进行定位
//		firefoxDriver.findElement(By.xpath("//a[text()='新闻']")).click();
		// 包含部分文本值
//		firefoxDriver.findElement(By.xpath("//a[contains(text(),'闻')]")).click();

		// 常用元素操作API
//		WebElement webElement1 = chromeDriver.findElement(By.id("kw"));
//		System.out.println("元素标签名为" + webElement1.getTagName());
//		System.out.println("maxlength属性为" + webElement1.getAttribute("maxlength"));
//		WebElement webElement2 = chromeDriver.findElement(By.xpath("//a[text()='新闻']"));
//		System.out.println("元素文本值为" + webElement2.getText());
//		System.out.println("元素是否显示" + webElement2.isDisplayed());

//		chromeDriver.findElement(By.id("kw")).sendKeys("菜鸟教程");
//		chromeDriver.findElement(By.id("su")).click(); Thread.sleep(2000);
//		chromeDriver.findElement(By.xpath("//a[text()=' - 学的不仅是技术,更是梦想!']")).click();
//		Thread.sleep(2000); chromeDriver.close();//会关闭一开始的百度首页，因为一开始就是从那个网址跳转过来的，如果想关闭当前网页，要用到窗口切换
//
//
//		Options options = chromeDriver.manage(); 
//		Dimension dimension = options.window().getSize(); 
//		System.out.println(dimension.getHeight());// 窗口高度
//		System.out.println(dimension.getWidth());// 窗口宽度 
//		Point point =options.window().getPosition(); 
//		System.out.println(point.getX());// 窗口X轴坐标
//		System.out.println(point.getY());// 窗口Y轴坐标


//		Navigation navigation = chromeDriver.navigate();// 导航
//		navigation.to("https://www.jd.com");// 访问京东
//		navigation.refresh();// 刷新页面
//		navigation.back();// 回退
//		navigation.forward();// 前进
		
//		// 如果UI元素没能及时加载出来，就需要页面等待，否则会在用xpath找元素的时候报异常（找不到元素）
//		chromeDriver.get("https://www.baidu.com");
//		chromeDriver.findElement(By.id("kw")).sendKeys("菜鸟教程");
//		chromeDriver.findElement(By.id("su")).click();
//		Thread.sleep(1000);
//		chromeDriver.findElement(By.xpath("//a[text()=' - 学的不仅是技术,更是梦想!']")).click();
//		// 如果不加线程等待会直接报错：no such element: Unable to locate element
//		// 这是因为点击a标签语句执行太快，在UI元素完全显示出来之前就已经执行，就会导致找不到元素
//		// 解决方案：加上硬性等待即可
		
//		// 隐式等待：在设置时间内不断寻找元素直到找到为止或者超时
//		// 缺点：这是针对全局的设置，相当于每找一个元素都会去等待，但实际上不是所有步骤都需要等待
//		// 在driver实例化之后再进行设置，全局只要设置一次即可，不需要在每次寻找元素之前都进行设置
//		// 下例中表示在5秒之内找到即可，而不一定是要找满5秒
//		chromeDriver.get("https://www.baidu.com");
//		chromeDriver.findElement(By.id("kw")).sendKeys("菜鸟教程");
//		chromeDriver.findElement(By.id("su")).click();
//		chromeDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		chromeDriver.findElement(By.xpath("//a[text()=' - 学的不仅是技术,更是梦想!']")).click();
		
		// 显示等待：用来等待某个条件发生后再继续执行后续代码（如找到元素、找到的元素可点击、找到的元素已显示等等条件）
//		chromeDriver.get("https://www.baidu.com");
//		chromeDriver.findElement(By.id("kw")).sendKeys("菜鸟教程");
//		chromeDriver.findElement(By.id("su")).click();
//		WebDriverWait webDriverWait = new WebDriverWait(chromeDriver, 5);
//		WebElement webElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=' - 学的不仅是技术,更是梦想!']")));
//		chromeDriver.findElement(By.xpath("//a[text()=' - 学的不仅是技术,更是梦想!']")).click();
//		WebElement webElement1 = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator));// 页面元素在页面存在并且可见
//		WebElement webElement1 = webDriverWait.until(ExpectedConditions.elementToBeClickable(locator));// 页面元素是否在页面上可用和可被单击
//		WebElement webElement1 = webDriverWait.until(ExpectedConditions.elementToBeSelected(locator));// 页面元素处于被选中状态
//		WebElement webElement1 = webDriverWait.until(ExpectedConditions.textToBePresentInElement(locator));// 在页面元素中是否包含特定的文本
//		WebElement webElement1 = webDriverWait.until(ExpectedConditions.presenceOfElementLocated(locator));// 页面元素在页面中存在
		
		// 找到本地的html文件并用浏览器打开
		chromeDriver.get("D:\\Sublime Text 3x86\\file\\demo\\auto_test.html");
		
		// 找到按钮元素并点击，弹出弹框
		chromeDriver.findElement(By.id("button_alert")).click();
		Thread.sleep(3000);
		// 用.switchTo().alert()找到页面上的alert弹框，返回Alert对象
		Alert alert = chromeDriver.switchTo().alert();
		// 用accept()方法确定
		alert.accept();
		// 用dismiss()方法取消
		alert.dismiss();
		// 用getText()方法获取文本信息
		System.out.println(alert.getText());
		
		// confirm弹框的写法与之类似
		chromeDriver.findElement(By.id("button_confirm")).click();
		Thread.sleep(3000);
		chromeDriver.switchTo().alert().accept();
		chromeDriver.switchTo().alert().dismiss();
		System.out.println(chromeDriver.switchTo().alert().getText());
	}

	public static void openChrome() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");// 指定谷歌浏览器的驱动位置
		chromeDriver = new ChromeDriver();
		chromeDriver.get("https://www.baidu.com");
	}

	public static void openFireFox() {
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");// 如果不加这行，会因为火狐安装没在默认位置而报错，如果已经将火狐浏览器装在默认文件夹，则不需要这行也可以执行
		System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");// 指定火狐驱动的位置
		firefoxDriver = new FirefoxDriver();
		firefoxDriver.get("https://www.baidu.com");
	}

	public static void openIE() {
		// 如果遇到保护模式的报错，就需要先进入ie浏览器中点击internet选项进入安全页面后将启用保护模式的选项全部勾选上即可
		// 如果报错：Unexpected error launching Internet Explorer. Browser zoom level was set
		// to 114%. It should be set to 100%
		// 则将ie浏览器的页面比例缩放至100%即可
		// 下面演示如何忽略保护模式和页面比例问题
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);// 这行代码表示忽略了保护模式
		desiredCapabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);// 这行代码表示忽略缩放比例问题
		System.setProperty("webdriver.ie.driver", "src/test/resources/IEDriverServer.exe");
		InternetExplorerDriver internetExplorerDriver = new InternetExplorerDriver(desiredCapabilities);// 将配置传到selenium
		internetExplorerDriver.get("https://www.baidu.com");// 此时即使ie浏览器internet选项并未设置保护模式、页面也并非100%，也能够顺利打开浏览器并成功打开对应网站
	}
}
