package org.example.src.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.example.src.conector.Conection;
import org.example.src.vista.VistaRegister;
import org.mindrot.jbcrypt.BCrypt;

/**
 * Clase que contiene los métodos necesarios para manejar al usuario en la bbdd
 */
public class UserAccountDAO {
    private VistaRegister register = new VistaRegister();

    /**
     * Inserta un Usuario en la bbdd según unos parámetros dados en el registro
     * 
     * @param userAccount
     * @throws SQLException
     */
    public void insertarUser(UserAccount userAccount) throws SQLException {
        // Obtener la conexión a la base de datos
        try (Connection con = Conection.connection()) {
            // Hasheamos la contraseña antes de almacenarla en la base de datos
            String hashedPassword = hashPassword(userAccount.getPassword());

            // Definir la consulta SQL parametrizada
            String query = "INSERT INTO Usuario (nombre, apellidos, nombre_usuario, contrasena, correo, telefono, direccion_envio) VALUES (?, ?, ?, ?, ?, ?, ?)";
            
            // Preparar la declaración SQL para evitar inyección de SQL
            try (PreparedStatement statement = con.prepareStatement(query)) {
                // Asignar valores a los parámetros de la consulta
                statement.setString(1, userAccount.getName());
                statement.setString(2, userAccount.getSurname());
                statement.setString(3, userAccount.getUsername());
                statement.setString(4, hashedPassword);
                statement.setString(5, userAccount.getEmail());
                statement.setString(6, userAccount.getPhoneNumber());
                statement.setString(7, userAccount.getAdress());
                
                // Ejecutar la inserción
                statement.executeUpdate();
            }
        }
    }

    /**
     * Método para validar el login de usuario
     * 
     * @param username nombre de cuenta proporcionado por el usuario
     * @param password contraseña proporcionada por el usuario
     * @return true si se ha realizado, false si ha fallado
     */
    public boolean validarUser(String username, String password) {
        Connection con = Conection.connection();
        boolean valido = false;

        String query = "SELECT * FROM Usuario WHERE nombre_usuario=?;";

        try (PreparedStatement statement = con.prepareStatement(query)) {
            statement.setString(1, username);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    // Comparamos la contraseña ingresada con la almacenada en la base de datos
                    String hashedPassword = resultSet.getString("contrasena");
                    valido = BCrypt.checkpw(password, hashedPassword);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejar la excepción adecuadamente
        } finally {
            // Cerrar la conexión aquí si es necesario
        }

        return valido;
    }

    /**
     * Método que comprueba si ya existe un usuario con ese nombre en la bbdd
     * 
     * @param userName
     * @return true si ya existe, false si no existe
     */
    public boolean comprobarUser(String userName) {
        boolean exist = false;
        Connection con = null;

        try {
            con = Conection.connection();
            String query = "SELECT * FROM Usuario WHERE nombre_usuario=?;";

            try (PreparedStatement statement = con.prepareStatement(query)) {
                statement.setString(1, userName);

                try (ResultSet resultSet = statement.executeQuery()) {
                    exist = resultSet.next(); // Establecer exist como true si se encontró alguna fila
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejar la excepción adecuadamente
        } finally {
            // Cerrar la conexión aquí si es necesario
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace(); // Manejar la excepción adecuadamente
            }
        }

        return exist;
    }

    /**
     * Método para cifrar la contraseña utilizando BCrypt
     * 
     * @param password Contraseña a cifrar
     * @return Contraseña cifrada
     */
    private String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
}
