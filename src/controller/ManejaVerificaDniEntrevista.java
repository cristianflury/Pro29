package controller;

import java.awt.Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.Chico;
import model.Entrevista;
import view.VentanaEntrevista;

public class ManejaVerificaDniEntrevista implements ActionListener {

	private Frame ventana;
	private String id;

	public ManejaVerificaDniEntrevista(Frame ventana) {
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		pideDniNinio();
		if (verificaDni()) {

			if (verificaChico()) {
				if (!verificaEntrevista()) {

					VentanaEntrevista v = new VentanaEntrevista(id);
					v.setVisible(true);
					ventana.setVisible(false);
					ventana.dispose();
				}
			}
		}

	}

	private void pideDniNinio() {
	
		id = JOptionPane.showInputDialog(null, "Por favor, ingrese el DNI del niño/a.");

	}

	private boolean verificaDni() {
		boolean tiene;

		if (this.id == null || this.id.equals("")) {
		
			JOptionPane.showMessageDialog(null, "Debe ingresar un DNI.");

			tiene = false;
		} else {

			tiene = true;
		}

		return tiene;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private boolean verificaChico() {
		boolean existe;
		Chico chicoTemp = new Chico();
		ICrudChicos crud = new CrudChicos();
		chicoTemp.setDocumento(id);
		chicoTemp = crud.obtenerRegistro(chicoTemp);

		if (chicoTemp == null) {

			existe = false;
			JOptionPane.showMessageDialog(null,  "Debe registrar los datos del niño/a con DNI " + id + "\n"
					+ "antes de cargar la entrevista.");


		} else {

			existe = true;
		}

		return existe;
	}

	private boolean verificaEntrevista() {

		boolean existe;
		Entrevista entre = new Entrevista();
		ICrudEntrevista crud = new CrudEntrevista();
		entre.setId(id);
		entre = crud.obtenerRegistro(entre);

		if (entre == null) {
			existe = false;

		} else {
			existe = true;
			JOptionPane.showMessageDialog(null, "Los datos de la entrevista del niño/a \n con DNI " + id + " ya existen.");
		}

		return existe;

	}

}
