package model;

public class Ligne {

	public enum couleur {
		   ROUGE, JAUNE, VERT, BLEU, BLANC, NOIR, ROSE,CYAN;
		}
	couleur[] point;
	
	public  Ligne(couleur c0, couleur c1, couleur c2 , couleur c3 ) {
		point= new couleur [4];
		point[0]=c0;
		point[1]=c1;
		point[2]=c2;
		point[3]=c3;
	}
	
	
	public boolean identique(Ligne l2) {
	
	return (point[0]==l2.point[0] &
			point[1]==l2.point[1] &
			point[2]==l2.point[2] &
			point[3]==l2.point[3]);
}
	
	public int nbrBienPlacer(Ligne l2) {
		int p =0;
			if(point[0]==l2.point[0])p+=1;
			if(point[1]==l2.point[1])p+=1;
			if(point[2]==l2.point[2])p+=1;
			if(point[3]==l2.point[3])p+=1;
			return p;
}
	public int nbrBonneCouleur(Ligne l2) {
		int p =0;
			
			if(point[0]==l2.point[1])p+=1;
			if(point[0]==l2.point[2])p+=1;
			if(point[0]==l2.point[3])p+=1;
			
			if(point[1]==l2.point[0])p+=1;
			if(point[1]==l2.point[2])p+=1;
			if(point[1]==l2.point[3])p+=1;
			
			if(point[2]==l2.point[0])p+=1;
			if(point[2]==l2.point[1])p+=1;
			if(point[2]==l2.point[3])p+=1;
			
			if(point[3]==l2.point[0])p+=1;
			if(point[3]==l2.point[1])p+=1;
			if(point[3]==l2.point[2])p+=1;
			return p;
}
	
	
	
	
	
}