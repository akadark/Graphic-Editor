package menus;

import constants.GEConstants;

import javax.swing.*;

public class GEMenuBar extends JMenuBar {

    private GEMenuFile fileMenu;
    private GEMenuColor colorMenu;
    private GEMenuEdit editMenu;

    public GEMenuBar() {
        fileMenu = new GEMenuFile(GEConstants.TITLE_FILEMENU);
        this.add(fileMenu);
        colorMenu = new GEMenuColor(GEConstants.TITLE_COLORMENU);
        this.add(colorMenu);
        editMenu = new GEMenuEdit(GEConstants.TITLE_EDITMENU);
        this.add(editMenu);
    }

}
