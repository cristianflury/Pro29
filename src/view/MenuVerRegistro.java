package view;




import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import controller.ManejaLecturaEntrevista;

import controller.ManejoLecturaDatosChicos;
import controller.ManejoLecturaDatosFamiliares;

import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.ImageIcon;


import java.awt.Font;
import java.awt.Button;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuVerRegistro extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4156943348620998320L;
	private JPanel contentPane;

	
	/**
	 * Create the frame.
	 */
	public MenuVerRegistro() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuVerRegistro.class.getResource("/images/icono.png")));
		setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 16));
		setTitle("Ver Registro Pro29");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		etqImagen.setIcon(new ImageIcon(MenuVerRegistro.class.getResource("/images/computadora.jpg")));
		etqImagen.setBounds(0, 108, 274, 363);
		panelLogo.add(etqImagen);
		
		JLabel etqPro29 = new JLabel("Pro29");
		etqPro29.setForeground(new Color(105, 105, 105));
		etqPro29.setFont(new Font("Arial Black", Font.BOLD, 40));
		etqPro29.setBounds(0, 57, 151, 69);
		panelLogo.add(etqPro29);
		
		Button btnSalir = new Button("Volver");
		btnSalir.setBounds(58, 474, 151, 33);
		btnSalir.setForeground(new Color(255, 255, 255));
		btnSalir.setBackground(new Color(0, 128, 128));
		btnSalir.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnSalir.setFocusable(false);
		btnSalir.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panelLogo.add(btnSalir);
		
		JLabel iconLogo = new JLabel("");
		iconLogo.setBounds(200, 0, 74, 80);
		panelLogo.add(iconLogo);
		iconLogo.setIcon(new ImageIcon(MenuVerRegistro.class.getResource("/images/pro29logo.png")));
		
		JLabel etqLogoVer = new JLabel("");
		etqLogoVer.setIcon(new ImageIcon(MenuVerRegistro.class.getResource("/images/LogoVerRegistro.png")));
		etqLogoVer.setBounds(432, 11, 112, 96);
		contentPane.add(etqLogoVer);
		
		Button btnVerNinio = new Button("Ver Ni\u00F1o/a");
		btnVerNinio.setForeground(new Color(255, 255, 224));
		btnVerNinio.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnVerNinio.setBackground(new Color(95, 158, 160));
		btnVerNinio.setBounds(447, 187, 193, 57);
		btnVerNinio.setFocusable(false);
		btnVerNinio.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add(btnVerNinio);
		
		Button btnFamiliares = new Button("Ver Familiares");
		btnFamiliares.setForeground(new Color(255, 255, 224));
		btnFamiliares.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnFamiliares.setFocusable(false);
		btnFamiliares.setBackground(new Color(95, 158, 160));
		btnFamiliares.setBounds(447, 308, 193, 57);
		btnFamiliares.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contentPane.add(btnFamiliares);
		
		Button btnEntrevista = new Button("Ver Entrevista");
		btnEntrevista.setForeground(new Color(255, 255, 224));
		btnEntrevista.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnEntrevista.setFocusable(false);
		btnEntrevista.setBackground(new Color(95, 158, 160));
		btnEntrevista.setBounds(447, 429, 193, 57);
		btnEntrevista.setCursor(new Cursor(Cursor.HAND_CURSOR));
		contentPane.add(btnEntrevista);
		
		JLabel iconVerRegistro = new JLabel("");
		iconVerRegistro.setIcon(new ImageIcon(MenuVerRegistro.class.getResource("/images/iconFamiliares.png")));
		iconVerRegistro.setBounds(340, 293, 87, 72);
		contentPane.add(iconVerRegistro);
		
		JLabel iconVerListado = new JLabel("");
		iconVerListado.setIcon(new ImageIcon(MenuVerRegistro.class.getResource("/images/icoNinios.png")));
		iconVerListado.setBounds(340, 179, 79, 65);
		contentPane.add(iconVerListado);
		
		JLabel iconAgregar = new JLabel("");
		iconAgregar.setIcon(new ImageIcon(MenuVerRegistro.class.getResource("/images/iconEntrevista.png")));
		iconAgregar.setBounds(340, 414, 75, 72);
		contentPane.add(iconAgregar);
		
		btnVerNinio.addActionListener(new ManejoLecturaDatosChicos(this));
		
		btnFamiliares.addActionListener(new ManejoLecturaDatosFamiliares(this));
		
		btnEntrevista.addActionListener(new ManejaLecturaEntrevista(this));

		btnSalir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
			
		});

	}
}
