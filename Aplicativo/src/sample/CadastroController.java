package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CadastroController {

    @FXML
    private TextField namelogin;
    @FXML
    private PasswordField senhalogin;
    @FXML
    private TextField emaillogin;
    @FXML
    private Button limparlogin;
    @FXML
    private Button listarlembretes;

    @FXML
    public void limpar (){

        namelogin.setText("");
        senhalogin.setText("");
        emaillogin.setText("");

    }

    @FXML
    public void voltar() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(".fxml"));
        Main.stage.setScene(new Scene(root, 800, 500));
    }

}
