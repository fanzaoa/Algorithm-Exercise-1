package _01;

import java.util.*;

public class _1的个数 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(Integer.toString(N, 2));// 表示把N(十进制)转化为2进制
		int count = 0;
		// 比对每一位
		for (int i = 0; i < 32; i++) {
			if ((N & (1 << i)) == (1 << i)) {
				count++;
			}
		}
		System.out.println(count);

		count = 0;
		while (N != 0) {
			N = ((N - 1) & N);
			count++;
		}
		System.out.println(count);
	}
}
