package controller;

import java.util.List;

import model.Chico;
import view.VentanaEditarDatosChicos;



public interface ICrudChicos {
	
	
	public void agregarRegistro(Chico chico);
	public Chico obtenerRegistro(Chico chico);
	public List<Chico> obtenerTodosLosRegistros(Chico chico);
	public void eliminarRegistro(Chico chico);
	void actualizarRegistro(Chico chico, VentanaEditarDatosChicos datos);
	


}
