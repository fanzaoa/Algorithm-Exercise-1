package _15;

import java.util.Scanner;

public class B9_垒骰子1 {
	static int op[] = new int[7];
	private static int n;
	private static int m;
	private static boolean[][] conflict;
	private static final long MOD = 1000000007;

	static void init() {
		op[1] = 4;
		op[4] = 1;
		op[2] = 5;
		op[5] = 2;
		op[3] = 6;
		op[6] = 3;
	}

	public static void main(String[] args) {
		init();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		conflict = new boolean[7][7];
		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			conflict[x][y] = true;
			conflict[y][x] = true;
		}
		long ans = 0;
		for (int up = 1; up <= 6; up++) {
			ans = (ans + 4 * f(up, n - 1)) % MOD;
		}
		System.out.println(ans);
	}

	// 上一层定好了朝上的数字为up的情况下，垒好cnt个骰子的方案数
	private static int f(int up, int cnt) {
		if (cnt == 0)
			return 4;
		long ans = 0;
		for (int upp = 1; upp <= 6; upp++) {
			if (conflict[op[up]][upp])
				continue;
			ans += f(upp, cnt - 1);
		}
		return (int) ans;
	}
}
