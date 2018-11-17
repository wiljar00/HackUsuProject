package example;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

import java.util.Random;

public class HighScores {

    private final StackPane totalScorePane; // or any other kind of pane, or  Group...

    public HighScores() {

        totalScorePane = new StackPane();

        final Image dice = new Image("example/css/dice.jpg");

        final ImageView iv1 = new ImageView();
        iv1.setImage(dice);
        iv1.setFitWidth(100);
        iv1.setPreserveRatio(true);
        iv1.setSmooth(true);
        iv1.setCache(true);


        Image pig = new Image("example/css/pig-transparent-toon.png");

        ImageView iv2 = new ImageView();
        iv2.setImage(pig);
        iv2.setFitWidth(100);
        iv2.setPreserveRatio(true);
        iv2.setSmooth(true);
        iv2.setCache(true);

        Text title = new Text();
        title.setFont(new Font("Arial Rounded MT Bold",30));
        title.setFill(Color.BLACK);
        title.setTextAlignment(TextAlignment.CENTER);
        title.setText("High Scores: ");

        final Text name = new Text();
        name.setFont(new Font("Arial Rounded MT Bold",15));
        name.setFill(Color.BLACK);
        name.setTextAlignment(TextAlignment.CENTER);
        name.setText("Names: ");


        final Text score = new Text();
        score.setFont(new Font("Arial Rounded MT Bold",15));
        score.setFill(Color.BLACK);
        score.setTextAlignment(TextAlignment.CENTER);
        score.setText("Scores: ");


        VBox box = new VBox(80);
        box.setAlignment(Pos.CENTER);
        box.setMinWidth(300);
        box.setMaxHeight(650);
        box.setOpacity(20);
        box.getChildren().addAll(title, name, score);
        box.setBackground(new Background(new BackgroundFill(Color.LIGHTBLUE, CornerRadii.EMPTY, Insets.EMPTY)));

        HBox hbox = new HBox(20);
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll(iv1, box, iv2);

        totalScorePane.getChildren().add(hbox);

    }
    public Pane getRootPane() {
        return totalScorePane ;
    }


}
