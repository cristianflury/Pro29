package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import controller.ManejaIngresoEntrevista;
import controller.ManejaVerificaDniEntrevista;
import controller.ManejoCambioVentana;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.Toolkit;


public class VentanaEntrevista extends JFrame {
	
	private static final long serialVersionUID = -4521349609951309982L;
	private JTextArea  ingresoPregunta_1;
	private JTextArea  ingresoPregunta_2;
	private JTextArea  ingresoPregunta_3;
	private JTextArea  ingresoPregunta_4;
	private JTextArea  ingresoPregunta_5;
	private JTextArea  ingresoPregunta_6;
	private JTextArea  ingresoPregunta_7;
	private JTextArea  ingresoPregunta_8;
	private JTextArea  ingresoPregunta_9;
	private JTextArea  ingresoPregunta_10;
	private String id;
	private JTextField ingresoIdChico;

	/**
	 * Create the frame.
	 */
	
	public VentanaEntrevista(String id) {
		setTitle("Ingreso Datos Entrevista Pro29");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaEntrevista.class.getResource("/images/icono.png")));
		
		this.id = id;
		setBounds(0, 0, 1300, 650);
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panelTitulo = new JPanel();
		getContentPane().add(panelTitulo, BorderLayout.NORTH);
		panelTitulo.setLayout(new BorderLayout(0, 0));
		
		JPanel panelTitulo2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panelTitulo2.getLayout();
		flowLayout_1.setHgap(60);
		panelTitulo2.setBackground(Color.BLACK);
		panelTitulo.add(panelTitulo2);

		JLabel etqTitulo = new JLabel("INGRESO DATOS ENTREVISTA");
		panelTitulo2.add(etqTitulo);
		etqTitulo.setIcon(new ImageIcon(VentanaEntrevista.class.getResource("/images/agregarRegistro.png")));
		etqTitulo.setForeground(Color.WHITE);
		etqTitulo.setFont(new Font("Arial Black", Font.PLAIN, 23));
		
		JLabel logoPro29 = new JLabel("");
		logoPro29.setIcon(new ImageIcon(VentanaEntrevista.class.getResource("/images/pro29logo.png")));
		panelTitulo2.add(logoPro29);
		
		JPanel panelEditarId = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelEditarId.getLayout();
		flowLayout.setHgap(20);
		panelEditarId.setBackground(Color.BLACK);
		panelTitulo.add(panelEditarId, BorderLayout.EAST);
		
		JLabel etqIdChico = new JLabel("ID - DNI del Ni\u00F1o");
		etqIdChico.setForeground(Color.WHITE);
		panelEditarId.add(etqIdChico);
		etqIdChico.setFont(new Font("Arial Black", Font.BOLD, 23));
		
		ingresoIdChico = new JTextField();
		panelEditarId.add(ingresoIdChico);
		ingresoIdChico.setEditable(false);
		ingresoIdChico.setText(id);
		ingresoIdChico.setColumns(10);

		JPanel panelEntrevista = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panelEntrevista.getLayout();
		panelEntrevista.setBackground(new Color(105, 105, 105));
		flowLayout_3.setHgap(25);
		getContentPane().add(panelEntrevista, BorderLayout.CENTER);

		JPanel panelPregunta_1 = new JPanel();
		panelEntrevista.add(panelPregunta_1);
		panelPregunta_1.setLayout(new GridLayout(0, 1, 0, 0));

		
		JLabel etqPregunta_1 = new JLabel(
				"<html>\u00BFPor qu\u00E9 pens\u00F3 que el ni\u00F1o/a asista<br> a un espacio de cuidado y recreaci\u00F3n?</html>");
		etqPregunta_1.setHorizontalAlignment(SwingConstants.CENTER);
		etqPregunta_1.setFont(new Font("Arial Black", Font.PLAIN, 13));
		etqPregunta_1.setForeground(new Color(255, 255, 255));
		etqPregunta_1.setBackground(new Color(95, 158, 160));
		etqPregunta_1.setOpaque(true);
		
		panelPregunta_1.add(etqPregunta_1);
		panelPregunta_1.setBorder(new LineBorder(new Color(0, 0, 0)));

		JScrollPane scrollPanePregunta_1 = new JScrollPane();
		panelPregunta_1.add(scrollPanePregunta_1);

		ingresoPregunta_1 = new JTextArea();
		ingresoPregunta_1.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		ingresoPregunta_1.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		scrollPanePregunta_1.setViewportView(ingresoPregunta_1);
		ingresoPregunta_1.setLineWrap(true);
		ingresoPregunta_1.setColumns(30);
		ingresoPregunta_1.setRows(3);
		

		JPanel panelPregunta_2 = new JPanel();
		panelPregunta_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelEntrevista.add(panelPregunta_2);
		panelPregunta_2.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel etqPregunta_2 = new JLabel("\u00BFPor qu\u00E9 eligi\u00F3 esta Instituci\u00F3n?");
		etqPregunta_2.setHorizontalAlignment(SwingConstants.CENTER);
		etqPregunta_2.setFont(new Font("Arial Black", Font.PLAIN, 13));
		etqPregunta_2.setForeground(new Color(255, 255, 255));
		etqPregunta_2.setBackground(new Color(95, 158, 160));
		etqPregunta_2.setOpaque(true);
		panelPregunta_2.add(etqPregunta_2);

		JScrollPane scrollPanePregunta_2 = new JScrollPane();
		panelPregunta_2.add(scrollPanePregunta_2);

		ingresoPregunta_2 = new JTextArea();
		ingresoPregunta_2.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		ingresoPregunta_2.setLineWrap(true);
		scrollPanePregunta_2.setViewportView(ingresoPregunta_2);
		ingresoPregunta_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoPregunta_2.setColumns(30);
		ingresoPregunta_2.setRows(3);

		JPanel panelPregunta_3 = new JPanel();
		panelPregunta_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelEntrevista.add(panelPregunta_3);
		panelPregunta_3.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel etqPregunta_3 = new JLabel("\u00BFC\u00F3mo es un d\u00EDa en la vida del ni\u00F1o/a ?");
		etqPregunta_3.setHorizontalAlignment(SwingConstants.CENTER);
		etqPregunta_3.setFont(new Font("Arial Black", Font.PLAIN, 13));
		etqPregunta_3.setForeground(new Color(255, 255, 255));
		etqPregunta_3.setBackground(new Color(95, 158, 160));
		etqPregunta_3.setOpaque(true);
		panelPregunta_3.add(etqPregunta_3);

		JScrollPane scrollPanePregunta_3 = new JScrollPane();
		panelPregunta_3.add(scrollPanePregunta_3);

		ingresoPregunta_3 = new JTextArea();
		ingresoPregunta_3.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		ingresoPregunta_3.setLineWrap(true);
		scrollPanePregunta_3.setViewportView(ingresoPregunta_3);
		ingresoPregunta_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoPregunta_3.setRows(3);
		ingresoPregunta_3.setColumns(30);

		JPanel panelPregunta_4 = new JPanel();
		panelPregunta_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelEntrevista.add(panelPregunta_4);
		panelPregunta_4.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel etqPregunta_4 = new JLabel(
				"<html>\u00BFCuenta con alguien que colabore<br> con la crianza del ni\u00F1o/a ?</html>");
		etqPregunta_4.setHorizontalAlignment(SwingConstants.CENTER);
		etqPregunta_4.setFont(new Font("Arial Black", Font.PLAIN, 13));
		etqPregunta_4.setForeground(new Color(255, 255, 255));
		etqPregunta_4.setBackground(new Color(95, 158, 160));
		etqPregunta_4.setOpaque(true);
		panelPregunta_4.add(etqPregunta_4);

		JScrollPane scrollPanePregunta_4 = new JScrollPane();
		panelPregunta_4.add(scrollPanePregunta_4);

	    ingresoPregunta_4 = new JTextArea();
	    ingresoPregunta_4.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		ingresoPregunta_4.setLineWrap(true);
		scrollPanePregunta_4.setViewportView(ingresoPregunta_4);
		ingresoPregunta_4.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoPregunta_4.setRows(3);
		ingresoPregunta_4.setColumns(30);

		JPanel panelPregunta_5 = new JPanel();
		panelPregunta_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelEntrevista.add(panelPregunta_5);
		panelPregunta_5.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel etqPregunta_5 = new JLabel(
				"<html>\u00BFPresent\u00F3 dificultad en su crecimiento<br>\r\no desarrollo? Especificar.</html>");
		etqPregunta_5.setHorizontalAlignment(SwingConstants.CENTER);
		etqPregunta_5.setFont(new Font("Arial Black", Font.PLAIN, 13));
		etqPregunta_5.setForeground(new Color(255, 255, 255));
		etqPregunta_5.setBackground(new Color(95, 158, 160));
		etqPregunta_5.setOpaque(true);
		panelPregunta_5.add(etqPregunta_5);

		JScrollPane scrollPanePregunta_5 = new JScrollPane();
		panelPregunta_5.add(scrollPanePregunta_5);

	    ingresoPregunta_5 = new JTextArea();
	    ingresoPregunta_5.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		scrollPanePregunta_5.setViewportView(ingresoPregunta_5);
		ingresoPregunta_5.setLineWrap(true);
		ingresoPregunta_5.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoPregunta_5.setRows(3);
		ingresoPregunta_5.setColumns(30);

		JPanel panelPregunta_6 = new JPanel();
		panelPregunta_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelEntrevista.add(panelPregunta_6);
		panelPregunta_6.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel etqPregunta_6 = new JLabel(
				"<html>Durante el crecimiento del ni\u00F1o/a, <br>\r\n\u00BFha tenido que hacer otra consulta con<br>\r\n especialista de salud adem\u00E1s del pediatra?</html>");
		etqPregunta_6.setHorizontalAlignment(SwingConstants.CENTER);
		etqPregunta_6.setFont(new Font("Arial Black", Font.PLAIN, 13));
		etqPregunta_6.setForeground(new Color(255, 255, 255));
		etqPregunta_6.setBackground(new Color(95, 158, 160));
		etqPregunta_6.setOpaque(true);
		panelPregunta_6.add(etqPregunta_6);

		JScrollPane scrollPanePregunta_6 = new JScrollPane();
		panelPregunta_6.add(scrollPanePregunta_6);

		ingresoPregunta_6 = new JTextArea();
		ingresoPregunta_6.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		scrollPanePregunta_6.setViewportView(ingresoPregunta_6);
		ingresoPregunta_6.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoPregunta_6.setLineWrap(true);
		ingresoPregunta_6.setRows(3);
		ingresoPregunta_6.setColumns(30);

		JPanel panelPregunta_7 = new JPanel();
		panelPregunta_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelEntrevista.add(panelPregunta_7);
		panelPregunta_7.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel etqPregunta_7 = new JLabel("\u00BFTiene obra social? \u00BFCu\u00E1l?");
		etqPregunta_7.setHorizontalAlignment(SwingConstants.CENTER);
		etqPregunta_7.setFont(new Font("Arial Black", Font.PLAIN, 13));
		etqPregunta_7.setForeground(new Color(255, 255, 255));
		etqPregunta_7.setBackground(new Color(95, 158, 160));
		etqPregunta_7.setOpaque(true);
		panelPregunta_7.add(etqPregunta_7);

		JScrollPane scrollPanePregunta_7 = new JScrollPane();
		panelPregunta_7.add(scrollPanePregunta_7);

		ingresoPregunta_7 = new JTextArea();
		ingresoPregunta_7.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		scrollPanePregunta_7.setViewportView(ingresoPregunta_7);
		ingresoPregunta_7.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoPregunta_7.setLineWrap(true);
		ingresoPregunta_7.setRows(3);
		ingresoPregunta_7.setColumns(30);

		JPanel panelPregunta_8 = new JPanel();
		panelPregunta_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelEntrevista.add(panelPregunta_8);
		panelPregunta_8.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel etqPregunta_8 = new JLabel(
				"<html>\u00BFTiene la posibilidad el<br>\r\nni\u00F1o/a de comer en familia?</html>");
		etqPregunta_8.setHorizontalAlignment(SwingConstants.CENTER);
		etqPregunta_8.setFont(new Font("Arial Black", Font.PLAIN, 13));
		etqPregunta_8.setForeground(new Color(255, 255, 255));
		etqPregunta_8.setBackground(new Color(95, 158, 160));
		etqPregunta_8.setOpaque(true);
		panelPregunta_8.add(etqPregunta_8);

		JScrollPane scrollPanePregunta_8 = new JScrollPane();
		panelPregunta_8.add(scrollPanePregunta_8);

	    ingresoPregunta_8 = new JTextArea();
	    ingresoPregunta_8.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		ingresoPregunta_8.setLineWrap(true);
		scrollPanePregunta_8.setViewportView(ingresoPregunta_8);
		ingresoPregunta_8.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoPregunta_8.setColumns(30);
		ingresoPregunta_8.setRows(3);

		JPanel panelPregunta_9 = new JPanel();
		panelPregunta_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelEntrevista.add(panelPregunta_9);
		panelPregunta_9.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel etqPregunta_9 = new JLabel("\u00BFC\u00F3mo se movilizan?");
		etqPregunta_9.setHorizontalAlignment(SwingConstants.CENTER);
		etqPregunta_9.setFont(new Font("Arial Black", Font.PLAIN, 13));
		etqPregunta_9.setForeground(new Color(255, 255, 255));
		etqPregunta_9.setBackground(new Color(95, 158, 160));
		etqPregunta_9.setOpaque(true);
		panelPregunta_9.add(etqPregunta_9);

		JScrollPane scrollPanePregunta_9 = new JScrollPane();
		panelPregunta_9.add(scrollPanePregunta_9);

		ingresoPregunta_9 = new JTextArea();
		ingresoPregunta_9.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		scrollPanePregunta_9.setViewportView(ingresoPregunta_9);
		ingresoPregunta_9.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoPregunta_9.setRows(3);
		ingresoPregunta_9.setColumns(30);

		JPanel panelPregunta_10 = new JPanel();
		panelPregunta_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelEntrevista.add(panelPregunta_10);
		panelPregunta_10.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel etqPregunta_10 = new JLabel(
				"<html>\u00BFUsted o alg\u00FAn miembro de la familia ha tenido\r\nque recurrir al Equipo de la Municipalidad, <br>SAMCO\r\nComisar\u00EDa, Fiscal\u00EDas, por alg\u00FAn motivo?\r\nEspecificar entidad y referente.</html>\r\n");
		etqPregunta_10.setHorizontalAlignment(SwingConstants.CENTER);
		etqPregunta_10.setFont(new Font("Arial Black", Font.PLAIN, 13));
		etqPregunta_10.setForeground(new Color(255, 255, 255));
		etqPregunta_10.setBackground(new Color(95, 158, 160));
		etqPregunta_10.setOpaque(true);
		panelPregunta_10.add(etqPregunta_10);

		JScrollPane scrollPanePregunta_10 = new JScrollPane();
		panelPregunta_10.add(scrollPanePregunta_10);

		ingresoPregunta_10 = new JTextArea();
		ingresoPregunta_10.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 0)));
		scrollPanePregunta_10.setViewportView(ingresoPregunta_10);
		ingresoPregunta_10.setRows(3);
		ingresoPregunta_10.setColumns(30);
		ingresoPregunta_10.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoPregunta_10.setLineWrap(true);

		JPanel panelBotones = new JPanel();
		panelBotones.setBackground(new Color(105, 105, 105));
		FlowLayout flowLayout_2 = (FlowLayout) panelBotones.getLayout();
		flowLayout_2.setVgap(15);
		flowLayout_2.setHgap(60);
		getContentPane().add(panelBotones, BorderLayout.SOUTH);

		JButton btnVolver = new JButton("Volver");
		btnVolver.setForeground(new Color(255, 255, 255));
		btnVolver.setBackground(new Color(0, 128, 128));
		btnVolver.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnVolver.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnVolver.addActionListener(new ManejoCambioVentana(new MenuAgregarRegistro(), this));
		panelBotones.add(btnVolver);
		
		JButton btnAgregarOtro = new JButton("Agregar Otro Registro");
		btnAgregarOtro.setForeground(new Color(255, 255, 255));
		btnAgregarOtro.setBackground(new Color(0, 128, 128));
		btnAgregarOtro.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnAgregarOtro.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnAgregarOtro.addActionListener(new ManejaVerificaDniEntrevista(this));
		panelBotones.add(btnAgregarOtro);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setForeground(new Color(255, 255, 255));
		btnGuardar.setBackground(new Color(0, 128, 128));
		btnGuardar.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnGuardar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnGuardar.addActionListener(new ManejaIngresoEntrevista(this));
		panelBotones.add(btnGuardar);


	}

	public JTextArea getIngresoPregunta_1() {
		return ingresoPregunta_1;
	}

	public void setIngresoPregunta_1(String ingresoPregunta_1) {
		this.ingresoPregunta_1.setText(ingresoPregunta_1);
	}

	public JTextArea getIngresoPregunta_2() {
		return ingresoPregunta_2;
	}

	public void setIngresoPregunta_2(String ingresoPregunta_2) {
		this.ingresoPregunta_2.setText(ingresoPregunta_2);
	}

	public JTextArea getIngresoPregunta_3() {
		return ingresoPregunta_3;
	}

	public void setIngresoPregunta_3(String ingresoPregunta_3) {
		this.ingresoPregunta_3.setText(ingresoPregunta_3);
	}

	public JTextArea getIngresoPregunta_4() {
		return ingresoPregunta_4;
	}

	public void setIngresoPregunta_4(String ingresoPregunta_4) {
		this.ingresoPregunta_4.setText(ingresoPregunta_4);
	}

	public JTextArea getIngresoPregunta_5() {
		return ingresoPregunta_5;
	}

	public void setIngresoPregunta_5(String ingresoPregunta_5) {
		this.ingresoPregunta_5.setText(ingresoPregunta_5);
	}

	public JTextArea getIngresoPregunta_6() {
		return ingresoPregunta_6;
	}

	public void setIngresoPregunta_6(String ingresoPregunta_6) {
		this.ingresoPregunta_6.setText(ingresoPregunta_6);
	}

	public JTextArea getIngresoPregunta_7() {
		return ingresoPregunta_7;
	}

	public void setIngresoPregunta_7(String ingresoPregunta_7) {
		this.ingresoPregunta_7.setText(ingresoPregunta_7);
	}

	public JTextArea getIngresoPregunta_8() {
		return ingresoPregunta_8;
	}

	public void setIngresoPregunta_8(String ingresoPregunta_8) {
		this.ingresoPregunta_8.setText(ingresoPregunta_8);
	}

	public JTextArea getIngresoPregunta_9() {
		return ingresoPregunta_9;
	}

	public void setIngresoPregunta_9(String ingresoPregunta_9) {
		this.ingresoPregunta_9.setText(ingresoPregunta_9);
	}

	public JTextArea getIngresoPregunta_10() {
		return ingresoPregunta_10;
	}

	public void setIngresoPregunta_10(String ingresoPregunta_10) {
		this.ingresoPregunta_10.setText(ingresoPregunta_10);
	}

	public String getId() {
		return id;
	}

	public  void setId(String id) {
		this.id = id;
	}

	public JTextField getIngresoIdChico() {
		return ingresoIdChico;
	}

	public void setIngresoIdChico(String ingresoIdChico) {
		this.ingresoIdChico.setText(ingresoIdChico);
	}
	
	
	
}
