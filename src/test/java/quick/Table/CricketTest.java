package quick.Table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CricketTest {

	@Test
	
	public void cric() {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dr Pramod Pandey\\Desktop\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/29064/ts-vs-tb-eng-warm-up-match-west-indies-tour-of-england-warm-up-matches-2020");
		
		WebElement inning = driver.findElement(By.xpath("//div[@id='innings_1']/div[1]"));
		
	int a =	inning.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).size();
	
System.out.println(a);
	
	
	for(int i=0;i<a;i++) {
		
		System.out.println(inning.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).get(i).getText());
		
		
	}
		
		
		
		

	}
}
