package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	private int aura;
	private boolean salioACazar;
	String user = "root";
	String psw = "admin";
	String path = "jdbc:mysql://localhost:3306/sic_seben";

	public void hacerChistesDeLeon() {
		if (aura > 400) {
			System.out.println("Un señor le pregunta a una señora '¿está felipe?'");
			System.out.println("noo estoy triste pe");
		} else if (aura > 200) {
			System.out.println("");
			System.out.println("");
		}
	}

	public void agregar() {
		String sql = "INSERT INTO `aura`(`id`, `dni_verity`,`nombreuwu`)VALUES(3, '49998007', 'jani');";
		Connection conexion = null;
		try {
			conexion = conectar();
			Statement stmt = conexion.createStatement();
			int filas = stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public Connection conectar() {
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(path, user, psw);
			Statement stmt = conexion.createStatement();
			System.out.println("Se conectó");
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return conexion;
	}
}
