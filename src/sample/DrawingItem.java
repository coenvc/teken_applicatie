package sample;

import java.util.Comparator;

/**
 * Created by coenv on 7-3-2017.
 */
public  class DrawingItem implements Comparator<DrawingItem>{
    private Point anchor;
    private Color color;

    public DrawingItem(Color color) {
        this.color = color;
    }

    public Point getAnchor(){return anchor;}
    public void setAnchor(Point anchor){this.anchor = anchor; };

    //region Getters and Setters
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public int compare(DrawingItem item1, DrawingItem item2) {
        double distance1 = item1.getAnchor().getX() +item1.getAnchor().getY();
        double distance2 = item2.getAnchor().getX() +item2.getAnchor().getY();
        if (distance1 < distance2) {
            return -1;
        }
        if (distance1 > distance2) {
            return 1;
        }
        return 0;
    }
    //endregion
}
