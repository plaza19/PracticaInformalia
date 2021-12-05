package recurso;

public abstract class Recurso {
	
	protected String id, nombre;
	protected int POfesivo, PDefensivo, PAstucia;
	protected boolean enUso;
	
	
	protected Recurso(String id, String nombre, int pOfesivo, int pDefensivo, int pAstucia, boolean enUso) {
		this.id = id;
		this.nombre = nombre;
		this.POfesivo = pOfesivo;
		this.PDefensivo = pDefensivo;
		this.PAstucia = pAstucia;
		this.enUso = enUso;
	}



	protected boolean estaEnUso() {
		return this.enUso;
	}
	
	

}
