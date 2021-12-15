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
	
	



	public String getId() {
		return id;
	}





	public void setId(String id) {
		this.id = id;
	}





	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public int getPOfesivo() {
		return POfesivo;
	}





	public void setPOfesivo(int pOfesivo) {
		POfesivo = pOfesivo;
	}





	public int getPDefensivo() {
		return PDefensivo;
	}





	public void setPDefensivo(int pDefensivo) {
		PDefensivo = pDefensivo;
	}





	public int getPAstucia() {
		return PAstucia;
	}





	public void setPAstucia(int pAstucia) {
		PAstucia = pAstucia;
	}





	public boolean isEnUso() {
		return enUso;
	}





	public void setEnUso(boolean enUso) {
		this.enUso = enUso;
	}



	protected boolean estaEnUso() {
		return this.enUso;
	}
	
	

}
