package ui;

import javax.swing.*;
import java.awt.*;

import service.AttendanceService;
import service.FaceRecognitionService;

public class DashboardPage extends JFrame {

    public DashboardPage() {

        setTitle("Dashboard");
        setSize(700, 500);
        setLayout(null);

        getContentPane().setBackground(new Color(20,20,30));

        JLabel title = new JLabel("AI Face Recognition Dashboard");
        title.setBounds(170, 30, 400, 40);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial", Font.BOLD, 28));

        JButton registerBtn = new JButton("Register Student");
        registerBtn.setBounds(220, 130, 250, 45);

        JButton webcamBtn = new JButton("Start Biometric Scan");
        webcamBtn.setBounds(220, 220, 250, 45);

        JButton reportBtn = new JButton("View Attendance");
        reportBtn.setBounds(220, 310, 250, 45);

        registerBtn.addActionListener(e ->
                new RegisterStudentPage());

        webcamBtn.addActionListener(e -> {

            FaceRecognitionService.startRecognition();

            String name = JOptionPane.showInputDialog(
                    "Enter Recognized Student Name");

            if(name != null && !name.isEmpty()) {

                AttendanceService.markAttendance(name);
            }
        });

        reportBtn.addActionListener(e ->
                new ReportPage());

        add(title);
        add(registerBtn);
        add(webcamBtn);
        add(reportBtn);

        setLocationRelativeTo(null);
        setVisible(true);
    }
}