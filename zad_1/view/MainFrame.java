    package com.andrijaskontra.zadatak_1.view;

    import com.andrijaskontra.zadatak_1.controller.MainFrameListener;
    import net.miginfocom.swing.MigLayout;

    import javax.swing.*;

    public class MainFrame extends JFrame {

        private InputPanel inputPanel;
        private JLabel resultLabel;
        private JTextField resultField;
        private JLabel allResultsLabel;
        private JTextArea allResultsArea;
        private JScrollPane scrollBarForResultsArea;
        private JMenuBar menuBar;
        private JMenu fileMenu;
        private JMenuItem exitMenuItem;
        private JMenuItem saveMenuItem;
        private JMenuItem loadMenuItem;

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
            menuBar = new JMenuBar();
            fileMenu = new JMenu("File");
            exitMenuItem = new JMenuItem("Exit");
            saveMenuItem = new JMenuItem("Save");
            loadMenuItem = new JMenuItem("Load");
            menuBar.add(fileMenu);
            fileMenu.add(saveMenuItem);
            fileMenu.add(loadMenuItem);
            fileMenu.add(exitMenuItem);
        }

        private void layoutComponents() {

            setLayout(new MigLayout("fill"));
            add(inputPanel, "spany, grow");
            add(resultLabel, "wrap");
            add(resultField, "wrap");
            add(allResultsLabel, "wrap");
            add(allResultsArea, "grow, pushy");
            add(menuBar, "dock north");
        }

        private void activateComponents() {
            mainFrameListener = new MainFrameListener(this, inputPanel);
            inputPanel.getCalculateButton().addActionListener(mainFrameListener);
            exitMenuItem.addActionListener(mainFrameListener);
            saveMenuItem.addActionListener(mainFrameListener);
            loadMenuItem.addActionListener(mainFrameListener);
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

        public JMenuItem getExitMenuItem() {
            return exitMenuItem;
        }

        public JMenuItem getSaveMenuItem() {
            return saveMenuItem;
        }

        public JMenuItem getLoadMenuItem() {
            return loadMenuItem;
        }
    }
