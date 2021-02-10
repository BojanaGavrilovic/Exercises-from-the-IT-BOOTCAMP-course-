package Domaci19012021;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook; 

public class RacunCitanjeIzExcela {

	public static void main(String[] args) throws IOException {
		
		File eksel = new File("data/racun.xlsx");
		FileInputStream fis = new FileInputStream(eksel);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheet("Sheet1");
		
		XSSFRow red = sheet1.getRow(1);
		
		XSSFCell BrojRacuna = red.getCell(0);
		XSSFCell Stanje = red.getCell(1);
		
		System.out.print(BrojRacuna.getNumericCellValue());
		System.out.println(Stanje.getNumericCellValue());
		
		
		/*for (int i = 1; i <= sheet1.getLastRowNum(); i++) {
			
			XSSFRow row = sheet1.getRow(i);
			XSSFCell BrojRacuna = row.getCell(0);
			XSSFCell Stanje = row.getCell(1);
			
			System.out.print(BrojRacuna.getNumericCellValue());
			System.out.println(Stanje.getNumericCellValue());
		}*/
			
		
			
		
		fis.close();
		wb.close();
		
	}

}
