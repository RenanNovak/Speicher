package sample;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {

    @FXML
   private TextField loginemail;
    @FXML
   private PasswordField loginsenha;
    @FXML
   private Button loginentrar;
    @FXML
   private Button loginvoltar;

    @FXML
    public void loginvoltar() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Main.stage.setScene(new Scene(root, 800, 500));
    }

    @FXML
    public void setLoginentrar() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Index.fxml"));
        Main.stage.setScene(new Scene(root, 800, 500));
    }


}
