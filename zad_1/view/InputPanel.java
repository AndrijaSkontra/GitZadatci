package com.andrijaskontra.zadatak_1.view;

import com.andrijaskontra.zadatak_1.model.AddCalculation;
import com.andrijaskontra.zadatak_1.model.Calculation;
import com.andrijaskontra.zadatak_1.model.PowerToCalculation;
import com.andrijaskontra.zadatak_1.model.MultiplyCalculation;
import com.andrijaskontra.zadatak_1.model.SubtractCalculation;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.util.ArrayList;

public class InputPanel extends JPanel {

    private JLabel firstNumberLabel;
    private JTextField firstNumberField;
    private JLabel secondNumberLabel;
    private JTextField secondNumberField;
    private JLabel operationLabel;
    private ArrayList<Calculation> calculationTypes;
    private JComboBox<Calculation> operationComboBox;
    private JButton calculateButton;

    public InputPanel() {

        setBorder(BorderFactory.createTitledBorder("Input"));

        initComponents();
        layoutComponents();
    }

    private void initComponents() {

        firstNumberLabel = new JLabel("First number:");
        firstNumberField = new JTextField();
        secondNumberLabel = new JLabel("Second number:");
        secondNumberField = new JTextField();
        operationLabel = new JLabel("Operation:");
        calculationTypes = new ArrayList<>();
        calculationTypes.add(new AddCalculation());
        calculationTypes.add(new PowerToCalculation());
        calculationTypes.add(new SubtractCalculation());
        calculationTypes.add(new MultiplyCalculation());
        calculationTypes.add(new PowerToCalculation());
        // TODO: 2021-08-17 put calculations in combobox
        operationComboBox = new JComboBox<>(calculationTypes.toArray(new Calculation[0]));
        calculateButton = new JButton("Calculate");
    }

    private void layoutComponents() {

        //layout components using miglayout
        setLayout(new MigLayout("gapy 20%"));
        add(firstNumberLabel);
        add(firstNumberField, "wrap");
        add(secondNumberLabel);
        add(secondNumberField, "wrap");
        add(operationLabel);
        add(operationComboBox, "wrap");
        add(calculateButton, "span 2");
    }

    public JLabel getFirstNumberLabel() {
        return firstNumberLabel;
    }

    public JTextField getFirstNumberField() {
        return firstNumberField;
    }

    public JLabel getSecondNumberLabel() {
        return secondNumberLabel;
    }

    public JTextField getSecondNumberField() {
        return secondNumberField;
    }

    public JLabel getOperationLabel() {
        return operationLabel;
    }

    public JComboBox<Calculation> getOperationComboBox() {
        return operationComboBox;
    }

    public JButton getCalculateButton() {
        return calculateButton;
    }
}
