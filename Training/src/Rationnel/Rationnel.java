package Rationnel;

import java.util.Scanner;

public class Rationnel {
	private int n;
	private int d;

	public void normalise(int num, int denum) {
		int resultat1;
		int resultat2;
		int pgcd = 0;

		for (int i = 1; i <= num && i <= denum; i++) {
			if (num % i == 0 && denum % i == 0)
				pgcd = i;
		}
		System.out.printf("PGCD de %d et %d est: %d", num, denum, pgcd);

		resultat1 = num / pgcd;
		resultat2 = denum / pgcd;
		System.out.println(resultat1);
		System.out.println(resultat2);
	}

	public Rationnel(int n, int d) {
	}

	public void Plus(Rationnel a) {
		int b;
		int c;

	}

	public void inverse() {
		if (n != 0) {
			int temp;
			temp = n;
			n = d;
			d = temp;
		}
	}
}
