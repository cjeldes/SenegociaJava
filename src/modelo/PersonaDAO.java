package modelo;

import java.util.ArrayList;

//Clase que se comunica con la clase BD e invoca los metodos que ella tiene
public class PersonaDAO {
	private BD bd;

	public PersonaDAO() {
		this.bd = new BD();
	}

	public ArrayList<Persona> listar() {
		return this.bd.listarPersonas();
	}
}
