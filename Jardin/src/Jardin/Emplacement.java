package Jardin;
import Flore.Vegetal;

public class Emplacement {

	private Vegetal vegetal;
	
	public Emplacement(Vegetal vegetal) {
		this.vegetal = vegetal;
	}
	
	public Vegetal getAttribut() {
		return this.vegetal;
	}
}
