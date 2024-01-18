import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class LoanerMain
{
    public static LoanerMain panelInstance;
    private Loan loan;
    private JFrame frame;
    private JLabel creationTime;
    private JPanel top;
    private JTable table;
    private List<Computers> computersList = new ArrayList<>();
    private MyTableModel myTableModel = new MyTableModel();
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

        //MyTableModel myTableModel = new MyTableModel();
        table = new JTable(myTableModel);

        JTextField searchBox = new JTextField();
        searchBox.setBounds(10,10,250,26);
        searchBox.setBackground(new Color(0xEBEBE3));

        JButton searchBtn = new JButton("Search");
        searchBtn.setBounds(260,10,110,25);
        searchBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Search method goes in here
            }
        });

        JButton addComputer = new JButton("Add Computer");
        addComputer.setBounds(10, 255, 150, 50);
        addComputer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add Computer action
                AddComputerUI addComputerUI = new AddComputerUI(myTableModel, computersList);
                System.out.println(computersList);
            }
        });

        JButton loanButton = new JButton("Loan");
        loanButton.setBounds(160, 255, 150, 50);
        loanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Loan
                // Check if it is selected or not
                LoanUI loanUI = new LoanUI(myTableModel, table.getSelectedRow());
            }
        });

        JButton retrieveButton = new JButton("Return");
        retrieveButton.setBounds(10, 310, 150, 50);
        retrieveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve action
            }
        });

        JButton delButton = new JButton("Delete");
        delButton.setBounds(160, 310, 150, 50);
        delButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Delete action

            }
        });


        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(10,50,400,200);
        scrollPane.setBackground(new Color(0xEBEBE3));
        scrollPane.setViewportView(table);


        frame = new JFrame();
        frame.setTitle("LoanerApplication");
        frame.setLayout(null);
        frame.setResizable(false);
        frame.pack();

        //frame.setPreferredSize(new Dimension(500,550 / 12 * 9));
        frame.setSize(500, 550 / 12 * 9);
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
}