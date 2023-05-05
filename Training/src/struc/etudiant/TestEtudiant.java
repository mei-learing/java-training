package struc.etudiant;

public class TestEtudiant {
	// affiche les caractéristique de l’étudiant ( grâce à la méthode affiche ) , on
	// affiche la moyenne de l’étudiant et s’il est reçu ou non .​

	// Refaire la méthode main en créant cette fois-ci un étudiant en passant en
	// paramètre son nom et ses notes au constructeur.​
	public static void main(String args[]) {
		// Ajouter la méthode main à la classe Étudiant de façon à ce que s’effectue les
		// opération suivantes : on crée une instance d’Étudiant sans paramètre ,
		Etudiant maissa = new Etudiant();
		maissa.affiche();
		if (maissa.reçu()) {
			System.out.println("La moyenne est " + maissa.moyenne());
		}

	}
}
