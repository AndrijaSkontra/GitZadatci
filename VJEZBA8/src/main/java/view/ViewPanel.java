package view;

import net.miginfocom.swing.MigLayout;

import javax.swing.*;

public class ViewPanel extends JPanel {

    private JTable table;
    private JScrollPane scrollPane;

    public ViewPanel() {
        setBorder(BorderFactory.createTitledBorder("View"));

        initComponents();
        layoutPanel();
    }

    private void initComponents() {
        String[][] data = {
                {"", "", "", "", ""}

        };
        String[] columnNames = {"First Name", "Last Name", "Best language", "Experience", "Working time"};
        table = new JTable(data, columnNames);
        scrollPane = new JScrollPane(table);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    }

    private void layoutPanel() {
        setLayout(new MigLayout());
        add(scrollPane, "w 600");
    }
}
