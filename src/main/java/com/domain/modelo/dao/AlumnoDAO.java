package com.domain.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.domain.modelo.Alumno;
import com.domain.modelo.Model;

import util.ConnectionManager;

public class AlumnoDAO implements DAO {

	public AlumnoDAO() {
	}

	@Override
	public void agregar(Model pModel) throws ClassNotFoundException, SQLException {
		// 1 conectar a la base de datos
		ConnectionManager.conectar();
		// 2 obtengo la conexion
		Connection con = ConnectionManager.getConexion();
		// 3 ahora viene el sql
		StringBuilder sql = new StringBuilder(
				"insert into alumnos(alu_nombre, alu_apellido, alu_email, alu_conocimientos, alu_git, alu_observaciones)");
		sql.append("values(?,?,?,?,?,?)");

		// 4 El sql con un preparedStatement
		// downCast
		Alumno alu = (Alumno) pModel;

		PreparedStatement ps = con.prepareStatement(sql.toString());
		ps.setString(1, alu.getNombre());
		ps.setString(2, alu.getApellido());
		ps.setString(3, alu.getEmail());
		ps.setString(4, alu.getEstudios());
		ps.setString(5, alu.getLinkArepositorio());
		ps.setString(6, alu.getObservaciones());

		// 5 ejecutar
		ps.execute();

		// Cerramos la conexion
		con.close();
		ConnectionManager.desconectar();

	}

	@Override
	public void modificar(Model pModel) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Model pModel) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Model> leer(Model pModel) {
		// TODO Auto-generated method stub
		return null;
	}

}
