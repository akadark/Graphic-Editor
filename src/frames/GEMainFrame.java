package frames;

import constants.GEConstants;

import javax.swing.*;

import constants.GEConstants.*;

public class GEMainFrame extends JFrame{

    private GEDrawingPanel drawingPanel;
    private static GEMainFrame uniqueMainFrame =
            new GEMainFrame(GEConstants.TITLE_MAINFRAME);

    // Singleton Pattern: make constructor with private,
    // make itself in MainFrame and use this in other files with using getter
    private GEMainFrame(String title) {
        super(title); // set name of title bar
        drawingPanel = new GEDrawingPanel();
        add(drawingPanel);
    }

    // getter
    public static GEMainFrame getInstance() {
        return uniqueMainFrame;
    }

    public void init() {
        // JFrame default setting
        this.setSize(GEConstants.WIDTH_MAINFRAME, GEConstants.HEIGHT_MAINFRAME);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // active 'X' button and real exit on the memory
    }
}
