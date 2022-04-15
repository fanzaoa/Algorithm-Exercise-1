package _16;

public class B5_抽签 {

	private static int ans;

	private static void f(int[] a, int k, int n, String s) {
		// TODO Auto-generated method stub
		if(k==a.length) {
			if(n==0) {
				ans++;
				System.out.println(s);
			}
			return;
		}
		String s2=s;
		for(int i=0;i<=a[k];i++) {//某国派出的人数
			//填空
			f(a, k+1, n-i, s2);
			s2+=(char)(k+'A');
		}
	}
	
	public static void main(String[] args) {
		int[] a= {4,2,2,1,1,3};
		f(a,0,5,"");
		System.out.println(ans);
	}
}
