package _13;

public class B6_Èý²½ÅÅÐò {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 25, 18, -2, 0, 16, -5, 33, 21, 0, 19, -16, 25, -3, 0 };
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static void sort(int[] x) {
		int p = 0;
		int left = 0;
		int right = x.length - 1;

		while (p <= right) {
			if (x[p] < 0) {
				int t = x[left];
				x[left] = x[p];
				x[p] = t;
				left++;
				p++;
			} else if (x[p] > 0) {
				int t = x[right];
				x[right] = x[p];
				x[p] = t;
				right--;
			} else {
				// _____________;Ìî¿Õ
				p++;
			}
		}
	}
}
