import javax.swing.*;
import java.awt.*;

/*
 * LoginFormGUI.java
 * Demonstrates building a simple login form with text fields, a password
 * field, buttons, and layout managers (GridBagLayout).
 */
public class LoginFormGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Form");
        frame.setSize(350, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField(15);
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField(15);
        JButton loginButton = new JButton("Login");
        JLabel statusLabel = new JLabel(" ");

        gbc.gridx = 0; gbc.gridy = 0; panel.add(userLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 0; panel.add(userField, gbc);
        gbc.gridx = 0; gbc.gridy = 1; panel.add(passLabel, gbc);
        gbc.gridx = 1; gbc.gridy = 1; panel.add(passField, gbc);
        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2;
        panel.add(loginButton, gbc);
        gbc.gridy = 3;
        panel.add(statusLabel, gbc);

        // Hardcoded credentials for demo purposes only.
        // In 11-JDBC we replace this with a real database check.
        loginButton.addActionListener(e -> {
            String username = userField.getText();
            String password = new String(passField.getPassword());

            if (username.equals("admin") && password.equals("1234")) {
                statusLabel.setForeground(new Color(0, 128, 0));
                statusLabel.setText("Login successful!");
            } else {
                statusLabel.setForeground(Color.RED);
                statusLabel.setText("Invalid username or password.");
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
