package sample;

/**
 * Created by coenv on 7-3-2017.
 */
public class Oval extends DrawingItem{
    private Point anchor;
    private double width;
    private double height;
    private double weight;

    public Oval(Color color, Point anchor, double width, double height, double weight) {
        super(color);
        this.anchor = anchor;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }
}
