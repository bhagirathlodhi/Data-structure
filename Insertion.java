package dsa;

public class Insertion {

	private static void insertionSort(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			int key = ar[i];
			int j = i - 1;
			while (j > -1 && ar[j] > key) {
				ar[j + 1] = ar[j];
				j--;
			}
			ar[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		int ar[] = { 4, 2, 6, 1, 3, 8, 7 };
		insertionSort(ar);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}
	}

}
