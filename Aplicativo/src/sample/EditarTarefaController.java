package sample;

import dao.tarefasDAO;
import entity.tarefas;
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
import java.sql.SQLException;


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
    public void salvaredit (ActionEvent actionEvent) throws SQLException, IOException {

        tarefasDAO dao = new tarefasDAO();
        dao.updateTarefa(t);
        JOptionPane.showMessageDialog(null, "Informacoes editadas com sucesso");
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("ListaTarefas.fxml"));
        Main.stage.setScene(new Scene(root, 800.0D, 500.0D));


    }

}
