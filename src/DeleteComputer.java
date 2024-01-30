import javax.swing.*;

public class DeleteComputer
{
    /*
        Deletes selected row/available computer
     */
    public DeleteComputer(MyTableModel myTableModel, int selectedRow)
    {
        if (myTableModel.getValueAt(selectedRow,3).equals(" "))
        {
            myTableModel.deleteRow(selectedRow);
            myTableModel.fireTableDataChanged();
        }
        else
        {
            display("You cannot delete a computer that are being loan");
        }
    }

    private void display(String message)
    {
        JOptionPane.showMessageDialog(null, message, "Analysis", JOptionPane.INFORMATION_MESSAGE);
    }
}
