package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DataBaseRealAccessProxy implements DatabaseAccess {
	private DatabaseRealAccess database;
	private String password = "s7gur1d4d";
	
	
	
	public DataBaseRealAccessProxy(DatabaseRealAccess database, String password) {
		this.database = database;
		this.password = password;
	}

	
	public Collection<String> getSearchResults(String queryString) {
		if (isPassword(this.password))
			return this.database.getSearchResults(queryString);
		else
			throw new RuntimeException("Acceso denegado");
	}
	

	public int insertNewRow(List<String> rowData) {
		if (isPassword(this.password))
			return this.database.insertNewRow(rowData);
		else
			throw new RuntimeException("Acceso denegado");
	}
	
	private boolean isPassword(String pass) {
		return this.password.equals(pass);
	}

}
