package controller;

import javax.swing.JOptionPane;

import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import model.Responsable;
import view.VentanaEditarDatosFamiliares;

public class CrudResponsable implements ICrudResponsable {
	
	private ObjectContainer db;
	private ConexionBBDD miConexion = new ConexionBBDD();
	private ObjectSet<Responsable> result;
	

	@Override
	public void agregarRegistro(Responsable responsable, String nombreBBDD) {
		try {

			miConexion.conectaBBDD(nombreBBDD);
			db = miConexion.getDb();
			db.store(responsable);


		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "No se pudo insertar el registro.");

		} finally {

			miConexion.cerrarConexion();
		}
	}

	@Override
	public Responsable obtenerRegistro(Responsable responsable, String nombreBBDD) {
		try {
			miConexion.conectaBBDD(nombreBBDD);
			db = miConexion.getDb();

			result = db.queryByExample(responsable);
			
			
			return result.next();
			
		} catch (Exception e) {
			return null;
		} finally {

			miConexion.cerrarConexion();
		}
	}

	@Override
	public void eliminarRegistro(Responsable responsable, String nombreBBDD) {
		try {
			miConexion.conectaBBDD(nombreBBDD);

			db = miConexion.getDb();

			result = db.queryByExample(responsable);

			while (result.hasNext()) {

				Responsable responsableDelete = result.next();

				db.delete(responsableDelete);


			}

		} catch (Exception e) {

		} finally {

			miConexion.cerrarConexion();

		}
		
	}

	@Override
	public void actualizarRegistroResponsable_1(Responsable responsable, VentanaEditarDatosFamiliares datos, String nombreBBDD) {
		try {

			miConexion.conectaBBDD(nombreBBDD);

			db = miConexion.getDb();

			result = db.queryByExample(responsable);

			while (result.hasNext()) {

				Responsable resp =  result.next();
				resp.setId(datos.getIngresoID().getText());
				resp.setNombre(datos.getIngresoNombre().getText());
				resp.setApellido(datos.getIngresoApellido().getText());
				resp.setVinculo(datos.getIngresoVinculo().getText());
				resp.setDni(datos.getIngresoDni().getText());
				resp.setFechaNacimiento(datos.getIngresoFechaNacimiento().getText());
				resp.setEdad(datos.getIngresoEdad().getText());
				resp.setDomicilio(datos.getIngresoDomicilio().getText());
				resp.setCelular(datos.getIngresoCelular().getText());
				resp.setOcupacion(datos.getIngresoOcupacion().getText());
				resp.setNivelEducativo(datos.getIngresoNivelEducativo().getText());
				resp.setObservaciones(datos.getTextAreaObservaciones().getText());

				db.store(resp);
			}

		} catch (Exception e) {

		} finally {

			miConexion.cerrarConexion();
		}
	}

	@Override
	public void actualizarRegistroResponsable_2(Responsable responsable, VentanaEditarDatosFamiliares datos,
			String nombreBBDD) {
		try {

			miConexion.conectaBBDD(nombreBBDD);

			db = miConexion.getDb();

			result = db.queryByExample(responsable);

			while (result.hasNext()) {

				 Responsable resp =  result.next();
				resp.setId(datos.getIngresoID().getText());
				resp.setNombre(datos.getIngresoNombre_2().getText());
				resp.setApellido(datos.getIngresoApellido_2().getText());
				resp.setVinculo(datos.getIngresoVinculo_2().getText());
				resp.setDni(datos.getIngresoDni_2().getText());
				resp.setFechaNacimiento(datos.getIngresoFechaNacimiento_2().getText());
				resp.setEdad(datos.getIngresoEdad_2().getText());
				resp.setDomicilio(datos.getIngresoDomicilio_2().getText());
				resp.setCelular(datos.getIngresoCelular_2().getText());
				resp.setOcupacion(datos.getIngresoOcupacion_2().getText());
				resp.setNivelEducativo(datos.getIngresoNivelEducativo_2().getText());
				

				db.store(resp);
			}

		} catch (Exception e) {

		} finally {

			miConexion.cerrarConexion();
		}
	}

	@Override
	public void actualizarRegistroResponsable_3(Responsable responsable, VentanaEditarDatosFamiliares datos,
			String nombreBBDD) {
		try {

			miConexion.conectaBBDD(nombreBBDD);

			db = miConexion.getDb();

			result = db.queryByExample(responsable);

			while (result.hasNext()) {

				Responsable resp =  result.next();
				resp.setId(datos.getIngresoID().getText());
				resp.setNombre(datos.getIngresoNombre_3().getText());
				resp.setApellido(datos.getIngresoApellido_3().getText());
				resp.setVinculo(datos.getIngresoVinculo_3().getText());
				resp.setDni(datos.getIngresoDni_3().getText());
				resp.setFechaNacimiento(datos.getIngresoFechaNacimiento_3().getText());
				resp.setEdad(datos.getIngresoEdad_3().getText());
				resp.setDomicilio(datos.getIngresoDomicilio_3().getText());
				resp.setCelular(datos.getIngresoCelular_3().getText());
				resp.setOcupacion(datos.getIngresoOcupacion_3().getText());
				resp.setNivelEducativo(datos.getIngresoNivelEducativo_3().getText());
				

				db.store(resp);
			}

		} catch (Exception e) {

		} finally {

			miConexion.cerrarConexion();
		}
		
	}

}
