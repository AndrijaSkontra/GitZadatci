package zadatak1.view;
import net.miginfocom.swing.MigLayout;
import zadatak1.controller.MainFrameListener;

import javax.swing.*;

public class MainFrame extends JFrame {

    private InputPanel inputPanel;
    private JLabel resultLabel;
    private JTextField resultField;
    private JLabel allResultsLabel;
    private JTextArea allResultsArea;
    private JScrollPane scrollBarForResultsArea;

    private MainFrameListener mainFrameListener;

    public MainFrame() {

        setTitle("Calculator");
        setSize(800, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        initComponents();
        layoutComponents();
        activateComponents();
    }

    private void initComponents() {

        inputPanel = new InputPanel();
        resultLabel = new JLabel("Result:");
        resultField = new JTextField();
        resultField.setEditable(false);
        allResultsLabel = new JLabel("All results:");
        allResultsArea = new JTextArea();
        scrollBarForResultsArea = new JScrollPane(allResultsArea);
        scrollBarForResultsArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
    }

    private void layoutComponents() {

        setLayout(new MigLayout("fill"));
        add(inputPanel, "spany, grow");
        add(resultLabel, "wrap");
        add(resultField, "wrap");
        add(allResultsLabel, "wrap");
        add(allResultsArea, "grow, pushy");
    }

    private void activateComponents() {
        mainFrameListener = new MainFrameListener(this, inputPanel);
        inputPanel.getCalculateButton().addActionListener(mainFrameListener);
    }

    public InputPanel getInputPanel() {
        return inputPanel;
    }

    public JLabel getResultLabel() {
        return resultLabel;
    }

    public JTextField getResultField() {
        return resultField;
    }

    public JLabel getAllResultsLabel() {
        return allResultsLabel;
    }

    public JTextArea getAllResultsArea() {
        return allResultsArea;
    }
}
