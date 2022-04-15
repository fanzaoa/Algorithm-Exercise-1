package _01;

import java.util.*;

public class _4成对的数 {

	public static void main(String[] args) {
		int N = 11;
		int[] arr = new int[N];
		//test输入
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入1-11的整数，不能重复");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		System.out.println(arr.length);// test
//		// 在后面添加一个随机数
		arr[arr.length - 1] = new Random().nextInt(N - 1) + 1;
		System.out.println(Arrays.toString(arr));
//		//创建一个无重复新数组与其^运算
		int x = 0;
		for (int i = 1; i < N; i++) {
			x = (x ^ i);
		}
		for (int i = 0; i < arr.length; i++) {
			x = x ^ arr[i];
		}
		System.out.println(x);
		System.out.println("================");
		// 数组下标求解
		int[] helper = new int[N];
		for (int i = 0; i < N; i++) {
			helper[arr[i]]++;
		}
		for (int i = 0; i < N; i++) {
			if (helper[i] == 2) {
				System.out.println(i);
			}
		}
	}
}
