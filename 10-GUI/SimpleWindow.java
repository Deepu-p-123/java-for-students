import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/*
 * SimpleWindow.java
 * The "Hello World" of Java GUI programming using Swing.
 * Demonstrates creating a basic window (JFrame) with a label.
 */
public class SimpleWindow {
    public static void main(String[] args) {
        // Create the main window
        JFrame frame = new JFrame("My First GUI Window");

        // Create a label to display text
        JLabel label = new JLabel("Hello, Java GUI!", SwingConstants.CENTER);

        // Add the label to the frame
        frame.add(label);

        // Configure the frame
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // center the window on screen
        frame.setVisible(true);
    }
}
