import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class ExcelFileDAOImpl implements ExcelFileDAO
{
    LocalDate now;
    @Override
    public void writeData(String filePath, List<String[]> data)
    {
        now = LocalDate.now();
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Loaner1");

            int rowNum = 0;
            for (String[] rowData : data) {
                Row row = sheet.createRow(rowNum++);
                int colNum = 0;
                for (String field : rowData) {
                    Cell cell = row.createCell(colNum++);
                    cell.setCellValue(field);
                }
            }

            try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
                workbook.write(outputStream);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<String[]> readData(String filePath)
    {
        List<String[]> dataList = new ArrayList<>();
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fileInputStream)) {
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                String[] rowData = new String[row.getLastCellNum()];
                int colNum = 0;
                for (Cell cell : row) {
                    rowData[colNum++] = cell.toString();
                }
                dataList.add(rowData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataList;
    }

    public List<String> datas(String datass)
    {
        return null;
    }
}
