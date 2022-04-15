package _13;

public class B3_振兴中华 {
/**
 * 从我做起振
 * 我做起振兴
 * 做起振兴中
 * 起振兴中华
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = f(0, 0);
		System.out.println(res);
	}

	private static int f(int i, int j) {
		// TODO Auto-generated method stub
		if (i == 3 || j == 4)
			return 1;
		return f(i + 1, j) + f(i, j + 1);
	}

}
