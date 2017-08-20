package menus;

import constants.GEConstants;

import javax.swing.*;

public class GEMenuColor extends JMenu {

    public GEMenuColor(String label) {
        super(label);

        for(GEConstants.EColorMenuItems btn : GEConstants.EColorMenuItems.values()) {
            JMenuItem menuItem = new JMenuItem(btn.name());
            add(menuItem);
        }
    }
}
