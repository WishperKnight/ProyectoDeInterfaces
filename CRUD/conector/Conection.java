package conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Conection {

	public static void main(String[] args) {
		Connection connect = null;
		try {

		Class.forName("com.mysql.cj.jdbc.Driver");

		String schema = "Mercadona";
		String url = "jdbc:mysql://localhost:3307/" + schema;
		String user = "root";
		String pass = "root";
		connect = DriverManager.getConnection(url, user, pass);

		System.out.println("Se ha establecido la conexion");
		
		} catch (ClassNotFoundException e) {
			System.err.println("No se ha encontrado el Driver"); e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("Error en la conexión de la BD"); e.printStackTrace();
		} 
	}
	
	protected void cerrarConexion(Connection connection) {
		try { if (connection != null) connection.close();
		System.out.println("--- CONEXION CERRADA ---");
	} catch (SQLException e) {
		System.err.println("No se ha podido cerrar la conexion con la BD");
		e.printStackTrace();
	}
	}
}
