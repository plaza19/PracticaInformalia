package personaje;

import java.util.ArrayList;

import recurso.Recurso;

public abstract class Personaje {
	
	protected String id;
	protected int Fuerza, Destreza, Inteligencia, Vitalidad;
	protected boolean IA;
	protected Raza raza;
	protected Recurso recursoActivo;
	protected ArrayList<Recurso> recursos;	
	
	
	
	public Personaje(String id, int fuerza, int destreza, int inteligencia, int vitalidad, boolean iA, Raza raza,
			Recurso recursoActivo, ArrayList<Recurso> recursos) {
		this.id = id;
		this.Fuerza = fuerza;
		this.Destreza = destreza;
		this.Inteligencia = inteligencia;
		this.Vitalidad = vitalidad;
		this.IA = iA;
		this.raza = raza;
		this.recursoActivo = recursoActivo;
		this.recursos = recursos;
	}

	protected void elegirRecursoAct(Recurso elegido) {
		this.recursoActivo = elegido;
		elegido.setEnUso(true);
		//Comprobar en la lista si existe
		
	}
	
	protected void mostrarRecursos() {
		for (int i=0; i<recursos.size(); i++) {
			System.out.println(this.recursos.get(i).toString());
		}
	}
	
	protected void restarVitalidad(int resta) {
		this.Vitalidad -= resta;
	}
	
	protected void addRecurso(Recurso recurso) {
		this.recursos.add(recurso);
	}
	
	protected void eliminarRecurso(Recurso recurso) {
		this.recursos.remove(recurso);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getFuerza() {
		return Fuerza;
	}

	public void setFuerza(int fuerza) {
		Fuerza = fuerza;
	}

	public int getDestreza() {
		return Destreza;
	}

	public void setDestreza(int destreza) {
		Destreza = destreza;
	}

	public int getInteligencia() {
		return Inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		Inteligencia = inteligencia;
	}

	public int getVitalidad() {
		return Vitalidad;
	}

	public void setVitalidad(int vitalidad) {
		Vitalidad = vitalidad;
	}

	public boolean getIA() {
		return this.IA;
	}

	public void setIA(boolean iA) {
		this.IA = iA;
	}

	public Raza getRaza() {
		return raza;
	}

	public void setRaza(Raza raza) {
		this.raza = raza;
	}

	public Recurso getRecursoActivo() {
		return recursoActivo;
	}

	public void setRecursoActivo(Recurso recursoActivo) {
		this.recursoActivo = recursoActivo;
	}

	public ArrayList<Recurso> getRecursos() {
		return recursos;
	}

	public void setRecursos(ArrayList<Recurso> recursos) {
		this.recursos = recursos;
	}
	
	
	
	
	

}
