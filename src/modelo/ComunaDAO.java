package modelo;

import java.util.ArrayList;
//Clase que se comunica con la clase BD e invoca los metodos que ella tiene
public class ComunaDAO {
	private BD bd;

	public ComunaDAO() {
		this.bd = new BD();
	}

	public ArrayList<Comuna> listarComunas() {
		return this.bd.listarComunas();
	}

	public Comuna buscarComuna(int id) {
		return this.bd.buscarComuna(id);
	}
}
