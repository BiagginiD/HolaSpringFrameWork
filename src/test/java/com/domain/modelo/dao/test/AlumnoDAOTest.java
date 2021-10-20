package com.domain.modelo.dao.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.domain.modelo.Alumno;
import com.domain.modelo.dao.AlumnoDAO;

public class AlumnoDAOTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAgregar() {
		Alumno alu = new Alumno();
		AlumnoDAO aluDAO = new AlumnoDAO();
		alu.setCodigo(0);
		alu.setNombre("nom_test");
		alu.setApellido("ape_test");
		alu.setEmail("email_test");
		alu.setEstudios("estudios_test");
		alu.setLinkArepositorio("link_test");
		alu.setObservaciones("observacion_test");
		try {
			aluDAO.agregar(alu);
			assertTrue(true);
		} catch (ClassNotFoundException e) {
			assertTrue(false);
		} catch (SQLException e) {
			assertTrue(false);
		}
	}

}
