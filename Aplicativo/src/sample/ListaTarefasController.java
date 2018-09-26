package sample;

import dao.tarefasDAO;
import entity.tarefas;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import util.tarefaAdapter;
import util.tarefaView;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class ListaTarefasController implements Initializable {

    @FXML
    private TableView listatarefas;
    @FXML
    private Button incluirtarefa ;
    @FXML
    private Button  editartarefa;
    @FXML
    private Button  excluirtarefa;
    @FXML
    private Button  homehome;

    ObservableList<tarefaView> registros;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        TableColumn coluna = (TableColumn) listatarefas.getColumns().get(0);
        coluna.setCellFactory(new PropertyValueFactory<tarefaView, String>("nometarefa"));
        listatarefas.getColumns().get(1);

        tarefasDAO dao = new tarefasDAO();
        List<tarefas> todasTarefas = dao.getTarefas();
        registros = FXCollections.observableList(new tarefaAdapter().adaptarTodosParaView(todasTarefas));
        listatarefas.setItems(registros);
    }

    @FXML
    public void homehome() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("index.fxml"));
        Main.stage.setScene(new Scene(root, 800, 500));
    }

    @FXML
    public void incluirtarefa3() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("IncluirTarefa.fxml"));
        Main.stage.setScene(new Scene(root, 800, 500));
    }

    @FXML
    public void editartarefa() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("EditarTarefa.fxml"));
        Main.stage.setScene(new Scene(root, 800, 500));
    }

}
