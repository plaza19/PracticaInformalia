package recurso;

public class Hechizo extends Recurso {
	
	private int tipo;

	public Hechizo(String id, String nombre, int pOfesivo, int pDefensivo, int pAstucia, boolean enUso, int tipo) {
		super(id, nombre, pOfesivo, pDefensivo, pAstucia, enUso);
		this.tipo = tipo;
		
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Hechizo [tipo=" + tipo + ", id=" + id + ", nombre=" + nombre + ", POfesivo=" + POfesivo
				+ ", PDefensivo=" + PDefensivo + ", PAstucia=" + PAstucia + ", enUso=" + enUso + "]";
	}
	
	
	
	

}
