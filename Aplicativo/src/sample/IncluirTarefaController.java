package sample;

import dao.ConnectionFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.web.HTMLEditor;

import javax.swing.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IncluirTarefaController {


    @FXML
    private TextField nometarefa;
    @FXML
    private HTMLEditor textotarefa;
    @FXML
    private Button salvartarefa;
    @FXML
    private Button listartarefas;
    @FXML
    private Button homehome;

    @FXML
    public void hometarefa() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("index.fxml"));
        Main.stage.setScene(new Scene(root, 800, 500));
    }

    @FXML
    public void setListartarefas() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ListaTarefas.fxml"));
        Main.stage.setScene(new Scene(root, 800, 500));
    }



    @FXML
    public void salvartarefas (ActionEvent actionEvent) throws SQLException {
        //System.out.println("Dado inserido no banco de dados!");
        Connection conn = ConnectionFactory.getConnection();

        //String ssq = "INSERT INTO user (nameUser, passwordUser, emailUser) " +
        //"VALUES ( \'" +
        //namelogin.getText() + "\', \'" +
        // senhalogin.getText() + "\', \''" +
        // emaillogin.getText() + "\')";

        PreparedStatement stmt = conn.prepareStatement("INSERT INTO tarefa (nametarefa, textotarefa) " +
                "VALUES ( \'" +
                nometarefa.getText() + "\', \'" +

                textotarefa.getHtmlText() + "\')");

        stmt.execute();
        /*PreparedStatement delete = conn.prepareStatement("delete from tarefa");
        delete.execut1e();*/
        //Node b = (Node) actionEvent.getSource();
        // b.getScene().getWindow().hide();

        JOptionPane.showMessageDialog(null, "Informacoes salvas com sucesso");
        System.out.println(actionEvent.getSource());
    }

}
