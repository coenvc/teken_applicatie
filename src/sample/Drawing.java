package sample;

import java.util.ArrayList;

/**
 * Created by coenv on 7-3-2017.
 */
public class Drawing {
    private String name;
    private ArrayList<DrawingItem> drawingItems = new ArrayList<>();

    public Drawing(String name, ArrayList<DrawingItem> drawingItems) {
        this.name = name;
        this.drawingItems = drawingItems;
    }

    //region Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<DrawingItem> getDrawingItems() {
        return drawingItems;
    }

    public void setDrawingItems(ArrayList<DrawingItem> drawingItems) {
        this.drawingItems = drawingItems;
    }
    //endregion
}
