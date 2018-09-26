package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import entity.User;

public class UserDAO {

    // Insere um Usuário BD
    public void insert(User user) {
        try {
            // Cria a conexão com o banco de dados
            Connection conn = (new ConnectionFactory()).getConnection();
            PreparedStatement p =
                    conn.prepareStatement("insert into user(nameuser,passworduser,emailuser) values(?, ?,?) ");
            p.setString(1, user.getNameuser());
            p.setString(2, user.getPassworduser());
            p.setString(3, user.getEmailuser());
            p.execute();
            p.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean getUserByAuthentication(User user) {
        try {
            // Cria a conexão com o banco de dados
            Connection conn = (new ConnectionFactory()).getConnection();
            PreparedStatement p =
                    conn.prepareStatement("select * from user where (nameuser = ? or emailuser = ?) and  passworduser = ?");
            p.setString(1, user.getNameuser());
            p.setString(2, user.getEmailuser());
            p.setString(3, user.getPassworduser());

            ResultSet rs = p.executeQuery();
            if (rs.next()) {
                return true;
            }
            p.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}

//	// Método para atualizar
//	public class UserDAOUpdate {
//	public void update(User user) {
//		try {
//			// Cria a conexão com o banco de dados
//			Connection conn = (new ConnectionFactory()).getConnection();
//			PreparedStatement p =
//					conn.prepareStatement("update set user(name,password,email) values(?,?,?) ");
//			p.setString(1, user.getName());
//			p.setString(2, user.getPassword());
//			p.setString(3, user.getEmail());
//			p.execute();
//			p.close();
//			conn.close();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//
// Método para excluir um Usuário específico pelo Id
//public void deleteUser() {
//try {
// Cria a conexão com o banco de dados
//Connection conn = (new ConnectionFactory()).getConnection();

//Statement stat = conn.createStatement();
//stat.execute("delete from user(name,password) values(?, ?) ");
//p.setString(1, user.getName());
// p.setString(2, user.getPassword());
// Fecha conexão com o banco de dados
// p.execute();
// p.close();
// conn.close();
//stat.close();
//conn.close();
//}catch(Exception e) {
//e.printStackTrace();
//}
//}

// Exclui todos os registros da Tabela
//	public void deleteAll() {
//		try {
//			// Cria a conexão com o banco de dados
//			Connection conn = (new ConnectionFactory()).getConnection();
//
//			Statement stat = conn.createStatement();
//			stat.execute("delete from user");
//			// Fecha conexão com o banco de dados
//			stat.close();
//			conn.close();
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//}
