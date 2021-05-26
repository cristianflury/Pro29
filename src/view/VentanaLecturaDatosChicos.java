package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.Box;
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
import controller.ManejoLecturaDatosChicos;

import model.Chico;

public class VentanaLecturaDatosChicos extends JFrame implements Printable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2369646257862814701L;
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
	private JPanel panelPrincipal;
	private JPanel panelGridLayout;
	private JPanel panelObservaciones;
	private JButton imprimir, btnVolver, btnVerOtro;
	private JPanel panelInferior;
	private JPanel panelCentral;

	/**
	 * Create the frame.
	 */
	public VentanaLecturaDatosChicos(Chico chico) {
		setTitle("Datos Ni\u00F1o/a Pro29");

		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuAgregarRegistro.class.getResource("/images/icono.png")));
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
		FlowLayout flowLayout_3 = (FlowLayout) panelTitulo.getLayout();
		flowLayout_3.setHgap(60);
		panelTitulo.setBackground(Color.BLACK);
		panelSuperior.add(panelTitulo, BorderLayout.CENTER);

		JLabel etqTitulo = new JLabel(" DATOS NI\u00D1O/A");
		etqTitulo.setBackground(Color.BLACK);
		panelTitulo.add(etqTitulo);
		etqTitulo.setIcon(new ImageIcon(VentanaLecturaDatosChicos.class.getResource("/images/verRegistro2.png")));

		etqTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		etqTitulo.setFont(new Font("Arial Black", Font.BOLD, 23));
		etqTitulo.setForeground(Color.WHITE);

		JLabel iconLogo = new JLabel("");
		iconLogo.setIcon(new ImageIcon(VentanaDatosChicos.class.getResource("/images/pro29logo.png")));
		panelTitulo.add(iconLogo);

		JPanel panelAnioLectivo = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panelAnioLectivo.getLayout();
		flowLayout_2.setHgap(20);
		panelAnioLectivo.setBackground(Color.BLACK);
		panelSuperior.add(panelAnioLectivo, BorderLayout.EAST);

		JLabel etqAnioLectivo = new JLabel("A\u00F1o Lectivo: ");
		etqAnioLectivo.setHorizontalAlignment(SwingConstants.CENTER);
		panelAnioLectivo.add(etqAnioLectivo);
		etqAnioLectivo.setFont(new Font("Arial Black", Font.BOLD, 23));
		etqAnioLectivo.setForeground(Color.WHITE);

		ingresoAnioLectivo = new JTextField();
		panelAnioLectivo.add(ingresoAnioLectivo);
		ingresoAnioLectivo.setText(chico.getAnioLectivo());
		ingresoAnioLectivo.setEditable(false);
		ingresoAnioLectivo.setColumns(10);

		panelInferior = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panelInferior.getLayout();
		flowLayout_1.setVgap(2);
		panelInferior.setBackground(new Color(105, 105, 105));
		panelPrincipal.add(panelInferior, BorderLayout.SOUTH);

		// FORMULARIO DENTRO DEL PANEL CENTRAL CON GRIDLAYOUT

		panelCentral = new JPanel();
		panelCentral.setBackground(new Color(105, 105, 105));
		panelPrincipal.add(panelCentral, BorderLayout.CENTER);
		panelCentral.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));

		Box verticalBox = Box.createVerticalBox();
		panelCentral.add(verticalBox);

		panelGridLayout = new JPanel();
		panelGridLayout.setBorder(null);
		panelGridLayout.setBackground(new Color(105, 105, 105));
		verticalBox.add(panelGridLayout);
		panelGridLayout.setLayout(new GridLayout(8, 4, 10, 10));

		// NOMBRE
		JLabel etqNombre = new JLabel("Nombre");
		etqNombre.setForeground(new Color(255, 255, 255));
		etqNombre.setBackground(new Color(95, 158, 160));
		etqNombre.setOpaque(true);
		etqNombre.setHorizontalAlignment(SwingConstants.LEFT);
		etqNombre.setFont(new Font("Arial Black", Font.PLAIN, 18));
		panelGridLayout.add(etqNombre);

		ingresoNombre = new JTextField();
		ingresoNombre.setEditable(false);
		ingresoNombre.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoNombre.setToolTipText("");
		ingresoNombre.setColumns(20);
		ingresoNombre.setText(chico.getNombre());
		panelGridLayout.add(ingresoNombre);

		// APELLIDO
		JLabel etqApellido = new JLabel("Apellido");
		etqApellido.setForeground(new Color(255, 255, 255));
		etqApellido.setBackground(new Color(95, 158, 160));
		etqApellido.setOpaque(true);
		etqApellido.setHorizontalAlignment(SwingConstants.LEFT);
		etqApellido.setFont(new Font("Arial Black", Font.PLAIN, 18));
		panelGridLayout.add(etqApellido);

		ingresoApellido = new JTextField();
		ingresoApellido.setEditable(false);
		ingresoApellido.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoApellido.setColumns(20);
		ingresoApellido.setText(chico.getApellido());
		panelGridLayout.add(ingresoApellido);

		// DNI
		JLabel etqDni = new JLabel("Documento");
		etqDni.setForeground(new Color(255, 255, 255));
		etqDni.setBackground(new Color(95, 158, 160));
		etqDni.setOpaque(true);
		etqDni.setHorizontalAlignment(SwingConstants.LEFT);
		etqDni.setFont(new Font("Arial Black", Font.PLAIN, 18));
		panelGridLayout.add(etqDni);

		ingresoDni = new JTextField();
		ingresoDni.setEditable(false);
		ingresoDni.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoDni.setColumns(20);
		ingresoDni.setText(chico.getDocumento());
		panelGridLayout.add(ingresoDni);

		// DOMICILIO
		JLabel etqDomicilio = new JLabel("Domicilio");
		etqDomicilio.setForeground(new Color(255, 255, 255));
		etqDomicilio.setBackground(new Color(95, 158, 160));
		etqDomicilio.setOpaque(true);
		etqDomicilio.setHorizontalAlignment(SwingConstants.LEFT);
		etqDomicilio.setFont(new Font("Arial Black", Font.PLAIN, 18));
		panelGridLayout.add(etqDomicilio);

		ingresoDomicilio = new JTextField();
		ingresoDomicilio.setEditable(false);
		ingresoDomicilio.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoDomicilio.setColumns(20);
		ingresoDomicilio.setText(chico.getDomicilio());
		panelGridLayout.add(ingresoDomicilio);

		// FECHA DE NACIMIENTO
		JLabel etqFechaNacimiento = new JLabel("Fecha Nacimiento");
		etqFechaNacimiento.setForeground(new Color(255, 255, 255));
		etqFechaNacimiento.setBackground(new Color(95, 158, 160));
		etqFechaNacimiento.setOpaque(true);
		etqFechaNacimiento.setHorizontalAlignment(SwingConstants.LEFT);
		etqFechaNacimiento.setFont(new Font("Arial Black", Font.PLAIN, 18));
		panelGridLayout.add(etqFechaNacimiento);

		ingresoFechaNacimiento = new JTextField();
		ingresoFechaNacimiento.setEditable(false);
		ingresoFechaNacimiento.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoFechaNacimiento.setColumns(20);
		ingresoFechaNacimiento.setText(chico.getFechaNacimiento());
		panelGridLayout.add(ingresoFechaNacimiento);

		// EDAD
		JLabel etqEdad = new JLabel("Edad");
		etqEdad.setForeground(new Color(255, 255, 255));
		etqEdad.setBackground(new Color(95, 158, 160));
		etqEdad.setOpaque(true);
		etqEdad.setHorizontalAlignment(SwingConstants.LEFT);
		etqEdad.setFont(new Font("Arial Black", Font.PLAIN, 18));
		panelGridLayout.add(etqEdad);

		ingresoEdad = new JTextField();
		ingresoEdad.setEditable(false);
		ingresoEdad.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		ingresoEdad.setColumns(20);
		ingresoEdad.setText(chico.getEdad());
		panelGridLayout.add(ingresoEdad);

		// ESCUELA
		JLabel etqEscuela = new JLabel("Escuela");
		etqEscuela.setForeground(new Color(255, 255, 255));
		etqEscuela.setBackground(new Color(95, 158, 160));
		etqEscuela.setOpaque(true);
		etqEscuela.setHorizontalAlignment(SwingConstants.LEFT);
		etqEscuela.setFont(new Font("Arial Black", Font.PLAIN, 18));
		panelGridLayout.add(etqEscuela);

		ingresoEscuela = new JTextField();
		ingresoEscuela.setEditable(false);
		ingresoEscuela.setFont(new Font("Tahoma", Font.PLAIN, 17));
		ingresoEscuela.setColumns(20);
		ingresoEscuela.setText(chico.getEscuela());
		panelGridLayout.add(ingresoEscuela);

		// Celular Responsable
		JLabel etqIngresoCelular = new JLabel("Celular Responsable");
		etqIngresoCelular.setHorizontalAlignment(SwingConstants.LEFT);
		etqIngresoCelular.setForeground(new Color(255, 255, 255));
		etqIngresoCelular.setBackground(new Color(95, 158, 160));
		etqIngresoCelular.setOpaque(true);
		etqIngresoCelular.setFont(new Font("Arial Black", Font.PLAIN, 18));
		panelGridLayout.add(etqIngresoCelular);

		ingresoCelular = new JTextField();
		ingresoCelular.setEditable(false);
		ingresoCelular.setFont(new Font("Tahoma", Font.PLAIN, 17));
		ingresoCelular.setColumns(20);
		ingresoCelular.setText(chico.getCelPrincipalResponsable());
		panelGridLayout.add(ingresoCelular);

		Component verticalStrut = Box.createVerticalStrut(40);
		verticalBox.add(verticalStrut);

		// OBSERVACIONES DENTRO DEL PANEL OBSERVACIONES
		panelObservaciones = new JPanel();
		panelObservaciones.setBackground(SystemColor.activeCaption);
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
		textAreaObservaciones.setEditable(false);
		lblObservaciones.setLabelFor(textAreaObservaciones);
		textAreaObservaciones.setWrapStyleWord(true);
		textAreaObservaciones.setLineWrap(true);
		textAreaObservaciones.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		textAreaObservaciones.setRows(10);
		textAreaObservaciones.setColumns(20);
		textAreaObservaciones.setBorder(new LineBorder(Color.BLACK, 1));
		textAreaObservaciones.setText(chico.getObservaciones());

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

		btnVolver = new JButton("Volver");
		btnVolver.setForeground(new Color(255, 255, 255));
		btnVolver.setBackground(new Color(0, 128, 128));
		btnVolver.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnVolver.setCursor(new Cursor(Cursor.HAND_CURSOR));
		// Evento Boton Volver
		btnVolver.addActionListener(new ManejoCambioVentana(new MenuVerRegistro(), this));
		panelBotones.add(btnVolver);

		btnVerOtro = new JButton("Ver Otro");
		btnVerOtro.setBackground(new Color(0, 128, 128));
		btnVerOtro.setForeground(new Color(255, 255, 255));
		btnVerOtro.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnVerOtro.setFont(new Font("Arial Black", Font.BOLD, 17));

		// Evento Botón Ver Otro
		btnVerOtro.addActionListener(new ManejoLecturaDatosChicos(this));
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
