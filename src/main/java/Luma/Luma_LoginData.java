package Luma;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Luma_LoginData {
	
	public String Email1;
	public String Password;
	
	public void Login() throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\rushi\\eclipse-workspace\\Luma\\DDT\\LoginData.xlsx");
		  Workbook W1 = WorkbookFactory.create(file);
	            Email1 = W1.getSheet("Login").getRow(0).getCell(5).getStringCellValue();
	            Password = W1.getSheet("Login").getRow(3).getCell(10).getStringCellValue();
	            
	            
	
	
	
	}

}
