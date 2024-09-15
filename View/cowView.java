package View;

import javax.swing.*;
import java.awt.event.*;
import Controller.*;

public class cowView {
    private milkCalculator milkcal = new milkCalculator();
    public void cowWindow(String id){
        JFrame frame = new JFrame("cow");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel milk = new JLabel("This cow can produce");
        milk.setBounds(10,10,200,30);
        panel.add(milk);

        String milkAmount = Integer.toString(milkcal.milkCalculate(id)) ;
        JLabel amount = new JLabel(milkAmount);
        amount.setBounds(220,10,100,30);
        panel.add(amount);

        // JLabel udderBeforeLabel = new JLabel();



        JButton backButton = new JButton("Back");
        backButton.setBounds(150, 100, 100, 50);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); 
            }
        });
        panel.add(backButton);

        frame.add(panel);
        frame.setVisible(true);

    }

}
