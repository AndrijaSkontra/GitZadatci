package zadatak1.controller;

import zadatak1.view.InputPanel;
import zadatak1.model.Calculation;
import zadatak1.model.SimpleCalculator;
import zadatak1.view.MainFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrameListener implements ActionListener {

    private MainFrame mainFrame;
    private InputPanel inputPanel;

    public MainFrameListener(MainFrame mainFrame, InputPanel inputPanel) {
        this.mainFrame = mainFrame;
        this.inputPanel = inputPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == inputPanel.getCalculateButton()) {
            SimpleCalculator simpleCalculator = new SimpleCalculator();
            Calculation calculation = (Calculation) inputPanel.getOperationComboBox().getSelectedItem();
            float firstNumber = Float.parseFloat(inputPanel.getFirstNumberField().getText());
            float secondNumber = Float.parseFloat(inputPanel.getSecondNumberField().getText());
            simpleCalculator.setCalculation(calculation);
            float result = simpleCalculator.performCalculation(firstNumber, secondNumber);
            mainFrame.getResultField().setText(String.valueOf(result));
            mainFrame.getAllResultsArea().append(String.valueOf(firstNumber) + " " + calculation.symbol()
                    + " " + String.valueOf(secondNumber) + " = " + String.valueOf(result) + "\n");
        }
    }
}
