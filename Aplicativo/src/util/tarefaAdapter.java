package util;

import entity.tarefas;

import java.util.ArrayList;
import java.util.List;

public class tarefaAdapter {

    public static tarefaView adpaptarParaView(tarefas t) {
        return new tarefaView(t.getIdtarefa(), t.getNametarefa(), t.getTextotarefa());
    }

    public static tarefas adaptarViewParaTarefa(tarefaView tv) {
        tarefas t = new tarefas();
        t.setIdtarefa(tv.getId());
        t.setNametarefa(tv.getNometarefa());
        t.setTextotarefa(tv.getConteudotarefa());
        return t;
    }

    public static List<tarefaView> adaptarTodosParaView(List<tarefas> tarefasList) {
        List<tarefaView> lista = new ArrayList<tarefaView>();
        for (tarefas t : tarefasList) {
            lista.add(new tarefaView(t.getIdtarefa(), t.getNametarefa(), t.getTextotarefa()));
        }
        return lista;
    }

}
