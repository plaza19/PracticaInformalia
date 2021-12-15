package main;

import java.util.ArrayList;

import personaje.Mago;
import personaje.Raza;
import recurso.Arma;
import recurso.Conjuro;
import recurso.Ingrediente;
import recurso.Recurso;

public class Main {

	public static void main(String[] args) {
		
		Arma arma = new Arma("arma1","arma1", 10, 10,10, false, 5, 2);
		System.out.println(arma.toString());	
		
		Conjuro c = new Conjuro("1", "Pocion", 50, 20, 10, false);
		System.out.println(c.toString());
		
		c.addIngrediente(new Ingrediente("Ingrediente3", 200));
		
		System.out.println(c.toString());
		
		ArrayList<Recurso> recursos = new ArrayList<>();
		recursos.add(arma);
		
		
		
		ArrayList<Ingrediente> ingredientes = new ArrayList<>();
		ingredientes.add(new Ingrediente("Ingrediente1", 100));
		ingredientes.add(new Ingrediente("Ingrediente2", 200));
		
		Conjuro c2 = new Conjuro("2", "Pocion2", 50, 20, 10, false, ingredientes);
		System.out.println(c2.toString());
		
		Mago mago = new Mago("1", 20,30 , 0, 0, false, Raza.ELFO, c, recursos, 0);
		System.out.println(mago.toString());
		

	}

}
