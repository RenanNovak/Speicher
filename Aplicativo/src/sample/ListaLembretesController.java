package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javax.swing.text.TabableView;
import java.io.IOException;

public class ListaLembretesController {

    @FXML
    private TabableView tablelembretes;
    @FXML
    private Button incluilembrete;
    @FXML
    private Button editalembrete;
    @FXML
    private Button excluilembrete;
    @FXML
    private Button homehome;


    @FXML
    public void homehome() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("index.fxml"));
        Main.stage.setScene(new Scene(root, 800, 500));
    }


}
