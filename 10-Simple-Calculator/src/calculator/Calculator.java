/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

/**
 *
 * @author Jason
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener  {

    /**
     * @param args the command line arguments
     */
    private JTextField textField;
    private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private JButton buttonAdd, buttonSubtract, buttonMultiply, buttonDivide, buttonEqual, buttonClear;
    private JPanel panel;
    private double num1 = 0, num2 = 0, result = 0;
    private char operator = ' ';
    private boolean decimal = false;

    public Calculator() {
        // Set up the frame
        setTitle("Calculator");
        setSize(350, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up the text field
        textField = new JTextField();
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);

        // Set up the buttons
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonAdd = new JButton("+");
        buttonSubtract = new JButton("-");
        buttonMultiply = new JButton("*");
        buttonDivide = new JButton("/");
        buttonEqual = new JButton("=");
        buttonClear = new JButton("C");

        // Add action listeners to the buttons
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonSubtract.addActionListener(this);
        buttonMultiply.addActionListener(this);
        buttonDivide.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonClear.addActionListener(this);

        // Set up the panel
        panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 5, 5));
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(buttonAdd);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(buttonSubtract);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonMultiply);
        panel.add(button0);
        panel.add(buttonClear);
        panel.add(buttonEqual);
        panel.add(buttonDivide);

        // Add components to the frame
        add(textField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        // Display the frame
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if (action.equals("C")) {
            num1 = 0;
            num2 = 0;
            result = 0;
            operator = ' ';
            decimal = false;
            textField.setText("");
        } else if (action.equals("+")) {
            num1 = Double.parseDouble(textField.getText());
            operator = '+';
            textField.setText("");
            decimal = false;
        } else if (action.equals("-")) {
            num1 = Double.parseDouble(textField.getText());
            operator = '-';
            textField.setText("");
            decimal = false;
        } else if (action.equals("*")) {
            num1 = Double.parseDouble(textField.getText());
            operator = '*';
            textField.setText("");
            decimal = false;
        } else if (action.equals("/")) {
            num1 = Double.parseDouble(textField.getText());
            operator = '/';
            textField.setText("");
            decimal = false;
        } else if (action.equals("=")) {
            num2 = Double.parseDouble(textField.getText());
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    result = 0;
                    break;
            }
            textField.setText(Double.toString(result));
            decimal = false;
        } else if (action.equals(".")) {
            if (!decimal) {
                textField.setText(textField.getText() + ".");
                decimal = true;
            }
        } else {
            textField.setText(textField.getText() + action);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Calculator calculator = new Calculator();
    }
    
}
