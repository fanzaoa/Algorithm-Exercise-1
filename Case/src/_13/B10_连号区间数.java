package _13;

import java.util.Scanner;

public class B10_���������� {

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
			for (int j = i; j < N; j++) {// ]��λ��
				if (arr[j] > max)
					max = arr[j];
				if (arr[j] < min)
					min = arr[j];
				if (i == j) {
					System.out.printf("[%d,%d]\n", i, j);
					ans++;
				} else {// i<j,��ô�ж�[i,j]����������
					/**
					 * 1��2��3��4��5��6 max-min=6-1=�����±���� 
					 * ������ʱ��max,minȷ��3 4 2 -------4 3(arr) -1 0(�±�) -----4 2- 2 0
					 * 3 5 2 4-----5 3 -1 0(x),û��������ֱ��3 5 2 4��������ʱans++
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
