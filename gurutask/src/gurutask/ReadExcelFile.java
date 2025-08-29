package gurutask;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

XSSFWorkbook wb;
XSSFSheet sheet;

public ReadExcelFile(String excelpath)
{
try
{
File src = new File(excelpath);
FileInputStream fis = new FileInputStream(src);
wb = new XSSFWorkbook(fis);
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
public String getData(int sheetnumber,int row,int column)
{
sheet = wb.getSheetAt(sheetnumber);
if (sheet.getRow(row) == null || sheet.getRow(row).getCell(column) == null) {
            return ""; // return empty string if row/cell is missing
        }
        return sheet.getRow(row).getCell(column).toString();
}
public int getRowCount(int sheetIndex)
{
int row = wb.getSheetAt(sheetIndex).getLastRowNum();
row = row+1;
return row;
}

public int getColumnCount(int sheetIndex) {
sheet = wb.getSheetAt(sheetIndex);
        return sheet.getRow(0).getLastCellNum();
}

public void close() {
        try {
            if (wb != null) wb.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
