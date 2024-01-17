import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.List;

public class AddComputerUI
{
    private JFrame addCompFrame;
    private JLabel buttonLabel, modelLabel, numLabel;
    private JTextField inputModel, inputNumber;
    private JRadioButton engineerButton, standardButton;
    private ButtonGroup typeGroup;
    private Computers addedComputer;
    private JButton confirmButton;
    private ButtonModel selectedModel;

    public AddComputerUI(MyTableModel myTableModel, List<Computers> computersList)
    {
        addFrames();
        typeGroup = new ButtonGroup();

        buttonLabel = new JLabel("Computer Type");
        modelLabel = new JLabel("Model");
        numLabel = new JLabel("Loan Number");

        buttonLabel.setBounds(10,130,100,50);
        modelLabel.setBounds(10,10,100,50);
        numLabel.setBounds(10, 70, 100,50);

        inputModel = new JTextField("    Ex) Dell 7440");
        inputModel.setBounds(150,10,200, 50);
        inputModel.setBackground(new Color(0xEBEBE3));

        inputNumber = new JTextField("   Ex) \"01\"");
        inputNumber.setBounds(150,70,200,50);
        inputNumber.setBackground(new Color(0xEBEBE3));

        engineerButton = new JRadioButton("Engineer");
        engineerButton.setMnemonic(KeyEvent.VK_B);
        engineerButton.setActionCommand("engineer");
        engineerButton.setSelected(true);
        engineerButton.setBounds(150,130,100,50);

        standardButton = new JRadioButton("Standard");
        standardButton.setMnemonic(KeyEvent.VK_B);
        standardButton.setActionCommand("standard");
        standardButton.setBounds(250,130,100,50);

        confirmButton = new JButton("Confirm");
        confirmButton.setBounds(250,190,100,50);

        selectedModel = typeGroup.getSelection();

        confirmButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                // Check user if all the text fields are inputted.
                if (!inputModel.getText().isEmpty() || !inputNumber.getText().isEmpty())
                {
                    if (engineerButton.isSelected())
                    {
                        addedComputer = new Computers(inputNumber.getText(), inputModel.getText(), true);
                        computersList.add(addedComputer);
                        System.out.println("eng");
                        System.out.println(addedComputer.toString());
                        myTableModel.addComputer(addedComputer);

                    }
                    else if (standardButton.isSelected())
                    {
                        addedComputer = new Computers(inputNumber.getText(),inputModel.getText(),false);
                        computersList.add(addedComputer);
                        System.out.println("stand");
                        System.out.println(addedComputer.toString());
                        myTableModel.addComputer(addedComputer);
                    }
                    System.out.println("check");
                }
                else
                {
                    System.out.println("nope");
                }
                addCompFrame.dispose();
            }
        });


        typeGroup.add(engineerButton);
        typeGroup.add(standardButton);

        addCompFrame.add(confirmButton);
        addCompFrame.add(inputModel);
        addCompFrame.add(inputNumber);
        addCompFrame.add(modelLabel);
        addCompFrame.add(numLabel);
        addCompFrame.add(buttonLabel);
        addCompFrame.add(standardButton);
        addCompFrame.add(engineerButton);
    }

    private void addFrames()
    {
        addCompFrame = new JFrame();
        addCompFrame.setTitle("Add Computer");
        addCompFrame.setLayout(null);
        addCompFrame.setVisible(true);
        addCompFrame.setResizable(false);
        addCompFrame.setSize(370,400 / 12 * 9);
        addCompFrame.setLocationRelativeTo(null);
    }

    public Computers getComputer()
    {
        System.out.println("called");
        return addedComputer;
    }

}
