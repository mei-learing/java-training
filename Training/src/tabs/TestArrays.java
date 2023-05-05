package tabs;

import java.util.Arrays;

public class TestArrays {
	public static void main(String[] args) {
		int[] a = { 44, 77, 55, 22, 99, 88, 33, 66 };
		print(a);
		Arrays.sort(a);
		print(a);
		int[] b = new int[8];
		print(b);
		System.arraycopy(a, 0, b, 0, a.length);
		print(b);
		System.out.println("Arrays.equals(a,b): " + Arrays.equals(a, b));
	}

	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
}
