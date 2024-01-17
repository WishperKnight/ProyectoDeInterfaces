package org.example.src.modelo;

public class UserAccount {
	// Declaramos las variables del modelo
	String name, surname, username, password, adress, phoneNumber, email;

	/**
	 * Constructor que usa parametros para insertar un usuario en la bbdd
	 * 
	 * @param name        Nombre del usuario
	 * @param userName    Nombre de la cuenta del usuario
	 * @param password    contraseña de la cuenta del usuario
	 * @param adress      direccion de envio de los productos del usuario
	 * @param phoneNumber numero de telefono del usuario
	 * @param email       correo electronico del usuario
	 */
	public UserAccount(String name, String surname, String userName, String password, String adress, String phoneNumber,
			String email) {
		super();
		this.name = name;
		this.surname = surname;
		this.username = userName;
		this.password = password;
		this.adress = adress;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the adress
	 */
	public String getAdress() {
		return adress;
	}

	/**
	 * @param adress the adress to set
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserAccount [name=" + name + ", username=" + username + ", password=" + password + ", adress=" + adress
				+ ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}

}
