package _15;

//1^3=1
//8^3=512   5+1+2=8
public class B2_立方变自身 {
	private static int ans=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 99; i++) {//i很大时，立方后不可能等于自身
			int i1 = i * i * i;
			int sum = sum(i1);
			if (sum == i) {
				System.out.println(i+" "+i1);
				ans++;
			}
		}
		System.out.println(ans);
	}

	private static int sum(int x) {
		// TODO Auto-generated method stub
		String s = String.valueOf(x);
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum += s.charAt(i) - '0';
		}
		return sum;
	}

}
