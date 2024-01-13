package zadatak1.view;

import net.miginfocom.swing.MigLayout;
import zadatak1.Utility.InterfaceImplementationFinder;
import zadatak1.model.Calculation;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class InputPanel extends JPanel {

    private JLabel firstNumberLabel;
    private JTextField firstNumberField;
    private JLabel secondNumberLabel;
    private JTextField secondNumberField;
    private JLabel operationLabel;
    private JComboBox<Calculation> operationComboBox;
    private JButton calculateButton;
    private List<Class<?>> classesImplementingCalculationInterface;

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
        operationComboBox = new JComboBox<>(initCalculations());
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

    private Calculation[] initCalculations() {
        classesImplementingCalculationInterface = InterfaceImplementationFinder.findClassesImplementingInterface(
                "homework.vjezba1.zadatak1.model", Calculation.class);
        // make this list something we can put into JComboBox
        Calculation[] calculations = new Calculation[classesImplementingCalculationInterface.size()];
        for (int i = 0; i < classesImplementingCalculationInterface.size(); i++) {
            try {
                calculations[i] = (Calculation) classesImplementingCalculationInterface.get(i).getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return calculations;
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
