
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controleur implements ActionListener {

	Modele refModl;
	
	public Controleur(Modele m) {
		this.refModl = m;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		refModl.incremente();
	}

	
}
