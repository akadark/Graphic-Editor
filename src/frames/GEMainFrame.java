package frames;

import constants.GEConstants;

import javax.swing.*;

import menus.GEMenuBar;

import java.awt.*;

public class GEMainFrame extends JFrame{

    private GEMenuBar menuBar;
    private GEToolBar toolBar;

    // Singleton Pattern: make constructor with private and
    // make a unique instance of it in the MainFrame.
    // After that, use this unique instance in other class with using getter.
    private static GEMainFrame uniqueMainFrame =
            new GEMainFrame(GEConstants.TITLE_MAINFRAME);

    private GEMainFrame(String title) {
        super(title); // set name of title bar

        menuBar = new GEMenuBar();
        this.setJMenuBar(menuBar);

        toolBar = new GEToolBar(GEConstants.TITLE_TOOLBAR);
        this.add(BorderLayout.NORTH, toolBar);
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
