package _13;

import java.util.Scanner;

public class B10_连号区间数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int ans = 0;
		for (int i = 0; i < N; i++) {
			int max = arr[i];
			int min = arr[i];
			for (int j = i; j < N; j++) {// ]的位置
				if (arr[j] > max)
					max = arr[j];
				if (arr[j] < min)
					min = arr[j];
				if (i == j) {
					System.out.printf("[%d,%d]\n", i, j);
					ans++;
				} else {// i<j,怎么判断[i,j]是连号区间
					/**
					 * 1，2，3，4，5，6 max-min=6-1=数组下标相减 
					 * 乱数组时，max,min确定3 4 2 -------4 3(arr) -1 0(下标) -----4 2- 2 0
					 * 3 5 2 4-----5 3 -1 0(x),没连起来，直到3 5 2 4能连起来时ans++
					 */
					if ((max - min) == j - i) {
						System.out.printf("[%d,%d]\n", i, j);
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}
}
