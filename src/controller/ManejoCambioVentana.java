package controller;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManejoCambioVentana implements ActionListener {
	
	private Frame ventanaIr;
	private Frame ventanaSalir;
	
	public ManejoCambioVentana(Frame ventanaIr , Frame ventanaSalir) {
		this.ventanaIr = ventanaIr;
		this.ventanaSalir = ventanaSalir;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		ventanaIr.setVisible(true);
		ventanaSalir.setVisible(false);
		ventanaSalir.dispose();
	}

}
