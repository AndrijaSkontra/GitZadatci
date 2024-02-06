import com.formdev.flatlaf.FlatDarculaLaf;
import view.MainFrame;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        setLookAndFeel();
        runApp();
    }

    private static void runApp() {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new MainFrame();
            }
        });
    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
    }
}
