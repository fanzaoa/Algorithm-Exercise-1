package _13;

public class B2_马虎的算式_枚举 {
//ab*cde=adb*ce
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = 0;
		for (int a = 1; a < 10; a++) {
			for (int b = 1; b < 10; b++) {
				if (b != a)
					for (int c = 1; c < 10; c++) {
						if (c != a && c != b)
							for (int d = 1; d < 10; d++) {
								if (d != a && d != b && d != c)
									for (int e = 1; e < 10; e++) {
										if (e != a && e != b && e != c && e != d)
											if ((a * 10 + b) * (c * 100 + d * 10 + e) == (a * 100 + d * 10 + b)* (c * 10 + e)) {
												ans++;
												System.out.printf("(%d * 10 + %d) * (%d * 100 + %d * 10 + %d) == (%d * 100 + %d * 10 + %d)* (%d * 10 + %d)==%d\n",a,b,c,d,e,a,d,b,c,e,(a * 100 + d * 10 + b)* (c * 10 + e));
											}
									}
							}
					}
			}
		}
		System.out.println(ans);
	}
}
