package selenium.project.Project2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;

public class DDT_program
{
	protected String username;
	protected String pass;
	

	public void valid_cred() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\sanji\\eclipse-workspace\\SeleniumProject\\src\\DDT\\LoginQMP.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		Sheet s1 = w1.getSheet("Login");
		 username = s1.getRow(6).getCell(0).getStringCellValue();
		 pass = s1.getRow(6).getCell(1).getStringCellValue();
		
	}
	public void invalid_cred() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\sanji\\eclipse-workspace\\SeleniumProject\\src\\DDT\\LoginQMP.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		Sheet s1 = w1.getSheet("Login");
		 username = s1.getRow(7).getCell(0).getStringCellValue();
		 pass = s1.getRow(7).getCell(1).getStringCellValue();
		
	}
}
