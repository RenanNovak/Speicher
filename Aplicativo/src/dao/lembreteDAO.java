package dao;

import entity.lembrete;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class lembreteDAO {




    //inserir lembrete BD
    public void insert(lembrete lembrete) {
        try {
            // Cria a conexão com o banco de dados
            Connection conn = (new ConnectionFactory()).getConnection();
            PreparedStatement p =
                    conn.prepareStatement("insert into lembrete( namelembrete, datalembrete,textolembrete) values(?,?,?) ");
            p.setString(1, lembrete.getNameLembrete());
            p.setString(2, lembrete.getDatalembrete());
            p.setString(3, lembrete.getTextolembrete());
            p.execute();
            p.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }}

