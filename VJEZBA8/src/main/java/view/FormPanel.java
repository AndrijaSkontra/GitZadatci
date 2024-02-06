package view;

import lombok.Getter;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FormPanel extends JPanel {

    private JLabel firstNameLabel;
    private JLabel lastNameLabel;
    private JLabel bestLanguageLabel;
    private JLabel experienceLabel;
    private JLabel workingTimeLabel;
    @Getter private JCheckBox experienceInPythonCB;
    @Getter private JCheckBox experienceInJavaCB;
    @Getter private JCheckBox experienceInCSharpCB;
    @Getter private JTextField firstNameField;
    @Getter private JTextField lastNameField;
    @Getter private JComboBox<String> bestLanguageComboBox;
    private JRadioButton partTimeRadioButton;
    private JRadioButton fullTimeRadioButton;
    @Getter private ButtonGroup workingTimeGroup;
    @Getter private JButton submitButton;

    private ActionListener formListener;

    public FormPanel() {
        setBorder(BorderFactory.createTitledBorder("Form"));
        initComponents();
        layoutPanel();
    }

    private void activatePanel() {
        submitButton.addActionListener(formListener);
    }

    private void initComponents() {
        setupLabels();
        setupExperienceCheckBox();
        setupTextFields();
        setupBestLanguageComboBox();
        setupRadioButtons();
        submitButton = new JButton("Submit");
    }

    private void setupTextFields() {
        firstNameField = new JTextField(10);
        lastNameField = new JTextField(10);
    }

    private void setupExperienceCheckBox() {
        experienceInPythonCB = new JCheckBox("Python");
        experienceInJavaCB = new JCheckBox("Java");
        experienceInCSharpCB = new JCheckBox("C#");
    }

    private void setupRadioButtons() {
        partTimeRadioButton = new JRadioButton("Part time");
        partTimeRadioButton.setActionCommand("Part time");
        fullTimeRadioButton = new JRadioButton("Full time");
        fullTimeRadioButton.setActionCommand("Full time");
        workingTimeGroup = new ButtonGroup();
        workingTimeGroup.add(partTimeRadioButton);
        workingTimeGroup.add(fullTimeRadioButton);
    }

    private void setupLabels() {
        firstNameLabel = new JLabel("First name: ");
        lastNameLabel = new JLabel("Last name: ");
        bestLanguageLabel = new JLabel("Best language: ");
        experienceLabel = new JLabel("Experience: ");
        workingTimeLabel = new JLabel("Working time: ");
    }

    private void setupBestLanguageComboBox() {
        bestLanguageComboBox = new JComboBox<>();
        bestLanguageComboBox.addItem("Python");
        bestLanguageComboBox.addItem("Java");
        bestLanguageComboBox.addItem("C#");
    }

    private void layoutPanel() {
    setLayout(new MigLayout("gap 10 10, fillx"));
    add(firstNameLabel, "align right");
    add(firstNameField, "wrap");
    add(lastNameLabel, "align right, gapbottom 20");
    add(lastNameField, "wrap");
    add(bestLanguageLabel, "align right, gapbottom 30");
    add(bestLanguageComboBox, "wrap");
    add(experienceLabel, "align right, gapbottom 30");
    add(experienceInPythonCB, "split 3");
    add(experienceInJavaCB);
    add(experienceInCSharpCB, "wrap");
    add(workingTimeLabel, "align center, spanx, wrap");
    add(partTimeRadioButton, "wrap, spanx, align center");
    add(fullTimeRadioButton, "gapbottom 50, wrap, spanx, align center");
    add(submitButton, "spanx, align center");
    }

    public void setFormListener(ActionListener formListener) {
        this.formListener = formListener;
        activatePanel();
    }

    public ArrayList<String> getExperiencedInAsArray() {
        ArrayList<String> experiencedIn = new ArrayList<>();
        if (experienceInPythonCB.isSelected()) {
            experiencedIn.add("Python");
        }
        if (experienceInJavaCB.isSelected()) {
            experiencedIn.add("Java");
        }
        if (experienceInCSharpCB.isSelected()) {
            experiencedIn.add("C#");
        }
        return experiencedIn;
    }
}
