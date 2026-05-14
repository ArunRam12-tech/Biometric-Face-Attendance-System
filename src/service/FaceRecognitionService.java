package service;

import javax.swing.*;

public class FaceRecognitionService {

    public static void startRecognition() {

        try {

            Runtime.getRuntime().exec(
                    "start microsoft.windows.camera:"
            );

            JOptionPane.showMessageDialog(
                    null,
                    "Opening Webcam..."
            );

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Camera Failed"
            );
        }
    }
}