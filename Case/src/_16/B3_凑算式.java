package _16;

public class B3_´ÕËãÊ½ {

	static int a[]= {1,2,3,4,5,6,7,8,9};
	static int ans;
	static boolean check() {
		int x=a[3]*100+a[4]*10+a[5];
		int y=a[6]*100+a[7]*10+a[8];
		if((a[1]*y+a[2]*x)%(y*a[2])==0&&a[0]+(a[1]*y+a[2]*x)/(y*a[2])==10)
			return true;
		return false;
	}
	static void f(int k) {
		if(k==9) {
			if(check())
				ans++;
		}
		for(int i=k;i<9;i++) {
			int t=a[k];
			a[k]=a[i];
			a[i]=t;
			f(k+1);
			t=a[k];
			a[k]=a[i];
			a[i]=t;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(0);
		System.out.println(ans);
	}

}
