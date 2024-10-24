package excelEX;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;

public class ExcelLottoEx {
    public static void main(String[] args) {
        Workbook wb = null;

        try {
            wb = Workbook.getWorkbook(new File("./excel.xls"));

            Sheet sht= wb.getSheet(0);

            System.out.println(sht.getName());
            System.out.println(sht.getColumns());
            System.out.println(sht.getRows());

            Cell cell = sht.getCell(1,1);
            System.out.print(cell.getContents()+"\t");
            cell = sht.getCell(13,1);
            System.out.println(cell.getContents());

            for(int i=3; i<sht.getRows();i++){
                System.out.print(sht.getCell(1,i).getContents()+"\t");
                for(int j=0;j<6;j++){
                    System.out.print(sht.getCell(13+j,i).getContents()+", ");
                }
                System.out.println("");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (BiffException e) {
            System.out.println(e.getMessage());
        } finally {
            if(wb != null){ wb.close(); }
        }

    }
}
