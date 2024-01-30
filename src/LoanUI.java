import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class LoanUI
{
    private JFrame loanUIFrame;
    private JLabel nameLabel, dateLabel;
    private JButton loan;
    private JTextField inputName, inputDate;
    private LocalDate now;
    /*
        Takes MyTableModel and selected Computer as the parameter.
        MyTableModel updates the UI table
        Selected Row indicate which row that needs to be changed.
     */
    public LoanUI(MyTableModel myTableModel, int selectedRow)
    {
        addFrames();

        now = LocalDate.now();
        nameLabel = new JLabel("User Name");
        dateLabel = new JLabel("Today's Date");

        nameLabel.setBounds(10,10,100,50);
        dateLabel.setBounds(10, 70,100,50);

        inputName = new JTextField("John Doe");
        inputName.setBounds(100,10,200,50);
        inputName.setBackground(new Color(0xEBEBE3));

        inputDate = new JTextField(now.toString());
        inputDate.setBounds(100,70,200,50);
        inputDate.setBackground(new Color(0xEBEBE3));

        loan = new JButton("Loan");
        loan.setBounds(100,130,200,50);
        loan.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // Check if the input value, see if it is empty
                if(!inputName.getText().isEmpty() && !inputDate.getText().isEmpty())
                {
                    System.out.println(now);
                    myTableModel.setValueAt("Not Available",selectedRow,0);
                    myTableModel.setValueAt(inputName.getText(),selectedRow,3);
                    myTableModel.setValueAt(inputDate.getText(),selectedRow,4);
                    loanUIFrame.dispose();
                }
            }
        });

        loanUIFrame.add(inputName);
        loanUIFrame.add(inputDate);
        loanUIFrame.add(nameLabel);
        loanUIFrame.add(dateLabel);
        loanUIFrame.add(loan);
    }
    private void addFrames()
    {
        loanUIFrame = new JFrame();
        loanUIFrame.setTitle("Loan");
        loanUIFrame.setLayout(null);
        loanUIFrame.setVisible(true);
        loanUIFrame.setResizable(false);
        loanUIFrame.setSize(300, 300 / 12 * 9);
        loanUIFrame.setLocationRelativeTo(null);
    }
}
