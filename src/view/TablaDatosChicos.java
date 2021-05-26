package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.awt.print.PrinterException;


import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import controller.Resaltador;

import javax.swing.JTextField;
import java.awt.FlowLayout;

public class TablaDatosChicos extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -985878442914256758L;
	private JPanel contentPane;
	private JTextField ingresoBuscador;

	/**
	 * Create the frame.
	 */
	public TablaDatosChicos() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenuAgregarRegistro.class.getResource("/images/icono.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0,0, 950, 750);
	
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setTitle("Listado Pro29");
		setContentPane(contentPane);

		JPanel panelTitulo = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panelTitulo.getLayout();
		flowLayout.setHgap(30);
		panelTitulo.setBackground(Color.BLACK);
		contentPane.add(panelTitulo, BorderLayout.NORTH);

		JLabel etqBuscador = new JLabel("Buscar por apellido");
		etqBuscador.setFont(new Font("Arial Black", Font.BOLD, 20));
		etqBuscador.setForeground(Color.WHITE);
		etqBuscador.setIcon(new ImageIcon(VentanaLecturaDatosChicos.class.getResource("/images/verRegistro2.png")));
		panelTitulo.add(etqBuscador);

		ingresoBuscador = new JTextField();
		panelTitulo.add(ingresoBuscador);
		ingresoBuscador.setColumns(10);

		JLabel etqTitulo = new JLabel("Tabla De Datos");
		etqTitulo.setIcon(new ImageIcon(TablaDatosChicos.class.getResource("/images/pro29logo.png")));
		etqTitulo.setFont(new Font("Arial Black", Font.BOLD, 20));
		etqTitulo.setForeground(Color.WHITE);
		panelTitulo.add(etqTitulo);

		TableModel miModelo = new ModeloTablaChicos();
		
		Resaltador res = new Resaltador(0);
		res.setColumna(3);

		JTable miTabla = new JTable(miModelo);
		TableColumnModel columnModel = miTabla.getColumnModel();

	    columnModel.getColumn(0).setPreferredWidth(50);
	    columnModel.getColumn(1).setPreferredWidth(250);
	    columnModel.getColumn(2).setPreferredWidth(250);
	    columnModel.getColumn(3).setPreferredWidth(250);
	    columnModel.getColumn(4).setPreferredWidth(250);
	    columnModel.getColumn(5).setPreferredWidth(250);
	    columnModel.getColumn(6).setPreferredWidth(50);
		miTabla.setDefaultRenderer(Object.class, res);

				
		miTabla.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
	
		TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(miModelo);
		miTabla.setRowHeight(25);
	
		
		miTabla.setRowSorter(elQueOrdena);
		
		ingresoBuscador.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				elQueOrdena.setRowFilter(RowFilter.regexFilter("(?i)^" + ingresoBuscador.getText(), 1));
			}

		});

		getContentPane().add(new JScrollPane(miTabla), BorderLayout.CENTER);

		JPanel panelBotonImprimir = new JPanel();
		panelBotonImprimir.setBackground(new Color(105, 105, 105));
		contentPane.add(panelBotonImprimir, BorderLayout.SOUTH);
		FlowLayout flow = new FlowLayout();
		flow.setHgap(100);
		panelBotonImprimir.setLayout(flow);

		JButton btnImprimir = new JButton("Imprimir Datos");
		btnImprimir.setForeground(new Color(255, 255, 255));
		btnImprimir.setBackground(new Color(0, 128, 128));
		btnImprimir.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnImprimir.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnImprimir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				try {
					
					miTabla.print();
				} catch (PrinterException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setForeground(new Color(255, 255, 255));
		btnSalir.setBackground(new Color(0, 128, 128));
		btnSalir.setFont(new Font("Arial Black", Font.BOLD, 17));
		btnSalir.setCursor(new Cursor(Cursor.HAND_CURSOR));
		btnSalir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				dispose();	
				
			}
			
			
		});
		
		
		panelBotonImprimir.add(btnSalir);
		panelBotonImprimir.add(btnImprimir);

	}

	public JTextField getIngresoBuscador() {
		return ingresoBuscador;
	}

	public void setIngresoBuscador(String ingresoBuscador) {
		this.ingresoBuscador.setText(ingresoBuscador);
	}

}
