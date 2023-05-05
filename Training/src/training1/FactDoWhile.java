package training1;

import java.util.Scanner;

public class FactDoWhile {
	public static void main(String[] args) {
		System.out.print(" saisir un nombre entier:");
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		int n = Integer.valueOf(value);
		int i = 1;
		int result = 1;
		while (i <= n) {
		result = result * i;
		i++;
	}
		System.out.print("La factoriel de " + value + " est " + result);
}
}
