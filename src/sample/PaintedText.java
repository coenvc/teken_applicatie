package sample;

public class PaintedText extends DrawingItem{
    private String content;
    private String fontName;
    private Point anchor;
    private double width;
    private double height;

    public PaintedText(Color color, String content, String fontName, Point anchor, double width, double height) {
        super(color);
        this.content = content;
        this.fontName = fontName;
        this.anchor = anchor;
        this.width = width;
        this.height = height;
    }

    //region Getters and Setters
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
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
        return "PaintedText{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", anchor=" + anchor +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
