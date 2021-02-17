package model;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Ligne l1= new Ligne( Ligne.couleur.ROUGE ,Ligne.couleur.ROUGE,Ligne.couleur.ROUGE,Ligne.couleur.ROUGE);
		Ligne l2= new Ligne( Ligne.couleur.ROUGE ,Ligne.couleur.BLEU,Ligne.couleur.NOIR,Ligne.couleur.ROSE);
		System.out.print(l2.identique(l1));
	
	
	}

}
