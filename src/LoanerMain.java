import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class LoanerMain
{
    public static LoanerMain panelInstance;
    private JFrame frame;
    private JTable table;
    private List<Computers> computersList = new ArrayList<>();
    private MyTableModel myTableModel = new MyTableModel();
    private ExcelFileDAO file;
    // Creating single panel instance
    public static LoanerMain getPanelInstance()
    {
        if (panelInstance == null)
        {
            synchronized (LoanerMain.class)
            {
                if (panelInstance == null)
                {
                    panelInstance = new LoanerMain();
                }
            }
        }
        return panelInstance;
    }

    public LoanerMain()
    {
        // Have
        FileOperation create = new FileOperation();


        table = new JTable(myTableModel);

        JTextField searchBox = new JTextField();
        searchBox.setBounds(190,215,150,51);
        searchBox.setBackground(new Color(0xFFFFFF));

        JButton searchBtn = new JButton("Search");
        searchBtn.setBounds(340,215,150,50);
        searchBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Search method goes in here
                // TODO
            }
        });

        JButton addComputer = new JButton("Add Computer");
        addComputer.setBounds(190, 265, 150, 50);
        addComputer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddComputerUI addComputerUI = new AddComputerUI(myTableModel, computersList);

            }
        });

        JButton loanButton = new JButton("Loan");
        loanButton.setBounds(340, 265, 150, 50);
        loanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Check if it is selected or not
                if (table.getSelectedRow() != -1)
                {
                    LoanUI loanUI = new LoanUI(myTableModel, table.getSelectedRow());
                }
                else
                {
                    display("Please Select The Computer first!!");
                }
            }
        });

        JButton retrieveButton = new JButton("Retrieve");
        retrieveButton.setBounds(190, 315, 150, 50);
        retrieveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve action
                if (table.getSelectedRow() != -1 && !myTableModel.getValueAt(table.getSelectedRow(),0).equals("Available"))
                {
                    Retrieve retrieve = new Retrieve(myTableModel, table.getSelectedRow());
                }
                else if (myTableModel.getValueAt(table.getSelectedRow(), 0).equals("Available"))
                {
                    display("The Computer is Available!!");
                }
                else
                {
                    display("Please Select The Computer First!!");
                }

            }
        });

        JButton delButton = new JButton("Delete");
        delButton.setBounds(340, 315, 150, 50);
        delButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Delete action
                if (table.getSelectedRow() != -1)
                {
                    DeleteComputer deleteComputer = new DeleteComputer(myTableModel, table.getSelectedRow());
                }
                else
                {
                    display("Please Select The Computer First!!");
                }
            }
        });


        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10,10,480,200);
        scrollPane.setBackground(new Color(0xEBEBE3));
        scrollPane.setViewportView(table);


        frame = new JFrame();
        frame.setTitle("LoanerApplication");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.pack();

        //frame.setPreferredSize(new Dimension(500,550 / 12 * 9));
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(searchBox);
        frame.add(searchBtn);
        frame.add(scrollPane);
        frame.add(addComputer);
        frame.add(delButton);
        frame.add(retrieveButton);
        frame.add(loanButton);

        frame.setVisible(true);
    }

    private void display(String message)
    {
        JOptionPane.showMessageDialog(null, message, "Analysis", JOptionPane.INFORMATION_MESSAGE);
    }
}