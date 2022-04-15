package Case;

import java.util.Scanner;

public class _1ÉÏÂ¥Ìİ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while(true) {
			int b = sc.nextInt();
			int res = f(b);
			System.out.println(res);
		}
	}

	static int f(int a) {
		if(a==0||a==1) return 1;
		if(a==2) return 2;
		return f(a-1)+f(a-2)+f(a-3);
	}
}
