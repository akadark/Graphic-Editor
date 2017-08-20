package menus;

import constants.GEConstants;

import javax.swing.*;

public class GEMenuFile extends JMenu{

    public GEMenuFile(String label) {
        super(label);

        for(GEConstants.EFileMenuItems btn : GEConstants.EFileMenuItems.values()) {
            //System.out.println(btn.name());
            JMenuItem menuItem = new JMenuItem(btn.name()); // btn.name() == btn.toString()
            this.add(menuItem);
        }
    }
}
