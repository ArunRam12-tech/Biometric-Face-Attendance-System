package ui;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;

public class RegisterStudentPage extends JFrame {

    public RegisterStudentPage() {

        setTitle("Register Student");
        setSize(550, 420);
        setLayout(null);

        getContentPane().setBackground(new Color(35,35,45));

        JLabel title = new JLabel("Student Registration");
        title.setBounds(150, 30, 250, 35);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial", Font.BOLD, 24));

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(80, 110, 100, 30);
        nameLabel.setForeground(Color.WHITE);

        JTextField nameField = new JTextField();
        nameField.setBounds(220, 110, 200, 35);

        JLabel usnLabel = new JLabel("USN");
        usnLabel.setBounds(80, 170, 100, 30);
        usnLabel.setForeground(Color.WHITE);

        JTextField usnField = new JTextField();
        usnField.setBounds(220, 170, 200, 35);

        JButton saveBtn = new JButton("Register Face");
        saveBtn.setBounds(190, 270, 160, 40);

        saveBtn.addActionListener(e -> {

            try {

                FileWriter writer =
                        new FileWriter("data/students.txt", true);

                writer.write(
                        nameField.getText() + ", " +
                        usnField.getText() + "\n"
                );

                writer.close();

                JOptionPane.showMessageDialog(null,
                        "Face Registered Successfully");

            } catch(Exception ex) {
                ex.printStackTrace();
            }
        });

        add(title);
        add(nameLabel);
        add(nameField);
        add(usnLabel);
        add(usnField);
        add(saveBtn);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}