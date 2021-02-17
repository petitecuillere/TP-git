package model;
import java.util.Observable;

public class Model extends Observable{
	//Ligne.couleur
	Ligne solution;
	Ligne tentative;
	int Nbrtentative;
	public Model() 
	{
		Nbrtentative= 0;
		solution =new Ligne(numCouleur(ale(8)),numCouleur(ale(8)),numCouleur(ale(8)),numCouleur(ale(8)));
		
	}
	
	public int ale(int n) {
		return (int) (Math.random() * (n+1) );
		
	}
	
	
	public Ligne.couleur numCouleur(int num)
	{
		switch (num) {
			case 0: return  Ligne.couleur.ROUGE;
			case 1: return  Ligne.couleur.JAUNE;
			case 2: return  Ligne.couleur.VERT; 
			case 3: return  Ligne.couleur.BLEU;
			case 4: return  Ligne.couleur.BLANC;
			case 5: return  Ligne.couleur.NOIR;
			case 6: return  Ligne.couleur.ROSE;
			case 7: return  Ligne.couleur.CYAN;
			default:return  Ligne.couleur.ROUGE;
		
		
		}
	}
	
}
