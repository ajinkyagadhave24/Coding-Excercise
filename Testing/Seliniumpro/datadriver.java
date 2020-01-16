import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class datadriver {

	public static void main(String args[]) throws IOException
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			FileInputStream fi = new FileInputStream("C:\\Users\\ADMIN\\Desktop\\Test.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook (fi);
			XSSFSheet sh = wb.getSheetAt(0);
			Row r = sh.getRow(0);
			Cell c = r.getCell(0);
			//System.out.println(c);
			driver.get(c.toString());
			
			WebElement s = driver.findElement(By.id("day"));
			System.out.println(s.getText());
			
			int rowCount = 0;
			Row newRow = sh.createRow(rowCount+1);
			for(int i=0;i< r.getLastCellNum();i++)
			{
				Cell cell = newRow.createCell(i);
				cell.setCellValue(s.getText());
			}
			fi.close();
			
			FileOutputStream fo = new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\Test.xlsx");
			wb.write(fo);
			fo.close();
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
