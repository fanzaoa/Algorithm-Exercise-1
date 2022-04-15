package test;

import java.util.Scanner;

public class _6 {
	static int ans;
	private static int N;
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		int[] arr = {1,2,3,4,5,6,7,8,9};
		f(arr,0);
		System.out.println(ans);
	}
	private static void f(int[] arr, int i) {
		// TODO Auto-generated method stub
		if(i==8) {
			check(arr);
			return;
		}
		for(int j=i;j<arr.length;j++) {
			int t = arr[j];
			arr[j] = arr[i];
			arr[i] = t;
			f(arr,i+1);
			t = arr[j];
			arr[j] = arr[i];
			arr[i] = t;
		}
	}
	private static void check(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=1;i<=7;i++) {
			int num1=Int(arr,0,i);
			if(num1>=N) continue;
			for(int j=1;j<=8-i;j++) {
				int num2=Int(arr,i,j);
				int num3=Int(arr,i+j,9-i-j);
				if(num2%num3==0&&N==num1+num2/num3) {
					ans++;
				}
			}
		}
	}
	private static int Int(int[] arr, int i, int i2) {
		// TODO Auto-generated method stub
		int t=1;
		int ans=0;
		for(int j = i+i2-1;j>=i;j--) {
			ans+=arr[j]*t;
			t*=10;
		}
		return ans;
	}
}
