import java.util.Scanner;

public class dfs_������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] r = new int[n];
		r[0] = 1;
		dfs(n, r, 1);
	}

	private static void dfs(int n, int[] r, int cur) {
		// TODO Auto-generated method stub
		if (cur == n && isP(r[0] + r[n - 1])) {// �ĩβ�ˣ�������λ���Ϊ��������ɹ�
			print(r);
			return;
		}
		for (int i = 2; i <= n; i++) {// ������ÿ�������cur���λ��
			if (check(r, i, cur)) {// r��û��i��������Һ���һ����֮��Ϊ����
				r[cur] = i;// ���Ž�i����curλ�ã���ǰ��һ��
				dfs(n, r, cur + 1);
				r[cur] = 0;// ����
			}
		}
	}

	private static boolean isP(int k) {
		// TODO Auto-generated method stub
		for (int i = 2; i * i <= k; i++) {
			if (k % i == 0)
				return false;
		}
		return true;
	}

	private static void print(int[] r) {
		// TODO Auto-generated method stub
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i] + (i == r.length - 1 ? "" : " "));
		}
		System.out.println();
	}

	private static boolean check(int[] r, int i, int cur) {
		// TODO Auto-generated method stub
		for (int e : r) {
			if (e == i || !isP(r[cur - 1] + i))
				return false;
		}
		return true;
	}

}
