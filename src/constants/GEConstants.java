package constants;

import java.awt.*;

/*
final: creating a variable to be never changed like read only.

static: creating not instance variable but class variable only once
which you can use in other class without making object.

static final: creating this variable for every object.
*/

public class GEConstants {

    // GEMainFrame
    public static final int WIDTH_MAINFRAME = 400;
    public static final int HEIGHT_MAINFRAME = 600;
    public static final String TITLE_MAINFRAME = "My Graphic Editor";

    // GEMenu
    public static final String TITLE_FILEMENU = "File";
    public static final String TITLE_EDITMENU = "Edit";
    public static final String TITLE_COLORMENU = "Color";

    // GEMenuItem
    public static enum EEditMenuItems {
        Undo, Redo, Delete, Cut, Copy, Paste, Group, Ungroup
    }
    public static enum EFileMenuItems {
        New, Open, Save, SaveAs, Exit
    }
    public static enum EColorMenuItems {
        SetLineColor, ClearLineColor, SetFillColor, ClearFillColor
    }

    // GEToolBar
    public static String TITLE_TOOLBAR = "shapes tools";
    public static enum EToolBarButtons {
        Select, Rectangle, Line, Ellipse, Polygon
    }
    public static String IMG_URL = "img/";
    public static String TOOLBAR_BTN = ".gif";
    public static String TOOLBAR_BTN_SLT = "SLT.gif";

    // GEDrawingPanel
    public static Color FOREGROUND_COLOR = Color.black;
    public static Color BACKGROUND_COLOR = Color.white;
}
