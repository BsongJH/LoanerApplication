import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyTableModel extends AbstractTableModel
{
    // Change to 2d Array instead of array list
    private final ArrayList<String> columnNames = new ArrayList<String>(
            Arrays.asList("Available", "Model", "Number", "Name", "Date")
    );

    private List<List<String>> data;

    public MyTableModel()
    {
        List<String> test = new ArrayList<>(Arrays.asList("test","test","test","test","test"));
        data = new ArrayList<>();
        data.add(test);
    }

    public void addComputer(Computers newComputer)
    {
        data = new ArrayList<>();
        data.add(newComputer.inAList());
        fireTableDataChanged();
    }
    /*
    public void addLoan(Loan loan)
    {


    }

     */
    public String getColumnName(int column) {
        return columnNames.get(column);
    }

    @Override
    public int getRowCount() {
        return data.size();
    }


    @Override
    public int getColumnCount() {
        return columnNames.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data.get(rowIndex).get(columnIndex);
    }
}
