package principal;

import dao.DAO;

public class leon {

	public static void main(String[] args) {
		DAO miPrimerConexion = new DAO();
		miPrimerConexion.conectar();
		miPrimerConexion.hacerChistesDeLeon();

	}

}
