
package Com.techlab.java;

public class Array {
	public static void main(String[] args) {

		int a[] = { 12, 15, 18, 45 };

		int temp = a[0];
		for (int i = 1; i < a.length; i++)
	a[i - 1] = a[i];
		a[a.length - 1] = temp;
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);

		}

	}
}
