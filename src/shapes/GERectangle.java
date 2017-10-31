package shapes;

import java.awt.*;
import java.awt.Rectangle;

public class GERectangle extends GEShape{

    private Rectangle rectangle;
    private Point startP;

    public GERectangle() {
//        rectangle = new Rectangle();
        super(new Rectangle());
    }

    public void initDraw(Point startP) {
        this.startP = startP;
    }

    public void setCoordinate(Point currentP) {
//        rectangle.setFrame(startP.x, startP.y,
//                currentP.x - startP.x, currentP.y - startP.y);
        Rectangle tempRectangle = (Rectangle)myShape;
        tempRectangle.setFrameFromDiagonal(startP.x, startP.y, currentP.x, currentP.y);
    }

    public Rectangle getRectangle() {
        return rectangle;
    }
}
