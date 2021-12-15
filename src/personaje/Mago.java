package personaje;

import java.util.ArrayList;

import recurso.Recurso;

public class Mago extends Personaje {
	
	private int poder;

	public Mago(String id, int fuerza, int destreza, int inteligencia, int vitalidad, boolean iA, Raza raza,
			Recurso recursoActivo, ArrayList<Recurso> recursos, int poder) {
		super(id, fuerza, destreza, inteligencia, vitalidad, iA, raza, recursoActivo, recursos);
		
		this.poder = poder;
	}

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}

	@Override
	public String toString() {
		return "Mago [poder=" + poder + ", id=" + id + ", Fuerza=" + Fuerza + ", Destreza=" + Destreza
				+ ", Inteligencia=" + Inteligencia + ", Vitalidad=" + Vitalidad + ", IA=" + IA + ", raza=" + raza
				+ ", recursoActivo=" + recursoActivo + ", recursos=" + recursos + "]";
	}
	
	

}
