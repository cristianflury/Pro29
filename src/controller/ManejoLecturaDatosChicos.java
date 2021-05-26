package controller;

import java.awt.Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Chico;
import view.VentanaLecturaDatosChicos;



public class ManejoLecturaDatosChicos implements ActionListener {

	private String id;
	private Chico chicoBuscado;
	private Frame ventana;
	private ICrudChicos crud = new CrudChicos();
	
	public  ManejoLecturaDatosChicos( Frame ventana) {
		this.ventana = ventana;
	}
	

	private void pideDniNinio() {
		
		id = JOptionPane.showInputDialog(null, "Por favor, ingrese el DNI del niño/a.");

	}

	private boolean verificaChico(Chico chico) {
		boolean existe;
		Chico chicoTemp = new Chico();
		
		chicoTemp.setDocumento(chico.getDocumento());
		chicoTemp = crud.obtenerRegistro(chicoTemp);

		if (chicoTemp == null)
			existe = false;
		else
			existe = true;

		return existe;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		pideDniNinio();
		chicoBuscado = new Chico();
		chicoBuscado.setDocumento(id);
		if ( id == null || id.equals("")) {
			
			JOptionPane.showMessageDialog(null, "Debe ingresar un DNI");

		} else {
			if (verificaChico(chicoBuscado) == true) {
				chicoBuscado = crud.obtenerRegistro(chicoBuscado);
				VentanaLecturaDatosChicos v = new VentanaLecturaDatosChicos(chicoBuscado);
				v.setVisible(true);
				ventana.setVisible(false);
				ventana.dispose();
				
			} else {
				
				JOptionPane.showMessageDialog(null,
						
						"El registro con DNI " + chicoBuscado.getDocumento() + " no existe.");
			}

		}

	}
}
