package zadatak2.gui_zadatak3;

import zadatak2.PaymentServiceInt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Stack;

public class DesktopAppInv extends JFrame {
    private Stack<PaymentServiceInt> history = new Stack<>();
    private TabPanel tabPanel;

    public DesktopAppInv() {
        setLayout(new BorderLayout());
        tabPanel = new TabPanel();
        add(tabPanel, BorderLayout.CENTER);
        add(createControlPanel(), BorderLayout.SOUTH);
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private JPanel createControlPanel() {
        JPanel panel = new JPanel();
        JButton undoButton = new JButton("Undo");
        JButton redoButton = new JButton("Redo");
        undoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                undo();
            }
        });
        redoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                redo();
            }
        });
        panel.add(undoButton);
        panel.add(redoButton);
        return panel;
    }

    public void executeCommand(PaymentServiceInt command) {
        command.execute();
        history.push(command);
    }

    public void undo() {
        if (!history.isEmpty()) {
            PaymentServiceInt command = history.pop();
            command.undo();
        } else {
            JOptionPane.showMessageDialog(this, "No commands to undo.");
        }
    }

    public void redo() {
        if (!history.isEmpty()) {
            PaymentServiceInt command = history.peek();
            command.execute();
        } else {
            JOptionPane.showMessageDialog(this, "No commands to redo.");
        }
    }

    public void saveAccounts() {
    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("accounts.dat"))) {
        out.writeObject(tabPanel);
    } catch (IOException e) {
        e.printStackTrace();
    }
    }

public void loadAccounts() {
    try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("accounts.dat"))) {
        tabPanel = (TabPanel) in.readObject();
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
    }
}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DesktopAppInv().setVisible(true);
            }
        });
    }
}