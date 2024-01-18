package conector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * La clase Conection proporciona métodos para establecer una conexión con la base de datos.
 */
public abstract class Conection {

    /**
     * Establece una conexión con la base de datos y devuelve el objeto Connection.
     *
     * @return Objeto Connection que representa la conexión a la base de datos.
     */
    public static Connection connection() {
        Connection connect = null;
        try {
            // Configuración de la conexión con la base de datos MySQL
            String url = "jdbc:mysql://localhost/Mercadona";
            String user = "root";
            String pass = "3arend1l#1";

            // Establecer la conexión
            connect = DriverManager.getConnection(url, user, pass);

            // Mensaje de éxito en la consola
            System.out.println("Se ha establecido la conexión");

        } catch (ClassNotFoundException e) {
            // Manejo de excepción si no se encuentra el Driver
            System.err.println("No se ha encontrado el Driver");
            e.printStackTrace();
        } catch (SQLException e) {
            // Manejo de excepción en caso de error en la conexión a la base de datos
            System.err.println("Error en la conexión de la BD");
            e.printStackTrace();
        }
        
        // Devolver el objeto Connection (o null si hay un error)
        return connect;
    }
}
