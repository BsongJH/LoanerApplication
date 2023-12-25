import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyTableModel extends AbstractTableModel
{
    private final ArrayList<String> columnNames = new ArrayList<String>(
            Arrays.asList("Availability", "Model", "Loan Number", "Type", "Date", "First Name", "LastName")
    );

    private List<List<String>> data;

    public MyTableModel(Loan newLoan)
    {
        data = new ArrayList<>();
        data.add(newLoan.inAList());
    }

    public MyTableModel(Computers newComputer)
    {
        data = new ArrayList<>();
        data.add(newComputer.inAList());
    }


    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }
}
