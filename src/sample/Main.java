package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Start Game");
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Game started......");
            }
        });


        

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene titlePage = new Scene(root, 600, 700);

        primaryStage.setTitle("Greedy Pig!");
        primaryStage.setScene(titlePage);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
