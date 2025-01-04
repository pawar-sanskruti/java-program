import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350, 200);
        frame.setLayout(new BorderLayout());

        // Create JPanel for form
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

        // Add username and password labels and fields
        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();
        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();

        // Add Login button
        JButton loginButton = new JButton("Login");

        // Add labels and fields to the panel
        panel.add(userLabel);
        panel.add(userField);
        panel.add(passLabel);
        panel.add(passField);
        panel.add(new JLabel()); // Empty placeholder for layout
        panel.add(loginButton);

        // Add panel to frame
        frame.add(panel, BorderLayout.CENTER);

        // Add action listener for the Login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());

                // Validation logic
                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (username.equals("admin") && password.equals("password123")) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}

