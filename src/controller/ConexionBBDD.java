package controller;



import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;


public class ConexionBBDD {
	
	private ObjectContainer db;
	
	public void conectaBBDD(String nombreBBDD) {
		
		
		db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), nombreBBDD);
		
		
	}
	
	
	
	public ObjectContainer getDb() {
		return db;
	}





	public void cerrarConexion() {
		
		db.close();
	}
	
	

}
