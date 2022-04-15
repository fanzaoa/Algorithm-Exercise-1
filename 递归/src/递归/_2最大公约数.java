package 递归;

public class _2最大公约数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(6,4));
	}

	static int gcd(int n, int m) {
		if (m == 0)
			return n;
		return gcd(m, n % m);//运算一次后n=m(m赋给n),m=n%m
	}
}
