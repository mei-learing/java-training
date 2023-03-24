package struc;

public class PileTest {
	
	public static void main(String [] args) {
		Pile p = new Pile();
		p.afficher(); // ==> Vide
		p.depiler(); // Pas possible car la pile est vide
		p.empiler("value1");
		p.empiler("value2");
		p.empiler("value3");
		p.afficher();// value3 value2 value1
		p.depiler(); // Pas possible car la pile est vide
	}
}
