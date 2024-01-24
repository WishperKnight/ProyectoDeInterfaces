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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

/**
 * La clase Vestibulo representa la interfaz grafica principal de la aplicacion.
 */
public class Vestibulo extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Constructor de la clase que crea el frame del Vestibulo.
     */
    public Vestibulo() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(Vestibulo.class.getResource("/assets/imagenes/logoMercadona.png")));
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

        JMenuItem mntmNewMenuItem_1 = new JMenuItem("Cerrar Sesion");
        mnNewMenu_1.add(mntmNewMenuItem_1);

        JMenuItem mntmNewMenuItem_9 = new JMenuItem("Salir");
        mnNewMenu_1.add(mntmNewMenuItem_9);

        JMenu mnNewMenu = new JMenu("Categorias");
        mnNewMenu.setForeground(new Color(0, 147, 94));
        mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 20));
        menuBar.add(mnNewMenu);

        JMenuItem mntmNewMenuItem_3 = new JMenuItem("Basico");
        mnNewMenu.add(mntmNewMenuItem_3);

        JMenuItem mntmNewMenuItem_4 = new JMenuItem("Carnes y pescados");
        mnNewMenu.add(mntmNewMenuItem_4);

        JMenuItem mntmNewMenuItem_5 = new JMenuItem("Vegetales");
        mnNewMenu.add(mntmNewMenuItem_5);

        JMenuItem mntmNewMenuItem_6 = new JMenuItem("Frutas");
        mnNewMenu.add(mntmNewMenuItem_6);

        JMenuItem mntmNewMenuItem_7 = new JMenuItem("Bebidas");
        mnNewMenu.add(mntmNewMenuItem_7);

        JMenuItem mntmNewMenuItem_8 = new JMenuItem("Snacks");
        mnNewMenu.add(mntmNewMenuItem_8);

        contentPane = new JPanel();
        contentPane.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Acciones al hacer clic en el contenido
            }
        });
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setBackground(new Color(255, 255, 255));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Seccion para mostrar productos
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(Vestibulo.class.getResource("/org/example/src/imagenes/CarnePescado.png")));
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 33));
        lblNewLabel_1.setBounds(39, 39, 162, 184);
        contentPane.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel(" Pescado y Carne");
        lblNewLabel_2.setForeground(new Color(0, 147, 94));
        lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_2.setBounds(40, 218, 160, 25);
        contentPane.add(lblNewLabel_2);

        // Seccion para mostrar otro tipo de productos
        JPanel panel = new JPanel();
        panel.setBackground(new Color(255, 255, 255));
        panel.setBounds(0, 0, 908, 501);
        contentPane.add(panel);
        panel.setLayout(null);

        JLabel lblVeg = new JLabel("");
        lblVeg.setIcon(new ImageIcon(Vestibulo.class.getResource("/org/example/src/imagenes/Vegetales.png")));
        lblVeg.setFont(new Font("Tahoma", Font.PLAIN, 33));
        lblVeg.setBounds(350, 39, 162, 184);
        panel.add(lblVeg);

        JLabel lblNewLabel_2_1 = new JLabel("Vegetales");
        lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1.setForeground(new Color(0, 147, 94));
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_2_1.setBounds(350, 218, 160, 25);
        panel.add(lblNewLabel_2_1);

        // Secci�n para mostrar m�s productos
        JLabel lblBasics = new JLabel("");
        lblBasics.setIcon(new ImageIcon(Vestibulo.class.getResource("/org/example/src/imagenes/productosbasicos.png")));
        lblBasics.setFont(new Font("Tahoma", Font.PLAIN, 33));
        lblBasics.setBounds(658, 39, 162, 184);
        panel.add(lblBasics);

        JLabel lblNewLabel_2_2 = new JLabel("Basicos");
        lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_2.setForeground(new Color(0, 147, 94));
        lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_2_2.setBounds(658, 218, 160, 25);
        panel.add(lblNewLabel_2_2);
        
        JLabel lblNewLabel_2_3 = new JLabel("Snacks");
        lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_3.setForeground(new Color(0, 147, 94));
        lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_2_3.setBounds(39, 436, 160, 25);
        panel.add(lblNewLabel_2_3);
        
        JLabel lblSnacks = new JLabel("");
        lblSnacks.setIcon(new ImageIcon(Vestibulo.class.getResource("/org/example/src/imagenes/snacks.png")));
        lblSnacks.setFont(new Font("Tahoma", Font.PLAIN, 33));
        lblSnacks.setBounds(38, 257, 162, 184);
        panel.add(lblSnacks);
        
        JLabel lblNewLabel_2_4 = new JLabel("Bebidas");
        lblNewLabel_2_4.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_4.setForeground(new Color(0, 147, 94));
        lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_2_4.setBounds(351, 433, 160, 25);
        panel.add(lblNewLabel_2_4);
        
        JLabel lblDrinks = new JLabel("");
        lblDrinks.setIcon(new ImageIcon(Vestibulo.class.getResource("/org/example/src/imagenes/Bebidas.png")));
        lblDrinks.setFont(new Font("Tahoma", Font.PLAIN, 33));
        lblDrinks.setBounds(350, 254, 162, 184);
        panel.add(lblDrinks);
        
        JLabel lblNewLabel_2_5 = new JLabel("Frutas");
        lblNewLabel_2_5.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_5.setForeground(new Color(0, 147, 94));
        lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel_2_5.setBounds(659, 433, 160, 25);
        panel.add(lblNewLabel_2_5);
        
        JLabel lblFruits = new JLabel("");
        lblFruits.setIcon(new ImageIcon(Vestibulo.class.getResource("/org/example/src/imagenes/fruta.png")));
        lblFruits.setFont(new Font("Tahoma", Font.PLAIN, 33));
        lblFruits.setBounds(658, 254, 162, 184);
        panel.add(lblFruits);
    }
}
