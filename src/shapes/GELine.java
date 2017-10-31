package shapes;

import java.awt.*;
import java.awt.geom.Line2D;

public class GELine extends GEShape{

  private Point startP;
  private Line2D line;
  /*
    line2D class is a abstract class, so you need to use
    Line2D.Double, Line2D.Float if you want to make it instance.
   */
  public GELine() {
//    line = new Line2D.Double();
    super(new Line2D.Double());
  }

  public void initDraw(Point startP) {
    this.startP = startP;
  }

  public void setCoordinate(Point currentP) {
//    line.setLine(startP.x, startP.y, currentP.x, currentP.y);
    Line2D tempLine = (Line2D)myShape;
    tempLine.setLine(startP.x, startP.y, currentP.x, currentP.y);
  }

  public Line2D getLine() {
    return line;
  }
}
