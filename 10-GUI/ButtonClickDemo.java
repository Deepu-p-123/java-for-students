import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

/*
 * ButtonClickDemo.java
 * Demonstrates handling button click events using an ActionListener (lambda form).
 */
public class ButtonClickDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Click Demo");
        frame.setLayout(new FlowLayout());

        JLabel messageLabel = new JLabel("Click the button below!", SwingConstants.CENTER);
        JButton clickButton = new JButton("Click Me");

        // Counter to track number of clicks
        int[] clickCount = {0}; // array trick so the lambda can modify it

        // Attach an event listener to the button using a lambda expression
        clickButton.addActionListener(e -> {
            clickCount[0]++;
            messageLabel.setText("Button clicked " + clickCount[0] + " time(s)!");
        });

        frame.add(messageLabel);
        frame.add(clickButton);

        frame.setSize(350, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
