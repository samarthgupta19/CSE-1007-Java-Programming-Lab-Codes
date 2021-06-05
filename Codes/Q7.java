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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.event.ActionEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class Q7 extends Application {
@Override
public void start(Stage primaryStage) {
TextField t1 = new TextField("Enter Course-Code");
TextField t2 = new TextField();
String[] courses = {"CSE1002","CSE1003","CSE1007","CSE2003","CSE2004","CSE2005"};
t1.setOnAction(new EventHandler<ActionEvent>()
{
@Override public void handle(ActionEvent event)
{
if(t1.getText().equals(courses[0]))
{
t2.setText("OOPS");
}
else if(t1.getText().equals(courses[1]))
{
t2.setText("DLD");
}
else if(t1.getText().equals(courses[2]))
{
t2.setText("JAVA");
}
else if(t1.getText().equals(courses[3]))
{
t2.setText("DSA");
}
else if(t1.getText().equals(courses[4]))
{
t2.setText("DBMS");
}
else if(t1.getText().equals(courses[5]))
{
t2.setText("OS");
}
else{ t2.setText("Invalid");
}
}
});
FlowPane root = new FlowPane();
root.getChildren().add(t1);
root.getChildren().add(t2);
Scene scene = new Scene(root, 400,400 );
primaryStage.setTitle("COURSE CODES");
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args)
{
launch(args);
}
}