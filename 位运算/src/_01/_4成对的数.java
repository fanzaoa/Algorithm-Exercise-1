package _01;

import java.util.*;

public class _4�ɶԵ��� {

	public static void main(String[] args) {
		int N = 11;
		int[] arr = new int[N];
		//test����
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
//		System.out.println("������1-11�������������ظ�");
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		System.out.println(arr.length);// test
//		// �ں������һ�������
		arr[arr.length - 1] = new Random().nextInt(N - 1) + 1;
		System.out.println(Arrays.toString(arr));
//		//����һ�����ظ�����������^����
		int x = 0;
		for (int i = 1; i < N; i++) {
			x = (x ^ i);
		}
		for (int i = 0; i < arr.length; i++) {
			x = x ^ arr[i];
		}
		System.out.println(x);
		System.out.println("================");
		// �����±����
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
