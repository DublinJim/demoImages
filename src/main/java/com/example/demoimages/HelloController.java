package com.example.demoimages;

import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    private ComboBox<String> comboBox = new ComboBox<>();
    private final String clickSound = "src/main/resources/FreeOfficeSFX_MouseSingleClick.wav";
    public ImageView imageView;
    public Image image;
    public AnchorPane rootPane;
    public GetAllFonts getAllFonts = new GetAllFonts();
    private String imageName;

    private static void playClick(String soundFile) {
        Media soundClick = new Media(new File(soundFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(soundClick);
        mediaPlayer.play();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        imageName = "testCard.png";
        image = new Image(imageName);
        imageView = new ImageView(image);
        imageView.fitHeightProperty().bind(rootPane.heightProperty());
        imageView.fitWidthProperty().bind(rootPane.widthProperty());
        imageView.preserveRatioProperty();
        getAllFonts.getList();

        rootPane.getChildren().add(imageView);
        String imageInView = imageView.getImage().toString();

        Button btn1 = new Button("Boing!");
        Font font = Font.font("Yu Gothic Light", FontWeight.BOLD, 18);
        btn1.setFont(font);
        btn1.setPadding(new Insets(10, 10, 10, 10));


        rootPane.getChildren().add(btn1);


        imageName = "fullbin.jpg";
        Image imageBin = new Image(imageName);

        btn1.setOnAction(actionEvent -> {

            imageView.setImage(imageBin);
            playClick(clickSound);

        });

    }

}



