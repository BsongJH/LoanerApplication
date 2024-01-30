import javax.swing.*;

public class Retrieve
{
    /*
        Deletes the name and date.
        Sets the Availability to available
        Asks the user if they want to continue.
     */

    public Retrieve(MyTableModel myTableModel, int selectedRow)
    {
        int response = JOptionPane.showConfirmDialog(null, "Do you want to proceed?",
                "Confirmation", JOptionPane.YES_NO_OPTION);

        if (response == JOptionPane.YES_OPTION)
        {
            // Deletes Name and Date
            myTableModel.setValueAt("Available",selectedRow,0);
            myTableModel.setValueAt(" ",selectedRow,3);
            myTableModel.setValueAt(" ",selectedRow,4);
        }

    }

}
