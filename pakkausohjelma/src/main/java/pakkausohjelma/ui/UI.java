package pakkausohjelma.ui;

import javafx.application.Application;
import javafx.stage.Stage;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class UI extends Application {

    private static JFileChooser tiedostoValitsija = new JFileChooser();
    private static FileNameExtensionFilter filter = new FileNameExtensionFilter(
            ".JPG & .GIF", "jpg", "gif");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        valitseTiedosto();
    }

    private void valitseTiedosto() {
        tiedostoValitsija.setFileFilter(filter);
        int arvo = tiedostoValitsija.showOpenDialog(null);
        if (arvo == JFileChooser.APPROVE_OPTION) {
            System.out.println(tiedostoValitsija.getSelectedFile().getName());
        }
    }
}