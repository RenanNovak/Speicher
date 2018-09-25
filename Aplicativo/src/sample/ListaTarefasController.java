package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javax.swing.text.TabableView;
import java.awt.*;
import java.io.IOException;

public class ListaTarefasController {

    @FXML
    private TabableView listatarefas;
    @FXML
    private Button incluirtarefa ;
    @FXML
    private Button  editartarefa;
    @FXML
    private Button  excluirtarefa;
    @FXML
    private Button  homehome;


    @FXML
    public void homehome() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("index.fxml"));
        Main.stage.setScene(new Scene(root, 800, 500));
    }


}
