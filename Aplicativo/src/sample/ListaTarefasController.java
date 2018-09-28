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

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        tarefasDAO dao = new tarefasDAO();
        final ObservableList<tarefaView> listaTarefas = FXCollections
                .observableList(
                        tarefaAdapter.adaptarTodosParaView(dao.getTarefas()
                        )
                );

        TableColumn colunaNome = (TableColumn) listatarefas.getColumns().get(0);
        TableColumn colunaDesc = (TableColumn) listatarefas.getColumns().get(1);
        colunaNome.setCellValueFactory(new PropertyValueFactory<tarefaView, String>("nometarefa"));
        colunaDesc.setCellValueFactory(new PropertyValueFactory<tarefaView, String>("conteudotarefa"));

        listatarefas.setItems(listaTarefas);
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
        FXMLLoader loader = new FXMLLoader(getClass().getResource("EditarTarefa.fxml"));
        Parent root = loader.load();
        EditarTarefaController editar = loader.getController();
        tarefaView tView = (tarefaView) listatarefas.getSelectionModel().getSelectedItem();
        Main.stage.setScene(new Scene(root, 800, 500));
        editar.load(tarefaAdapter.adaptarViewParaTarefa(tView));
    }

    @FXML
    public void deletartarefa() throws IOException {

        tarefaView tView = (tarefaView) listatarefas.getSelectionModel().getSelectedItem();
        tarefasDAO dao = new tarefasDAO();
        dao.delete(tView.getId());
        reload();
    }

    public void reload() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ListaTarefas.fxml"));
        Main.stage.setScene(new Scene(root, 800, 500));
    }

}
