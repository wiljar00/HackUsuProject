package example;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Main extends Application {

    private BorderPane rootPane;


    @Override
    public void start(final Stage primaryStage) {

        Button btn = new Button();
        btn.setText("Start Game!");
        btn.setTextFill(Color.BROWN);
        btn.setPrefSize(200, 50);
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Game started......");
                GamePage game = new GamePage();
                primaryStage.getScene().setRoot(game.getRootPane());

            }
        });

        Text title = new Text();
        title.setFont(new Font("Arial Rounded MT Bold",65));
        title.setFill(Color.BROWN);
        title.setTextAlignment(TextAlignment.CENTER);
        title.setText("GREEDY PIG!");

        Image pig = new Image("example/css/pig-transparent-toon.png");

        ImageView iv2 = new ImageView();
        iv2.setImage(pig);
        iv2.setFitWidth(300);
        iv2.setPreserveRatio(true);
        iv2.setSmooth(true);
        iv2.setCache(true);

        VBox box = new VBox(80);
        box.setAlignment(Pos.CENTER);
        box.getChildren().addAll(title, iv2, btn);

        HBox hbox = new HBox(100);
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll(box);

        StackPane root = new StackPane();
        root.getChildren().add(hbox);

        Scene mainScene = new Scene(root, 556, 720);
        mainScene.getStylesheets().add("example/css/stylesheet.css");

        primaryStage.setTitle("Greedy Pig!");
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
