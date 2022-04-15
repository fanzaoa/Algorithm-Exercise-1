package _15;

import java.util.Scanner;

public class B8_ÒûÁÏ»»¹º {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		while (n >= 3) {
			n -= 2;
			ans += 3;
		}
		ans+=n;
		System.out.println(ans);
	}
}
