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

import javax.swing.border.LineBorder;

import controller.ManejaIngresoDatosResponsable;
import controller.ManejaVerificaDniFamiliar;
import controller.ManejoCambioVentana;

import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class VentanaDatosFamiliares extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3217674708474991404L;
	private JTextField ingresoNombre;
	private JTextField ingresoApellido;
	private JTextField ingresoVinculo;
	private JTextField ingresoDni;
	private JTextField ingresoFechaNacimiento;
	private JTextField ingresoEdad;
	private JTextField ingresoDomicilio;
	private JTextField ingresoCelular;
	private JTextField ingresoOcupacion;
	private JTextField ingresoNivelEducativo;
	private JTextField ingresoNombre_2;
	private JTextField ingresoApellido_2;
	private JTextField ingresoVinculo_2;
	private JTextField ingresoDni_2;
	private JTextField ingresoFechaNacimiento_2;
	private JTextField ingresoEdad_2;
	private JTextField ingresoDomicilio_2;
	private JTextField ingresoCelular_2;
	private JTextField ingresoOcupacion_2;
	private JTextField ingresoNivelEducativo_2;
	private JTextField ingresoNombre_3;
	private JTextField ingresoApellido_3;
	private JTextField ingresoVinculo_3;
	private JTextField ingresoDni_3;
	private JTextField ingresoFechaNacimiento_3;
	private JTextField ingresoEdad_3;
	private JTextField ingresoDomicilio_3;
	private JTextField ingresoCelular_3;
	private JTextField ingresoOcupacion_3;
	private JTextField ingresoNivelEducativo_3;
	private JTextArea textAreaObservaciones;
	private JTextField ingresoID;
	private String id;

	/**
	 * Create the frame.
	 */
	public VentanaDatosFamiliares(String id) {
		setTitle("Ingreso Datos Familiares Pro29");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaDatosFamiliares.class.getResource("/images/icono.png")));

		this.id = id;

		setBounds(0, 0, 1300, 650);
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
		FlowLayout flowLayoutTitulo = (FlowLayout) panelTitulo.getLayout();
		flowLayoutTitulo.setHgap(60);
		panelTitulo.setBackground(Color.BLACK);
		panelSuperior.add(panelTitulo);

		// TITULO PRINCIPAL DEL PANEL

		JLabel etqTitulo = new JLabel("INGRESO DATOS FAMILIARES");
		etqTitulo.setForeground(Color.WHITE);
		panelTitulo.add(etqTitulo);
		etqTitulo.setIcon(new ImageIcon(VentanaDatosFamiliares.class.getResource("/images/agregarRegistro.png")));
		etqTitulo.setBackground(Color.BLACK);
		etqTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		etqTitulo.setFont(new Font("Arial Black", Font.PLAIN, 23));
		etqTitulo.setOpaque(true);

		JLabel iconLogo = new JLabel("");
		iconLogo.setIcon(new ImageIcon(VentanaDatosFamiliares.class.getResource("/images/pro29logo.png")));
		panelTitulo.add(iconLogo);

		JPanel panelID = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelID.getLayout();
		flowLayout.setHgap(20);
		panelID.setBackground(Color.BLACK);
		panelSuperior.add(panelID, BorderLayout.EAST);

		JLabel etqIdChico = new JLabel("ID");
		etqIdChico.setBackground(Color.BLACK);
		etqIdChico.setForeground(Color.WHITE);
		panelID.add(etqIdChico);
		etqIdChico.setFont(new Font("Arial Black", Font.BOLD, 23));

		ingresoID = new JTextField();
		panelID.add(ingresoID);
		ingresoID.setEditable(false);
		ingresoID.setText(id);
		ingresoID.setColumns(10);

		// FORMULARIO DENTRO DEL PANEL CENTRAL

		JPanel panelCentral = new JPanel();
		panelCentral.setBackground(Color.LIGHT_GRAY);
		panelPrincipal.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new BorderLayout(0, 0));

		JPanel panelFormulario = new JPanel();
		panelCentral.add(panelFormulario, BorderLayout.CENTER);
		panelFormulario.setLayout(new BorderLayout(0, 0));

		JPanel panelDatosResponsables = new JPanel();
		panelDatosResponsables.setBackground(new Color(105, 105, 105));
		FlowLayout flowLayout_2 = (FlowLayout) panelDatosResponsables.getLayout();
		flowLayout_2.setHgap(20);
		panelFormulario.add(panelDatosResponsables, BorderLayout.CENTER);

		// ETIQUETAS DEL FORMULARIO
		JPanel panelEtiquetas = new JPanel();
		panelEtiquetas.setOpaque(false);
		panelDatosResponsables.add(panelEtiquetas);
		panelEtiquetas.setLayout(new GridLayout(0, 1, 0, 2));

		JLabel etqDato = new JLabel("Dato");
		etqDato.setForeground(new Color(255, 255, 255));
		etqDato.setBackground(new Color(95, 158, 160));
		etqDato.setOpaque(true);
		etqDato.setFont(new Font("Arial Black", Font.PLAIN, 18));
		panelEtiquetas.add(etqDato);

		JLabel etqNombre = new JLabel("Nombre");
		etqNombre.setForeground(new Color(255, 255, 255));
		etqNombre.setBackground(new Color(95, 158, 160));
		etqNombre.setOpaque(true);
		etqNombre.setFont(new Font("Arial Black", Font.PLAIN, 18));
		panelEtiquetas.add(etqNombre);

		JLabel etqApellido = new JLabel("Apellido");
		etqApellido.setForeground(new Color(255, 255, 255));
		etqApellido.setBackground(new Color(95, 158, 160));
		etqApellido.setOpaque(true);
		etqApellido.setFont(new Font("Arial Black", Font.PLAIN, 18));
		panelEtiquetas.add(etqApellido);

		JLabel etqVinculo = new JLabel("V\u00EDnculo");
		etqVinculo.setForeground(new Color(255, 255, 255));
		etqVinculo.setBackground(new Color(95, 158, 160));
		etqVinculo.setOpaque(true);
		etqVinculo.setFont(new Font("Arial Black", Font.PLAIN, 18));
		panelEtiquetas.add(etqVinculo);

		JLabel etqDocumento = new JLabel("Documento");
		etqDocumento.setForeground(new Color(255, 255, 255));
		etqDocumento.setBackground(new Color(95, 158, 160));
		etqDocumento.setOpaque(true);
		etqDocumento.setFont(new Font("Arial Black", Font.PLAIN, 18));
		panelEtiquetas.add(etqDocumento);

		JLabel etqFechaNacimiento = new JLabel("Fecha Nacimiento");
		etqFechaNacimiento.setForeground(new Color(255, 255, 255));
		etqFechaNacimiento.setBackground(new Color(95, 158, 160));
		etqFechaNacimiento.setOpaque(true);
		etqFechaNacimiento.setFont(new Font("Arial Black", Font.PLAIN, 18));
		panelEtiquetas.add(etqFechaNacimiento);

		JLabel etqEdad = new JLabel("Edad");
		etqEdad.setForeground(new Color(255, 255, 255));
		etqEdad.setBackground(new Color(95, 158, 160));
		etqEdad.setOpaque(true);
		etqEdad.setFont(new Font("Arial Black", Font.PLAIN, 18));
		panelEtiquetas.add(etqEdad);

		JLabel etqDomicilio = new JLabel("Domicilio");
		etqDomicilio.setForeground(new Color(255, 255, 255));
		etqDomicilio.setBackground(new Color(95, 158, 160));
		etqDomicilio.setOpaque(true);
		etqDomicilio.setFont(new Font("Arial Black", Font.PLAIN, 18));
		panelEtiquetas.add(etqDomicilio);

		JLabel etqCelular = new JLabel("Celular");
		etqCelular.setForeground(new Color(255, 255, 255));
		etqCelular.setBackground(new Color(95, 158, 160));
		etqCelular.setOpaque(true);
		etqCelular.setFont(new Font("Arial Black", Font.PLAIN, 18));
		panelEtiquetas.add(etqCelular);

		JLabel etqOcupacion = new JLabel("Ocupaci\u00F3n");
		etqOcupacion.setForeground(new Color(255, 255, 255));
		etqOcupacion.setBackground(new Color(95, 158, 160));
		etqOcupacion.setOpaque(true);
		etqOcupacion.setFont(new Font("Arial Black", Font.PLAIN, 18));
		panelEtiquetas.add(etqOcupacion);

		JLabel etqNivelEducativo = new JLabel("Nivel Educativo");
		etqNivelEducativo.setForeground(new Color(255, 255, 255));
		etqNivelEducativo.setBackground(new Color(95, 158, 160));
		etqNivelEducativo.setOpaque(true);
		etqNivelEducativo.setFont(new Font("Arial Black", Font.PLAIN, 18));
		panelEtiquetas.add(etqNivelEducativo);

		JPanel panelIngreso1 = new JPanel();
		panelDatosResponsables.add(panelIngreso1);
		panelIngreso1.setOpaque(false);
		panelIngreso1.setLayout(new GridLayout(0, 1, 0, 4));

		JLabel etqResponsable1 = new JLabel("RESPONSABLE 1");
		panelIngreso1.add(etqResponsable1);
		etqResponsable1.setForeground(new Color(255, 255, 255));
		etqResponsable1.setBackground(new Color(95, 158, 160));
		etqResponsable1.setOpaque(true);
		etqResponsable1.setFont(new Font("Arial Black", Font.PLAIN, 16));

		// TEXT FIELD RESPONSABLE 1

		ingresoNombre = new JTextField();
		ingresoNombre.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		panelIngreso1.add(ingresoNombre);
		ingresoNombre.setColumns(20);

		ingresoApellido = new JTextField();
		ingresoApellido.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoApellido.setColumns(20);
		panelIngreso1.add(ingresoApellido);

		ingresoVinculo = new JTextField();
		ingresoVinculo.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoVinculo.setColumns(20);
		panelIngreso1.add(ingresoVinculo);

		ingresoDni = new JTextField();
		ingresoDni.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoDni.setColumns(20);
		panelIngreso1.add(ingresoDni);

		ingresoFechaNacimiento = new JTextField();
		ingresoFechaNacimiento.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoFechaNacimiento.setColumns(20);
		panelIngreso1.add(ingresoFechaNacimiento);

		ingresoEdad = new JTextField();
		ingresoEdad.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoEdad.setColumns(20);
		panelIngreso1.add(ingresoEdad);

		ingresoDomicilio = new JTextField();
		ingresoDomicilio.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoDomicilio.setColumns(20);
		panelIngreso1.add(ingresoDomicilio);

		ingresoCelular = new JTextField();
		ingresoCelular.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoCelular.setColumns(20);
		panelIngreso1.add(ingresoCelular);

		ingresoOcupacion = new JTextField();
		ingresoOcupacion.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoOcupacion.setColumns(20);
		panelIngreso1.add(ingresoOcupacion);

		ingresoNivelEducativo = new JTextField();
		ingresoNivelEducativo.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoNivelEducativo.setColumns(20);
		panelIngreso1.add(ingresoNivelEducativo);

		// TEXTS FIELD INGRESO RESPONSABLE 2

		JPanel panelIngreso2 = new JPanel();
		panelDatosResponsables.add(panelIngreso2);
		panelIngreso2.setOpaque(false);
		panelIngreso2.setLayout(new GridLayout(0, 1, 0, 4));

		JLabel etqResponsable2 = new JLabel("RESPONSABLE 2");
		panelIngreso2.add(etqResponsable2);
		etqResponsable2.setForeground(new Color(255, 255, 255));
		etqResponsable2.setBackground(new Color(95, 158, 160));
		etqResponsable2.setOpaque(true);
		etqResponsable2.setFont(new Font("Arial Black", Font.PLAIN, 16));

		ingresoNombre_2 = new JTextField();
		ingresoNombre_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoNombre_2.setColumns(20);
		panelIngreso2.add(ingresoNombre_2);

		ingresoApellido_2 = new JTextField();
		ingresoApellido_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoApellido_2.setColumns(20);
		panelIngreso2.add(ingresoApellido_2);

		ingresoVinculo_2 = new JTextField();
		ingresoVinculo_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoVinculo_2.setColumns(20);
		panelIngreso2.add(ingresoVinculo_2);

		ingresoDni_2 = new JTextField();
		ingresoDni_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoDni_2.setColumns(20);
		panelIngreso2.add(ingresoDni_2);

		ingresoFechaNacimiento_2 = new JTextField();
		ingresoFechaNacimiento_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoFechaNacimiento_2.setColumns(20);
		panelIngreso2.add(ingresoFechaNacimiento_2);

		ingresoEdad_2 = new JTextField();
		ingresoEdad_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoEdad_2.setColumns(20);
		panelIngreso2.add(ingresoEdad_2);

		ingresoDomicilio_2 = new JTextField();
		ingresoDomicilio_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoDomicilio_2.setColumns(20);
		panelIngreso2.add(ingresoDomicilio_2);

		ingresoCelular_2 = new JTextField();
		ingresoCelular_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoCelular_2.setColumns(20);
		panelIngreso2.add(ingresoCelular_2);

		ingresoOcupacion_2 = new JTextField();
		ingresoOcupacion_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoOcupacion_2.setColumns(20);
		panelIngreso2.add(ingresoOcupacion_2);

		ingresoNivelEducativo_2 = new JTextField();
		ingresoNivelEducativo_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoNivelEducativo_2.setColumns(20);
		panelIngreso2.add(ingresoNivelEducativo_2);

		// TEXTS FIELD INGRESO RESPONSABLE 3

		JPanel panelIngreso3 = new JPanel();
		panelDatosResponsables.add(panelIngreso3);
		panelIngreso3.setOpaque(false);
		panelIngreso3.setLayout(new GridLayout(0, 1, 0, 4));

		JLabel etqResponsable3 = new JLabel("RESPONSABLE 3");
		panelIngreso3.add(etqResponsable3);
		etqResponsable3.setForeground(new Color(255, 255, 255));
		etqResponsable3.setBackground(new Color(95, 158, 160));
		etqResponsable3.setOpaque(true);
		etqResponsable3.setFont(new Font("Arial Black", Font.PLAIN, 16));

		ingresoNombre_3 = new JTextField();
		ingresoNombre_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoNombre_3.setColumns(20);
		panelIngreso3.add(ingresoNombre_3);

		ingresoApellido_3 = new JTextField();
		ingresoApellido_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoApellido_3.setColumns(20);
		panelIngreso3.add(ingresoApellido_3);

		ingresoVinculo_3 = new JTextField();
		ingresoVinculo_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoVinculo_3.setColumns(20);
		panelIngreso3.add(ingresoVinculo_3);

		ingresoDni_3 = new JTextField();
		ingresoDni_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoDni_3.setColumns(20);
		panelIngreso3.add(ingresoDni_3);

		ingresoFechaNacimiento_3 = new JTextField();
		ingresoFechaNacimiento_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoFechaNacimiento_3.setColumns(20);
		panelIngreso3.add(ingresoFechaNacimiento_3);

		ingresoEdad_3 = new JTextField();
		ingresoEdad_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoEdad_3.setColumns(20);
		panelIngreso3.add(ingresoEdad_3);

		ingresoDomicilio_3 = new JTextField();
		ingresoDomicilio_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoDomicilio_3.setColumns(20);
		panelIngreso3.add(ingresoDomicilio_3);

		ingresoCelular_3 = new JTextField();
		ingresoCelular_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoCelular_3.setColumns(20);
		panelIngreso3.add(ingresoCelular_3);

		ingresoOcupacion_3 = new JTextField();
		ingresoOcupacion_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoOcupacion_3.setColumns(20);
		panelIngreso3.add(ingresoOcupacion_3);

		ingresoNivelEducativo_3 = new JTextField();
		ingresoNivelEducativo_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoNivelEducativo_3.setColumns(20);
		panelIngreso3.add(ingresoNivelEducativo_3);

		// PANEL OBSERVACIONES Y SUS CAMPOS

		JPanel panelObservacionesTabla = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panelObservacionesTabla.getLayout();
		flowLayout_3.setHgap(50);
		panelFormulario.add(panelObservacionesTabla, BorderLayout.SOUTH);

		JPanel panelObservaciones = new JPanel();
		panelObservacionesTabla.add(panelObservaciones);
		panelObservacionesTabla.setBackground(new Color(105, 105, 105));
		panelObservaciones.setLayout(new BorderLayout(0, 0));

		JLabel etqObservaciones = new JLabel("Observaciones");
		etqObservaciones.setFont(new Font("Arial Black", Font.PLAIN, 18));
		etqObservaciones.setForeground(new Color(255, 255, 255));
		etqObservaciones.setBackground(new Color(95, 158, 160));
		etqObservaciones.setOpaque(true);
		panelObservaciones.add(etqObservaciones, BorderLayout.NORTH);

		textAreaObservaciones = new JTextArea();
		textAreaObservaciones.setWrapStyleWord(true);
		textAreaObservaciones.setLineWrap(true);
		textAreaObservaciones.setRows(10);
		textAreaObservaciones.setColumns(40);
		textAreaObservaciones.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textAreaObservaciones.setBorder(new LineBorder(Color.BLACK, 1));
		JScrollPane scrollObservaciones = new JScrollPane(textAreaObservaciones);
		panelObservaciones.add(scrollObservaciones);

		// PANEL INFERIOR Y SUS BOTONES MENÚ PRINCIPAL, CANCELAR Y GUARDAR

		JPanel panelInferior = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panelInferior.getLayout();
		flowLayout_1.setVgap(2);
		panelInferior.setBackground(new Color(105, 105, 105));
		panelPrincipal.add(panelInferior, BorderLayout.SOUTH);

		JPanel panelBotones = new JPanel();
		panelBotones.setBackground(new Color(105, 105, 105));
		FlowLayout flowLayoutBotones = (FlowLayout) panelBotones.getLayout();
		flowLayoutBotones.setHgap(70);
		flowLayoutBotones.setVgap(15);
		panelInferior.add(panelBotones);

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
		btnAgregarOtro.addActionListener(new ManejaVerificaDniFamiliar(this));
		panelBotones.add(btnAgregarOtro);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setForeground(new Color(255, 255, 255));
		btnGuardar.setBackground(new Color(0, 128, 128));
		btnGuardar.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnGuardar.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnGuardar.addActionListener(new ManejaIngresoDatosResponsable(this));
		panelBotones.add(btnGuardar);

	}

	public JTextField getIngresoNombre() {
		return ingresoNombre;
	}

	public void setIngresoNombre(String ingresoNombre) {
		this.ingresoNombre.setText(ingresoNombre);
	}

	public JTextField getIngresoApellido() {
		return ingresoApellido;
	}

	public void setIngresoApellido(String ingresoApellido) {
		this.ingresoApellido.setText(ingresoApellido);
	}

	public JTextField getIngresoVinculo() {
		return ingresoVinculo;
	}

	public void setIngresoVinculo(String ingresoVinculo) {
		this.ingresoVinculo.setText(ingresoVinculo);
	}

	public JTextField getIngresoDni() {
		return ingresoDni;
	}

	public void setIngresoDni(String ingresoDni) {
		this.ingresoDni.setText(ingresoDni);
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

	public JTextField getIngresoDomicilio() {
		return ingresoDomicilio;
	}

	public void setIngresoDomicilio(String ingresoDomicilio) {
		this.ingresoDomicilio.setText(ingresoDomicilio);
	}

	public JTextField getIngresoCelular() {
		return ingresoCelular;
	}

	public void setIngresoCelular(String ingresoCelular) {
		this.ingresoCelular.setText(ingresoCelular);
	}

	public JTextField getIngresoOcupacion() {
		return ingresoOcupacion;
	}

	public void setIngresoOcupacion(String ingresoOcupacion) {
		this.ingresoOcupacion.setText(ingresoOcupacion);
	}

	public JTextField getIngresoNivelEducativo() {
		return ingresoNivelEducativo;
	}

	public void setIngresoNivelEducativo(String ingresoNivelEducativo) {
		this.ingresoNivelEducativo.setText(ingresoNivelEducativo);
	}

	public JTextField getIngresoNombre_2() {
		return ingresoNombre_2;
	}

	public void setIngresoNombre_2(String ingresoNombre_2) {
		this.ingresoNombre_2.setText(ingresoNombre_2);
		;
	}

	public JTextField getIngresoApellido_2() {
		return ingresoApellido_2;
	}

	public void setIngresoApellido_2(String ingresoApellido_2) {
		this.ingresoApellido_2.setText(ingresoApellido_2);
	}

	public JTextField getIngresoVinculo_2() {
		return ingresoVinculo_2;
	}

	public void setIngresoVinculo_2(String ingresoVinculo_2) {
		this.ingresoVinculo_2.setText(ingresoVinculo_2);
	}

	public JTextField getIngresoDni_2() {
		return ingresoDni_2;
	}

	public void setIngresoDni_2(String ingresoDni_2) {
		this.ingresoDni_2.setText(ingresoDni_2);
	}

	public JTextField getIngresoFechaNacimiento_2() {
		return ingresoFechaNacimiento_2;
	}

	public void setIngresoFechaNacimiento_2(String ingresoFechaNacimiento_2) {
		this.ingresoFechaNacimiento_2.setText(ingresoFechaNacimiento_2);
	}

	public JTextField getIngresoEdad_2() {
		return ingresoEdad_2;
	}

	public void setIngresoEdad_2(String ingresoEdad_2) {
		this.ingresoEdad_2.setText(ingresoEdad_2);
	}

	public JTextField getIngresoDomicilio_2() {
		return ingresoDomicilio_2;
	}

	public void setIngresoDomicilio_2(String ingresoDomicilio_2) {
		this.ingresoDomicilio_2.setText(ingresoDomicilio_2);
	}

	public JTextField getIngresoCelular_2() {
		return ingresoCelular_2;
	}

	public void setIngresoCelular_2(String ingresoCelular_2) {
		this.ingresoCelular_2.setText(ingresoCelular_2);
	}

	public JTextField getIngresoOcupacion_2() {
		return ingresoOcupacion_2;
	}

	public void setIngresoOcupacion_2(String ingresoOcupacion_2) {
		this.ingresoOcupacion_2.setText(ingresoOcupacion_2);
	}

	public JTextField getIngresoNivelEducativo_2() {
		return ingresoNivelEducativo_2;
	}

	public void setIngresoNivelEducativo_2(String ingresoNivelEducativo_2) {
		this.ingresoNivelEducativo_2.setText(ingresoNivelEducativo_2);
	}

	public JTextField getIngresoNombre_3() {
		return ingresoNombre_3;
	}

	public void setIngresoNombre_3(String ingresoNombre_3) {
		this.ingresoNombre_3.setText(ingresoNombre_3);
	}

	public JTextField getIngresoApellido_3() {
		return ingresoApellido_3;
	}

	public void setIngresoApellido_3(String ingresoApellido_3) {
		this.ingresoApellido_3.setText(ingresoApellido_3);
	}

	public JTextField getIngresoVinculo_3() {
		return ingresoVinculo_3;
	}

	public void setIngresoVinculo_3(String ingresoVinculo_3) {
		this.ingresoVinculo_3.setText(ingresoVinculo_3);
	}

	public JTextField getIngresoDni_3() {
		return ingresoDni_3;
	}

	public void setIngresoDni_3(String ingresoDni_3) {
		this.ingresoDni_3.setText(ingresoDni_3);
	}

	public JTextField getIngresoFechaNacimiento_3() {
		return ingresoFechaNacimiento_3;
	}

	public void setIngresoFechaNacimiento_3(String ingresoFechaNacimiento_3) {
		this.ingresoFechaNacimiento_3.setText(ingresoFechaNacimiento_3);
	}

	public JTextField getIngresoEdad_3() {
		return ingresoEdad_3;
	}

	public void setIngresoEdad_3(String ingresoEdad_3) {
		this.ingresoEdad_3.setText(ingresoEdad_3);
	}

	public JTextField getIngresoDomicilio_3() {
		return ingresoDomicilio_3;
	}

	public void setIngresoDomicilio_3(String ingresoDomicilio_3) {
		this.ingresoDomicilio_3.setText(ingresoDomicilio_3);
	}

	public JTextField getIngresoCelular_3() {
		return ingresoCelular_3;
	}

	public void setIngresoCelular_3(String ingresoCelular_3) {
		this.ingresoCelular_3.setText(ingresoCelular_3);
	}

	public JTextField getIngresoOcupacion_3() {
		return ingresoOcupacion_3;
	}

	public void setIngresoOcupacion_3(String ingresoOcupacion_3) {
		this.ingresoOcupacion_3.setText(ingresoOcupacion_3);
	}

	public JTextField getIngresoNivelEducativo_3() {
		return ingresoNivelEducativo_3;
	}

	public void setIngresoNivelEducativo_3(String ingresoNivelEducativo_3) {
		this.ingresoNivelEducativo_3.setText(ingresoNivelEducativo_3);
	}

	public JTextField getIngresoID() {
		return ingresoID;
	}

	public void setIngresoID(String ingresoID) {
		this.ingresoID.setText(ingresoID);
		;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public JTextArea getTextAreaObservaciones() {
		return textAreaObservaciones;
	}

	public void setTextAreaObservaciones(String textAreaObservaciones) {
		this.textAreaObservaciones.setText(textAreaObservaciones);
	}

}
