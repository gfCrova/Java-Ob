package com.introSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form {
    private JButton botonCalcular;
    private JPanel taxPanel;
    private JTextField pricePane;
    private JTextField totalPane;
    private JTextField taxPane;
    public Form() {
        botonCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double p = Double.parseDouble(pricePane.getText());
                double t = Double.parseDouble(taxPane.getText());

                double result = p + (p / 100 * t);
                totalPane.setText(Double.toString(result));
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("SwingTax");
        frame.setContentPane(new Form().taxPanel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
