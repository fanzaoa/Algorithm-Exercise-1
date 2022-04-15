package _15;

import java.util.Scanner;

public class B9_垒骰子 {

	static int op[] = new int[7];
	private static int n;
	private static int m;
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
		// TODO Auto-generated method stub
		init();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		long conflict[][] = new long[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				conflict[i][j] = 1;
			}
		}
		// 建立冲突矩阵
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			conflict[op[a - 1]][b - 1] = 0;
			conflict[op[b - 1]][a - 1] = 0;
		}
		// 求冲突矩阵的n-1次方
		long[][] mPow_n_1 = mPow(conflict, n - 1);
		// 累加矩阵的每个元素
		long ans = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				ans = (ans + mPow_n_1[i][j]) % MOD;
			}
		}
		// ans*4^n
		System.out.println(ans*power(4,n)%MOD);
	}

	private static long power(long i, int n2) {
		// TODO Auto-generated method stub
		long ans=1;
		while(n!=0) {
			if((n&1)==1)ans=(ans*i)%MOD;
			i=i*i%MOD;
			n>>=1;
		}
		return ans;
	}

	// 矩阵的快速幂
	private static long[][] mPow(long[][] conflict, int n) {
		// TODO Auto-generated method stub
		long[][] e = new long[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i == j)
					e[i][j] = 1;
				else
					e[i][j] = 0;
			}
		}
		while (n != 0) {
			if ((n & 1) == 1) {
				e = mMul(e, conflict);
			}
			conflict = mMul(conflict, conflict);
			n >>= 1;
		}
		return e;
	}

	private static long[][] mMul(long[][] a, long[][] b) {
		// TODO Auto-generated method stub
		long[][] ans = new long[6][6];
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				for (int k = 0; k < 6; k++) {
					ans[i][j] = (ans[i][j]+a[i][k] * b[k][j])%MOD;
				}
			}
		}
		return ans;
	}

}
