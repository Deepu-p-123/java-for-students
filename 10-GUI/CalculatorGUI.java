import javax.swing.*;
import java.awt.*;

/*
 * CalculatorGUI.java
 * A simple two-number calculator GUI demonstrating text fields,
 * a combo box, buttons, layout managers, and exception handling in a GUI.
 */
public class CalculatorGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setSize(320, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridLayout(5, 2, 8, 8));

        JTextField num1Field = new JTextField();
        JTextField num2Field = new JTextField();
        String[] operations = {"+", "-", "*", "/"};
        JComboBox<String> operationBox = new JComboBox<>(operations);
        JButton calculateButton = new JButton("Calculate");
        JLabel resultLabel = new JLabel("Result: ", SwingConstants.LEFT);

        frame.add(new JLabel("Number 1:"));
        frame.add(num1Field);
        frame.add(new JLabel("Number 2:"));
        frame.add(num2Field);
        frame.add(new JLabel("Operation:"));
        frame.add(operationBox);
        frame.add(new JLabel()); // spacer
        frame.add(calculateButton);
        frame.add(new JLabel());
        frame.add(resultLabel);

        calculateButton.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                String operation = (String) operationBox.getSelectedItem();

                double result;
                switch (operation) {
                    case "+": result = num1 + num2; break;
                    case "-": result = num1 - num2; break;
                    case "*": result = num1 * num2; break;
                    case "/":
                        if (num2 == 0) {
                            resultLabel.setText("Result: Error (divide by zero)");
                            return;
                        }
                        result = num1 / num2;
                        break;
                    default: result = 0;
                }
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Result: Invalid input");
            }
        });

        frame.setVisible(true);
    }
}
