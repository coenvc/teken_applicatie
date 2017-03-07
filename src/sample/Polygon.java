package sample;

import java.util.Arrays;

public class Polygon extends DrawingItem {
    private Point[] vertices;
    private double weight;

    public Polygon(Color color, Point[] vertices, double weight) {
        super(color);
        this.vertices = vertices;
        this.weight = weight;
    }

    @Override
    public Point getAnchor() {
        return null;
    }


    public double getWidth() {
        return 0;
    }


    public double getHeight() {
        return 0;
    }

    //region Getters and setters
    public Point[] getVertices() {
        return vertices;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    //endregion


    @Override
    public String toString() {
        return "Polygon{" +
                "vertices=" + Arrays.toString(vertices) +
                ", weight=" + weight +
                '}';
    }
}

