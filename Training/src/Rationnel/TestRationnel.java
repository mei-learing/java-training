package Rationnel;

public class TestRationnel {
	public static void main(String args[]) {
		int num = 60;
		int denum = 36;
		int pgcd = 0;

		for (int i = 1; i <= num && i <= denum; i++) {
			if (num % i == 0 && denum % i == 0)
				pgcd = i;
		}
		System.out.printf("PGCD de %d et %d est: %d", num, denum, pgcd);
	}
}
