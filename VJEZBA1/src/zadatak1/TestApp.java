package zadatak1;

import com.formdev.flatlaf.FlatDarculaLaf;
import zadatak1.view.MainFrame;

import javax.swing.*;
import java.util.List;

public class TestApp {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
        });

    }
}
