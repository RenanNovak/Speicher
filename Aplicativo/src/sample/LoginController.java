package sample;


import dao.UserDAO;
import entity.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javax.swing.*;
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

    public static User usuario;

    @FXML
    public void loginvoltar() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Main.stage.setScene(new Scene(root, 800, 500));
    }

    @FXML
    public void setLoginentrar() throws IOException {
        UserDAO dao = new UserDAO();
        User user = new User();
        user.setNameuser(loginemail.getText());
        user.setEmailuser(loginemail.getText());
        user.setPassworduser(loginsenha.getText());
        User authUser = dao.getUserByAuthentication(user);

        if (authUser != null) {
            JOptionPane.showMessageDialog(null, "Informacoes Corretas, Bem Vindo ao Speicher");
            usuario = authUser;
            Parent root = FXMLLoader.load(getClass().getResource("Index.fxml"));
            Main.stage.setScene(new Scene(root, 800, 500));
        } else {

            JOptionPane.showMessageDialog(null, "Informacoes incorretas, tente novamente",
            "Erro",JOptionPane.ERROR_MESSAGE);
            loginemail.setText("");
            loginsenha.setText("");

        }
    }


}
