package _14;

import java.util.Scanner;

public class B9_地宫取宝 {
	static int[][] data;
	private static int n;
	private static int m;
	private static int k;
	private static final int MOD = 1000000007;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		/**/
//		for(int i=0;i<51;i++) {
//			for(int j=0;j<51;j++) {
//				for(int l=0;l<14;l++) {
//					for(int o=0;o<14;o++) {
//						cache[i][j][l][o]=-1;
//					}
//				}
//			}
//		}
		long ans = dfs(0, 0, -1, 0);//第一个点的价值可能是0
		System.out.println(ans);
	}

//	static long[][][][] cache=new long[51][51][14][14];//记忆性递归
	private static long dfs(int x, int y, int max, int cnt) {//max宝物价值，cnt宝物数
		// TODO Auto-generated method stub
//		if(cache[x][y][max+1][cnt]!=-1) return cache[x][y][max+1][cnt];//
		if (x == n || y == m || cnt > k)
			return 0;
		int cur = data[x][y];
		int ans = 0;
		if (x == n - 1 && y == m - 1) {//已经面临最后一个格子
			if (cnt == k || (cnt == k - 1 && cur > max))
				return 1;
		}
		if (cur > max) {//可以取这个物品
			ans += dfs(x, y + 1, cur, cnt + 1);
			ans += dfs(x + 1, y, cur, cnt + 1);
		}
		//对于价值较小，或者价值大但不去这个物品的情况如下
		ans += dfs(x, y + 1, max, cnt);
		ans += dfs(x + 1, y, max, cnt);
//		cache[x][y][max+1][cnt]=ans%MOD;//
		return ans % MOD;
//		return ans;
	}

}
