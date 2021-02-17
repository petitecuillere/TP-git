package mvc;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Observable;

public class Modele extends Observable { 

	public ArrayList<ImageModele> images;

	int indexImageSelectionnée = 0;

	public Modele(String dir) {
		File ficher = new File("sav.xml");
		XMLDecoder decode=null;
		try {
			FileInputStream fils = new FileInputStream(ficher);
			BufferedInputStream bis = new BufferedInputStream(fils);
			decode = new XMLDecoder(bis);
			
			this.images = (ArrayList<ImageModele>) decode.readObject();
			bis.close();
			fils.close();
			
		}catch(IOException  e){
		
		File repImages = new File(dir);
		File[] imagesListe = repImages.listFiles();
		this.images = new ArrayList<>();
		for (File file : imagesListe) {
			String nomImage = file.getName().split("\\.")[0];
			this.images.add(new ImageModele(nomImage, "images/"+file.getName(), 0));
		}
	  }finally {
			if(decode != null ) decode.close();
		}
	}
	
	/*public Modele(String dir) {
		File ficher = new File("sav.bat");
		try {
			FileInputStream fils = new FileInputStream(ficher);
			ObjectInputStream oie = new ObjectInputStream(fils);
			
			this.images = (ArrayList<ImageModele>) oie.readObject();
			oie.close();
			fils.close();
			
		}catch(IOException | ClassNotFoundException e){
		
		File repIm	public Modele(String dir) {
		File ficher = new File("sav.bat");
		try {
			FileInputStream fils = new FileInputStream(ficher);
			ObjectInputStream oie = new ObjectInputStream(fils);
			
			this.images = (ArrayList<ImageModele>) oie.readObject();
			oie.close();
			fils.close();
			
		}catch(IOException | ClassNotFoundException e){
		
		File repImages = new File(dir);
		File[] imagesListe = repImages.listFiles();
		this.images = new ArrayList<>();
		for (File file : imagesListe) {
			String nomImage = file.getName().split("\\.")[0];
			this.images.add(new ImageModele(nomImage, "images/"+file.getName(), 0));
		}
	  }
	}
ages = new File(dir);
		File[] imagesListe = repImages.listFiles();
		this.images = new ArrayList<>();
		for (File file : imagesListe) {
			String nomImage = file.getName().split("\\.")[0];
			this.images.add(new ImageModele(nomImage, "images/"+file.getName(), 0));
		}
	  }
	}*/


	public void sélection(int item) {
		this.indexImageSelectionnée = item;
		this.setChanged();
		this.notifyObservers(this.images.get(this.indexImageSelectionnée));
	}

	public void changeNote(int nouveauRating) {
		this.images.get(this.indexImageSelectionnée).note = nouveauRating;
		this.setChanged();
		this.notifyObservers(this.images.get(this.indexImageSelectionnée));
	}
	
	public void enregistrerB()
	{
		
		File ficher = new File("sav.bat");

		try {
			FileOutputStream fos = new FileOutputStream(ficher);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(this.images);
			
			oos.close();
			fos.close();
		
		} catch (IOException ex1) {
			throw new RuntimeException("imposible d'érire les donner");			
		}
	}
	
	public void enregistrer()
	{
		
		File ficher = new File("sav.xml");
		XMLEncoder encode=null;
		try {
			FileOutputStream fos = new FileOutputStream(ficher);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			encode = new XMLEncoder(bos);
			
			encode.writeObject(this.images);
			
			encode.flush();
			bos.close();
			fos.close();
		
		} catch (IOException ex1) {
			throw new RuntimeException("imposible d'érire les donner");			
		}finally {
			if(encode != null ) encode.close();
		}
	}

}
 