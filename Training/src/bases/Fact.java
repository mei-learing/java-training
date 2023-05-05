package bases;
import java.io.IOException;
import java.util.Scanner;

public class Fact {
	public static void main(String [] args ) throws IOException {
		System.out.print("Entrer un nombre: ");
		Scanner scan= new Scanner(System.in);
		String text= scan.nextLine();
		
		int value = Integer.valueOf(text);
		int result = 1;
		int i = 1;
		// 3 = 1*2*3
		while (i <= value) {
			result= result * i;
			i++;
		}
		
		System.out.println("----------------------------------------------");
		System.out.println("La factorielle de " + value + " est: " + result);
		System.out.println("----------------------------------------------");

		///qsdqsdqsdqs
	}

}
