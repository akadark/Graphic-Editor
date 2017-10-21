package frames;

import constants.GEConstants;

import javax.swing.*;

import menus.GEMenuBar;

import java.awt.*;

public class GEMainFrame extends JFrame{
    /*
    Singleton Pattern: make constructor with private and
    make a unique instance of it in the MainFrame.
    After that, use this unique instance in other class with using getter.
    This pattern is like static variable but static variable can waste memory than singleton.
    */
    // Because it is static, It will take memory right after this program start.
    private static GEMainFrame uniqueMainFrame =
            new GEMainFrame(GEConstants.TITLE_MAINFRAME);

    private GEDrawingPanel drawingPanel;
    private GEMenuBar menuBar;
    private GEToolBar toolBar;

    private GEMainFrame(String title) {
        super(title); // set name of title bar

        drawingPanel = new GEDrawingPanel();
        this.add(drawingPanel);

        menuBar = new GEMenuBar();
        this.setJMenuBar(menuBar);

        toolBar = new GEToolBar(GEConstants.TITLE_TOOLBAR);
        this.add(BorderLayout.NORTH, toolBar);
    }

    // getter
    public static GEMainFrame getInstance() {     // Other class can use it without creating object if you make it static.
        return uniqueMainFrame;
    }

    // default setting about size, close option, etc
    public void init() {
        this.setSize(GEConstants.WIDTH_MAINFRAME, GEConstants.HEIGHT_MAINFRAME);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // active 'X' button and real exit on the memory

        toolBar.init(drawingPanel); // give drawingPanel instance to GEToolbar
    }

}
