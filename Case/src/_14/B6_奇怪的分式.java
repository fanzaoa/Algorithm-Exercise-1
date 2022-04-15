package _14;

//1/4*8/5=18/45，分子分母为1-9，分子分母不相等
public class B6_奇怪的分式 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans=0;
		for (int a = 1; a < 10; a++) {
			for (int b = 1; b < 10; b++) {
				if (b == a)
					continue;
				for (int c = 1; c < 10; c++) {
					for (int d = 1; d < 10; d++) {
						if (d == c)
							continue;
						int num1 = gcd(a * c, b * d);
						int num2 = gcd(a * 10 + c, b * 10 + d);
						if(a*c/num1==(a*10+c)/num2&&b*d/num1==(b*10+d)/num2)
							ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}

	private static int gcd(int i, int j) {
		// TODO Auto-generated method stub
		if (j == 0)
			return i;
		return gcd(j, i % j);
	}

}
