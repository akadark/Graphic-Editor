package frames;

import constants.GEConstants;
import menus.GEMenuColor;
import shapes.GERectangle;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.MouseEvent;

public class GEDrawingPanel extends JPanel {

    private MouseDrawingHandler drawingHandler;
    private GERectangle rectangle;

    public GEDrawingPanel() {
        super();
        drawingHandler = new MouseDrawingHandler();
        addMouseListener(drawingHandler);
        addMouseMotionListener(drawingHandler);
        this.setForeground(GEConstants.FOREGROUND_COLOR);
        this.setBackground(GEConstants.BACKGROUND_COLOR);
    }

    // save originP with GERectangle class
    private void initDraw(Point originP) {
        rectangle = new GERectangle();
        rectangle.initDraw(originP);
    }

    private void animateDraw(Point currentP) {
        Graphics2D g2D = (Graphics2D)getGraphics();
        g2D.setXORMode(g2D.getBackground());
        g2D.draw(rectangle.getRectangle());
        rectangle.setCoordinate(currentP);
        g2D.draw(rectangle.getRectangle());
    }

    public class MouseDrawingHandler extends MouseInputAdapter {

        // send event coordinate to initDraw()
        public void mousePressed(MouseEvent e) {
            initDraw(e.getPoint());
        }
        // send event coordinate to animateDraw()
        public void mouseDragged(MouseEvent e) {
            animateDraw(e.getPoint());
        }
    }
}
