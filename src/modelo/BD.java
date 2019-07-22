package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BD {
	// creacion de listas para trabajar clases.
	private ArrayList<Region> lstRegiones;
	private ArrayList<Comuna> lstComunas;
	private ArrayList<Persona> lstPersonas;

	public BD() {
		// instancia de listas y creacion de objetos
		this.lstRegiones = new ArrayList<Region>();
		this.lstRegiones.add(new Region(2, "Antofagasta", true));
		this.lstRegiones.add(new Region(5, "Valparaiso", true));
		this.lstRegiones.add(new Region(10, "Los Lagos", true));
		this.lstRegiones.add(new Region(15, "Arica", true));
		this.lstComunas = new ArrayList<Comuna>();
		this.lstComunas.add(new Comuna(1, "Calama", true, 2));
		this.lstComunas.add(new Comuna(2, "Mejillones", true, 2));
		this.lstComunas.add(new Comuna(3, "Limache", true, 5));
		this.lstComunas.add(new Comuna(4, "Olmue", true, 5));
		this.lstComunas.add(new Comuna(5, "Castro", true, 10));
		this.lstComunas.add(new Comuna(6, "Putre", true, 15));
		this.lstPersonas = new ArrayList<Persona>();
		this.lstPersonas.add(new Persona(1, "Juan", true, "Jose", "Direccion 1", 1));
		this.lstPersonas.add(new Persona(2, "Maria", true, "Muñoz", "Direccion 2", 2));
		this.lstPersonas.add(new Persona(3, "Pedro", true, "Perez", "Direccion 3", 3));
		this.lstPersonas.add(new Persona(4, "Luis", true, "Pinto", "Direccion 4", 4));
		this.lstPersonas.add(new Persona(5, "Dani", true, "Lobos", "Direccion 5", 5));
		this.lstPersonas.add(new Persona(6, "Diego", true, "Marin", "Direccion 6", 6));
	}

	// --------------- PERSONA ---------------
	// Metodo que retorna la lista de personas ordenadas por identificador
	public ArrayList<Persona> listarPersonas() {
		Collections.sort(lstPersonas, new Comparator<Persona>() {
			public int compare(Persona x, Persona y) {
				return x.getIdentificador() - y.getIdentificador();
			}
		});
		return lstPersonas;
	}

	// --------------- COMUNA ---------------
	// Metodo que retorna la lista de comunas ordenadas por identificador
	public ArrayList<Comuna> listarComunas() {
		Collections.sort(lstComunas, new Comparator<Comuna>() {
			public int compare(Comuna x, Comuna y) {
				return x.getIdentificador() - y.getIdentificador();
			}
		});
		return lstComunas;
	}

	// Metodo busca una comuna por su identificador en la lista de comunas
	public Comuna buscarComuna(int id) {
		for (Comuna tmp : lstComunas) {
			if (tmp.getIdentificador() == id) {
				return tmp;
			}
		}
		return null;
	}

	// --------------- REGION ---------------
	// Metodo que retorna la lista de regiones ordenadas por identificador
	public ArrayList<Region> listarRegiones() {
		Collections.sort(lstRegiones, new Comparator<Region>() {
			public int compare(Region x, Region y) {
				return x.getIdentificador() - y.getIdentificador();
			}
		});
		return lstRegiones;
	}

	// Metodo busca una region por su identificador en la lista de regiones
	public Region buscarRegion(int id) {
		for (Region tmp : lstRegiones) {
			if (tmp.getIdentificador() == id) {
				return tmp;
			}
		}
		return null;
	}

}
