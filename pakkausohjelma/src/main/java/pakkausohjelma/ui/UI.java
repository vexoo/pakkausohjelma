package pakkausohjelma.ui;

import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.FileChooser;

public class UI extends Application {

    private static FileChooser tiedostoValitsija = new FileChooser();
    private File tiedosto;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        final Label tiedostoNimi = new Label();
        final Label tiedostoKoko = new Label();
        
        Button tiivistaLZW = new Button("Tiivistä tiedosto");
        tiivistaLZW.setOnAction(e -> {
        });
        tiivistaLZW.setVisible(false);

        Button valitseTiedosto = new Button("Valitse tiivistettävä tiedosto");
        valitseTiedosto.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter(
                        ".JPG & .GIF", "*.jpg", "*.gif");
                tiedostoValitsija.getExtensionFilters().add(filter);

                tiedosto = tiedostoValitsija.showOpenDialog(primaryStage);
                if (tiedosto != null) {
                    tiedostoNimi.setText(tiedosto.getName());
                    long kokoTavuina = tiedosto.length();
                    long kokoKiloTavuina = (kokoTavuina / 1024);
                    tiedostoKoko.setText(String.format("%,d KB", kokoKiloTavuina));
                    tiivistaLZW.setVisible(true);
                }
            }
        });
        
        VBox tiedostoInfo = new VBox(10);
        tiedostoInfo.getChildren().add(tiedostoNimi);
        tiedostoInfo.getChildren().add(tiedostoKoko);
        tiedostoInfo.setAlignment(Pos.BASELINE_CENTER);

        VBox vBox = new VBox(25);
        vBox.getChildren().add(valitseTiedosto);
        vBox.getChildren().add(tiedostoInfo);
        vBox.setAlignment(Pos.BASELINE_CENTER);

        StackPane root = new StackPane();
        root.getChildren().add(vBox);
        root.getChildren().add(tiivistaLZW);
        primaryStage.setScene(new Scene(root, 400, 350));
        primaryStage.show();
    }


}
