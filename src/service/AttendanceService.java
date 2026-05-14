package service;

import java.io.FileWriter;

public class AttendanceService {

    public static void markAttendance(String name) {

        try {

            FileWriter writer =
                    new FileWriter("data/attendance.txt", true);

            writer.write(name + " - Present\n");

            writer.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}