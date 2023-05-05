package tabs;

public class CopieRef {
	public static void main(String[] args) {
		int[] a = { 22, 44, 66, 55, 33 };
		System.out.println("a: " + a);
		printTable(a);

		int[] copieA;
		copieA = a;
		System.out.println("copieA: " + copieA);
		printTable(copieA);
		
		a[3] = 88;
		printTable(a);
		printTable(copieA);
		
		copieA[1] = 11;
		
		printTable(a);
		printTable(copieA);
	}

	public static void printTable(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
}
