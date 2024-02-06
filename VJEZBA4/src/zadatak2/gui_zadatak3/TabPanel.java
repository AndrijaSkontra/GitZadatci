package zadatak2.gui_zadatak3;

import zadatak2.CheckingAccount;
import zadatak2.ForeignCurrencyAccount;

import javax.swing.*;

public class TabPanel extends JTabbedPane {
    public TabPanel() {
        addTab("Checking Account", new AccountPanel(new CheckingAccount()));
        addTab("Foreign Currency Account", new AccountPanel(new ForeignCurrencyAccount()));
    }
}