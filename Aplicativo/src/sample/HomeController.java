package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

public class HomeController {

    @FXML
    private Button homelogin;
    @FXML
    private Button homecadastro;

    @FXML
    public void homecadastro() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Cadastro.fxml"));
        Main.stage.setScene(new Scene(root, 800, 500));
    }
    @FXML
    public void homelogin() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Main.stage.setScene(new Scene(root, 800, 500));
    }
}
