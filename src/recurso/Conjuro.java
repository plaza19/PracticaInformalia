package recurso;

import java.util.ArrayList;

public class Conjuro extends Recurso {
	
	private ArrayList<Ingrediente> ingredientes;

	public Conjuro(String id, String nombre, int pOfesivo, int pDefensivo, int pAstucia, boolean enUso, ArrayList<Ingrediente> ingredientes) {
		super(id, nombre, pOfesivo, pDefensivo, pAstucia, enUso);
		
		this.ingredientes = ingredientes;		
		
	}
	
	
	
	public Conjuro(String id, String nombre, int pOfesivo, int pDefensivo, int pAstucia, boolean enUso) {
		super(id, nombre, pOfesivo, pDefensivo, pAstucia, enUso);
		this.ingredientes = new ArrayList<Ingrediente>();
	}



	public void addIngrediente(Ingrediente i) {
		this.ingredientes.add(i);
	}



	@Override
	public String toString() {
		return "Conjuro [ingredientes=" + ingredientes + ", id=" + id + ", nombre=" + nombre + ", POfesivo=" + POfesivo
				+ ", PDefensivo=" + PDefensivo + ", PAstucia=" + PAstucia + ", enUso=" + enUso + "]";
	}
	
	

}
