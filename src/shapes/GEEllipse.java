package shapes;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class GEEllipse extends GEShape{

  private Point startP;
  private Ellipse2D ellipse;
  /*
    Ellipse2D class is a abstract class, so we should use
    Ellipse2D.Double or Ellipse2D.Float if we want to make it instance.
    And Ellipse2D class is expressed a ellipse which is inscribed in a rectangle.
  */
  public GEEllipse() {
//    ellipse = new Ellipse2D.Double();
    super(new Ellipse2D.Double());
  }

  public void initDraw(Point startP) {
    this.startP = startP;
  }

  public void setCoordinate(Point currentP) {
//    ellipse.setFrame(startP.x, startP.y,
//            currentP.x - startP.x, currentP.y - startP.y);
    Ellipse2D tempEllipse = (Ellipse2D)myShape;
    tempEllipse.setFrameFromDiagonal(startP.x, startP.y, currentP.x, currentP.y);
  }

  public Ellipse2D getEllipse() {
    return ellipse;
  }
}
