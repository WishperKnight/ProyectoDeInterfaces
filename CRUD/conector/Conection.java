package conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * La clase Conection proporciona m�todos para establecer una conexi�n con la base de datos.
 */
public abstract class Conection {

    /**
     * Establece una conexi�n con la base de datos y devuelve el objeto Connection.
     *
     * @return Objeto Connection que representa la conexi�n a la base de datos.
     */
    public static Connection connection() {
        Connection connect = null;
        try {
            // Configuraci�n de la conexi�n con la base de datos MySQL
            String url = "jdbc:mysql://localhost/Mercadona";
            String user = "root";
            String pass = "3arend1l#1";

            // Establecer la conexi�n
            connect = DriverManager.getConnection(url, user, pass);

            // Mensaje de �xito en la consola
            System.out.println("Se ha establecido la conexi�n");

        } catch (ClassNotFoundException e) {
            // Manejo de excepci�n si no se encuentra el Driver
            System.err.println("No se ha encontrado el Driver");
            e.printStackTrace();
        } catch (SQLException e) {
            // Manejo de excepci�n en caso de error en la conexi�n a la base de datos
            System.err.println("Error en la conexi�n de la BD");
            e.printStackTrace();
        }
        
        // Devolver el objeto Connection (o null si hay un error)
        return connect;
    }
}
