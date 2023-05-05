package struc;

public class Pile {
//
//	/*
//	 * Une pile est une liste cha�n�e d'informations dans laquelle : Un �l�ment ne
//	 * peut �tre ajout� qu'au sommet de la pile, 
//	 * Un �l�ment ne peut �tre retir� que du sommet de la pile. 
//	 * Op�rations autoris�es empiler, toujours au sommet, 
//	 * et
//	 * jusqu�� la limite de la m�moire, d�piler, toujours au sommet, si la pile
//	 * n�est pas vide . Afficher les elements de
//	 * la pile
//	 * 
//	 */

	private String[] elements;
	private int tailleMax;
	private int sommet;

	public Pile(int tailleMax) {
		// TODO Auto-generated constructor stub
		this.tailleMax = tailleMax;
		elements = new String[tailleMax];
		sommet = -1;
	}

	void empiler(String value) {

		if (estPleine()) {
			System.out.println("Impossible d'empiler, la pile est pleine");
			return;
		}

		sommet = sommet + 1;

		elements[sommet] = value;

	}

	String depiler() {
		if (estVide()) {
			System.out.println("[]");
			return "";
		}
		String s= elements[sommet];
		elements[sommet]=null;
		sommet --;
		return s;
	}

	String sommetPile() {
		return elements[sommet];
	}

	boolean estVide() {
		if (sommet == -1) {
			return true;
		}
		return false;
	}

	boolean estPleine() {
		if (sommet == tailleMax - 1) {
			return true;
		}
		return false;
	}

	void afficher() {
		if (estVide()) {
			System.out.println("Impossible d'afficher, la pile est vide");
			return;
		}

		for (int i = sommet; i >= 0; i--) {
			System.out.println(elements[i]);
		}
	}
}

//
