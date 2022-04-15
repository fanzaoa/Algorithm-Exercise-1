package test;

import java.util.*;

public class _1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 11;
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		arr[arr.length - 1] = new Random().nextInt(N - 1) + 1;
		System.out.println(Arrays.toString(arr));
		int m = 0;
		for (int i = 1; i < N; i++) {
			m = m ^ i;
		}
		for (int i = 0; i < arr.length; i++) {
			m = m ^ arr[i];
		}
		System.out.println(m);
	}

}
