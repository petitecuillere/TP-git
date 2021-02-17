package model;
import java.util.Observable;

public class Model extends Observable{
	//Ligne.couleur
	Ligne solution;
	Ligne tentative;
	int Nbrtentative;
	int [] couleurEntree;
	public Model() 
	{
		Nbrtentative= 0;
		solution =new Ligne(numCouleur(ale(8)),numCouleur(ale(8)),numCouleur(ale(8)),numCouleur(ale(8)));
		couleurEntree =new int[] {0,0,0,0};
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
	
	public void changerC(int x,int val){
		
		couleurEntree[x]=val;
		
	}
	
	public boolean validerLigne() 
	{
		tentative= new Ligne(numCouleur(couleurEntree[0]),numCouleur(couleurEntree[1]),numCouleur(couleurEntree[2]),numCouleur(couleurEntree[3])) ;
		
		return solution.identique(tentative);
	}
	
	public boolean nbrCBP() 
	{
		
		
		return solution.identique(tentative);
	}
	
	
	
}
