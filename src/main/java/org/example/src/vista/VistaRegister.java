package org.example.src.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;

import controlador.ControladorVistaRegister;
import utiles.Utiles;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;

public class VistaRegister extends JFrame {

	private JPanel contentPane;
	private JTextField tfNombre;
	private JTextField tfApellidos;
	private JTextField tfCorreo;
	private JTextField tfUsuario;
	private JTextField tfContrasenia;
	private JTextField tfNumeroTelefono;
	private JTextField tfDireccionEnvio;
	private ControladorVistaRegister controlador = new ControladorVistaRegister(this);

	/**
	 * Create the frame.
	 */
	public VistaRegister() {
		setTitle("Crear cuenta");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VistaRegister.class.getResource("/imagenes/logoMercadona.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//jlabel nombre para el textfield nombre
		JLabel lbNombre = new JLabel("Nombre:");
		lbNombre.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lbNombre.setBounds(10, 67, 55, 14);
		lbNombre.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		contentPane.add(lbNombre);
		
		JLabel lbCorreos = new JLabel("Correo:");
		lbCorreos.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lbCorreos.setBounds(10, 182, 48, 14);
		lbCorreos.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		contentPane.add(lbCorreos);
		
		JLabel lbApellidos = new JLabel("Apellidos:");
		lbApellidos.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lbApellidos.setBounds(10, 106, 62, 14);
		lbApellidos.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		contentPane.add(lbApellidos);
		
		JLabel lbContrasenia = new JLabel("Contrasenia:");
		lbContrasenia.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lbContrasenia.setBounds(327, 71, 105, 14);
		lbContrasenia.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		contentPane.add(lbContrasenia);
		
		JButton btnCrearCuenta = new JButton("");
		btnCrearCuenta.setIcon(new ImageIcon(VistaRegister.class.getResource("/imagenes/RegistrarseIcono.png")));
		btnCrearCuenta.setBounds(271, 215, 62, 35);
		btnCrearCuenta.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		btnCrearCuenta.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		contentPane.add(btnCrearCuenta);
		
		JButton btnAtras = new JButton("");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				volverAtras();
				
			}
		});
		btnAtras.setIcon(new ImageIcon(VistaLogin.class.getResource("/imagenes/IconoBotonAtras.png")));
		btnAtras.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		btnAtras.setBounds(10, 11, 42, 32);
		
		contentPane.add(btnAtras);
		
		JPopupMenu menuContextual = new JPopupMenu();
		
		JMenuItem menuItemRegistrarse = new JMenuItem("Crear cuenta");
		menuItemRegistrarse.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuItemRegistrarse.setBackground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		menuItemRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				
			}
		});
		
		JMenuItem menuItemVolverAtras = new JMenuItem("Volver hacia atras");
		menuItemVolverAtras.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuItemVolverAtras.setBackground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		menuItemVolverAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				volverAtras();
				
			}
		});
		
		JMenuItem menuItemReproducirAudio = new JMenuItem("Reproducir audio de ayuda");
		menuItemReproducirAudio.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuItemReproducirAudio.setBackground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		menuItemReproducirAudio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				
			}
		});
		
		menuContextual.add(menuItemReproducirAudio);
		menuContextual.add(menuItemVolverAtras);
		menuContextual.add(menuItemRegistrarse);
		contentPane.setComponentPopupMenu(menuContextual);
		
		
		JLabel lbNumeroTelefono = new JLabel("Telefono:");
		lbNumeroTelefono.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lbNumeroTelefono.setBounds(10, 144, 62, 14);
		lbNumeroTelefono.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		contentPane.add(lbNumeroTelefono);
		
		JLabel lbUsuario = new JLabel("Usuario:");
		lbUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lbUsuario.setBounds(327, 110, 55, 14);
		lbUsuario.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		contentPane.add(lbUsuario);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(82, 142, 134, 20);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
		
		tfApellidos = new JTextField();
		tfApellidos.setColumns(10);
		tfApellidos.setBounds(82, 180, 134, 20);
		contentPane.add(tfApellidos);
		
		tfCorreo = new JTextField();
		tfCorreo.setColumns(10);
		tfCorreo.setBounds(82, 104, 134, 20);
		contentPane.add(tfCorreo);
		
		tfUsuario = new JTextField();
		tfUsuario.setColumns(10);
		tfUsuario.setBounds(460, 108, 134, 20);
		contentPane.add(tfUsuario);
		
		tfContrasenia = new JTextField();
		tfContrasenia.setColumns(10);
		tfContrasenia.setBounds(460, 69, 134, 20);
		contentPane.add(tfContrasenia);
		
		tfNumeroTelefono = new JTextField();
		tfNumeroTelefono.setColumns(10);
		tfNumeroTelefono.setBounds(82, 65, 134, 20);
		contentPane.add(tfNumeroTelefono);
		
		JLabel lbTitulo = new JLabel("Sign up");
		lbTitulo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
		lbTitulo.setBounds(259, 11, 139, 35);
		lbTitulo.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		contentPane.add(lbTitulo);
		
		JLabel lblDireccionDeEnvio = new JLabel("Direccion de envio:");
		lblDireccionDeEnvio.setForeground(new Color(63, 134, 113));
		lblDireccionDeEnvio.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblDireccionDeEnvio.setBounds(327, 148, 122, 14);
		contentPane.add(lblDireccionDeEnvio);
		
		tfDireccionEnvio = new JTextField();
		tfDireccionEnvio.setColumns(10);
		tfDireccionEnvio.setBounds(460, 146, 134, 20);
		contentPane.add(tfDireccionEnvio);
		
		//Aniado ToolTips mediante el metodo de la clase Utiles
		Utiles.toolTip(tfUsuario, "Inserta tu nombre de usuario");
		Utiles.toolTip(tfContrasenia, "Inserta una contrasenia para esta nueva cuenta");
		Utiles.toolTip(tfNombre, "Inserta tu nombre");
		Utiles.toolTip(tfNumeroTelefono, "Inserta tu nnumero de telefono");
		Utiles.toolTip(tfApellidos, "Inserta tus apellidos");
		Utiles.toolTip(tfDireccionEnvio, "Inserta una direccion a la cual entregaremos los productos");
		Utiles.toolTip(tfCorreo, "Inserta tu correo electronico");
		Utiles.toolTip(btnAtras, "Volver a la anterior ventana");
		Utiles.toolTip(btnCrearCuenta, "Confirma la creacion de la cuenta");
		
	}
	
	public void volverAtras() {
		
		controlador.volverAtras();
		
	}
	
	
}
