package sample;

import java.io.File;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
public class JavaFX_Media Example extends Application{

    void start(Stage primaryStage) throws Exception {

        String path = "\u202AD:\\DOWNLOAD HERE\\1- Introduction.mp4";

        Media media = new Media(new File(path).toURI().toString());

        MediaPlayer mediaPlayer = new MediaPlayer(media);

        MediaView mediaView = new MediaView(mediaPlayer);

        mediaPlayer.setAutoPlay(true);

        Group root = new Group();
        root.getChildren().add(mediaView);
        Scene scene = new Scene(root,500,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Playing video");
        primaryStage.show();
    }
    void main(String[] args) {
        launch(args);
    }

    private void launch(String[] args) {
    }

}