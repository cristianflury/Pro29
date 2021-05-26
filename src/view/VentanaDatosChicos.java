package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;

import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import controller.ManejaIngresoDatosChico;
import controller.ManejoCambioVentana;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;

public class VentanaDatosChicos extends JFrame  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5061673957325010345L;
	private JTextArea textAreaObservaciones;
	private JTextField ingresoNombre;
	private JTextField ingresoApellido;
	private JTextField ingresoDni;
	private JTextField ingresoDomicilio;
	private JTextField ingresoFechaNacimiento;
	private JTextField ingresoEdad;
	private JTextField ingresoEscuela;
	private JTextField ingresoCelular;
	private JTextField ingresoAnioLectivo;
	private String anioLectivo;

	/**
	 * Create the frame.
	 */

	public VentanaDatosChicos(String anioLectivo) {

		this.anioLectivo = anioLectivo;
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuAgregarRegistro.class.getResource("/images/icono.png")));
		setBounds(0, 0, 1300, 650);
		setTitle("Ingreso Datos Ni\u00F1o/a Pro29");
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		// PANEL PRINCIPAL
		JPanel panelPrincipal = new JPanel();

		getContentPane().add(panelPrincipal, BorderLayout.CENTER);
		panelPrincipal.setLayout(new BorderLayout(0, 0));

		JPanel panelSuperior = new JPanel();
		panelSuperior.setBackground(Color.BLACK);
		panelPrincipal.add(panelSuperior, BorderLayout.NORTH);
		panelSuperior.setLayout(new BorderLayout(0, 0));

		JPanel panelTitulo = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panelTitulo.getLayout();
		flowLayout_3.setHgap(60);
		panelTitulo.setBackground(Color.BLACK);
		panelSuperior.add(panelTitulo, BorderLayout.CENTER);

		// TITULO PRINCIPAL DEL PANEL

		JLabel etqTitulo = new JLabel("INGRESO DATOS NI\u00D1O/A");
		etqTitulo.setBackground(Color.BLACK);
		panelTitulo.add(etqTitulo);
		etqTitulo.setIcon(new ImageIcon(VentanaDatosChicos.class.getResource("/images/agregarRegistro.png")));

		etqTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		etqTitulo.setFont(new Font("Arial Black", Font.BOLD, 23));
		etqTitulo.setForeground(Color.WHITE);

		JLabel iconLogo = new JLabel("");
		iconLogo.setIcon(new ImageIcon(VentanaDatosChicos.class.getResource("/images/pro29logo.png")));
		panelTitulo.add(iconLogo);

		JPanel panelAnioLectivo = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panelAnioLectivo.getLayout();
		flowLayout_2.setHgap(30);
		panelAnioLectivo.setBackground(Color.BLACK);
		panelSuperior.add(panelAnioLectivo, BorderLayout.EAST);

		JLabel etqAnioLectivo = new JLabel("A\u00F1o Lectivo: ");
		etqAnioLectivo.setHorizontalAlignment(SwingConstants.CENTER);
		panelAnioLectivo.add(etqAnioLectivo);
		etqAnioLectivo.setFont(new Font("Arial Black", Font.BOLD, 23));
		etqAnioLectivo.setForeground(Color.WHITE);

		ingresoAnioLectivo = new JTextField();
		panelAnioLectivo.add(ingresoAnioLectivo);
		ingresoAnioLectivo.setText(anioLectivo);
		ingresoAnioLectivo.setEditable(false);
		ingresoAnioLectivo.setColumns(10);

		JCheckBox editarAnioLectivo = new JCheckBox("Editar A\u00F1o Lectivo");
		editarAnioLectivo.setBackground(new Color(0, 139, 139));
		editarAnioLectivo.setForeground(Color.WHITE);
		editarAnioLectivo.setFont(new Font("Arial Black", Font.BOLD, 14));
		panelAnioLectivo.add(editarAnioLectivo);

		editarAnioLectivo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (editarAnioLectivo.isSelected())
					ingresoAnioLectivo.setEditable(true);
				else
					ingresoAnioLectivo.setEditable(false);
			}

		});

		JPanel panelInferior = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panelInferior.getLayout();
		flowLayout_1.setVgap(2);
		panelInferior.setBackground(new Color(105, 105, 105));
		panelPrincipal.add(panelInferior, BorderLayout.SOUTH);

		// FORMULARIO DENTRO DEL PANEL CENTRAL CON GRIDLAYOUT

		JPanel panelCentral = new JPanel();
		panelCentral.setBackground(new Color(105, 105, 105));
		panelPrincipal.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));

		Box verticalBox = Box.createVerticalBox();
		panelCentral.add(verticalBox);

		JPanel panelGridLayout = new JPanel();
		panelGridLayout.setBorder(null);
		panelGridLayout.setBackground(new Color(105, 105, 105));
		verticalBox.add(panelGridLayout);
		panelGridLayout.setLayout(new GridLayout(8, 4, 10, 10));

		// NOMBRE
		JLabel etqNombre = new JLabel("Nombre");
		etqNombre.setForeground(new Color(255, 255, 255));
		etqNombre.setHorizontalAlignment(SwingConstants.LEFT);
		etqNombre.setFont(new Font("Arial Black", Font.PLAIN, 18));
		etqNombre.setBackground(new Color(95, 158, 160));
		etqNombre.setOpaque(true);
		panelGridLayout.add(etqNombre);

		ingresoNombre = new JTextField();
		ingresoNombre.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoNombre.setColumns(20);
		panelGridLayout.add(ingresoNombre);

		// APELLIDO
		JLabel etqApellido = new JLabel("Apellido");
		etqApellido.setBackground(new Color(95, 150, 160));
		etqApellido.setForeground(Color.WHITE);
		etqApellido.setHorizontalAlignment(SwingConstants.LEFT);
		etqApellido.setFont(new Font("Arial Black", Font.PLAIN, 18));
		etqApellido.setOpaque(true);
		panelGridLayout.add(etqApellido);

		ingresoApellido = new JTextField();
		ingresoApellido.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoApellido.setColumns(20);
		panelGridLayout.add(ingresoApellido);

		// DNI
		JLabel etqDni = new JLabel("Documento");
		etqDni.setBackground(new Color(95, 150, 160));
		etqDni.setForeground(Color.WHITE);
		etqDni.setHorizontalAlignment(SwingConstants.LEFT);
		etqDni.setFont(new Font("Arial Black", Font.PLAIN, 18));
		etqDni.setOpaque(true);
		panelGridLayout.add(etqDni);

		ingresoDni = new JTextField();
		ingresoDni.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoDni.setColumns(20);
		panelGridLayout.add(ingresoDni);

		// DOMICILIO
		JLabel etqDomicilio = new JLabel("Domicilio");
		etqDomicilio.setBackground(new Color(95, 150, 160));
		etqDomicilio.setForeground(Color.WHITE);
		etqDomicilio.setHorizontalAlignment(SwingConstants.LEFT);
		etqDomicilio.setFont(new Font("Arial Black", Font.PLAIN, 18));
		etqDomicilio.setOpaque(true);
		panelGridLayout.add(etqDomicilio);

		ingresoDomicilio = new JTextField();
		ingresoDomicilio.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoDomicilio.setColumns(20);
		panelGridLayout.add(ingresoDomicilio);

		// FECHA DE NACIMIENTO
		JLabel etqFechaNacimiento = new JLabel("Fecha Nacimiento");
		etqFechaNacimiento.setBackground(new Color(95, 150, 160));
		etqFechaNacimiento.setForeground(Color.WHITE);
		etqFechaNacimiento.setHorizontalAlignment(SwingConstants.LEFT);
		etqFechaNacimiento.setFont(new Font("Arial Black", Font.PLAIN, 18));
		etqFechaNacimiento.setOpaque(true);
		panelGridLayout.add(etqFechaNacimiento);

		ingresoFechaNacimiento = new JTextField();
		ingresoFechaNacimiento.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoFechaNacimiento.setColumns(20);
		panelGridLayout.add(ingresoFechaNacimiento);

		// EDAD
		JLabel etqEdad = new JLabel("Edad");
		etqEdad.setBackground(new Color(95, 150, 160));
		etqEdad.setForeground(Color.WHITE);
		etqEdad.setHorizontalAlignment(SwingConstants.LEFT);
		etqEdad.setFont(new Font("Arial Black", Font.PLAIN, 18));
		etqEdad.setOpaque(true);
		panelGridLayout.add(etqEdad);

		ingresoEdad = new JTextField();
		ingresoEdad.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoEdad.setColumns(20);
		panelGridLayout.add(ingresoEdad);

		// ESCUELA
		JLabel etqEscuela = new JLabel("Escuela");
		etqEscuela.setBackground(new Color(95, 150, 160));
		etqEscuela.setForeground(Color.WHITE);
		etqEscuela.setHorizontalAlignment(SwingConstants.LEFT);
		etqEscuela.setFont(new Font("Arial Black", Font.PLAIN, 18));
		etqEscuela.setOpaque(true);
		panelGridLayout.add(etqEscuela);

		ingresoEscuela = new JTextField();
		ingresoEscuela.setFont(new Font("Tahoma", Font.PLAIN, 17));
		ingresoEscuela.setColumns(20);
		panelGridLayout.add(ingresoEscuela);

		// Celular Responsable
		JLabel etqIngresoCelular = new JLabel("Celular Responsable");
		etqIngresoCelular.setHorizontalAlignment(SwingConstants.LEFT);
		etqIngresoCelular.setBackground(new Color(95, 150, 160));
		etqIngresoCelular.setForeground(Color.WHITE);
		etqIngresoCelular.setFont(new Font("Arial Black", Font.PLAIN, 18));
		etqIngresoCelular.setOpaque(true);
		panelGridLayout.add(etqIngresoCelular);

		ingresoCelular = new JTextField();
		ingresoCelular.setFont(new Font("Tahoma", Font.PLAIN, 17));
		ingresoCelular.setColumns(20);
		panelGridLayout.add(ingresoCelular);

		Component verticalStrut = Box.createVerticalStrut(40);
		verticalBox.add(verticalStrut);

		// OBSERVACIONES DENTRO DEL PANEL OBSERVACIONES
		JPanel panelObservaciones = new JPanel();

		verticalBox.add(panelObservaciones);
		panelObservaciones.setLayout(new BorderLayout(0, 0));

		// OBSERVACIONES
		JLabel lblObservaciones = new JLabel("Observaciones");
		lblObservaciones.setBackground(new Color(95, 150, 160));
		lblObservaciones.setForeground(Color.WHITE);
		lblObservaciones.setOpaque(true);
		lblObservaciones.setHorizontalAlignment(SwingConstants.LEFT);
		lblObservaciones.setFont(new Font("Arial Black", Font.PLAIN, 18));
		panelObservaciones.add(lblObservaciones, BorderLayout.NORTH);

		textAreaObservaciones = new JTextArea();
		lblObservaciones.setLabelFor(textAreaObservaciones);
		textAreaObservaciones.setWrapStyleWord(true);
		textAreaObservaciones.setLineWrap(true);
		textAreaObservaciones.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textAreaObservaciones.setRows(10);
		textAreaObservaciones.setColumns(20);
		textAreaObservaciones.setBorder(new LineBorder(Color.BLACK, 1));

		// TEXTAREAOBSERVACIONES DENTRO DE UN JSCROLL PANE
		JScrollPane scrollPane = new JScrollPane(textAreaObservaciones);
		panelObservaciones.add(scrollPane, BorderLayout.CENTER);

		// PANEL INFERIOR Y SUS BOTONES

		JPanel panelBotones = new JPanel();
		panelBotones.setBackground(new Color(105, 105, 105));
		FlowLayout flowLayout = (FlowLayout) panelBotones.getLayout();
		flowLayout.setHgap(70);
		flowLayout.setVgap(15);
		panelInferior.add(panelBotones);

		JButton btnVolver = new JButton("Volver");
		btnVolver.setForeground(new Color(255, 255, 255));
		btnVolver.setBackground(new Color(0, 128, 128));
		btnVolver.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnVolver.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnVolver.addActionListener(new ManejoCambioVentana(new MenuAgregarRegistro(), this));

		panelBotones.add(btnVolver);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBackground(new Color(0, 128, 128));
		btnGuardar.setForeground(new Color(255, 255, 255));
		btnGuardar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnGuardar.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnGuardar.addActionListener(new ManejaIngresoDatosChico(this));
		panelBotones.add(btnGuardar);
		
	}
		
	

	public JTextArea getTextAreaObservaciones() {
		return textAreaObservaciones;
	}

	public void setTextAreaObservaciones(String ingresoObservaciones) {
		this.textAreaObservaciones.setText(ingresoObservaciones);
	}

	public JTextField getIngresoNombre() {
		return ingresoNombre;
	}

	public void setIngresoNombre(String ingresoNombre) {
		this.ingresoNombre.setText(ingresoNombre);
		;
	}

	public JTextField getIngresoApellido() {
		return ingresoApellido;
	}

	public void setIngresoApellido(String ingresoApellido) {
		this.ingresoApellido.setText(ingresoApellido);
		;
	}

	public JTextField getIngresoDni() {
		return ingresoDni;
	}

	public void setIngresoDni(String ingresoDni) {
		this.ingresoDni.setText(ingresoDni);
		;
	}

	public JTextField getIngresoDomicilio() {
		return ingresoDomicilio;
	}

	public void setIngresoDomicilio(String ingresoDomicilio) {
		this.ingresoDomicilio.setText(ingresoDomicilio);
		;
	}

	public JTextField getIngresoFechaNacimiento() {
		return ingresoFechaNacimiento;
	}

	public void setIngresoFechaNacimiento(String ingresoFechaNacimiento) {
		this.ingresoFechaNacimiento.setText(ingresoFechaNacimiento);
	}

	public JTextField getIngresoEdad() {
		return ingresoEdad;
	}

	public void setIngresoEdad(String ingresoEdad) {
		this.ingresoEdad.setText(ingresoEdad);
	}

	public JTextField getIngresoEscuela() {
		return ingresoEscuela;
	}

	public void setIngresoEscuela(String ingresoEscuela) {
		this.ingresoEscuela.setText(ingresoEscuela);
	}

	public JTextField getIngresoCelular() {
		return ingresoCelular;
	}

	public void setIngresoCelular(String ingresoCelular) {
		this.ingresoCelular.setText(ingresoCelular);
	}

	public JTextField getIngresoAnioLectivo() {
		return ingresoAnioLectivo;
	}

	public void setIngresoAnioLectivo(String ingresoAnioLectivo) {
		this.ingresoAnioLectivo.setText(ingresoAnioLectivo);
	}

	public String getAnioLectivo() {
		return anioLectivo;
	}

	public void setAnioLectivo(String anioLectivo) {
		this.anioLectivo = anioLectivo;
	}

}
