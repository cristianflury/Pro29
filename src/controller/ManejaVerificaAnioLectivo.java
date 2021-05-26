package controller;

import java.awt.Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import view.VentanaDatosChicos;

public class ManejaVerificaAnioLectivo implements ActionListener {

	private String anioLectivo;
	private Frame ventana;
	
	

	public ManejaVerificaAnioLectivo(Frame ventana) {
		this.ventana = ventana;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		pideAnioLectivo();
		if(verificaAnioLectivo()) {
			
			VentanaDatosChicos v = new VentanaDatosChicos(anioLectivo);
			v.setVisible(true);
			ventana.setVisible(false);
			ventana.dispose();
			
		}

	}

	private void pideAnioLectivo() {
		
		anioLectivo = JOptionPane.showInputDialog(null, "Por favor, ingrese el AÑO LECTIVO.");
	}
	
	
	private boolean verificaAnioLectivo() {
		boolean tiene;
		
		if (this.anioLectivo == null || this.anioLectivo.equals("")) {
			
			JOptionPane.showMessageDialog(null, "Debe ingresar el AÑO LECTIVO.");
			
			tiene = false;
		}else {
			
			tiene = true;
		}
		
		return tiene;
	}

	public String getAnioLectivo() {
		return anioLectivo;
	}

	public void setAnioLectivo(String anioLectivo) {
		this.anioLectivo = anioLectivo;
	}
	
	

}
