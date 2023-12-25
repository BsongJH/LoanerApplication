import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoanerMain
{
    /* TODO Main 화면은 버튼 세개 (Track, Loan, Search)가 있고
        버튼을
     */
    public static LoanerMain panelInstance;
    private Loan loan;
    private JFrame frame;
    private JTree jtree;
    private JLabel creationTime;
    private JPanel top;
    private DefaultMutableTreeNode loanNode;
    private

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
    /*
        원하는 방법 (하나씩 구현해보자.
        스크롤 패널에 컴퓨터 리스트를 보여준다. 컴퓨터 리스트에 론 가능 불가능 이 보여진다 -- GUI
        유저는 가능/불가능한 컴퓨터를 클릭한다/하이라이트 한다. 론 버튼을 누른다. -- GUI
        작은 창이 뜨는데 거기에 이름과 날짜를 기입하고 확인을 누른다. -- Function
        기입된 정보는 스프레드 시트에 저장된다 --> 컴퓨터 목록은 이미 저장된 상태이기 때문에 옆에 다른칸에 새롭게 기입된다. -- Function
     */
    public LoanerMain()
    {
        FileOperation create = new FileOperation();
        FileOperation handle = new Access(); // Passes thinks to write

        loanNode = new DefaultMutableTreeNode();

        DefaultMutableTreeNode node = new DefaultMutableTreeNode()
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
            }
        });

        JButton loanButton = new JButton("Loan");
        loanButton.setBounds(160, 255, 150, 50);
        loanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Loan action
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


        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10,50,300,200);
        scrollPane.setBackground(new Color(0xEBEBE3));
        scrollPane.setViewportView(jtree);


        frame = new JFrame();
        frame.setTitle("LoanerApplication");
        frame.setLayout(null);
        frame.setResizable(false);

        frame.setPreferredSize(new Dimension(500,550 / 12 * 9));
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