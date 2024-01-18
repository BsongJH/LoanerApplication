import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyTableModel extends AbstractTableModel
{
    // Change to 2d Array instead of array list
    private final ArrayList<String> columnNames = new ArrayList<String>(
            Arrays.asList("Available", "Model", "Number", "Name", "Date","Type")
    );

    private List<List<String>> data = new ArrayList<>();

    /*
        The constructor assigns the headline.
        data will have the list of computers that user has added
        and will be shown on the table.
     */
    public MyTableModel()
    {
        List<String> test = new ArrayList<>(Arrays.asList("test","test","test","test","test","test"));
        data.add(test);
    }

    /*
        This function adds a new computer to the table
     */
    public void addComputer(Computers newComputer)
    {
        data.add(newComputer.inAList());
        System.out.println("In MyTableModel Class" + data);
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

    public void setValueAt(String aValue, int rowIndex, int columnIndex)
    {
        data.get(rowIndex).set(columnIndex, aValue);
    }
}
