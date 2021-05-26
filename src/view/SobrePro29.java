package view;



import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.border.LineBorder;

import java.awt.Button;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SobrePro29 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6725022703488888538L;
	private JPanel contentPane;

	

	/**
	 * Create the frame.
	 */
	public SobrePro29() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 389);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new LineBorder(Color.GRAY, 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelImagen = new JPanel();
		panelImagen.setBounds(0, 0, 496, 175);
		contentPane.add(panelImagen);
		panelImagen.setLayout(null);
		
		JLabel etqImagen = new JLabel("");
		etqImagen.setIcon(new ImageIcon(SobrePro29.class.getResource("/images/computadora.jpg")));
		etqImagen.setBounds(0, 0, 496, 175);
		panelImagen.add(etqImagen);
		
		JLabel etqLogo = new JLabel("");
		etqLogo.setIcon(new ImageIcon(SobrePro29.class.getResource("/images/pro29logo.png")));
		etqLogo.setBounds(20, 223, 78, 66);
		contentPane.add(etqLogo);
		
		JLabel eqtTitulo = new JLabel("Pro29");
		eqtTitulo.setForeground(new Color(0, 0, 0));
		eqtTitulo.setFont(new Font("Arial Black", Font.BOLD, 25));
		eqtTitulo.setBounds(10, 174, 91, 66);
		contentPane.add(eqtTitulo);
		
		JLabel etqVersion = new JLabel("VERSI\u00D3N - 1.0.0");
		etqVersion.setForeground(Color.WHITE);
		etqVersion.setFont(new Font("Arial Black", Font.BOLD, 14));
		etqVersion.setBounds(185, 188, 213, 34);
		contentPane.add(etqVersion);
		
		JLabel etqAutor = new JLabel("AUTOR - CRISTIAN FLURY");
		etqAutor.setForeground(Color.WHITE);
		etqAutor.setFont(new Font("Arial Black", Font.BOLD, 14));
		etqAutor.setBounds(185, 315, 330, 34);
		contentPane.add(etqAutor);
		
		JLabel etqLeyenda1 = new JLabel("PRO29 ES UN SOFTWARE");
		etqLeyenda1.setForeground(Color.WHITE);
		etqLeyenda1.setFont(new Font("Arial Black", Font.BOLD, 14));
		etqLeyenda1.setBounds(185, 223, 253, 34);
		contentPane.add(etqLeyenda1);
		
		JLabel eteLeyenda2 = new JLabel("DESARROLLADO PARA EL C.A.F 29");
		eteLeyenda2.setForeground(Color.WHITE);
		eteLeyenda2.setFont(new Font("Arial Black", Font.BOLD, 14));
		eteLeyenda2.setBounds(185, 247, 338, 34);
		contentPane.add(eteLeyenda2);
		
		JLabel etqEmail = new JLabel("EMAIL - cristianflury@gmail.com");
		etqEmail.setForeground(Color.WHITE);
		etqEmail.setFont(new Font("Arial Black", Font.BOLD, 14));
		etqEmail.setBounds(185, 345, 330, 34);
		contentPane.add(etqEmail);
		
		Button btnSalir = new Button("Salir");
		btnSalir.setFocusable(false);
		btnSalir.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnSalir.setBackground(new Color(0, 128, 128));
		btnSalir.setForeground(Color.WHITE);
		btnSalir.setBounds(10, 345, 88, 34);
		btnSalir.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnSalir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				dispose();
				
			}
			
		});
		contentPane.add(btnSalir);
		
		
	}
}
