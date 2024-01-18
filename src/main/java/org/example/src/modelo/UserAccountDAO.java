package org.example.src.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Crud.conector.Conection;
public class UserAccountDAO {

	/**
	 * Inserta un Usuario en la bbdd según unos parametros dados en el login
	 * 
	 * @param animal
	 * @throws SQLException
	 */
	public void insertarUser(UserAccount userAccount) throws SQLException {
		Connection con = Conection.conexion();
		String query = "INSERT INTO useraccount (name, surname, username, password, email, phone, adress) VALUES (?, ?, ?, ?, ?, ?, ?)";
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
	 * @return
	 */
	public boolean validarUser(String username, String password) {
		Connection con = Conection.conexion();
		boolean valido = false;

		String query = "SELECT * FROM USERACCOUNT WHERE USERNAME=? AND PASSWORD=?;";

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

}
