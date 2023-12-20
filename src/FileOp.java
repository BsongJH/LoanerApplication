import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    Parent Class of
 */
public class FileOp
{
    // TODO Change it to Abstract class and have "Access" method or find common method that can be shared.
    protected Workbook workbook;
    protected Sheet sheet;
    protected Row headerRow;
    protected Cell cell;

    // TODO receives parameters writes them to excel file
    public void createSheet()
    {
        // Create a Workbook
        workbook = new XSSFWorkbook();  // new HSSFWorkbook() for generating `.xls` file

        // Create a Sheet
        sheet = workbook.createSheet("My Sample Sheet");

        // Create a Row
        headerRow = sheet.createRow(0);

        // Creating cells
        for(int i = 0; i < 3; i++) {
             cell = headerRow.createCell(i);
            cell.setCellValue("Cell Header " + i);
        }

        // Create Other rows and cells with data
        for(int i = 1; i <= 5; i++) {
            Row row = sheet.createRow(i);
            for(int j = 0; j < 3; j++) {
                row.createCell(j).setCellValue("Value " + i + "," + j);
            }
        }

        // Write the output to a file
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
