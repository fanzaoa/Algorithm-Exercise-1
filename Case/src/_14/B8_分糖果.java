package _14;

import java.util.Scanner;

/**
 * ����N(2<N<100) ÿ����������1000 ����������ǹ���
 * 
 * @author hp
 *
 */
public class B8_���ǹ� {

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
		while (true) {
			int t = arr[0];
			for (int i = 0; i < N - 1; i++) {
				arr[i] -= arr[i] / 2;
				arr[i] += arr[i + 1] / 2;
				if (arr[i] % 2 == 1) {
					ans++;
					arr[i]++;
//					System.out.println(ans);
				}
			}
			arr[N - 1] -= arr[N - 1] / 2;
			arr[N - 1] += t / 2;//�����forѭ���Ѿ��ı���arr[0];
			if (arr[N - 1] % 2 == 1) {
				ans++;
				arr[N - 1]++;
//				System.out.println(arr[N-1]);
			}
			if (check(arr)) {
				System.out.println(ans);
				break;
			}
		}
	}

	private static boolean check(int[] arr) {
		// TODO Auto-generated method stub
		int a = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != a)
				return false;
		}
		return true;
	}

}
