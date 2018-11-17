package example;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class TitlePage  {
    public VBox sceneView1(Label label, Button button) {

        // Layout 1 - children are laid out in vertical column
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label, button);

        return layout1;
    }


}