package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application implements EventHandler<ActionEvent>{

    Button btn;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        btn = new Button();
        btn.setText("Start Game");
        btn.setOnAction(this);

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene titlePage = new Scene(root, 600, 400);
        primaryStage.setTitle("Greedy Pig!");
        primaryStage.setScene(titlePage);
        primaryStage.show();
    }
    int total = 0;
    @Override
    public void handle(ActionEvent event){

        if(event.getSource()== btn){
            Random rand = new Random();
            int randNum = rand.nextInt(5 + 1) +1;
            System.out.println("Random Number: " + randNum);
            if(randNum == 1){
                System.out.println("You lose");
                total = 0;
                System.out.println("Total: " + total);
            }else {
                total = total + randNum;
                System.out.println("Total: " + total);
            }
        }

    }

    

}
