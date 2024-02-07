package view;

import lombok.Getter;
import model.Programmer;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ViewPanel extends JPanel {

    private JTable table;
    private DefaultTableModel tableModel;
    private JScrollPane scrollPane;
    @Getter private JButton dataButton;

    private ActionListener viewListener;

    public ViewPanel() {
        setBorder(BorderFactory.createTitledBorder("View"));

        initComponents();
        layoutPanel();
    }

    private void activatePanel() {
        dataButton.addActionListener(viewListener);
    }

    private void initComponents() {
        setupTable();
        dataButton = new JButton("Get data");
    }

    private void setupTable() {
        tableModel = new DefaultTableModel();
        table = new JTable(tableModel);
        addColumnsToTable(tableModel);
//      tableModel.addRow(new Object[]{"1", "2", "3", "5", "6"});
        scrollPane = new JScrollPane(table);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    }

    private void addColumnsToTable(DefaultTableModel tableModel) {
        tableModel.addColumn("First Name");
        tableModel.addColumn("Last Name");
        tableModel.addColumn("Best language");
        tableModel.addColumn("Experience");
        tableModel.addColumn("Working time");
    }

    private void layoutPanel() {
        setLayout(new MigLayout());
        add(scrollPane, "w 600, wrap");
        add(dataButton, "spanx, align center");
    }

    public void setViewListener(ActionListener viewListener) {
        this.viewListener = viewListener;
        activatePanel();
    }

    public void updateTable(ArrayList<Programmer> programmers) {
        for (Programmer programmer : programmers) {
            System.out.println(programmer);
            tableModel.addRow(new Object[]{
                    programmer.getFirstName(),
                    programmer.getLastName(),
                    programmer.getBestLanguage(),
                    programmer.getExperiencedIn(),
                    programmer.getWorkingTime()
            });
        }
    }
}
