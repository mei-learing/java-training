package struc.compteur;

public class Compteur {

	private int val;

	public Compteur() {
		val = 0;
	}

	public void clic() {
		this.val = val+1;
	}

	public void raz() {
		val = 0;
	}

	public int valeur() {
		return val;
	}
}