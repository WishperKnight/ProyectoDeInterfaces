package org.example.src.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.example.src.conector.Conection;
import org.example.src.utiles.Utiles;
import org.example.src.vista.VistaRegister;

/**
 * Clase que contiene los metodos necesarios para manejar al usuario en la bbdd
 */
public class UserAccountDAO {
	private VistaRegister register = new VistaRegister();

	/**
	 * Inserta un Usuario en la bbdd según unos parametros dados en el registro
	 * 
	 * @param Useraccount
	 * @throws SQLException
	 */
	public void insertarUser(UserAccount userAccount) throws SQLException {
		Connection con = Conection.connection();

		String query = "INSERT INTO Usuario (id_usuario, nombre, apellidos, nombre_usuario, contrasena, correo, telefono, direccion_envio) VALUES (null, ?, ?, ?, ?, ?, ?, ?)";
		try (PreparedStatement statement = con.prepareStatement(query)) {
			statement.setString(1, userAccount.getName());
			statement.setString(2, userAccount.getSurname());
			statement.setString(3, userAccount.getUsername());
			statement.setString(4, userAccount.getPassword());
			statement.setString(5, userAccount.getEmail());
			statement.setString(6, userAccount.getPhoneNumber());
			statement.setString(7, userAccount.getAdress());
			statement.executeUpdate();
		}

	}

	/**
	 * Metodo para validar el login de usuario
	 * 
	 * @param username nombre de cuenta prorporcionado por el usuario
	 * @param password contrasena prorporcionada por el usuario
	 * @return T si se ha realizado F si ha fallado
	 */
	public boolean validarUser(String username, String password) {
		Connection con = Conection.connection();
		boolean valido = false;

		String query = "SELECT * FROM Usuario WHERE nombre_usuario=? AND contrasena=?;";

		try (PreparedStatement statement = con.prepareStatement(query)) {
			statement.setString(1, username);
			statement.setString(2, password);

			try (ResultSet resultSet = statement.executeQuery()) {
				valido = resultSet.next(); // Establecer valido como true si se encontró alguna fila
			}
		} catch (SQLException e) {
			e.printStackTrace(); // Manejar la excepción adecuadamente
		} finally {
			// Cerrar la conexión aquí si es necesario
		}

		return valido;
	}

	/**
	 * Metodo que comprueba si existe un ya un usuario con ese nombre en la bbdd
	 * 
	 * @param UserName
	 * @return T si ya existe F si no existe
	 */
	public boolean comprobarUser(String UserName) {
		boolean exist = false;
		Connection con = Conection.connection();
		String query = "SELECT * FROM Usuario WHERE nombre_usuario=?;";
		try (PreparedStatement statement = con.prepareStatement(query)) {
			statement.setString(1, userName);
			try (ResultSet resultSet = statement.executeQuery()) {
				exist = resultSet.next(); // Establecer valido como true si se encontró alguna fila
			} catch (SQLException e) {
				e.printStackTrace(); // Manejar la excepción adecuadamente
			} finally {
				// Cerrar la conexión aquí si es necesario
				con.close();

			}
			return exist;
		}
	}
}
