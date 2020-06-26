package utility;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;

public class DataReaderTeam4<data1> {


    static Workbook book;
    static Sheet sheet2;
    public static String path="";
    public static String[] fileReader3(String sheetName,String pathName) throws IOException, InvalidFormatException {
// String[][] data1 = {};
        File file = new File(pathName);
        book = WorkbookFactory.create(file);
        sheet2 = book.getSheet(sheetName);
        String[] data1 = new String[sheet2.getLastRowNum()];
        for (int i = 0; i < sheet2.getLastRowNum(); i++) {
            int j = 0;
            data1[i] = sheet2.getRow(i + 1).getCell(j).toString(); }
        return data1; }

    static Sheet sheet1;
// public static String path="C:/Users/ssbra/Desktop/New Microsoft Office Excel Worksheet.xlsx";

    public static Object[] fileReader4(String sheetName,String pathName) throws IOException, InvalidFormatException {
// String[][] data1 = {};
        File file = new File(pathName);

        book = WorkbookFactory.create(file);
        sheet1 = book.getSheet(sheetName);
// numberOfRows = sheet.getLastRowNum();
// numberOfCol = sheet.getRow(0).getLastCellNum();

        Object[] data1 = new Object[sheet1.getLastRowNum()];

        for (int i = 0; i < sheet1.getLastRowNum(); i++) {
// HSSFRow rows = sheet.getRow(i);
//for (int j = 0;j < sheet1.getRow(0); j++) {
// HSSFCell cell = rows.getCell(j);
//String cellData = getCellValue(cell);
// data1[i] = sheet1.getRow(i + 1).toString();
//System.out.println(cellData);
        }



        return data1;


    }
}
