package controlador;

import java.util.ArrayList;

import modelo.Comuna;
import modelo.ComunaDAO;
import modelo.Persona;
import modelo.PersonaDAO;
import modelo.Region;
import modelo.RegionDAO;

//Clase que se comunica con las clases DAO e invoca los metodos que ellas tienen
//Esta clase sirve de comunicacion con la vista
public class Ctrl {
	private PersonaDAO daoPersona;
	private ComunaDAO daoComuna;
	private RegionDAO daoRegion;

	public Ctrl() {
		this.daoPersona = new PersonaDAO();
		this.daoComuna = new ComunaDAO();
		this.daoRegion = new RegionDAO();
	}

	// --------------- PERSONA ---------------
	public ArrayList<Persona> listarPersonas() {
		return this.daoPersona.listar();
	}

	// --------------- COMUNA ---------------
	public ArrayList<Comuna> listarComunas() {
		return this.daoComuna.listarComunas();
	}

	public Comuna buscarComuna(int id) {
		return this.daoComuna.buscarComuna(id);
	}

	// --------------- REGION ---------------
	public ArrayList<Region> listarRegiones() {
		return this.daoRegion.listarRegiones();
	}

	public Region buscarRegion(int id) {
		return this.daoRegion.buscarRegion(id);
	}

}
