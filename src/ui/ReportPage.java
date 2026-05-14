package ui;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class ReportPage extends JFrame {

    public ReportPage() {

        setTitle("Attendance Report");
        setSize(500, 400);

        JTextArea area = new JTextArea();
        area.setFont(new Font("Arial", Font.PLAIN, 16));

        try {

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader("data/attendance.txt"));

            String line;

            while((line = reader.readLine()) != null) {

                area.append(line + "\n");
            }

            reader.close();

        } catch(Exception e) {

            area.setText("No Attendance Records Found");
        }

        add(new JScrollPane(area));

        setLocationRelativeTo(null);
        setVisible(true);
    }
}