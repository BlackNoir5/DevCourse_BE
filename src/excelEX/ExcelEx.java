package excelEX;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class ExcelEx {
    public static void main(String[] args) {
        Workbook wb = null;

        try {
            wb = Workbook.getWorkbook(new File("./jxlrwtest.xls"));
            Sheet sheet = wb.getSheet(0);

            String[] names = wb.getSheetNames();

            System.out.println(Arrays.toString(names));
            System.out.println(wb.getVersion());
            System.out.println(wb.getNumberOfSheets());

            System.out.println(sheet.getName());
            System.out.println(sheet.getRows());
            System.out.println(sheet.getColumns());

            for(int i=0;i<11;i++){
                Cell cell = sheet.getCell(i,2);
                System.out.println("this cell : "+cell.getContents());
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (BiffException e) {
            System.out.println(e.getMessage());
        } finally {
            if(wb!=null){wb.close();}
        }

//        Workbook wb = null;

//        try {
//            wb = Workbook.getWorkbook(new File("./jxlrwtest.xls"));
//
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        } catch (BiffException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            if(wb!=null){wb.close();}
//        }

    }
}
