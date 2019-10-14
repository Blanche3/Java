package Flore;

public abstract class Vegetal {
	
	private Etat etat;
	protected String dessin[];
	
	public Vegetal() {
		dessin = new String [6];
		dessin[0] = "_";
		dessin[1] = ".";
		dessin[2] = "|";
		dessin[5] = "#";	
	}
}