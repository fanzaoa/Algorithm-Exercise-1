package _16;
import static java.lang.Math.*;
public class B6_方格填数 {

	private static int ans;
	static int[] a= {0,1,2,3,4,5,6,7,8,9};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(a,0);
		System.out.println(ans);
	}

	private static void f(int[] a, int k) {
		// TODO Auto-generated method stub
		if(k==a.length) {
			boolean b=check();
			if(b) {
				ans++;
				return;
			}
		}
		for(int i=k;i<a.length;i++) {
			int t=a[k];
			a[k]=a[i];
			a[i]=t;
			f(a,k+1);
			t=a[k];
			a[k]=a[i];
			a[i]=t;
		}
	}

	static boolean check() {
		// TODO Auto-generated method stub
		//abs() 返回参数的绝对值
		if(abs(a[0]-a[1])==1||
				abs(a[0]-a[3])==1||
				abs(a[0]-a[4])==1||
				abs(a[0]-a[5])==1||
				
				abs(a[1]-a[2])==1||
				abs(a[1]-a[5])==1||
				abs(a[1]-a[4])==1||
				abs(a[1]-a[6])==1||
				
				abs(a[2]-a[6])==1||
				abs(a[2]-a[5])==1||
				
				abs(a[3]-a[4])==1||
				abs(a[3]-a[7])==1||
				abs(a[3]-a[8])==1||
				
				abs(a[4]-a[5])==1||
				abs(a[4]-a[8])==1||
				abs(a[4]-a[7])==1||
				abs(a[4]-a[9])==1||
				
				abs(a[5]-a[6])==1||
				abs(a[5]-a[9])==1||
				abs(a[5]-a[8])==1||
				
				abs(a[6]-a[9])==1||
				abs(a[7]-a[8])==1||
				abs(a[8]-a[9])==1)
			return false;
		return true;
	}

}
