package test.ljl;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Set;

import org.apache.commons.configuration.Configuration;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.XMLConfiguration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.*;

public class DemoImplement {
	
	public WebDriver CurDriver() throws ConfigurationException {
//		启动selenium server
//		配置，连接浏览器Chrome
		Configuration config = new XMLConfiguration("config.xml"); 
//		String chromeDriverPath = config.getString("BrowserConfig.chromeDriverConfigPath");  
//		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
	    ChromeDriver ChromeD = new ChromeDriver();
	    return ChromeD;
	}
	
//	step destination： 通过正则表达式，将feature里边的文本步骤转义为可执行的代码
//	假如x个浏览器打开y网址
//	@假如("^打开(\\d+)个浏览器，输入网址\"([^\"]*\"$"))
	@Given("^当我访问淘宝官网$")
	public void total() throws ConfigurationException{
		WebDriver driver = CurDriver();
		driver.get("https://world.taobao.com");
		
//		启动selenium server
//		配置，连接浏览器-firefox
//		
//		try {
//		    Configuration config = new XMLConfiguration("config.xml");  
//		    String fireFoxInstallationBin=config.getString("BrowserConfig.firefoxInstallationBin");
//		    String firefoxPluginXpiConfigPath  = config.getString("BrowserConfig.firefoxPluginXpiConfigPath");
//			System.setProperty("webdriver.firefox.bin",fireFoxInstallationBin);
//			File firefoxFirebugPlugin = new File(BrowserFactory.class.getClassLoader().getResource(firefoxPluginXpiConfigPath).toURI());
//			FirefoxProfile firefoxProfile = new FirefoxProfile();
//			firefoxProfile.addExtension(firefoxFirebugPlugin);
//			// 参照 http://getfirebug.com/wiki/index.php/Firebug_Preferences
//			firefoxProfile.setPreference("extensions.firebug.currentVersion",
//					"1.9.2"); // Avoid startup screen
//			firefoxProfile.setPreference(
//					"extensions.firebug.script.enableSites", true);
//			firefoxProfile.setPreference(
//					"extensions.firebug.console.enableSites", true);
//			firefoxProfile.setPreference(
//					"extensions.firebug.allPagesActivation", true);
//			firefoxProfile.setPreference("extensions.firebug.delayLoad", false);
//			return new FirefoxDriver(firefoxProfile);
//		} catch (IOException e) {
//			e.printStackTrace();
//			return null;
//		} catch (URISyntaxException e) {
//			e.printStackTrace();
//			return null;
//		} catch(ConfigurationException e){
//			e.printStackTrace();
//			return null;
//		}
//		WebDriver FF = new FirefoxDriver();
//		FF.get("https://www.taobao.com/");
//		
//		
		
	}
	
	@When("^发送一个get请求$")
	public void finished() throws ConfigurationException, IOException{
		WebDriver driver = CurDriver();
		URL url = new URL("https://world.taobao.com");
        URLConnection conn = url.openConnection();
        
        Map headers = conn.getHeaderFields();
        Set<String> keys = headers.keySet();
        for( String key : keys ){
            String val = conn.getHeaderField(key);
            System.out.println(key+"    "+val);
        }
        Assert.assertEquals("HTTP/1.1 200 OK",conn.getHeaderField(null).toString());
        System.out.println("=============");
        
        System.out.println( conn.getLastModified() );
        
	}
	
	@When("^我尝试在搜索框中输入$")
	public void sendRequest() throws ConfigurationException, IOException{
		WebDriver driver = CurDriver();
        driver.findElement(By.id("q")).click();
	    driver.findElement(By.id("q")).sendKeys("jjjj");
	}
	
	@Then("^搜索结果页面底部$")
	public void remainder(){
		
	}
	
	
}
