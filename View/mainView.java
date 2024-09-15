package View;

import javax.swing.*;
import java.awt.event.*;

import Controller.*;

public class mainView {
    
    private JTextField inputIdField;
    private inputValidator inputVaid = new inputValidator();
    private milkCalculator milkcal = new milkCalculator();
    private goatView goat = new goatView();
    private cowView cow = new cowView();
    
    private int totalMilk = 0;
    private JLabel milkTotalLabel;

    public void mainWindow() {
        JFrame mainFrame = new JFrame();
        mainFrame.setSize(400, 300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setTitle("ID Input");

        JPanel panel = new JPanel();
        panel.setLayout(null);

        // input label
        JLabel idLabel = new JLabel("Enter cow ID:");
        idLabel.setBounds(10, 20, 100, 20);
        panel.add(idLabel);

        // input field
        inputIdField = new JTextField(10);
        inputIdField.setBounds(110, 20, 200, 20);
        panel.add(inputIdField);

        // submit button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(110, 60, 100, 30);
        panel.add(submitButton);
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitMain();
            }
        });

        // milk total label
        milkTotalLabel = new JLabel("Milk Total: 0 Liter");
        milkTotalLabel.setBounds(10, 100, 150, 20);
        panel.add(milkTotalLabel);

        // reset milk amount button
        JButton resetButton = new JButton("Reset");
        resetButton.setBounds(220, 60, 100, 30);
        panel.add(resetButton);
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                totalMilk = 0;
                milkTotalLabel.setText("Milk Total: " + totalMilk + " Liter");
            }
        });

        // Add panel to frame
        mainFrame.add(panel);
        mainFrame.setVisible(true);
    }

    public void submitMain() {
        String id = inputIdField.getText();
        if (inputVaid.checkeId(id)) {
            if (inputVaid.isCow(id)) {
                int milkProduced = milkcal.milkCalculate(id);
                totalMilk += milkProduced;
                milkTotalLabel.setText("Milk Total: " + totalMilk + " Liter");
                cow.cowWindow(id);
            } else {
                goat.goatWindow();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid ID. Please enter a valid ID.");
        }
    }

 

}
