package _13;

import java.util.Scanner;

public class B8_������ {
/**
 * 1,2,3,4,5,6,...(���)
 * 1Ϊ����������2��ʼ������������ܱ�2��������ɾ�� 1,3,5,7,9,...
 * 3Ϊ��2��������������������ܱ�3��������ɾ��,ɾ��5,11,17
 * ...
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();//��ʼ
		int n = sc.nextInt();//����
		int[] a = new int[n];// �洢���ݵ�����
		for (int i = 0; i < n; i++) {
			a[i] = 2 * i + 1;
		}
		// �Ѿ���2�ı�����λ�ã�ɾ����

		int l = 1;// ���������±꣬a[l]��������
		while (true) {
			int p = l + 1;// ������ǰŲ���Ŀ�λ
			for (int i = l + 1; i < n; i++) {
				if ((i + 1) % a[l] == 0) {//(i+1)�����
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
		int ans = 0;//����
		for (int i = 0; i < n; i++) {
			if (a[i] >= n)
				break;
			if (a[i] > m)
				ans++;
		}
		System.out.println(ans);
	}
}
