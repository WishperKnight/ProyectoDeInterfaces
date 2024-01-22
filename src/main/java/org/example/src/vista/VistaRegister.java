package org.example.src.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;

import org.example.src.controlador.ControladorVistaRegister;
import org.example.src.utiles.Utiles;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		setResizable(false);
		setTitle("Crear cuenta");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VistaRegister.class.getResource("/assets/imagenes/logoMercadona.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 620, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//jlabel lbNombre para el textfield tfNombre
		JLabel lbNombre = new JLabel("Nombre:");
		lbNombre.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lbNombre.setBounds(10, 81, 55, 14);
		lbNombre.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		contentPane.add(lbNombre);
		
		//jlabel lbCorreos para el textfield tfCorreo
		JLabel lbCorreos = new JLabel("Correo:");
		lbCorreos.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lbCorreos.setBounds(10, 196, 44, 14);
		lbCorreos.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		contentPane.add(lbCorreos);
		
		//jlabel lbApellidos para el textfield tfApellidos
		JLabel lbApellidos = new JLabel("Apellidos:");
		lbApellidos.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lbApellidos.setBounds(10, 120, 62, 14);
		lbApellidos.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		contentPane.add(lbApellidos);
		
		//jlabel lbContrasenia para el textfield tfContrasenia
		JLabel lbContrasenia = new JLabel("Contraseña:");
		lbContrasenia.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lbContrasenia.setBounds(327, 85, 76, 14);
		lbContrasenia.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		contentPane.add(lbContrasenia);
		
		//Boton btnCrearCuenta con el que crearemos la cuenta con los datos establecidos
		JButton btnCrearCuenta = new JButton("");
		btnCrearCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Llamamos al metodo registrarUsuarioEnLaBBDD
				registrarUsuarioEnLaBBDD();
				
				
			}
		});
		btnCrearCuenta.setIcon(new ImageIcon(VistaRegister.class.getResource("/assets/imagenes/RegistrarseIcono.png")));
		btnCrearCuenta.setBounds(269, 239, 62, 35);
		btnCrearCuenta.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		btnCrearCuenta.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		contentPane.add(btnCrearCuenta);
		
		//Boton btnAtras con el que volveremos a la anterior ventana
		JButton btnAtras = new JButton("");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Llamamos al metodo volverAtras
				volverAtras();
				
			}
		});
		btnAtras.setIcon(new ImageIcon(VistaRegister.class.getResource("/assets/imagenes/IconoBotonAtras.png")));
		btnAtras.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		btnAtras.setBounds(10, 35, 42, 32);
		
		contentPane.add(btnAtras);
		//JPopupMenu menuContextual que contendra los JMenuItem menuItemRegistrarse, menuItemVolverAtras y menuItemReproducirAudio los cuales podremos acceder haciendo click derecho
		JPopupMenu menuContextual = new JPopupMenu();
		
		//JMenuItem menuItemRegistrarse con el que estableceremos la cunta nueva con los datos que he introducido
		JMenuItem menuItemRegistrarse = new JMenuItem("Crear cuenta");
		menuItemRegistrarse.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuItemRegistrarse.setBackground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		menuItemRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Llamamos al metodo registrarUsuarioEnLaBBDD
				registrarUsuarioEnLaBBDD();
				
			}
		});
		
		//JMenuItem menuItemVolverAtras con el que volveremos a la anterior ventana
		JMenuItem menuItemVolverAtras = new JMenuItem("Volver hacia atras");
		menuItemVolverAtras.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuItemVolverAtras.setBackground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		menuItemVolverAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Llamamos al metodo volverAtras
				volverAtras();
				
			}
		});
		
		//JMenuItem menuItemReproducirAudio con el que reproduciremos el audio de ayuda
		JMenuItem menuItemReproducirAudio = new JMenuItem("Reproducir audio de ayuda");
		menuItemReproducirAudio.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuItemReproducirAudio.setBackground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		menuItemReproducirAudio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Llamamos al metodo reproducirAudio
				reproducirAudio();
				
			}
		});
		
		menuContextual.add(menuItemReproducirAudio);
		menuContextual.add(menuItemVolverAtras);
		menuContextual.add(menuItemRegistrarse);
		contentPane.setComponentPopupMenu(menuContextual);
		
		//jlabel lbNumeroTelefono para el textfield tfNumeroTelefono
		JLabel lbNumeroTelefono = new JLabel("Telefono:");
		lbNumeroTelefono.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lbNumeroTelefono.setBounds(10, 158, 62, 14);
		lbNumeroTelefono.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		contentPane.add(lbNumeroTelefono);
		
		//jlabel lbUsuario para el textfield tfUsuario
		JLabel lbUsuario = new JLabel("Usuario:");
		lbUsuario.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lbUsuario.setBounds(327, 124, 55, 14);
		lbUsuario.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		contentPane.add(lbUsuario);
		
		//textfield para insertar el nombre
		tfNombre = new JTextField();
		tfNombre.setBounds(96, 81, 134, 20);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
		
		//textfield para insertar los apellidos
		tfApellidos = new JTextField();
		tfApellidos.setColumns(10);
		tfApellidos.setBounds(96, 120, 134, 20);
		contentPane.add(tfApellidos);
		
		//textfield para insertar el correo electronico
		tfCorreo = new JTextField();
		tfCorreo.setColumns(10);
		tfCorreo.setBounds(96, 196, 134, 20);
		contentPane.add(tfCorreo);
		
		//textfield para insertar el nombre de usuario
		tfUsuario = new JTextField();
		tfUsuario.setEnabled(false);
		tfUsuario.setEditable(false);
		tfUsuario.setColumns(10);
		tfUsuario.setBounds(460, 122, 134, 20);
		contentPane.add(tfUsuario);
		
		//textfield para insertar la contrasenia
		tfContrasenia = new JTextField();
		tfContrasenia.setColumns(10);
		tfContrasenia.setBounds(460, 83, 134, 20);
		contentPane.add(tfContrasenia);
		
		//textfield para insertar el numero de telefono
		tfNumeroTelefono = new JTextField();
		tfNumeroTelefono.setColumns(10);
		tfNumeroTelefono.setBounds(96, 158, 134, 20);
		contentPane.add(tfNumeroTelefono);
		
		//jlabel Sign up
		JLabel lbTitulo = new JLabel("Sign up");
		lbTitulo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.BOLD, 25));
		lbTitulo.setBounds(258, 35, 85, 35);
		lbTitulo.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		contentPane.add(lbTitulo);
		
		//jlabel lbNombreRequerido para indicar que el textfield tfNombre es requerido
		JLabel lbNombreRequerido = new JLabel("*");
		lbNombreRequerido.setForeground(Utiles.convertirColorJava(Utiles.COLOR_ROJO));
		lbNombreRequerido.setBounds(64, 76, 11, 20);
		contentPane.add(lbNombreRequerido);
		
		//jlabel lbApellidosRequerido para indicar que el textfield tfApellidos es requerido
		JLabel lbApellidosRequerido = new JLabel("*");
		lbApellidosRequerido.setForeground(Utiles.convertirColorJava(Utiles.COLOR_ROJO));
		lbApellidosRequerido.setBounds(69, 115, 14, 20);
		contentPane.add(lbApellidosRequerido);
		
		//jlabel lbDireccionRequerido para indicar que el textfield tfDireccionEnvio es requerido
		JLabel lbDireccionRequerido = new JLabel("*");
		lbDireccionRequerido.setForeground(Utiles.convertirColorJava(Utiles.COLOR_ROJO));
		lbDireccionRequerido.setBounds(439, 159, 11, 14);
		contentPane.add(lbDireccionRequerido);
		
		//jlabel lbContraseniaRequerido para indicar que el textfield tfContrasenia es requerido
		JLabel lbContraseniaRequerido = new JLabel("*");
		lbContraseniaRequerido.setForeground(Utiles.convertirColorJava(Utiles.COLOR_ROJO));
		lbContraseniaRequerido.setBounds(400, 82, 14, 14);
		contentPane.add(lbContraseniaRequerido);
		
		//jlabel lbCorreoRequerido para indicar que el textfield tfCorreo es requerido
		JLabel lbCorreoRequerido = new JLabel("*");
		lbCorreoRequerido.setForeground(Utiles.convertirColorJava(Utiles.COLOR_ROJO));
		lbCorreoRequerido.setBounds(56, 190, 11, 20);
		contentPane.add(lbCorreoRequerido);
		
		//jlabel lblDireccionDeEnvio para el textfield tflDireccionDeEnvio
		JLabel lblDireccionDeEnvio = new JLabel("Direccion de envio:");
		lblDireccionDeEnvio.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		lblDireccionDeEnvio.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		lblDireccionDeEnvio.setBounds(327, 162, 111, 14);
		contentPane.add(lblDireccionDeEnvio);
		
		//textfield para insertar la direccion a la que se enviaran los pedidos
		tfDireccionEnvio = new JTextField();
		tfDireccionEnvio.setColumns(10);
		tfDireccionEnvio.setBounds(460, 160, 134, 20);
		contentPane.add(tfDireccionEnvio);
		
		//MenuBar para el menu general
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 604, 22);
		menuBar.setBackground(Utiles.convertirColorJava(Utiles.COLOR_AZUL));
		contentPane.add(menuBar);
		
		//JMenu menuVolver que contendra el JMenuItem menuItemVolver
		JMenu menuVolver = new JMenu("Volver");
		menuVolver.setBackground(Utiles.convertirColorJava(Utiles.COLOR_AZUL));
		menuVolver.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuBar.add(menuVolver);
		
		//JMenuItem menuItemVolver con el que volveremos a la anterior ventana
		JMenuItem menuItemVolver = new JMenuItem("Volver a la anterior ventana");
		menuItemVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Llamamos al metodo volverAtras
				volverAtras();
				
			}
		});
		menuItemVolver.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuItemVolver.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		menuVolver.add(menuItemVolver);
		
		//JMenu menuCuenta que contendra el JMenuItem menuItemCuentaEstablecer
		JMenu menuCuenta = new JMenu("Cuenta");
		menuCuenta.setBackground(Utiles.convertirColorJava(Utiles.COLOR_AZUL));
		menuCuenta.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuBar.add(menuCuenta);
		
		//JMenuItem menuItemCuentaEstablecer con el que estableceremos la cuenta con los datos que he introducido
		JMenuItem menuItemCuentaEstablecer = new JMenuItem("Establecer cuenta");
		menuItemCuentaEstablecer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//Llamamos al metodo registrarUsuarioEnLaBBDD
				registrarUsuarioEnLaBBDD();
				
			}
		});
		menuItemCuentaEstablecer.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuItemCuentaEstablecer.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		menuCuenta.add(menuItemCuentaEstablecer);
		
		//JMenu menuAudio que contendra el JMenuItem menuItemAudioReproducir
		JMenu menuAudio = new JMenu("Audio");
		menuAudio.setBackground(Utiles.convertirColorJava(Utiles.COLOR_AZUL));
		menuAudio.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuBar.add(menuAudio);
		
		//JMenuItem menuItemAudioReproducir con el que podremos reproducir el audio de ayuda
		JMenuItem menuItemAudioReproducir = new JMenuItem("Reproducir audio de ayuda");
		menuItemAudioReproducir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Llamamos al metodo reproducirAudio
				reproducirAudio();
				
			}
		});
		menuItemAudioReproducir.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuItemAudioReproducir.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		menuAudio.add(menuItemAudioReproducir);
		
		//Boton para reproducir el audio de ayuda
		JButton btnAudio = new JButton("");
		btnAudio.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		btnAudio.setIcon(new ImageIcon(VistaRegister.class.getResource("/assets/imagenes/IconoBotonAudio.png")));
		btnAudio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Llamamos al metodo reproducirAudio
				reproducirAudio();
				
			}
		});
		btnAudio.setBounds(552, 35, 42, 32);
		contentPane.add(btnAudio);
		
		//Atajos de teclado
		menuItemVolver.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.CTRL_MASK));
		menuItemCuentaEstablecer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.CTRL_MASK));
		menuItemAudioReproducir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.CTRL_MASK));
		
		
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
		Utiles.toolTip(btnAudio, "Reproducir audio que explica el funcionamiento de esta ventana");
		Utiles.toolTip(menuItemReproducirAudio, "Reproducir audio que explica el funcionamiento de esta ventana");
		Utiles.toolTip(menuItemRegistrarse, "Confirma la creacion de la cuenta");
		Utiles.toolTip(menuItemVolverAtras, "Volver a la anterior ventana");
		Utiles.toolTip(menuItemVolver, "Volver a la anterior ventana");
		Utiles.toolTip(menuItemAudioReproducir, "Reproducir audio que explica el funcionamiento de esta ventana");
		Utiles.toolTip(menuItemCuentaEstablecer, "Confirma la creacion de la cuenta");
	
		
	}
	
	//Metodo para volver hacia atras
	public void volverAtras() {
		
		//Llamamos al metodo volverAtras del controlador
		controlador.volverAtras();
		
	}
	
	//Metodo para reproducir audio de ayuda
	public void reproducirAudio() {
		
		//Llamamos al metodo reproducirAudio del controlador
		controlador.reproducirAudio();
		
	}

	public void registrarUsuarioEnLaBBDD() {
		
		controlador.registrarUsuarioEnLaBBDD();
		
	}
	
	public void setUsername() {
		
		controlador.setUsername();
		
	}


	public JTextField getTfUsuario() {
		return tfUsuario;
	}

	public void setTfUsuario(JTextField tfUsuario) {
		this.tfUsuario = tfUsuario;
	}

	public JTextField getTfNombre() {
		return tfNombre;
	}

	public JTextField getTfApellidos() {
		return tfApellidos;
	}

	public JTextField getTfCorreo() {
		return tfCorreo;
	}

	public JTextField getTfContrasenia() {
		return tfContrasenia;
	}

	public JTextField getTfNumeroTelefono() {
		return tfNumeroTelefono;
	}

	public JTextField getTfDireccionEnvio() {
		return tfDireccionEnvio;
	}
	
}
