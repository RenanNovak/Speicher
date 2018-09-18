package dao;

import java.sql.Connection;
import java.sql.DriverManager;

// Fábrica de conexão com o Banco de dados
public class ConnectionFactory {

    private static final  String stringConexao = "jdbc:mysql://localhost:3306/speicher?useTimezone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false";
    private static final String usuarioBD = "univille";
    private static final String senhaBD = "univille";

    // Obtêm uma nova Conexão
    public Connection getConnection() {
        try {
            return DriverManager
                    .getConnection(stringConexao
                            , usuarioBD, senhaBD);
        }catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

}
