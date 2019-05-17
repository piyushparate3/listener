package first;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(first.ListenerDemo.class)

public class Flipkart { 
	
	
	
	
	@Test
	public void firstlogin() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\End 2018\\Testing\\Library\\chromedriver.exe");
		
		   WebDriver driverm = new ChromeDriver();
		
		   driverm.manage().window().maximize();
		   driverm.manage().deleteAllCookies();
		   driverm.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driverm.get("https://www.flipkart.com");
			driverm.findElement(By.linkText("Login & Signup"));

		    Thread.sleep(3000);
			driverm.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("7588530334");							
			driverm.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys("Admin@1");

			driverm.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driverm.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();	
		    
		    Thread.sleep(3000);
		    driverm.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);


		
		 		    
		    File src = new File("F:\\data.xlsx");
			
			FileInputStream fls = new FileInputStream(src);
			
			XSSFWorkbook wb = new XSSFWorkbook(fls);
			XSSFSheet sheet1 = wb.getSheetAt(0);
			int rowcount = sheet1.getLastRowNum();
			
			
			
			 File src1 = new File("F:\\Savedata.xlsx");
			 FileInputStream fls1 = new FileInputStream(src1);
				
			XSSFWorkbook write = new XSSFWorkbook(fls1);
			XSSFSheet sheet2 = write.getSheetAt(0);

		    Thread.sleep(3000);
		    String data = sheet1.getRow(1).getCell(0).getStringCellValue(); 
		    driverm.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys(data);

		    Thread.sleep(3000);
		    driverm.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   

		    driverm.findElement(By.xpath("//button[@class='vh79eN']")).click();
		    
		    driverm.findElement(By.linkText("Apple iPad Pro (2018) 1 TB 11 inch with Wi-Fi Only (Spa...")).click();
			   
		    

		    Thread.sleep(3000);
		    sheet2.getRow(0).createCell(0).setCellValue("Actual Name Of Product");
		    sheet2.getRow(0).createCell(1).setCellValue("Rating");
		    sheet2.getRow(0).createCell(2).setCellValue("Price");
			   
		    String name = driverm.findElement(By.xpath("//span[@class='_35KyD6']")).getText();
		    String rating = driverm.findElement(By.xpath("//span[@class='hGSR34']")).getText();
		    String price = driverm.findElement(By.xpath("//span[@class='_1vC4OE _3qQ9m1']")).getText();
		    
		    
		    Thread.sleep(3000);
		    sheet2.getRow(1).createCell(0).setCellValue(name);
		    sheet2.getRow(2).createCell(1).setCellValue(rating);
		    sheet2.getRow(3).createCell(2).setCellValue(price);
			
		    
				    
		    ArrayList<String> tabs2 = new ArrayList<String> (driverm.getWindowHandles());
		    driverm.switchTo().window(tabs2.get(1));
		    driverm.close();
		    driverm.switchTo().window(tabs2.get(0));
		    
		    Thread.sleep(3000);
		  driverm.navigate().back();
			   
		    String data1 = sheet1.getRow(2).getCell(0).getStringCellValue(); 
		    driverm.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys(data1);

		    driverm.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   

		    driverm.findElement(By.xpath("//button[@class='vh79eN']")).click();
		    driverm.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		 
		    driverm.findElement(By.xpath("//a[@class='_31qSD5']")).click();
		    
		     
				    Thread.sleep(3000);
		 
		    String name1 = driverm.findElement(By.xpath("//span[@class='_3wU53n']")).getText();
		    String rating1 = driverm.findElement(By.xpath("//span[@class='hGSR34']")).getText();
		    String price1 = driverm.findElement(By.xpath("//span[@class='_1vC4OE _2rQ-NK']")).getText();
		    
		    
		    Thread.sleep(3000);
		    sheet2.getRow(1).createCell(0).setCellValue(name1);
		    sheet2.getRow(2).createCell(1).setCellValue(rating1);
		    sheet2.getRow(3).createCell(2).setCellValue(price1);
		
		    driverm.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			    
		    ArrayList<String> tabs3 = new ArrayList<String> (driverm.getWindowHandles());
		    driverm.switchTo().window(tabs3.get(1));
		    driverm.close();
		    driverm.switchTo().window(tabs3.get(0));
		    
		    Thread.sleep(3000);
		  driverm.navigate().back();
			   
		  driverm.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		  Thread.sleep(3000);
		    String data3 = sheet1.getRow(3).getCell(0).getStringCellValue(); 
		    driverm.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys(data3);

		    Thread.sleep(3000);
		    driverm.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   

		    driverm.findElement(By.xpath("//button[@class='vh79eN']")).click();
		    
		    driverm.findElement(By.linkText("one plus 6 t")).click();

				    
		    
		
	}
	

}
