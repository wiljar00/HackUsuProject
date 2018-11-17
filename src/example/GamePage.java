package example;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

import java.util.Random;

public class GamePage {

    private final StackPane rootPane ; // or any other kind of pane, or  Group...

    public GamePage() {

        rootPane = new StackPane();

        Text title = new Text();
        title.setFont(new Font("Arial Rounded MT Bold",65));
        title.setFill(Color.BROWN);
        title.setTextAlignment(TextAlignment.CENTER);
        title.setText("Game Page!");

        final Text totalScore = new Text();
        totalScore.setFont(new Font("Arial Rounded MT Bold",40));
        totalScore.setFill(Color.BLACK);
        totalScore.setTextAlignment(TextAlignment.CENTER);
        totalScore.setText("Total Score: ");


        final Text currentScore = new Text();
        currentScore.setFont(new Font("Arial Rounded MT Bold",30));
        currentScore.setFill(Color.BLACK);
        currentScore.setTextAlignment(TextAlignment.CENTER);
        currentScore.setText("Current Roll: ");

        Button roll = new Button();
        roll.setText("ROLL");
        roll.setTextFill(Color.BROWN);
        roll.setPrefSize(100, 50);
        roll.setOnAction(new EventHandler<ActionEvent>() {

            int total = 0;
            @Override
            public void handle(ActionEvent event) {
                Text score = new Text();
                Random rand = new Random();
                int randNum = rand.nextInt(5 + 1) + 1;
                currentScore.setText("CurrentRoll: "+ randNum);
                totalScore.setText("Total Score: " + total);
                if (randNum == 1) {
                    currentScore.setText("You lose");
                    System.out.println("You lose");
                    total = 0;
                    totalScore.setText("Total Score: " + total);
                    System.out.println("Total: " + total);
                } else {
                    total = total + randNum;
                    totalScore.setText("Total Score: " + total);
                    System.out.println("Total: " + total);
                }
            }
        });

        Button stop = new Button();
        stop.setText("STOP");
        stop.setTextFill(Color.BROWN);
        stop.setPrefSize(100, 50);
        stop.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Stop pressed, go to title");
//                GamePage game = new GamePage();
                rootPane.getScene().setRoot(getRootPane());

            }
        });


        VBox box = new VBox(80);
        box.setAlignment(Pos.CENTER);
        box.getChildren().addAll(title, totalScore, currentScore, roll, stop);

        HBox hbox = new HBox(100);
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll(box);

        rootPane.getChildren().add(hbox);

    }

    private void gameLogic(){

    }

    public Pane getRootPane() {
        return rootPane ;
    }
}
