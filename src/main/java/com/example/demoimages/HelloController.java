package com.example.demoimages;

import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    private final String clickSound = "src/main/resources/FreeOfficeSFX_MouseSingleClick.wav";
    public ImageView imageView;
    public Image image;
    public AnchorPane rootPane;
    public GetAllFonts getAllFonts = new GetAllFonts();
    private String imageName;
    private ArrayList<String> allFontsArray = new ArrayList<>();

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
        allFontsArray = getAllFonts.getFontArray();
        ComboBox<String> comboBox = new ComboBox<>();

        comboBox.getItems().addAll(allFontsArray);
        comboBox.setPadding(new Insets(5, 5, 5, 5));
        HBox hBox = new HBox();
        hBox.setPadding(new Insets(10,10,10,10));
        hBox.setSpacing(10);
        hBox.getChildren().add(comboBox);
        rootPane.getChildren().add(imageView);

        String imageInView = imageView.getImage().toString();

        Button btn1 = new Button("Boing!");
        Font font = Font.font("Yu Gothic Light", FontWeight.BOLD, 18);
        btn1.setFont(font);
        btn1.setPadding(new Insets(10, 10, 10, 10));
        hBox.getChildren().add(btn1);
        rootPane.getChildren().add(hBox);



        imageName = "fullbin.jpg";
        Image imageBin = new Image(imageName);

        btn1.setOnAction(actionEvent -> {

            imageView.setImage(imageBin);
            playClick(clickSound);

        });

    }

}



