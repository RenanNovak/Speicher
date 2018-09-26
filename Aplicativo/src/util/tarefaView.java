package util;

import javafx.beans.property.SimpleStringProperty;

public class tarefaView {

    private SimpleStringProperty nometarefa;
    private SimpleStringProperty conteudotarefa;

    public tarefaView(String nometarefa, String conteudotarefa) {
        this.nometarefa = new SimpleStringProperty(nometarefa);
        this.conteudotarefa = new SimpleStringProperty(conteudotarefa);
    }

    public String getNometarefa() {
        return nometarefa.get();
    }

    public String getConteudotarefa() {
        return conteudotarefa.get();
    }

}
