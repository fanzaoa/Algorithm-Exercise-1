package _13;

import java.util.Scanner;

public class B8_幸运数 {
/**
 * 1,2,3,4,5,6,...(序号)
 * 1为幸运数，从2开始，把所有序号能被2整除的项删除 1,3,5,7,9,...
 * 3为第2个幸运数，把所有序号能被3整除的项删除,删掉5,11,17
 * ...
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();//起始
		int n = sc.nextInt();//结束
		int[] a = new int[n];// 存储数据的数组
		for (int i = 0; i < n; i++) {
			a[i] = 2 * i + 1;
		}
		// 已经把2的倍数（位置）删除了

		int l = 1;// 幸运数的下标，a[l]是幸运数
		while (true) {
			int p = l + 1;// 数字向前挪动的坑位
			for (int i = l + 1; i < n; i++) {
				if ((i + 1) % a[l] == 0) {//(i+1)是序号
				} else {
					a[p] = a[i];
					p++;
				}
				if (a[i] > n)
					break;
			}

			for (int i = 0; i < n; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
			l++;
			if (a[l] >= n)
				break;
		}
		int ans = 0;//计数
		for (int i = 0; i < n; i++) {
			if (a[i] >= n)
				break;
			if (a[i] > m)
				ans++;
		}
		System.out.println(ans);
	}
}
