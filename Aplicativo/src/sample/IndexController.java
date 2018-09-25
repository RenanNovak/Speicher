package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

public class IndexController {

    @FXML
    private Button indextarefas;
    @FXML
    private Button indexlembretes;
    @FXML
    private Button indexsobre;
    @FXML
    private Button sairindex;
    @FXML
    public void indextarefas() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ListaTarefas.fxml"));
        Main.stage.setScene(new Scene(root, 800, 500));
    }

    @FXML
    public void indexlembretes() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ListaLembretes.fxml"));
        Main.stage.setScene(new Scene(root, 800, 500));
    }


    @FXML
    public void sobre() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("about.fxml"));
        Main.stage.setScene(new Scene(root, 800, 500));
    }

    @FXML
    public void sairindex() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Main.stage.setScene(new Scene(root, 800, 500));
    }
}
