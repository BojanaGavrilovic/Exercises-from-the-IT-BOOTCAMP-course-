package Domaci19012021;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RacunUpisivanjeUExcel {

	public static void main(String[] args) throws IOException {
		
		Racun R1 = new Racun(123456789, 1500);
		
		File fajl = new File ("data/racun2.xlsx");
		FileOutputStream fos = new FileOutputStream(fajl);

		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet list1 = wb.createSheet("Sheet1");
		
		
		XSSFRow red = list1.createRow(0);
		
		XSSFCell BrojRacuna = red.createCell(0);
		XSSFCell Stanje = red.createCell(1);
		
		BrojRacuna.setCellValue(R1.getBrojRacuna());
		Stanje.setCellValue(R1.getStanje());

		wb.write(fos);
		fos.close();
		wb.close();
	}


}
