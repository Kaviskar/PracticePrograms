import java.io.BufferedInputStream;

import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.URL;


public class PDF_Test {
	
	 static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Vikas/Desktop/TrainingMaterial/Framework/Lib/geckodriver.exe");
	    driver =new FirefoxDriver();
		driver.get("http://fiscal.ca.gov/training-academy/index.html");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id='relatedLinks']/ul[1]/li[3]/a/span")).click();
		
		URL TestURL=new URL();
		
		/*BufferedInputStream TestFile = new BufferedInputStream(((Object) TestURL).openStream());
		PDFParser TestPDF = new PDFParser((RandomAccessRead) TestFile);
		TestPDF.parse();
		String TestText = new PDFTextStripper().getText(TestPDF.getPDDocument());*/

	}

}
