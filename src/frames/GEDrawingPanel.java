package frames;

import constants.GEConstants;
import shapes.GEEllipse;
import shapes.GELine;
import shapes.GERectangle;

import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.*;
import java.awt.event.MouseEvent;

public class GEDrawingPanel extends JPanel {

    private MouseDrawingHandler drawingHandler;

    // shapes
    private GERectangle rectangle;
    private GEEllipse ellipse;
    private GELine line;

    private GEConstants.EToolBarButtons selectShape;

    public GEDrawingPanel() {
        super(); // call parents class's constructor
        drawingHandler = new MouseDrawingHandler();

        addMouseListener(drawingHandler);
        addMouseMotionListener(drawingHandler);

        this.setForeground(GEConstants.FOREGROUND_COLOR);
        this.setBackground(GEConstants.BACKGROUND_COLOR);
    }

    // Initialize selected shapes
    public void setRectangle(GERectangle rectangle) {
        this.rectangle = rectangle;
    }
    public void setEllipse(GEEllipse ellipse) {
        this.ellipse = ellipse;
    }
    public void setLine(GELine line) {
        this.line = line;
    }

    public void setSelectShape(GEConstants.EToolBarButtons selectShape) {
        this.selectShape = selectShape;
    }

    // According to the selected shape, set startP with using initDraw(Point startP) in each shapes
    private void initDraw(Point startP) {
        // rectangle = new GERectangle();
        // rectangle.initDraw(startP);
        if(selectShape == GEConstants.EToolBarButtons.Rectangle) {
            rectangle = new GERectangle();
            rectangle.initDraw(startP);
        } else if(selectShape == GEConstants.EToolBarButtons.Ellipse) {
            ellipse = new GEEllipse();
            ellipse.initDraw(startP);
        } else if(selectShape == GEConstants.EToolBarButtons.Line) {
            line = new GELine();
            line.initDraw(startP);
        }
    }

    // drawing a shape with Graphics2D.draw()
    private void animateDraw(Point currentP) {
        Graphics2D g2D = (Graphics2D)getGraphics(); // drawing function
        g2D.setXORMode(g2D.getBackground()); // erasing trace

        // g2D.draw(rectangle.getRectangle()); // drawing first shape of rectangle
        // rectangle.setCoordinate(currentP); // reset coordinates
        // g2D.draw(rectangle.getRectangle()); // redrawing shape of rectangle
        if(selectShape == GEConstants.EToolBarButtons.Rectangle) {
            g2D.draw(rectangle.getRectangle());
            rectangle.setCoordinate(currentP);
            g2D.draw(rectangle.getRectangle());
        } else if(selectShape == GEConstants.EToolBarButtons.Ellipse) {
            g2D.draw(ellipse.getEllipse());
            ellipse.setCoordinate(currentP);
            g2D.draw(ellipse.getEllipse());
        } else if(selectShape == GEConstants.EToolBarButtons.Line) {
            g2D.draw(line.getLine());
            line.setCoordinate(currentP);
            g2D.draw(line.getLine());
        }
    }


    public class MouseDrawingHandler extends MouseInputAdapter {

        // send event's coordinates to initDraw()
        public void mousePressed(MouseEvent e) {
            initDraw(e.getPoint());
        }
        // send event's coordinates to animateDraw()
        public void mouseDragged(MouseEvent e) {
            animateDraw(e.getPoint());
        }
    }
}
