package com.example.demoimages;

import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {


    public ImageView imageView;
    public Image image;
    public AnchorPane rootPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        image = new Image("testCard.png");
        imageView = new ImageView(image);
        imageView.fitHeightProperty().bind(rootPane.heightProperty());
        imageView.fitWidthProperty().bind(rootPane.widthProperty());
        imageView.preserveRatioProperty();

       /* rootPane.setMaxSize(800, 800);
        rootPane.setMinSize(400, 400);
*/
        rootPane.setMaxHeight(1000);
        rootPane.setMaxWidth(1000);


        rootPane.setMinWidth(200);
        rootPane.setMinHeight(200);

        rootPane.getChildren().add(imageView);
    }


}