package autoit;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exl {
    static XSSFWorkbook book;
    static XSSFSheet sheet;
    public static void main(String[] args) throws IOException {
	File f=new File("D:\\New folder\\143.xlsx");
	FileOutputStream fos = new FileOutputStream(f);
	book = new XSSFWorkbook();
	sheet = book.createSheet("Products");
	Exl ewe = new Exl();
	ewe.writeExcel(0, "Rakesh", 2419, "Kompally");
	ewe.writeExcel(1, "AbhiChary", 1234 , "Sangareddy");
	ewe.writeExcel(2, "Atchuth", 1235 , "SR Nagar");
	ewe.writeExcel(3, "Vijay", 1236 , "Sanath Nagar");
	ewe.writeExcel(4, "Teja", 1237 , "KPHB");
	
	//before this, you are aading all the data to FOS
	book.write(fos);
	fos.close();
	

}

public void writeExcel(int rowno,String col1, int col2,String col3)
{
	XSSFRow row=sheet.createRow(rowno);
	XSSFCell cell=row.createCell(0);
	cell.setCellType(Cell.CELL_TYPE_STRING);
	cell.setCellValue(col1);
	cell=row.createCell(1);
	cell.setCellType(Cell.CELL_TYPE_NUMERIC);
	cell.setCellValue(col2);
	cell=row.createCell(2);
	cell.setCellType(Cell.CELL_TYPE_STRING);
	cell.setCellValue(col3);
	   

    
	}

}
