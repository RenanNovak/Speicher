package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

public class AboutController {

    @FXML
    private Button aboutvoltar;


    @FXML
    public void aboutvoltar() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Index.fxml"));
        Main.stage.setScene(new Scene(root, 800, 500));
    }
}
