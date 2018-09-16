package dao;
import factory.ConnectionFactory;
import modelo.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;
public class UsuarioDAO {
    private Connection connection;
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
    public UsuarioDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    public void adiciona(Usuario usuario){
        String sql = "INSERT INTO usuario(nome,cpf,email,telefone) VALUES(?,?,?,)";
        try {
            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, usuario.getName());
            p.setString(2, usuario.getEmail());
            p.setString(3, usuario.getPassword());
            p.execute();
            p.close();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }

    }

}