package view;

import controller.ManageDataBase;
import model.Programmer;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {

    private final ViewPanel viewPanel = new ViewPanel();
    private final FormPanel formPanel = new FormPanel();
    private final ManageDataBase manageDataBase = new ManageDataBase();

    public MainFrame() {
        super("dev app");
        setSize(600, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        layoutPanels();
        activateApp();
    }

    private void activateApp() {
        formPanel.setFormListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean submitPressed = formPanel.getSubmitButton() == e.getSource();
                if (submitPressed) {
                    Programmer programmer = buildAProgrammer();
                    manageDataBase.saveProgrammer(programmer);
                }
            }
        });
    }

    private Programmer buildAProgrammer() {
        String firstName = formPanel.getFirstNameField().getText();
        String lastName = formPanel.getLastNameField().getText();
        String bestLanguage = (String) formPanel.getBestLanguageComboBox().getSelectedItem();
        String workingTime = formPanel.getWorkingTimeGroup().getSelection().getActionCommand();
        Programmer programmer = new Programmer.Builder()
                .withFirstName(firstName)
                .withLastName(lastName)
                .withBestLanguage(bestLanguage)
                .withWorkingTime(workingTime)
                .withExperience(formPanel.getExperiencedInAsArray())
                .build();
        return programmer;
    }

    private void layoutPanels() {
        setLayout(new MigLayout());
        add(viewPanel, "h 300, wrap");
        add(formPanel, "w 600, h 400");
    }
}
