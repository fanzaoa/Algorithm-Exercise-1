package _01;

import java.util.*;

public class _2�������η� {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(Integer.toString(N, 2));
		int count = 0;
		while (N != 0) {
			N = ((N - 1) & N);
			count++;
		}
		if (count == 1)
			System.out.println("��2�������η�");
		else
			System.out.println("����");
	}
}
