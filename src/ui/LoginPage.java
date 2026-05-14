package ui;

import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame {

    public LoginPage() {

        setTitle("Biometric Face Attendance");
        setSize(600, 420);
        setLayout(null);

        getContentPane().setBackground(new Color(18,18,28));

        JLabel title = new JLabel("BIOMETRIC FACE ATTENDANCE");
        title.setBounds(120, 40, 400, 40);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial", Font.BOLD, 24));

        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(120, 120, 100, 30);
        userLabel.setForeground(Color.WHITE);

        JTextField userField = new JTextField();
        userField.setBounds(230, 120, 220, 35);

        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(120, 180, 100, 30);
        passLabel.setForeground(Color.WHITE);

        JPasswordField passField = new JPasswordField();
        passField.setBounds(230, 180, 220, 35);

        JButton loginBtn = new JButton("LOGIN");
        loginBtn.setBounds(230, 260, 150, 40);

        loginBtn.addActionListener(e -> {

            new DashboardPage();
            dispose();
        });

        add(title);
        add(userLabel);
        add(userField);
        add(passLabel);
        add(passField);
        add(loginBtn);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}