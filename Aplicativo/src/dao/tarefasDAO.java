package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import entity.tarefas;

public class tarefasDAO {


    //inserir tarefas BD
    public void insert(tarefas tarefas) {
        try {
            // Cria a conexão com o banco de dados
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
    }}



