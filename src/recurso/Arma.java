package recurso;

public class Arma extends Recurso {
	
	private int rangoAccion, usoManos;
	
	public Arma(String id, String nombre, int pOfesivo, int pDefensivo, int pAstucia, boolean enUso, int rangoAccion, int usoManos) {
		super(id, nombre, pOfesivo, pDefensivo, pAstucia, enUso);
		this.rangoAccion = rangoAccion;
		this.usoManos = usoManos;
		
	}

	public int getRangoAccion() {
		return rangoAccion;
	}

	public void setRangoAccion(int rangoAccion) {
		this.rangoAccion = rangoAccion;
	}

	public int getUsoManos() {
		return usoManos;
	}

	public void setUsoManos(int usoManos) {
		this.usoManos = usoManos;
	}

	@Override
	public String toString() {
		return "Arma [rangoAccion=" + rangoAccion + ", usoManos=" + usoManos + ", id=" + id + ", nombre=" + nombre
				+ ", POfesivo=" + POfesivo + ", PDefensivo=" + PDefensivo + ", PAstucia=" + PAstucia + ", enUso="
				+ enUso + "]";
	}
	
	
	
	

}
