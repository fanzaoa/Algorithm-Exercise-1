package _01;

import java.util.*;

public class _1�ĸ��� {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(Integer.toString(N, 2));// ��ʾ��N(ʮ����)ת��Ϊ2����
		int count = 0;
		// �ȶ�ÿһλ
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
