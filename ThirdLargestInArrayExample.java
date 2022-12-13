package dsa;

public class ThirdLargestInArrayExample {
	public static int getThirdLargest(int[] a, int us) {
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a[a.length - us];
	}

	public static void main(String args[]) {
		int a[] = { 1, 2, 5, 6, 3, 2 };
		int b[] = { 44, 66, 99, 77, 33, 22, 55 };
//		int n = a.length;
//		int nn = b.length;
		System.out.println("Third Largest: " + getThirdLargest(a,4));
		System.out.println("Third Largest: " + getThirdLargest(b,2));
	}
}