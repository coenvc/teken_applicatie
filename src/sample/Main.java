package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
//        launch(args);
//        Drawing drawing = new Drawing("My new Drawing",)Drawing
        ArrayList<DrawingItem> drawingItems = new ArrayList<>();
        Oval oval = new Oval(Color.BLACK,new Point(),1.25,2.6,11);
        drawingItems.add(oval);
        ArrayList<Point> points = new ArrayList<>();
        points.add(new Point());
        points.add(new Point());
        Point[] points1 =  points.toArray(new Point[points.size()]);
        Polygon polygon = new Polygon(Color.GREEN,points1,10);
        PaintedText paintedText = new PaintedText(Color.RED,"This is some sample techt","Arial",new Point(),10.6,10.5);
        drawingItems.add(paintedText);
        Image img = new Image(Color.BLUE,new File("D:\\Downloads\\test.txt"),new Point(),8.3,4.2);
        drawingItems.add(img);
        drawingItems.add(polygon);
        for (DrawingItem drawingItem:drawingItems) {
            System.out.println(drawingItem.toString());
        }
    }
}
