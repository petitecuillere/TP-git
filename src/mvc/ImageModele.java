package mvc;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class ImageModele implements Serializable {

	public String id;
	public String chemin;
	public int note;

	public ImageModele() {}
		
	public ImageModele(String id, String p, int r) {
		this.id = id;
		this.chemin = p;
		this.note = r;
	}
	
	public String toString() {
		String out = this.id + " ";
		for (int i=0; i<=this.note; i++) out += "*";
		return out;
	}
	


}
 