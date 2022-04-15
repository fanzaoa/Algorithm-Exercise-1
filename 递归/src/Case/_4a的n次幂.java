package Case;

public class _4aµÄn´ÎÃÝ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(3,2));
		System.out.println(pow1(3,2));
	}
//O(n)
	static int pow(int a,int n) {
		if(n==1)
			return a;
		return a*pow(a,n-1);
	}
	static int pow1(int a,int n) {
		int res = 1;
		for(int i=0;i<n;i++) {
			res*=a;
		}
		return res;
	}
}
