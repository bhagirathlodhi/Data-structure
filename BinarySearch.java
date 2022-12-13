package dsa;

public class BinarySearch {
	private static int binarySearch(int[] ar, int ele) {
		return binarySearch(ar, ele, 0, ar.length - 1);
	}
	private static int binarySearch(int[] ar, int ele, int low, int high) {

		if (high < low)
			return -1;
		int mid = (low + high) / 2;
		if (ar[mid] == ele)
			return mid;
		if (ar[mid] < ele)
			return binarySearch(ar, ele, mid + 1, high);
		else
			return binarySearch(ar, ele, low, mid - 1);
	}

	public static void main(String[] args) {
		int ar[] = { 2,22, 3, 5, 6, 8, 9, 12, 23, 45, 56 };
		System.out.println(binarySearch(ar, 9));
		int a =binarySearch(ar, 9);
		System.out.println(ar[a]);
	}

}
