package struc.compteur;

public class TestCompteur {
	public static void main(String[] args) {
		Compteur c1 = new Compteur();
		for (int i = 0; i < 10; i++) {
			System.out.println("---- " + i + " ---");

			c1.clic();
			c1.clic();
			c1.valeur();
			System.out.println(c1.valeur());

		}
		c1.raz();
		c1.valeur();
		System.out.println(c1.valeur());
	}
}
