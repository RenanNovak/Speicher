package sample;

import dao.ConnectionFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.web.HTMLEditor;
import javafx.scene.control.DatePicker;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IncluirLembreteController {

    @FXML
    private TextField nomelembrete;
    @FXML
    private DatePicker datalembrete;
    @FXML
    private HTMLEditor textolembrete;
    @FXML
    private Button salvarlembrete;

    @FXML
    public void salvarlembrete (ActionEvent actionEvent) throws SQLException {
        //System.out.println("Dado inserido no banco de dados!");
        Connection conn = ConnectionFactory.getConnection();

        //String ssq = "INSERT INTO user (nameUser, passwordUser, emailUser) " +
        //"VALUES ( \'" +
        //namelogin.getText() + "\', \'" +
        // senhalogin.getText() + "\', \''" +
        // emaillogin.getText() + "\')";

        PreparedStatement stmt = conn.prepareStatement("INSERT INTO lembrete (namelembrete, datalembrete, textolembrete) " +
                "VALUES ( \'" +
                nomelembrete.getText() + "\', \'" +
                datalembrete.getCssMetaData() + "\', \'" +
                textolembrete.getHtmlText() + "\')");

        stmt.execute();
        /*PreparedStatement delete = conn.prepareStatement("delete from tarefa");
        delete.execut1e();*/
        //Node b = (Node) actionEvent.getSource();
        // b.getScene().getWindow().hide();


        System.out.println(actionEvent.getSource());
    }

}
