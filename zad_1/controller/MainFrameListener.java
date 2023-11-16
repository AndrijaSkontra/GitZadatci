package com.andrijaskontra.zadatak_1.controller;

import com.andrijaskontra.zadatak_1.model.CalcData;
import com.andrijaskontra.zadatak_1.model.CalcDataList;
import com.andrijaskontra.zadatak_1.model.Calculation;
import com.andrijaskontra.zadatak_1.utility.UtilityForArrays;
import com.andrijaskontra.zadatak_1.view.ChooseLoadDialog;
import com.andrijaskontra.zadatak_1.view.ChooseSaveDialog;
import com.andrijaskontra.zadatak_1.view.InputPanel;
import com.andrijaskontra.zadatak_1.view.MainFrame;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class MainFrameListener implements ActionListener {

    private MainFrame mainFrame;
    private InputPanel inputPanel;

    private CalcDataList calcDataList;

    public MainFrameListener(MainFrame mainFrame, InputPanel inputPanel) {
        this.mainFrame = mainFrame;
        this.inputPanel = inputPanel;
        calcDataList = new CalcDataList();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == inputPanel.getCalculateButton()) {
            String firstNumString = mainFrame.getInputPanel().getFirstNumberField().getText();
            String secondNumString = mainFrame.getInputPanel().getSecondNumberField().getText();
            if (firstNumString.isEmpty() || secondNumString.isEmpty()) {
                JOptionPane optionPane = new JOptionPane();
                optionPane.showMessageDialog(mainFrame, "Please enter both numbers", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    double firstNum = Double.parseDouble(firstNumString);
                    double secondNum = Double.parseDouble(secondNumString);
                    CalcData calcData = new CalcData(firstNum, secondNum, (Calculation) mainFrame.getInputPanel().getOperationComboBox().getSelectedItem());
                    mainFrame.getResultField().setText(String.valueOf(calcData.getResult()));
                    calcDataList.addCalcData(calcData);
                    mainFrame.getAllResultsArea().setText(UtilityForArrays.
                            getCalcDataListAsString(calcDataList.getCalcDataList()));
                } catch (NumberFormatException ex) {
                    JOptionPane optionPane = new JOptionPane();
                    optionPane.showMessageDialog(mainFrame, "Please enter valid numbers",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    mainFrame.getInputPanel().getFirstNumberField().setText("");
                    mainFrame.getInputPanel().getSecondNumberField().setText("");
                }
            }

        }
        if (e.getSource() == mainFrame.getExitMenuItem()) {
            System.exit(0);
        }
        if (e.getSource() == mainFrame.getSaveMenuItem()) {

            new ChooseSaveDialog(mainFrame,
                    UtilityForArrays.getCalcDataListAsString(calcDataList.getCalcDataList()));
        }
        if (e.getSource() == mainFrame.getLoadMenuItem()) {

            ChooseLoadDialog chooseLoadDialog = new ChooseLoadDialog(mainFrame,
                    UtilityForArrays.getCalcDataListAsString(calcDataList.getCalcDataList()));

            mainFrame.getAllResultsArea().setText(chooseLoadDialog.getText());
        }
    }
}
