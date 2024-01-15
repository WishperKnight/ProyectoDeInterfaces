package org.example.src.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.example.src.utiles.*;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JMenu;
import java.awt.Dimension;
import javax.swing.SwingConstants;

public class Vestibulo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vestibulo frame = new Vestibulo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vestibulo() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 922, 612);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 255, 255));
		setJMenuBar(menuBar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(0, 150, 96));
		menuBar.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Vestibulo.class.getResource("/org/example/src/imagenes/mercadona.png")));
		
		JMenu mnNewMenu_1 = new JMenu("Opciones");
		mnNewMenu_1.setForeground(new Color(0, 147, 94));
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 20));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Inicio");
		mnNewMenu_1.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Cuenta");
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Salir");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu = new JMenu("Categor\u00EDas");
		mnNewMenu.setForeground(new Color(0, 147, 94));
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 20));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("B\u00E1sico");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Carnes y pescados");
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Vegetales");
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Frutas");
		mnNewMenu.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Bebidas");
		mnNewMenu.add(mntmNewMenuItem_7);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(255, 255, 255));


		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("IAMGEN");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\yeray\\OneDrive\\Escritorio\\CarnePescado.png"));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel_1.setBounds(39, 39, 162, 184);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Carnes y Pescados");
		lblNewLabel_2.setForeground(new Color(0, 147, 94));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(40, 218, 160, 25);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 908, 501);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("IAMGEN");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel_1_1.setBounds(350, 39, 162, 184);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Carnes y Pescados");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(new Color(0, 147, 94));
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_1.setBounds(350, 218, 160, 25);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("IAMGEN");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel_1_2.setBounds(658, 39, 162, 184);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Carnes y Pescados");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setForeground(new Color(0, 147, 94));
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_2.setBounds(658, 218, 160, 25);
		panel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("IAMGEN");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel_1_3.setBounds(40, 271, 162, 184);
		panel.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("Carnes y Pescados");
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setForeground(new Color(0, 147, 94));
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_3.setBounds(40, 450, 160, 25);
		panel.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("IAMGEN");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel_1_4.setBounds(350, 271, 162, 184);
		panel.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_2_4 = new JLabel("Carnes y Pescados");
		lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_4.setForeground(new Color(0, 147, 94));
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_4.setBounds(350, 450, 160, 25);
		panel.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("IAMGEN");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblNewLabel_1_5.setBounds(656, 271, 162, 184);
		panel.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_2_5 = new JLabel("Carnes y Pescados");
		lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_5.setForeground(new Color(0, 147, 94));
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2_5.setBounds(656, 450, 160, 25);
		panel.add(lblNewLabel_2_5);
	}
}
