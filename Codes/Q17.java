// Rename the filename.java to be same as public class name.

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samarth Gupta
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class Da2_19BDS0042 extends Application {
@Override
public void start(Stage stage) {
//Creating a menu
Menu fileMenu = new Menu("SHAPE");
//Creating menu Items
MenuItem item1 = new MenuItem("CIRCLE");
item1.setOnAction(e -> {
System.out.println("Area Of Circle = Pi * Radius * Radius"); });
MenuItem item2 = new MenuItem("RECTANGLE");
item2.setOnAction(e ->
{
System.out.println("Area Of Rectangle = Length * Breadth");
});
MenuItem item3 = new MenuItem("SQUARE");
item3.setOnAction(e ->
{
System.out.println("Area Of Square = Length * Length ");
});
MenuItem item4 = new MenuItem("DIAMOND");
item4.setOnAction(e ->
{
System.out.println("Area Of Diamond = Base * Height");
});
//Adding all the menu items to the menu
fileMenu.getItems().addAll(item1, item2, item3, item4);
//Creating a menu bar and adding menu to it.
MenuBar menuBar = new MenuBar(fileMenu);
menuBar.setTranslateX(200);
menuBar.setTranslateY(20);
//Setting the stage
Group root = new Group(menuBar);
Scene scene = new Scene(root, 595, 200, Color.BEIGE);
stage.setTitle("Menu Example");
stage.setScene(scene);
stage.show();
}
public static void main(String args[]){
launch(args);
}
}