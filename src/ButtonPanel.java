import javax.swing.*;
// TODO USE LATER TO CLEAN THE CODE
public class ButtonPanel {
    private JPanel panel;
    private JButton addComputer, loan, retrieve, del;

    public ButtonPanel() {
        panel = new JPanel();
        // ... Initialize buttons and set action listeners ...
    }

    private void initializeButtons() {
        addComputer = new JButton("Add Computer");
        // ... Set bounds and listeners ...
    }

    // ... ActionListeners as inner classes or separate classes ...

    public JPanel getPanel() {
        return panel;
    }
}
