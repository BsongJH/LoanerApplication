/*
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperation {
    protected Workbook workbook;
    protected Sheet sheet;
    protected Row headerRow;
    protected Cell cell;

    public void createWorkbook(String name)
    {
        // Create a Workbook
        workbook = new XSSFWorkbook();  // new HSSFWorkbook() for generating `.xls` file
    }

    public void createSheet(String name)
    {
        // Create a Sheet
        sheet = workbook.createSheet(name);
    }

    // Writes from workbook to spreadsheet
    public void writeAll()
    {
        try (FileOutputStream fileOut = new FileOutputStream("POIExcelFile.xlsx")) {
            workbook.write(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

 */