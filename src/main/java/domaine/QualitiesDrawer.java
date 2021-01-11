package domaine;

import org.javatuples.Pair;

import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

public class QualitiesDrawer {

    public QualitiesDrawer(){

    }

    public void draw(Graphics gc, Me me){
        Graphics2D g = (Graphics2D)gc;
        g.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        MyShape test = new MyShape(me.getSelfDescription());
        int i = 0;
        for(Pair position : test.getDescriptionPosition()){
            int x = (int)position.getValue0();
            int y = (int)position.getValue1();
            g.setColor(Color.WHITE);
            g.setFont(new Font("TimesRoman", Font.PLAIN, 13));
            String description = me.getSelfDescription().get(i);
            g.drawString(description, x - 3 * description.length(), y);
            Shape ring = createRingShape(x, y, 80, 20);
            g.setPaint(new GradientPaint(
                    new Point(x-100,x -100), Color.RED,
                    new Point(x+100,x -100 ), Color.GREEN));
            g.fill(ring);
            g.setColor(Color.BLACK);
            g.draw(ring);
            i++;
        }
    }
    private Shape createRingShape(
            double centerX, double centerY, double outerRadius, double thickness)
    {
        Ellipse2D outer = new Ellipse2D.Double(
                centerX - outerRadius,
                centerY - outerRadius,
                outerRadius + outerRadius,
                outerRadius + outerRadius);
        Ellipse2D inner = new Ellipse2D.Double(
                centerX - outerRadius + thickness,
                centerY - outerRadius + thickness,
                outerRadius + outerRadius - thickness - thickness,
                outerRadius + outerRadius - thickness - thickness);
        Area area = new Area(outer);
        area.subtract(new Area(inner));
        return area;
    }
}
