package view;




import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ManejaEliminarRegistroChico;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.ImageIcon;


import java.awt.Font;
import java.awt.Button;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuInicio extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4156943348620998320L;
	private JPanel contentPane;

	
	/**
	 * Create the frame.
	 */
	public MenuInicio() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuInicio.class.getResource("/images/icono.png")));
		setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
		setTitle("Home Pro29");
		//setBackground(Color.WHITE);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0, 689, 574);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(105, 105, 105));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelLogo = new JPanel();
		panelLogo.setBorder(new EmptyBorder(0, 0, 0, 0));
		panelLogo.setBackground(Color.BLACK);
		panelLogo.setBounds(0, 0, 274, 545);
		contentPane.add(panelLogo);
		panelLogo.setLayout(null);
		
		JLabel etqImagen = new JLabel("");
		etqImagen.setBackground(Color.BLACK);
		etqImagen.setIcon(new ImageIcon(MenuInicio.class.getResource("/images/computadora.jpg")));
		etqImagen.setBounds(0, 108, 274, 363);
		panelLogo.add(etqImagen);
		
		JLabel etqPro29 = new JLabel("Pro29");
		etqPro29.setForeground(new Color(105, 105, 105));
		etqPro29.setFont(new Font("Arial Black", Font.BOLD, 40));
		etqPro29.setBounds(0, 57, 151, 69);
		panelLogo.add(etqPro29);
		
		Button btnSalir = new Button("Salir");
		btnSalir.setBounds(167, 477, 97, 33);
		btnSalir.setForeground(new Color(255, 255, 255));
		btnSalir.setBackground(new Color(0, 128, 128));
		btnSalir.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnSalir.setFocusable(false);
		btnSalir.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panelLogo.add(btnSalir);
		
		JLabel iconLogo = new JLabel("");
		iconLogo.setBounds(200, 0, 74, 80);
		panelLogo.add(iconLogo);
		iconLogo.setIcon(new ImageIcon(MenuInicio.class.getResource("/images/pro29logo.png")));
		
		Button btnAbout = new Button("Acerca de");
		btnAbout.setBounds(10, 477, 91, 33);
		panelLogo.add(btnAbout);
		btnAbout.setForeground(Color.WHITE);
		btnAbout.setFont(new Font("Arial Black", Font.BOLD, 14));
		btnAbout.setFocusable(false);
		btnAbout.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnAbout.setBackground(new Color(0, 128, 128));
		
		JLabel etqHome = new JLabel("");
		etqHome.setIcon(new ImageIcon(MenuInicio.class.getResource("/images/home_243.png")));
		etqHome.setBounds(432, 11, 112, 96);
		contentPane.add(etqHome);
		
		Button btnVerListado = new Button("Ver Listado");
		btnVerListado.setForeground(new Color(255, 255, 224));
		btnVerListado.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnVerListado.setBackground(new Color(95, 158, 160));
		btnVerListado.setBounds(447, 152, 176, 38);
		btnVerListado.setFocusable(false);
		btnVerListado.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(btnVerListado);
		
		Button btnVerRegistro = new Button("Ver Registro");
		btnVerRegistro.setForeground(new Color(255, 255, 224));
		btnVerRegistro.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnVerRegistro.setFocusable(false);
		btnVerRegistro.setBackground(new Color(95, 158, 160));
		btnVerRegistro.setBounds(447, 230, 176, 38);
		btnVerRegistro.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add(btnVerRegistro);
		
		Button btnAgregar = new Button("Agregar Registro");
		btnAgregar.setForeground(new Color(255, 255, 224));
		btnAgregar.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnAgregar.setFocusable(false);
		btnAgregar.setBackground(new Color(95, 158, 160));
		btnAgregar.setBounds(447, 306, 176, 38);
		btnAgregar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add(btnAgregar);
		
		Button btnEditar = new Button("Editar Registro");
		btnEditar.setForeground(new Color(255, 255, 224));
		btnEditar.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnEditar.setFocusable(false);
		btnEditar.setBackground(new Color(95, 158, 160));
		btnEditar.setBounds(447, 384, 176, 38);
		btnEditar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add(btnEditar);
		
		Button btnEliminar = new Button("Eliminar Registro");
		btnEliminar.setForeground(new Color(255, 255, 224));
		btnEliminar.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnEliminar.setFocusable(false);
		btnEliminar.setBackground(new Color(95, 158, 160));
		btnEliminar.setBounds(447, 456, 176, 38);
		btnEliminar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add(btnEliminar);
		
		JLabel iconVerRegistro = new JLabel("");
		iconVerRegistro.setIcon(new ImageIcon(MenuInicio.class.getResource("/images/verRegistro2.png")));
		iconVerRegistro.setBounds(346, 214, 64, 65);
		contentPane.add(iconVerRegistro);
		
		JLabel iconVerListado = new JLabel("");
		iconVerListado.setIcon(new ImageIcon(MenuInicio.class.getResource("/images/verListado.png")));
		iconVerListado.setBounds(346, 141, 46, 48);
		contentPane.add(iconVerListado);
		
		JLabel iconAgregar = new JLabel("");
		iconAgregar.setIcon(new ImageIcon(MenuInicio.class.getResource("/images/agregarRegistro.png")));
		iconAgregar.setBounds(346, 290, 46, 57);
		contentPane.add(iconAgregar);
		
		JLabel iconEditar = new JLabel("");
		iconEditar.setIcon(new ImageIcon(MenuInicio.class.getResource("/images/editarRegistro.png")));
		iconEditar.setBounds(346, 368, 46, 60);
		contentPane.add(iconEditar);
		
		JLabel iconEliminar = new JLabel("");
		iconEliminar.setIcon(new ImageIcon(MenuInicio.class.getResource("/images/eliminarRegistro.png")));
		iconEliminar.setBounds(346, 445, 46, 61);
		contentPane.add(iconEliminar);
		
		btnVerListado.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				TablaDatosChicos t = new TablaDatosChicos();
				t.setVisible(true);
				
			}
			
			
		});
		
		btnVerRegistro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MenuVerRegistro v = new MenuVerRegistro();
				v.setVisible(true);
				
			}
			
			
		});
		
		btnAgregar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MenuAgregarRegistro v = new MenuAgregarRegistro();
				v.setVisible(true);					
			}
			
			
		});
		
		btnEditar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MenuEditarRegistro v = new MenuEditarRegistro();
				v.setVisible(true);
				
			}
			
			
		});
		
		btnEliminar.addActionListener(new ManejaEliminarRegistroChico());

		
		
		btnSalir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}
			
			
		});
		
		btnAbout.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SobrePro29 s = new SobrePro29();
				s.setVisible(true);
				
			}
			
		});
	
	}
	

}
