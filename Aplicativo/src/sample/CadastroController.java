package sample;

import dao.ConnectionFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import java.io.IOException;

import static com.sun.tools.doclint.Entity.and;

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
    private Button cadastrarlogin;

    @FXML
    public void limpar (){

        namelogin.setText("");
        senhalogin.setText("");
        emaillogin.setText("");

    }

    @FXML
    public void voltar() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Main.stage.setScene(new Scene(root, 800, 500));
    }

    @FXML
    public void cadastrarlogin (ActionEvent actionEvent) throws SQLException, IOException {
        //if () {
            //JOptionPane.showMessageDialog(null, "Informaçoes incorretas, náo deixe nenhum campo em branco");
        //}
       // else {
            Connection conn = ConnectionFactory.getConnection();


            PreparedStatement stmt = conn.prepareStatement("INSERT INTO user (nameUser, passwordUser, emailUser) " +
                    "VALUES ( \'" +
                    namelogin.getText() + "\', \'" +
                    senhalogin.getText() + "\', \'" +
                    emaillogin.getText() + "\')");

            stmt.execute();
            namelogin.setText("");
            senhalogin.setText("");
            emaillogin.setText("");

            JOptionPane.showMessageDialog(null, "Cadastro foi efetuado com sucesso");

            Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
            Main.stage.setScene(new Scene(root, 800, 500));


            System.out.println(actionEvent.getSource());

        //}
    }



}
