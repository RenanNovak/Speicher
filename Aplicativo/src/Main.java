
        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.PreparedStatement;
        import java.sql.ResultSet;
        import java.sql.Statement;
        import dao.lembreteDAO;
        import dao.tarefasDAO;
        import dao.UserDAO;
        import entity.User;
        import entity.tarefas;
        import entity.lembrete;

public class Main {

    public static void main(String[] args) {

        // inserir tabela user
        User user = new User();
        user.setNameuser("Elba");
        user.setPassworduser("Ragnarok");
        user.setEmailuser("Idris@Idris.com.br");

        UserDAO userDAO = new UserDAO();
        //userDAO.deleteAll();
        userDAO.insert(user);
        //userDAO.update(user);




        // inserir tabela tarefas
        tarefas tarefas = new tarefas();
        tarefas.setNametarefa("Elba");
        tarefas.setTextotarefa("Ragnarok");
        tarefasDAO tarefasDAO = new tarefasDAO();
        //userDAO.deleteAll();
        tarefasDAO.insert(tarefas);
        //userDAO.update(user);





        // inserir tabela tarefas
        lembrete lembrete = new lembrete();
        lembrete.setNameLembrete("Elba");
        lembrete.setDatalembrete("2004-07-12");
        lembrete.setTextolembrete("Ragnarok");
        lembreteDAO lembreteDAO = new lembreteDAO();
        //userDAO.deleteAll();
        lembreteDAO.insert(lembrete);
        //userDAO.update(user);



/*
		try {
			Connection conn = DriverManager.getConnection(stringConexao, usuarioBD, senhaBD);
			Statement stat = conn.createStatement();
			stat.execute("delete from user");
			stat.close();

			PreparedStatement p =
					conn.prepareStatement("insert into user(name,password,email) values(?,?, ?) ");
			p.setString(1, "Renan");
			p.setString(2, "1234");
			p.setString(3, " ");

			p.execute();
			p.close();

			Statement query = conn.createStatement();

			ResultSet result = query.executeQuery("select user_id, name, password from user ");
			// Para cada registro do conjunto de resultado
			while(result.next()) {
				// Pega os valores de cada coluna
				long userId = result.getLong(1);
				String name = result.getString(2);
				String password = result.getString(3);
				System.out.println(userId+" "+name+" "+password);
			}
			result.close();
			query.close();

			//Fecha a conexão de bancos de dados
			conn.close();

		}catch (Exception e) {
			e.printStackTrace();
		}
*/

    }

}
