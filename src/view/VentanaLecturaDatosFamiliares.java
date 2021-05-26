package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import javax.swing.border.LineBorder;


import controller.ManejoCambioVentana;
import controller.ManejoLecturaDatosFamiliares;

import model.Responsable;


public class VentanaLecturaDatosFamiliares extends JFrame implements Printable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2788441627659892219L;
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
	private JTextField ingresoID;
	private JTextArea textAreaObservaciones;
	private JButton imprimir;
	private JPanel panelPrincipal;
	private JPanel panelInferior;

	/**
	 * Create the frame.
	 */
	public VentanaLecturaDatosFamiliares(Responsable resp_1, Responsable resp_2, Responsable resp_3) {

		setTitle("Datos Familiares Pro29");
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaDatosFamiliares.class.getResource("/images/icono.png")));

		setBounds(0, 0, 1300, 650);
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		// PANEL PRINCIPAL
	    panelPrincipal = new JPanel();
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

		JLabel etqTitulo = new JLabel("DATOS FAMILIARES");
		etqTitulo.setForeground(Color.WHITE);
		panelTitulo.add(etqTitulo);
		etqTitulo.setIcon(new ImageIcon(VentanaLecturaDatosFamiliares.class.getResource("/images/verRegistro2.png")));
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
		ingresoID.setText(resp_1.getId());
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
		ingresoNombre.setText(resp_1.getNombre());
		ingresoNombre.setColumns(20);
		ingresoNombre.setEditable(false);
		panelIngreso1.add(ingresoNombre);

		ingresoApellido = new JTextField();
		ingresoApellido.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoApellido.setColumns(20);
		ingresoApellido.setText(resp_1.getApellido());
		ingresoApellido.setEditable(false);

		panelIngreso1.add(ingresoApellido);

		ingresoVinculo = new JTextField();
		ingresoVinculo.setEditable(false);
		ingresoVinculo.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoVinculo.setColumns(20);
		ingresoVinculo.setText(resp_1.getVinculo());

		panelIngreso1.add(ingresoVinculo);

		ingresoDni = new JTextField();
		ingresoDni.setEditable(false);
		ingresoDni.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoDni.setColumns(20);
		ingresoDni.setText(resp_1.getDni());

		panelIngreso1.add(ingresoDni);

		ingresoFechaNacimiento = new JTextField();
		ingresoFechaNacimiento.setEditable(false);
		ingresoFechaNacimiento.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoFechaNacimiento.setColumns(20);
		ingresoFechaNacimiento.setText(resp_1.getFechaNacimiento());

		panelIngreso1.add(ingresoFechaNacimiento);

		ingresoEdad = new JTextField();
		ingresoEdad.setEditable(false);
		ingresoEdad.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoEdad.setColumns(20);
		ingresoEdad.setText(resp_1.getEdad());

		panelIngreso1.add(ingresoEdad);

		ingresoDomicilio = new JTextField();
		ingresoDomicilio.setEditable(false);
		ingresoDomicilio.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoDomicilio.setColumns(20);
		ingresoDomicilio.setText(resp_1.getDomicilio());

		panelIngreso1.add(ingresoDomicilio);

		ingresoCelular = new JTextField();
		ingresoCelular.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoCelular.setColumns(20);
		ingresoCelular.setText(resp_1.getCelular());
		ingresoCelular.setEditable(false);

		panelIngreso1.add(ingresoCelular);

		ingresoOcupacion = new JTextField();
		ingresoOcupacion.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoOcupacion.setColumns(20);
		ingresoOcupacion.setText(resp_1.getOcupacion());
		ingresoOcupacion.setEditable(false);

		panelIngreso1.add(ingresoOcupacion);

		ingresoNivelEducativo = new JTextField();
		ingresoNivelEducativo.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoNivelEducativo.setColumns(20);
		ingresoNivelEducativo.setText(resp_1.getNivelEducativo());
		ingresoNivelEducativo.setEditable(false);

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
		ingresoNombre_2.setEditable(false);
		ingresoNombre_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoNombre_2.setColumns(20);
		ingresoNombre_2.setText(resp_2.getNombre());
		panelIngreso2.add(ingresoNombre_2);

		ingresoApellido_2 = new JTextField();
		ingresoApellido_2.setEditable(false);
		ingresoApellido_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoApellido_2.setColumns(20);
		ingresoApellido_2.setText(resp_2.getApellido());
		panelIngreso2.add(ingresoApellido_2);

		ingresoVinculo_2 = new JTextField();
		ingresoVinculo_2.setEditable(false);
		ingresoVinculo_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoVinculo_2.setColumns(20);
		ingresoVinculo_2.setText(resp_2.getVinculo());
		panelIngreso2.add(ingresoVinculo_2);

		ingresoDni_2 = new JTextField();
		ingresoDni_2.setEditable(false);
		ingresoDni_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoDni_2.setColumns(20);
		ingresoDni_2.setText(resp_2.getDni());
		panelIngreso2.add(ingresoDni_2);

		ingresoFechaNacimiento_2 = new JTextField();
		ingresoFechaNacimiento_2.setEditable(false);
		ingresoFechaNacimiento_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoFechaNacimiento_2.setColumns(20);
		ingresoFechaNacimiento_2.setText(resp_2.getFechaNacimiento());
		panelIngreso2.add(ingresoFechaNacimiento_2);

		ingresoEdad_2 = new JTextField();
		ingresoEdad_2.setEditable(false);
		ingresoEdad_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoEdad_2.setColumns(20);
		ingresoEdad_2.setText(resp_2.getEdad());
		panelIngreso2.add(ingresoEdad_2);

		ingresoDomicilio_2 = new JTextField();
		ingresoDomicilio_2.setEditable(false);
		ingresoDomicilio_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoDomicilio_2.setColumns(20);
		ingresoDomicilio_2.setText(resp_2.getDomicilio());
		panelIngreso2.add(ingresoDomicilio_2);

		ingresoCelular_2 = new JTextField();
		ingresoCelular_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoCelular_2.setColumns(20);
		ingresoCelular_2.setText(resp_2.getCelular());
		ingresoCelular_2.setEditable(false);
		panelIngreso2.add(ingresoCelular_2);

		ingresoOcupacion_2 = new JTextField();
		ingresoOcupacion_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoOcupacion_2.setColumns(20);
		ingresoOcupacion_2.setText(resp_2.getOcupacion());
		ingresoOcupacion_2.setEditable(false);
		panelIngreso2.add(ingresoOcupacion_2);

		ingresoNivelEducativo_2 = new JTextField();
		ingresoNivelEducativo_2.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoNivelEducativo_2.setColumns(20);
		ingresoNivelEducativo_2.setText(resp_2.getNivelEducativo());
		ingresoNivelEducativo_2.setEditable(false);
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
		ingresoNombre_3.setEditable(false);
		ingresoNombre_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoNombre_3.setColumns(20);
		ingresoNombre_3.setText(resp_3.getNombre());
		panelIngreso3.add(ingresoNombre_3);

		ingresoApellido_3 = new JTextField();
		ingresoApellido_3.setEditable(false);
		ingresoApellido_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoApellido_3.setColumns(20);

		ingresoApellido_3.setText(resp_3.getApellido());
		panelIngreso3.add(ingresoApellido_3);

		ingresoVinculo_3 = new JTextField();
		ingresoVinculo_3.setEditable(false);
		ingresoVinculo_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoVinculo_3.setColumns(20);
		ingresoVinculo_3.setText(resp_3.getVinculo());
		panelIngreso3.add(ingresoVinculo_3);

		ingresoDni_3 = new JTextField();
		ingresoDni_3.setEditable(false);
		ingresoDni_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoDni_3.setColumns(20);
		ingresoDni_3.setText(resp_3.getDni());
		panelIngreso3.add(ingresoDni_3);

		ingresoFechaNacimiento_3 = new JTextField();
		ingresoFechaNacimiento_3.setEditable(false);
		ingresoFechaNacimiento_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoFechaNacimiento_3.setColumns(20);
		ingresoFechaNacimiento_3.setText(resp_3.getFechaNacimiento());
		panelIngreso3.add(ingresoFechaNacimiento_3);

		ingresoEdad_3 = new JTextField();
		ingresoEdad_3.setEditable(false);
		ingresoEdad_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoEdad_3.setColumns(20);
		ingresoEdad_3.setText(resp_3.getEdad());
		panelIngreso3.add(ingresoEdad_3);

		ingresoDomicilio_3 = new JTextField();
		ingresoDomicilio_3.setEditable(false);
		ingresoDomicilio_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoDomicilio_3.setColumns(20);
		ingresoDomicilio_3.setText(resp_3.getDomicilio());
		panelIngreso3.add(ingresoDomicilio_3);

		ingresoCelular_3 = new JTextField();
		ingresoCelular_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoCelular_3.setColumns(20);
		ingresoCelular_3.setText(resp_3.getCelular());
		ingresoCelular_3.setEditable(false);
		panelIngreso3.add(ingresoCelular_3);

		ingresoOcupacion_3 = new JTextField();
		ingresoOcupacion_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoOcupacion_3.setColumns(20);
		ingresoOcupacion_3.setText(resp_3.getOcupacion());
		ingresoOcupacion_3.setEditable(false);
		panelIngreso3.add(ingresoOcupacion_3);

		ingresoNivelEducativo_3 = new JTextField();
		ingresoNivelEducativo_3.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoNivelEducativo_3.setColumns(20);
		ingresoNivelEducativo_3.setText(resp_3.getNivelEducativo());
		ingresoNivelEducativo_3.setEditable(false);
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
		textAreaObservaciones.setEditable(false);
		textAreaObservaciones.setWrapStyleWord(true);
		textAreaObservaciones.setLineWrap(true);
		textAreaObservaciones.setRows(10);
		textAreaObservaciones.setColumns(40);
		textAreaObservaciones.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textAreaObservaciones.setBorder(new LineBorder(Color.BLACK, 1));
		textAreaObservaciones.setText(resp_1.getObservaciones());
		JScrollPane scrollObservaciones = new JScrollPane(textAreaObservaciones);
		panelObservaciones.add(scrollObservaciones);
		// PANEL INFERIOR Y SUS BOTONES MENÚ PRINCIPAL, CANCELAR Y GUARDAR

		panelInferior = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panelInferior.getLayout();
		flowLayout_1.setVgap(2);
		
		panelInferior.setBackground(new Color(105, 105, 105));
		panelPrincipal.add(panelInferior, BorderLayout.SOUTH);

		JPanel panelBotones = new JPanel();
		panelBotones.setBackground(new Color(105, 105, 105));
		FlowLayout flowLayout_4 = (FlowLayout) panelBotones.getLayout();
		flowLayout_4.setHgap(70);
		flowLayout_4.setVgap(15);
		panelInferior.add(panelBotones);

		JButton btnVolver = new JButton("Volver");
		btnVolver.setForeground(new Color(255, 255, 255));
		btnVolver.setBackground(new Color(0, 128, 128));
		btnVolver.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnVolver.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnVolver.addActionListener(new ManejoCambioVentana(new MenuVerRegistro(), this));

		panelBotones.add(btnVolver);

		JButton btnVerOtro = new JButton("Ver Otro");
		btnVerOtro.setForeground(new Color(255, 255, 255));
		btnVerOtro.setBackground(new Color(0, 128, 128));
		btnVerOtro.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnVerOtro.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnVerOtro.addActionListener(new ManejoLecturaDatosFamiliares(this));

		panelBotones.add(btnVerOtro);
		
		imprimir = new JButton("Imprimir Datos");
		imprimir.setBackground(new Color(0, 128, 128));
		imprimir.setForeground(new Color(255, 255, 255));
		imprimir.setCursor(new Cursor(Cursor.HAND_CURSOR));
		imprimir.setFont(new Font("Arial Black", Font.BOLD, 17));
		imprimir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				 botonImprimirInterfazActionPerformed(arg0);
			}
			
		});
		panelBotones.add(imprimir);

	
	}
	
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

		if (pageIndex > 0) { /* We have only one page, and 'page' is zero-based */
			return NO_SUCH_PAGE;
		}

		Graphics2D g2d = (Graphics2D) graphics;
		g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
		g2d.scale(pageFormat.getImageableWidth() / this.getWidth(), pageFormat.getImageableHeight() / this.getHeight());
		panelPrincipal.printAll(g2d);
		panelPrincipal.setBackground(Color.WHITE);
		panelInferior.setVisible(false);
		

		return PAGE_EXISTS;

	}
	
	
	private void botonImprimirInterfazActionPerformed(java.awt.event.ActionEvent evt) {
	    PrinterJob job = PrinterJob.getPrinterJob();
	    PageFormat preformat = job.defaultPage();
	    preformat.setOrientation(PageFormat.LANDSCAPE);
	    PageFormat postformat = job.pageDialog(preformat);
	    job.setPrintable(this, postformat);
	    
	    boolean doPrint = job.printDialog(); // mostrar diálogo de impresión
	    if (doPrint) {
	        try {
	            
	            job.print();
	            panelInferior.setVisible(true);
	        } catch (PrinterException e) {
	            // aquí maneja los errores al imprimir
	        	JOptionPane.showMessageDialog(this, e);
	        }
	    }
	}
	
	

}
