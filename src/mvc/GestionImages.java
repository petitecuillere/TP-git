package mvc;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GestionImages extends Frame implements WindowListener {

	public static void main(String[] args) {
		new GestionImages();
	}

	Modele modl;
	
	public GestionImages() {

		modl = new Modele("images/");
		Controleur ctrl = new Controleur(modl);
		
		this.setLayout(new BorderLayout());

		AWT_ListeImages panneauGauche = new AWT_ListeImages(ctrl, modl);
		this.add(panneauGauche, BorderLayout.WEST);

		AWT_AfficheurImage panneauDroite = new AWT_AfficheurImage(modl);
		this.add(panneauDroite, BorderLayout.EAST);

		AWT_NoteImage panneauBas = new AWT_NoteImage(ctrl, modl);
		this.add(panneauBas, BorderLayout.SOUTH);

		this.addWindowListener(this);
		this.setTitle("Visualisation d'images");
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent e) {}

	@Override
	public void windowClosing(WindowEvent e) { 
		this.modl.enregistrer();
		System.exit(0); 
	}

	@Override
	public void windowClosed(WindowEvent e) {}

	@Override
	public void windowIconified(WindowEvent e) {}

	@Override
	public void windowDeiconified(WindowEvent e) {}

	@Override
	public void windowActivated(WindowEvent e) {}

	@Override
	public void windowDeactivated(WindowEvent e) {}


} 
