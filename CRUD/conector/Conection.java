package conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Conection {

	public static Connection connection() {
		Connection connect = null;
		try {

			String url = "jdbc:mysql://localhost/Mercadona";
			String user = "root";
			String pass = "3arend1l#1";
			connect = DriverManager.getConnection(url, user, pass);

			System.out.println("Se ha establecido la conexion");

		} catch (ClassNotFoundException e) {
			System.err.println("No se ha encontrado el Driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("Error en la conexión de la BD");
			e.printStackTrace();
		}
	}

}
