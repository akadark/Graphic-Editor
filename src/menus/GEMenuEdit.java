package menus;

import constants.GEConstants;

import javax.swing.*;

public class GEMenuEdit extends JMenu {

    public GEMenuEdit(String label) {
        super(label);

        for(GEConstants.EEditMenuItems btn : GEConstants.EEditMenuItems.values()) {
            JMenuItem menuItem = new JMenuItem(btn.name());
            this.add(menuItem);
        }
    }
}
