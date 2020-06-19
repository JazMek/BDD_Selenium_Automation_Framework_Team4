package utility;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataReader {
   public static XSSFWorkbook wb = null;
    public static XSSFSheet sheet = null;
    public static  Cell cell = null;
    public static  FileOutputStream fio = null;
    public static  int numberOfRows, numberOfCol, rowNum;

//    public String[][] fileReader1(String path,int sheetIndex) throws IOException {
//        String[][] data = {};
//        File file = new File(path);
//        FileInputStream fis = new FileInputStream(file);
//        wb = new XSSFWorkbook(fis);
//        sheet = wb.getSheetAt(sheetIndex);
//        numberOfRows = sheet.getLastRowNum();
//        numberOfCol = sheet.getRow(0).getLastCellNum();
//        data = new String[numberOfRows + 1][numberOfCol + 1];
//
//        for (int i = 1; i < data.length; i++) {
//            XSSFRow rows = sheet.getRow(i);
//            for (int j = 0; j < numberOfCol; j++) {
//                XSSFCell cell = rows.getCell(j);
//                String cellData = getCellValue(cell);
//                data[i][j] = cellData;
//            }
//        }
//        return data;
//    }
//
//    public  String[] fileReader2(String path, int sheetIndex) throws IOException {
//        String[] data = {};
//        File file = new File(path);
//        FileInputStream fis = new FileInputStream(file);
//        wb = new XSSFWorkbook(fis);
//        sheet = wb.getSheetAt(sheetIndex);
//        numberOfRows = sheet.getLastRowNum();
//        numberOfCol = sheet.getRow(0).getLastCellNum();
//        data = new String[numberOfRows + 1];
//
//        for (int i = 1; i < data.length; i++) {
//            XSSFRow rows = sheet.getRow(i);
//            for (int j = 0; j < numberOfCol; j++) {
//                XSSFCell cell = rows.getCell(j);
//                String cellData = getCellValue(cell);
//                data[i] = cellData;
//            }
//        }
//        return data;
//    }
////karim modification
//    public static String[] fileReader2UsingSheetName(String path, String sheetName) throws IOException {
//        String[] data = {};
//        File file = new File(path);
//        FileInputStream fis = new FileInputStream(file);
//        wb = new XSSFWorkbook(fis);
//        sheet = wb.getSheet(sheetName);
//        numberOfRows = sheet.getLastRowNum();
//        numberOfCol = sheet.getRow(0).getLastCellNum();
//        data = new String[numberOfRows + 1];
//
//        for (int i = 1; i < data.length; i++) {
//            XSSFRow rows = sheet.getRow(i);
//            for (int j = 0; j < numberOfCol; j++) {
//                XSSFCell cell = rows.getCell(j);
//                String cellData = getCellValue(cell);
//                data[i] = cellData;
//            }
//        }
//        return data;
//    }

//    public static String getCellValue(XSSFCell cell) {
//        Object value = null;
//
//        int dataType = cell.getCellType();
//        switch (dataType) {
//            case HSSFCell.CELL_TYPE_NUMERIC:
//                value = cell.getNumericCellValue();
//                break;
//            case HSSFCell.CELL_TYPE_STRING:
//                value = cell.getStringCellValue();
//                break;
//            case HSSFCell.CELL_TYPE_BOOLEAN:
//                value = cell.getBooleanCellValue();
//                break;
//        }
//        return value.toString();
//
//    }



    public void writeBack(String value) throws IOException {
        wb = new XSSFWorkbook();
        sheet = wb.createSheet();
        Row row = sheet.createRow(rowNum);
        row.setHeightInPoints(10);

        fio = new FileOutputStream(new File("ExcelFile.xls"));
        wb.write(fio);
        for (int i = 0; i < row.getLastCellNum(); i++) {
            row.createCell(i);
            cell.setCellValue(value);
        }
        fio.close();
        wb.close();
    }
//    karim methods
//        XSSFWorkbook wb;



    public  void ExcelDataProvider(String XlsPath){

        File src = new File(XlsPath);

        try {
            FileInputStream fis =new FileInputStream(src);
            wb = new XSSFWorkbook(fis);

        }catch (Exception e){
            System.out.println("Unable to read Excel File" +e.getMessage());
        }

    }


    public String getStringData(String sheetName,int row,int column){
        return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
    }


    public String getStringData(int sheetIndex,int row,int column){
        return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
    }


    public double getNumericData(String sheetName,int row,int column){
        return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
    }


    public double getNumericData(int sheetIndex,int row,int column){
        return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getNumericCellValue();
    }
//Ibrahim method

    
    static Workbook book;
    static Sheet sheet1;

//    public static String path="C:/Users/ssbra/Desktop/New Microsoft Office Excel Worksheet.xlsx";

    public static Object[][] fileReader3(String sheetName,String pathName) throws IOException, InvalidFormatException {
// String[][] data1 = {};
        File file = new File(pathName);

        book = WorkbookFactory.create(file);
        sheet1 = book.getSheet(sheetName);
// numberOfRows = sheet.getLastRowNum();
// numberOfCol = sheet.getRow(0).getLastCellNum();

        Object[][] data1 = new Object[sheet1.getLastRowNum()][sheet1.getRow(0).getLastCellNum()];

        for (int i = 0; i < sheet1.getLastRowNum(); i++) {
// HSSFRow rows = sheet.getRow(i);
            for (int j = 0; j < sheet1.getRow(0).getLastCellNum(); j++) {
// HSSFCell cell = rows.getCell(j);
//String cellData = getCellValue(cell);
                data1[i][j] = sheet1.getRow(i + 1).getCell(j).toString();
//System.out.println(cellData);
            }

        }

        return data1;
    }


     public  static Sheet  sheet2;
    public static String [][] fileReader5(String sheetName,String pathName) throws IOException, InvalidFormatException {
// String[][] data = {};
        File file = new File(pathName);

        book = WorkbookFactory.create(file);
        sheet2 = book.getSheet(sheetName);
// numberOfRows = sheet.getLastRowNum();
// numberOfCol = sheet.getRow(0).getLastCellNum();

        String [][] data = new String[sheet2.getLastRowNum()][sheet2.getRow(0).getLastCellNum()];

        for (int i = 0; i < sheet2.getLastRowNum(); i++) {
//HSSFRow rows = sheet.getRow(i);
            for (int j = 0; j < sheet2.getRow(0).getLastCellNum(); j++) {
//HSSFCell cell = rows.getCell(j);
//String cellData = getCellValue(cell);


                data[i][j] =sheet2.getRow(i + 1).getCell(j).getStringCellValue();
//System.out.println(cellData);
            }


        }

        return data;
    }
//---------------------------------------------------------------------------------

    public static String path="";

    public static String[] fileReader6(String sheetName,String pathName) throws IOException, InvalidFormatException {
// String[][] data1 = {};
        File file = new File(pathName);
        book = WorkbookFactory.create(file);
        sheet2 = book.getSheet(sheetName);



        String[] data1 = new String[sheet2.getLastRowNum()];

        for (int i = 0; i < sheet2.getLastRowNum(); i++) {
            int j = 0;
            data1[i] = sheet2.getRow(i+1 ).getCell(j).toString();
        }

        return data1;
    }
//*****************************************
    /**
     * This method is to read Excel file based on sheet Index Number
     *
     *
     *
     *
     */
//FILE_NAME
    public static List<String> readExcelFile(String pathExcel) {
        List<String> list = new ArrayList<>();

        try {
            FileInputStream inputStream = new FileInputStream(new File(pathExcel));
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet dataTypeSheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = dataTypeSheet.iterator();
            while (rowIterator.hasNext()) {
                Row currentRow = rowIterator.next();
                Iterator<Cell> cellIterator = currentRow.iterator();
                while (cellIterator.hasNext()) {
                    Cell currentCell = cellIterator.next();

                    if (currentCell.getCellType() == CellType.STRING) {
                        System.out.print(currentCell.getStringCellValue() + " ");
                        currentCell.getStringCellValue();
                        list.add(currentCell.getStringCellValue());
                    } else if (currentCell.getCellType() == CellType.NUMERIC) {
                        System.out.print(currentCell.getNumericCellValue());
                        currentCell.getStringCellValue();
                        list.add(currentCell.getStringCellValue());
                    }

                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found Exception");

        } catch (IOException e1) {
            e1.printStackTrace();
            System.out.println("Input Output Exception");
        }
        return list;
    }
}





