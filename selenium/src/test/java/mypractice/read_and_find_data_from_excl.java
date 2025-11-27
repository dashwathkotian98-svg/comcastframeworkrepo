package mypractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class read_and_find_data_from_excl {
	@Test
	public void read_and_find_data_from_exc() throws EncryptedDocumentException, IOException,NullPointerException
	{
		String expecteddata="Monday";
		
		FileInputStream f = new FileInputStream("C:\\Users\\thane\\OneDrive\\Desktop\\TIMESHEET FORMAT-NOV.xlsx");
	Workbook wb = WorkbookFactory.create(f);
	Sheet s = wb.getSheet("NOV-25");
	int c = s.getLastRowNum();
	for(int i=7;i<c;i++)
	{
		try {
		String data1=s.getRow(i).getCell(0).toString();
		String data2=s.getRow(i).getCell(1).toString();
		String data3=s.getRow(i).getCell(2).toString();
		
		if(data1.equals(expecteddata))
		{
			System.out.println(data1+" "+data2+" "+data3);
		}
		}catch(Exception e)
		{
			
		}
	}
	}

}
