package �ݹ�;

public class _2���Լ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(6,4));
	}

	static int gcd(int n, int m) {
		if (m == 0)
			return n;
		return gcd(m, n % m);//����һ�κ�n=m(m����n),m=n%m
	}
}
