package controller;




import model.Entrevista;
import view.VentanaEditarEntrevista;



public interface ICrudEntrevista {
	
	public void agregarRegistro(Entrevista entrevista);
	public Entrevista obtenerRegistro(Entrevista entrevista);
	public void eliminarRegistro(Entrevista entrevista);
	void actualizarRegistro(Entrevista entrevista, VentanaEditarEntrevista datos);
	
	


}
