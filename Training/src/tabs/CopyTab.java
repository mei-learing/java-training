package tabs;

public class CopyTab {
	public static void main(String[] args) {
		int[] tabOriginal = { 22, 33, 44, 55, 66, 77, 88, 99 };
		System.out.println("original: " + tabOriginal);
		print(tabOriginal);
		
		int[] tabCopy = new int[tabOriginal.length];
		System.out.println("copy: " + tabCopy);
		print(tabCopy);
		
		System.arraycopy(tabOriginal, 0, tabCopy, 0, tabOriginal.length);
		System.out.println("copy: " + tabCopy);
		print(tabCopy);
		tabCopy[1] = 11;
		print(tabOriginal);
		print(tabCopy);
		System.out.println("---------------------------------");
		tabCopy = new int[12];
		System.arraycopy(tabOriginal, 0, tabCopy, 3, 8);
		System.out.println("--> copy: " + tabCopy);
		print(tabCopy);
		System.arraycopy(tabCopy, 3, tabCopy, 1, 5);
		System.out.println("--> copy: " + tabCopy);
		print(tabCopy);
	}

	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
}
