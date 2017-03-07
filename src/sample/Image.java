package sample;

import java.io.File;

/**
 * Created by coenv on 7-3-2017.
 */
public class Image extends DrawingItem {
    private File file;
    private Point anchor;
    public double width;
    public double height;

    public Image(Color color, File file, Point anchor, double width, double height) {
        super(color);
        this.file = file;
        this.anchor = anchor;
        this.width = width;
        this.height = height;
    }

    //region Getters and Setters
    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setAnchor(Point anchor) {
        this.anchor = anchor;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    //endregion

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

    @Override
    public String toString() {
        return "Image{" +
                "file=" + file +
                ", anchor=" + anchor +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
