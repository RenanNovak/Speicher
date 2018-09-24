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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
    public void cadastrarlogin (ActionEvent actionEvent) throws SQLException {
        //System.out.println("Dado inserido no banco de dados!");
        Connection conn = ConnectionFactory.getConnection();

        //String ssq = "INSERT INTO user (nameUser, passwordUser, emailUser) " +
                //"VALUES ( \'" +
                //namelogin.getText() + "\', \'" +
               // senhalogin.getText() + "\', \''" +
               // emaillogin.getText() + "\')";

        PreparedStatement stmt = conn.prepareStatement("INSERT INTO user (nameUser, passwordUser, emailUser) " +
                "VALUES ( \'" +
                namelogin.getText() + "\', \'" +
                senhalogin.getText() + "\', \'" +
                emaillogin.getText() + "\')");

        stmt.execute();
        /*PreparedStatement delete = conn.prepareStatement("delete from tarefa");
        delete.execut1e();*/
        //Node b = (Node) actionEvent.getSource();
       // b.getScene().getWindow().hide();


        System.out.println(actionEvent.getSource());
    }



}
