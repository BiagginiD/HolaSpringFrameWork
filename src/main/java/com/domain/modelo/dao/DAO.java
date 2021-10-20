package com.domain.modelo.dao;

import java.sql.SQLException;
import java.util.List;

import com.domain.modelo.Model;

public interface DAO {
	
	void agregar(Model pModel) throws ClassNotFoundException, SQLException;
	
	void modificar(Model pModel) throws ClassNotFoundException, SQLException;
	
	void eliminar(Model pModel) throws ClassNotFoundException, SQLException;
	
	List<Model> leer(Model pModel) throws ClassNotFoundException, SQLException;

}
