package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import entity.tarefas;

public class tarefasDAO {



    public void insert(tarefas tarefas) {
        try {
            Connection conn = (new ConnectionFactory()).getConnection();
            PreparedStatement p =
                    conn.prepareStatement("insert into tarefa( nametarefa,textotarefa) values(?, ?) ");
            p.setString(1, tarefas.getNametarefa());
            p.setString(2, tarefas.getTextotarefa());
            p.execute();
            p.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(Long id) {
        try {
            Connection conn = (new ConnectionFactory()).getConnection();
            PreparedStatement p = conn.prepareStatement("delete from tarefa where idtarefa=?");
            p.setLong(1, id);
            p.execute();
            p.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateTarefa(tarefas t) {
        try {
            Connection conn = (new ConnectionFactory()).getConnection();
            PreparedStatement p = conn.prepareStatement("update tarefa set nametarefa=?, textotarefa=? where idtarefa=?");
            p.setString(1, t.getNametarefa());
            p.setString(2, t.getTextotarefa());
            p.setLong(3, t.getIdtarefa());
            p.execute();
            p.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<tarefas> getTarefas() {
        Connection conn = (new ConnectionFactory()).getConnection();
        List<tarefas> todasTarefas = null;
        try {
            PreparedStatement p = conn.prepareStatement("SELECT * FROM TAREFA");
            ResultSet rs = p.executeQuery();
            todasTarefas = new ArrayList<>();
            while (rs.next()) {
                tarefas t = new tarefas();
                t.setIdtarefa(rs.getInt("idtarefa"));
                t.setNametarefa(rs.getString("nametarefa"));
                t.setTextotarefa(rs.getString("textotarefa"));
                todasTarefas.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return todasTarefas;
    }

}



