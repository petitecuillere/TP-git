

import java.util.Observable;

public class Modele extends Observable {

	int compte;
	
	public Modele() {
		this.compte = 0;
	}

	public void incremente() {
		this.compte += 1;
		this.setChanged();
		this.notifyObservers(String.valueOf(this.compte));
	}
	
}
