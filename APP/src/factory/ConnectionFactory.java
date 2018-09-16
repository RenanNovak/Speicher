// situa em qual package ou “pacote” está a classe
package factory;
// faz as importações de classes necessárias para o funcionamento do programa
import java.sql.Connection;
// conexão SQL para Java
import java.sql.DriverManager;
// driver de conexão SQL para Java
import java.sql.SQLException;
// classe para tratamento de exceções
public class ConnectionFactory {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/speicher?useTimezone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false","univille","univille");
        }
        catch(SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}
