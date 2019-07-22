package modelo;

import java.util.ArrayList;

//Clase que se comunica con la clase BD e invoca los metodos que ella tiene
public class RegionDAO {
	private BD bd;

	public RegionDAO() {
		this.bd = new BD();
	}

	public ArrayList<Region> listarRegiones() {
		return this.bd.listarRegiones();
	}

	public Region buscarRegion(int id) {
		return this.bd.buscarRegion(id);
	}
}
