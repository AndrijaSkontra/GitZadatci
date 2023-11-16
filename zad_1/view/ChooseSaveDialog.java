package com.andrijaskontra.zadatak_1.view;

import com.andrijaskontra.zadatak_1.data_save_load.BinFileManager;
import com.andrijaskontra.zadatak_1.data_save_load.SaveLoadStrategy;
import com.andrijaskontra.zadatak_1.data_save_load.TxtFileManager;
import com.andrijaskontra.zadatak_1.model.CalcDataList;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.io.File;
import java.util.ArrayList;

public class ChooseSaveDialog extends JDialog {

    protected JComboBox<SaveLoadStrategy> saveLoadStrategyComboBox;
    private ArrayList<SaveLoadStrategy> saveLoadStrategyArrayList;
    protected JButton okButton;
    private String arrayAsString;

    public ChooseSaveDialog(MainFrame mainFrame, String arrayAsString) {
        this.arrayAsString = arrayAsString;

        setTitle("Choose save/load strategy");
        setSize(300, 200);
        setLocationRelativeTo(mainFrame);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setModal(true);
        initComponents();
        layoutComponents();
        activateComponents();
        setVisible(true);
    }

    private void initComponents() {

        saveLoadStrategyArrayList = new ArrayList<>();
        saveLoadStrategyArrayList.add(new TxtFileManager());
        saveLoadStrategyArrayList.add(new BinFileManager());
        saveLoadStrategyComboBox = new JComboBox<>(
                saveLoadStrategyArrayList.toArray(new SaveLoadStrategy[0]));
        okButton = new JButton("OK");
    }

    private void layoutComponents() {
        setLayout(new MigLayout("align center center"));
        // padding on all sides
        add(saveLoadStrategyComboBox, "width 70%, height 20%, gap 0 0 0 50, wrap");
        add(okButton, "align center");
    }

    protected void activateComponents() {
        okButton.addActionListener(e -> {
            SaveLoadStrategy saveLoadStrategy = (SaveLoadStrategy) saveLoadStrategyComboBox.getSelectedItem();

            JFileChooser fileChooser = new JFileChooser();
            int userSelection = fileChooser.showSaveDialog(null);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                saveLoadStrategy.save(fileToSave.getAbsolutePath(), arrayAsString);
            }

            dispose();
        });
    }
}
