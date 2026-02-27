package com.introSwing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Ejercicio: Crear una aplicación de escritorio que permita al usuario ingresar un precio y un porcentaje de impuesto,
// y luego calcule y muestre el precio total con impuestos incluidos.
public class Form {
    private final JPanel taxPanel;
    private final JTextField pricePane;
    private final JTextField totalPane;
    private final JTextField taxPane;

    public Form() {

        JButton botonCalcular = new JButton("Calcular");
        taxPanel = new JPanel();
        pricePane = new JTextField(10);
        totalPane = new JTextField(10);
        taxPane = new JTextField(10);

        taxPanel.add(new JLabel("Precio:"));
        taxPanel.add(pricePane);
        taxPanel.add(new JLabel("Impuesto:"));
        taxPanel.add(taxPane);
        taxPanel.add(botonCalcular);
        taxPanel.add(new JLabel("Total:"));
        taxPanel.add(totalPane);

        // Agregar un ActionListener al botón para calcular el precio total con impuestos incluidos cuando se haga clic en él.
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
