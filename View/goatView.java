package View;

import javax.swing.*;
import java.awt.event.*;

public class goatView {
    // private mainView mainView = new mainView();
    public void goatWindow(){
        JFrame frame = new JFrame("Goat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel goat = new JLabel("is it goat click button to banish goat to the moutain ");
        goat.setBounds(50,50,300,50);
        panel.add(goat);
        JButton goatButton = new JButton("Banish");
        goatButton.setBounds(100,150,100,50);
        goatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Banished");
                frame.dispose();
            }
        });
        panel.add(goatButton);

        JButton backButton = new JButton("Back");
        backButton.setBounds(100, 220, 100, 50);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose(); // Close the current window
            }
        });
        panel.add(backButton);


        frame.add(panel);
        frame.setVisible(true);
        
    }
}
