package test;

import java.util.Scanner;

public class _8 {
	static int n;
	static int m;
	static int k;
	static int[][] data;
	private static int MAX = 1000000007;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();
		data = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				data[i][j] = sc.nextInt();
			}
		}
		long ans = lks(0, 0, -1, 0);
		System.out.println(ans);
	}

	private static long lks(int i, int j, int max, int cnt) {
		// TODO Auto-generated method stub
		if (i == n || j == m || cnt > k)
			return 0;
		int cur = data[i][j];
		int ans = 0;
		if (i == n - 1 || j == m - 1) {
			if (cnt == k || (cnt == k - 1 && cur > max))
				return 1;
		}
		if (cur > max) {
			ans += lks(i, j + 1, cur, cnt + 1);
			ans += lks(i + 1, j, cur, cnt + 1);
		}
		ans += lks(i, j + 1, max, cnt);
		ans += lks(i + 1, j, max, cnt);
		return ans % MAX;
	}
}
