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
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
public class Course_category_bds0042 extends Application {
@Override
public void start(Stage primaryStage) {
TextField t1 = new TextField("ENTER COURSE NAME");
TextField t2 = new TextField();
String[] courses = {"JAVA","OOPS","CHEMISTRY","ALGEBRA"};
t1.setOnAction((ActionEvent event) -> {
if(t1.getText().equals(courses[0]))
{
t2.setText("PC");
}
else if(t1.getText().equals(courses[1]))
{
t2.setText("UC");
}
else if(t1.getText().equals(courses[2]))
{
t2.setText("PE");
}
else if(t1.getText().equals(courses[3]))
{
t2.setText("UE");
}
else{ t2.setText("INVALID COURSE");
}
});
FlowPane root = new FlowPane();
root.getChildren().add(t1);
root.getChildren().add(t2);
Scene scene = new Scene(root, 400,400 );
primaryStage.setTitle("COURSE CATEGORY");
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args)
{
launch(args);
}
}