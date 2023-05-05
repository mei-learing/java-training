package struc.etudiant;

import java.util.Scanner;

/**
 * 
 * @author T553026
 *
 */

public class Etudiant {
	private String nom;
	private float notes[];
	private static final int TAILLE_MAX = 3;

//- la méthode LitChaine permettant de lire une chaîne de caractères au clavier et retournant le résultat de type String. On n’écrira pas le contenu de cette méthode. On considérera qu’elle existe et qu’on peut l’appeler dans d’autres méthode de la classe . ​
	public String litChaine() {
		System.out.println("veuiller saisir un nom:");
		Scanner sc = new Scanner(System.in);
		String resultat = sc.next();
		return resultat;
	}

//-la méthode LitFloat permettant de lire un flottant au clavier et retournant le résultat de type float.​
	public float litFloat() {
		boolean valide = false;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("Veuiller saisir un nombre");
				float resultat = sc.nextFloat();
				return resultat;
			} catch (Exception e) {
				System.out.println("Erreur, Veuiller saisir un nombre valide");
			}
		} while (valide == false);
		return -1;
	}

//On n’écrira pas non plus le contenu de cette méthode.​
//
//- un constructeur sans paramètre qui lit le nom et les notes d’un étudiant au clavier.​
	public Etudiant() {
		this.notes = new float[TAILLE_MAX];
		this.nom = litChaine();
		for (int i = 0; i < TAILLE_MAX; i++) {
			this.notes[i] = litFloat();
		}
	}

//- un constructeur prenant un nom et un tableau de notes en paramètre.​
	public Etudiant(String nom, float notes[]) {
		this.nom = nom;
		this.notes = notes;
	}

//- la méthode moyenne qui retourne la moyenne des 10 notes de l’étudiant.​
	public float moyenne() {
		float m = 0;
		for (int i = 0; i < TAILLE_MAX; i++) {
			m = this.notes[i] + m;
		}
		return (m / TAILLE_MAX);
	}

//- la méthode recu qui retourne true si l’étudiant a la moyenne et false sinon .​
	public boolean reçu() {

		if (moyenne() > 10)
			return true;
		else
			return false;
	}

//- la méthode affiche qui affiche le nom et les notes de l’étudiant.​
	public void affiche() {
		System.out.print(nom);
		System.out.print("[");
		for (int i = 0; i < TAILLE_MAX; i++) {
			System.out.print(notes[i] + " ");
		}
		System.out.println("]");
	}
//Ajouter la méthode main à la classe Étudiant de façon à ce que s’effectue les opération suivantes : on crée une instance d’Étudiant sans paramètre , on affiche les caractéristique de l’étudiant ( grâce à la méthode affiche ) , on affiche la moyenne de l’étudiant et s’il est reçu ou non .​

//Refaire la méthode main en créant cette fois-ci un étudiant en passant en paramètre son nom et ses notes au constructeur.​
}
