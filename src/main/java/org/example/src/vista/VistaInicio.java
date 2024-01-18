package org.example.src.vista;

import java.awt.EventQueue;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.border.EmptyBorder;

import org.example.src.controlador.ControladorVistaInicio;
import org.example.src.utiles.Utiles;

import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class VistaInicio extends JFrame {

	private JPanel contentPane;
	private ControladorVistaInicio controlador = new ControladorVistaInicio(this);

	/**
	 * Create the frame.
	 */
	public VistaInicio() {
		setTitle("Ventana Inicio");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(VistaInicio.class.getResource("/assets/imagenes/logoMercadona.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 407);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Etiqueta que muestra una imagen con la marca de mercadona
		JLabel lbImagen = new JLabel("");
		lbImagen.setIcon(new ImageIcon(VistaInicio.class.getResource("/assets/imagenes/mercadona.png")));
		lbImagen.setBounds(85, 24, 418, 76);
		contentPane.add(lbImagen);

		// Boton btnIniciarSesion para dirigirnos a la ventana de inicio de sesion
		JButton btnIniciarSesion = new JButton("Iniciar sesion");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Llamamos al metodo iniciarSesion
				iniciarSesion();

			}
		});
		btnIniciarSesion.setBounds(22, 308, 168, 23);
		btnIniciarSesion.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		btnIniciarSesion.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		contentPane.add(btnIniciarSesion);

		// Boton btnCrearCuenta para dirigirnos a la ventana de creacion de cuenta
		JButton btnCrearCuenta = new JButton("Crear cuenta");
		btnCrearCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Llamamos al metodo crearCuenta
				crearCuenta();

			}
		});
		btnCrearCuenta.setBounds(402, 308, 168, 23);
		btnCrearCuenta.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		btnCrearCuenta.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		contentPane.add(btnCrearCuenta);

		// JPopupMenu menuContextual que contendra los JMenuItem menuItemIniciarSesion,
		// menuItemCrearCuenta y menuItemUsuarioInvitado y al que podremos acceder
		// haciendo click derecho
		JPopupMenu menuContextual = new JPopupMenu();

		// JMenuItem menuItemIniciarSesion con el que nos dirigiremos a la ventana de
		// inicio de sesion
		JMenuItem menuItemIniciarSesion = new JMenuItem("Iniciar sesion");
		menuItemIniciarSesion.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuItemIniciarSesion.setBackground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		menuItemIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Llamamos al metodo iniciarSesion
				iniciarSesion();

			}
		});

		// JMenuItem menuItemCrearCuenta con el que nos dirigiremos a la ventana de
		// creacion de cuenta
		JMenuItem menuItemCrearCuenta = new JMenuItem("Crear cuenta");
		menuItemCrearCuenta.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuItemCrearCuenta.setBackground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		menuItemCrearCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Llamamos al metodo crearCuenta
				crearCuenta();

			}
		});

		// JMenuItem menuItemUsuarioInvitado con el que podremos acceder a la ventana
		// principal usando un usuario invitado
		JMenuItem menuItemUsuarioInvitado = new JMenuItem("Acceder como invitado");
		menuItemUsuarioInvitado.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuItemUsuarioInvitado.setBackground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		menuItemUsuarioInvitado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		menuContextual.add(menuItemUsuarioInvitado);
		menuContextual.add(menuItemCrearCuenta);
		menuContextual.add(menuItemIniciarSesion);
		contentPane.setComponentPopupMenu(menuContextual);

		// Boton btnUsuarioInvitado para acceder a la ventana principal usando un
		// usuario invitado
		JButton btnUsuarioInvitado = new JButton("Acceder como invitado");
		btnUsuarioInvitado.setForeground(new Color(63, 134, 113));
		btnUsuarioInvitado.setBackground(new Color(214, 234, 226));
		btnUsuarioInvitado.setBounds(212, 308, 168, 23);
		contentPane.add(btnUsuarioInvitado);

		// JTextArea textAreaTextoDescriptivo que mostrara un texto descriptivo de la
		// aplicacion
		JTextArea textAreaTextoDescriptivo = new JTextArea();
		textAreaTextoDescriptivo.setFont(new Font("Monospaced", Font.BOLD, 13));
		textAreaTextoDescriptivo.setText(
				"Bienvenidos a la aplicación oficial de Mercadona, esta aplicacion ha sido diseñada para la venta de alimentos online de una forma facil y sencilla, aquí puedes acceder a la ventana principal de dos formas diferentes, la forma principal es acceder con una cuenta ya creada, de esta forma tendras acceso a todas las funcionalidades de la aplicacion, la otra forma es con una cuenta de invitado, aqui tendras una funcionalidad mas limitada, tambien si no tienes cuenta puedes crear una e iniciar sesion con ella posteriormente");
		textAreaTextoDescriptivo.setEditable(false);
		textAreaTextoDescriptivo.setLineWrap(true);
		textAreaTextoDescriptivo.setWrapStyleWord(true);
		textAreaTextoDescriptivo.setBackground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		textAreaTextoDescriptivo.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		textAreaTextoDescriptivo.setBounds(85, 98, 418, 199);
		contentPane.add(textAreaTextoDescriptivo);

		// MenuBar para el menu general
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 601, 22);
		menuBar.setBackground(Utiles.convertirColorJava(Utiles.COLOR_AZUL));
		contentPane.add(menuBar);

		// JMenu menuAcceder que contendra el JMenuItem menuItemSesionIniciar
		JMenu menuAcceder = new JMenu("Acceder");
		menuAcceder.setBackground(Utiles.convertirColorJava(Utiles.COLOR_AZUL));
		menuAcceder.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuBar.add(menuAcceder);

		// JMenuItem menuItemSesionIniciar con el que podremos iniciar sesion con una
		// cuenta ya creada
		JMenuItem menuItemSesionIniciar = new JMenuItem("Iniciar sesion");
		menuItemSesionIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Llamamos al metodo iniciarSesion
				iniciarSesion();

			}
		});
		menuItemSesionIniciar.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuItemSesionIniciar.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		menuAcceder.add(menuItemSesionIniciar);

		// JMenu menuInvitado que contendra el JMenuItem menuItemInvitadoAcceder
		JMenu menuInvitado = new JMenu("Invitado");
		menuInvitado.setBackground(Utiles.convertirColorJava(Utiles.COLOR_AZUL));
		menuInvitado.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuBar.add(menuInvitado);

		// JMenuItem menuItemInvitadoAcceder con el que podremos iniciar sesion con una
		// cuenta ya creada
		JMenuItem menuItemInvitadoAcceder = new JMenuItem("Acceder como invitado");
		menuItemInvitadoAcceder.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuItemInvitadoAcceder.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		menuInvitado.add(menuItemInvitadoAcceder);

		// JMenu menuCuentaNueva que contendra el JMenuItem menuItemCuentaCrear
		JMenu menuCuentaNueva = new JMenu("Cuenta");
		menuCuentaNueva.setBackground(Utiles.convertirColorJava(Utiles.COLOR_AZUL));
		menuCuentaNueva.setForeground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuBar.add(menuCuentaNueva);

		// JMenuItem menuItemCuentaCrear con el que podremos crear una nueva cuenta
		JMenuItem menuItemCuentaCrear = new JMenuItem("Crear cuenta");
		menuItemCuentaCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Llamamos al metodo crearCuenta
				crearCuenta();

			}
		});
		menuItemCuentaCrear.setBackground(Utiles.convertirColorJava(Utiles.COLOR_CLARO));
		menuItemCuentaCrear.setForeground(Utiles.convertirColorJava(Utiles.COLOR_VERDE));
		menuCuentaNueva.add(menuItemCuentaCrear);

		// Atajos de teclado
		menuItemSesionIniciar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.CTRL_MASK));
		menuItemInvitadoAcceder.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.CTRL_MASK));
		menuItemCuentaCrear.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_3, ActionEvent.CTRL_MASK));

		// Aniado ToolTips mediante el metodo de la clase Utiles
		Utiles.toolTip(btnIniciarSesion, "Inicia sesion con una cuenta existente");
		Utiles.toolTip(btnUsuarioInvitado, "Accede como usuario invitado, aqui no hace falta tener una cuenta creada");
		Utiles.toolTip(btnCrearCuenta, "Crea una nueva cuenta de usuario");
		Utiles.toolTip(menuItemIniciarSesion, "Inicia sesion con una cuenta existente");
		Utiles.toolTip(menuItemUsuarioInvitado,
				"Accede como usuario invitado, aqui no hace falta tener una cuenta creada");
		Utiles.toolTip(menuItemCrearCuenta, "Crea una nueva cuenta de usuario");
		Utiles.toolTip(menuItemSesionIniciar, "Inicia sesion con una cuenta existente");
		Utiles.toolTip(menuItemInvitadoAcceder,
				"Accede como usuario invitado, aqui no hace falta tener una cuenta creada");
		Utiles.toolTip(menuItemCuentaCrear, "Crea una nueva cuenta de usuario");

	}

	// Metodo para dirigirnos a la ventana de inicio de sesion
	public void iniciarSesion() {

		// Llamamos al metodo iniciarSesion del controlador
		controlador.iniciarSesion();

	}

	// Metodo para dirigirnos a la ventana de creacion de cuenta
	public void crearCuenta() {

		// Llamamos al metodo crearCuenta del controlador
		controlador.crearCuenta();

	}
}
