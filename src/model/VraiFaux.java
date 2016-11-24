package model;

public class VraiFaux {
	private boolean val = true;

	public boolean retournerVrai(int entree) {
		if (entree > 5) {
			val = true;
		} else {
			val = false;
		}
		return val;
	}
}
