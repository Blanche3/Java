package Jardin;
import java.util.HashMap;

public class Jardin {

	private int longueur;
	private int largeur;
	private Emplacement emplacements[][];
	private HashMap<String, Integer>panier;
	
	public Jardin(int longueur, int largeur) {
		this.longueur = longueur;
		this.largeur = largeur ;
		this.emplacements = new Emplacement [longueur][largeur];
		this.panier = new HashMap<String, Integer>();
	}
	
	public void ajouterPanier(String nomDuVegetal, int quantite) {
		this.panier.put(nomDuVegetal, quantite);
	}
		
	@Override
	public String toString() {
		String texte;
		texte = "Voici notre jardin\n";
		for(int x = 0; x < this.longueur; x++) {
			for(int y = 0; y < this.largeur; y++) {
				Emplacement e = emplacements[x][y];
				if(e == null) {
					texte += "o";
				} else {
					texte += "Nothing";
				}
			}
			texte += "\n";
		}
		texte += "\nEt notre panier contient :\n";
		ajouterPanier("Tomate", 5);
		ajouterPanier("Carotte", 5);
		ajouterPanier("Ail", 10);
		ajouterPanier("Betterave", 5);
		for (String i : panier.keySet()) {
			texte += i + " : " + panier.get(i) + " graine(s)\n";
		}
		return texte;
	}

/*	
	public void main(String[] args) {
        panier.put("Ail", 4);
        panier.put("Betterave", 7);
        panier.put("Carotte", 2);
	}
*/
}
