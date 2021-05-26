package controller;




import model.Responsable;

import view.VentanaEditarDatosFamiliares;



public interface ICrudResponsable {
	
	public void agregarRegistro(Responsable responsable, String nombreBBDD);
	public Responsable obtenerRegistro(Responsable responsable, String nombreBBDD);
	public void eliminarRegistro(Responsable responsable, String nombreBBDD);
	void actualizarRegistroResponsable_1(Responsable responsable, VentanaEditarDatosFamiliares datos, String nombreBBDD);
	void actualizarRegistroResponsable_2(Responsable responsable, VentanaEditarDatosFamiliares datos, String nombreBBDD);
	void actualizarRegistroResponsable_3(Responsable responsable, VentanaEditarDatosFamiliares datos, String nombreBBDD);
	


}
