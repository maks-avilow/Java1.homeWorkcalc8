package calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends JFrame {

    public Calc() {
        setTitle ("my first calc");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(550,220,400,150);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

        JTextField first = new JTextField();
        JTextField second = new JTextField();
        JButton multiply_Label = new JButton ("*");
        JButton plus_Label = new JButton("+");
        JButton minus_Label = new JButton("-");
        JButton share_Label = new JButton("/");
        JLabel result_Label = new JLabel("результат");
        JLabel equals = new JLabel(" = ");

        multiply_Label.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(first.getText());
                double n2 = Double.parseDouble(second.getText());
               double res =  n1 * n2;
                result_Label.setText(String.valueOf(res));
            }
        });
        plus_Label.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(first.getText());
                double n2 = Double.parseDouble(second.getText());
                double res =  n1 + n2;
                result_Label.setText(String.valueOf(res));
            }
        });
        minus_Label.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(first.getText());
                double n2 = Double.parseDouble(second.getText());
                double res =  n1 - n2;
                result_Label.setText(String.valueOf(res));
            }
        });
        share_Label.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Double.parseDouble(first.getText());
                double n2 = Double.parseDouble(second.getText());
                double res =  n1 / n2;
                result_Label.setText(String.valueOf(res));
            }
        });

        add(first);
        add(multiply_Label);
        add(plus_Label);
        add(minus_Label);
        add(share_Label);
        add(second);
        add(equals);
        add(result_Label);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Calc();
            }
}
