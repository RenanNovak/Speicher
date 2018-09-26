package util;

import entity.tarefas;

import java.util.ArrayList;
import java.util.List;

public class tarefaAdapter {

    public tarefaView adpaptarParaView(tarefas t) {
        return new tarefaView(t.getNametarefa(), t.getTextotarefa());
    }

    public List<tarefaView> adaptarTodosParaView(List<tarefas> tarefasList) {
        List<tarefaView> lista = new ArrayList<tarefaView>();
        for (tarefas t : tarefasList) {
            lista.add(new tarefaView(t.getNametarefa(), t.getTextotarefa()));
        }
        return lista;
    }

}
