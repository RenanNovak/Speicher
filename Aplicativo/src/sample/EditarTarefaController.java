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

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EditarTarefaController {


    @FXML
    private TextField nometarefa;
    @FXML
    private HTMLEditor textotarefa;
    @FXML
    private Button salvartarefaedit;



    @FXML
    public void homeedittarefa() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        Main.stage.setScene(new Scene(root, 800, 500));
    }

    @FXML
    public void salvaredit (ActionEvent actionEvent) throws SQLException {

        Connection conn = ConnectionFactory.getConnection();

        String ssq = "UPDATE tarefa set (nametarefa, textotarefa) " +
                        "VALUES ( \'" +
                        nometarefa.getText() + "\', \'" +
                        textotarefa.getHtmlText() + "\')";

        PreparedStatement stmt = conn.prepareStatement("UPDATE tarefa set (nametarefa, textotarefa) " +
                "VALUES ( \'" +
                nometarefa.getText() + "\', \'" +
                textotarefa.getHtmlText() + "\')");

        stmt.execute();
        /*PreparedStatement delete = conn.prepareStatement("delete from tarefa");
        delete.execut1e();*/
        //Node b = (Node) actionEvent.getSource();
        // b.getScene().getWindow().hide();


        System.out.println(actionEvent.getSource());
    }
}
