package constants;

public class GEConstants {

    // private final static -> create this variable only once.
    // private final -> create this variable for every object.

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
}
