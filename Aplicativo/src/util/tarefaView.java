package util;

import javafx.beans.property.SimpleStringProperty;

public class tarefaView {

    private Long id;
    private SimpleStringProperty nometarefa;
    private SimpleStringProperty conteudotarefa;

    public tarefaView(Long id, String nometarefa, String conteudotarefa) {
        this.nometarefa = new SimpleStringProperty(nometarefa);
        this.conteudotarefa = new SimpleStringProperty(conteudotarefa);
        this.id = id;
    }

    public String getNometarefa() {
        return nometarefa.get();
    }

    public String getConteudotarefa() {
        return conteudotarefa.get();
    }

    public Long getId() {
        return id;
    }

}
