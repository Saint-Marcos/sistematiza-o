package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/Dianome";
		String usuario = "postgres";
		String senha = "6490";
		try {
			Connection conexao = DriverManager.getConnection(url, usuario, senha);
			if (conexao != null) {
				System.out.println("Conexão bem-sucedida!");
				conexao.close();
			} else {
				System.out.println("Falha na conexão.");
			}
		} catch (SQLException e) {
			System.out.println("Erro na conexão com o banco de dados: " + e.getMessage());
		}
	}
}
