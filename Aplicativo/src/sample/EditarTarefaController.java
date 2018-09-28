package sample;

import dao.ConnectionFactory;
import dao.tarefasDAO;
import entity.tarefas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.web.HTMLEditor;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class EditarTarefaController {


    private tarefas t;

    @FXML
    private TextField nometarefa;
    @FXML
    private HTMLEditor textotarefa;
    @FXML
    private Button salvartarefaedit;

    public void load(tarefas t) {
        this.t = t;
        nometarefa.setText(t.getNametarefa());
        textotarefa.setHtmlText(t.getTextotarefa());
    }

    @FXML
    public void homeedittarefa() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Main.stage.setScene(new Scene(root, 800, 500));
    }

    @FXML
    public void salvaredit (ActionEvent actionEvent) throws SQLException {

        tarefasDAO dao = new tarefasDAO();
        dao.updateTarefa(t);

        //Connection conn = ConnectionFactory.getConnection();

        //String ssq = "UPDATE tarefa set (nametarefa, textotarefa) " +
         //               "VALUES ( \'" +
         //               nometarefa.getText() + "\', \'" +
        //                textotarefa.getHtmlText() + "\')";

        //PreparedStatement stmt = conn.prepareStatement("UPDATE tarefa set (nametarefa, textotarefa) " +
         //       "VALUES ( \'" +
        //        nometarefa.getText() + "\', \'" +
        //        textotarefa.getHtmlText() + "\')");

        //stmt.execute();
        /*PreparedStatement delete = conn.prepareStatement("delete from tarefa");
        delete.execut1e();*/
        //Node b = (Node) actionEvent.getSource();
        // b.getScene().getWindow().hide();
        //JOptionPane.showMessageDialog(null, "Informaçoes editadas com sucesso");

        //System.out.println(actionEvent.getSource());
    }

}
