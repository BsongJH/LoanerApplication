import java.util.List;

public interface ExcelFileDAO
{
    void writeData(String filePath, List<String[]> data);
    List<String[]> readData(String filePath);
}
