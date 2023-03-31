package struc;

public class PileTest {
	
	public static void main(String [] args) throws Exception {
		Pile pVide = new Pile(4);
		System.out.println("Test d'une pile vide");
		pVide.afficher(); // ==> Vide
		pVide.depiler(); // Pas possible car la pile est vide
		System.out.println("Test d'une pile pleine");
		Pile pPleine = new Pile(4);
		pPleine.empiler("value1");
		pPleine.empiler("value2");
		pPleine.empiler("value3");
		pPleine.afficher();// value3 value2 value1
		pPleine.depiler(); // valeur2, valeur1
		pPleine.afficher();
	}
}
