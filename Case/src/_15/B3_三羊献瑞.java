package _15;

public class B3_�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int b = 2; b < 9; b++) {
			for (int d = 2; d < 9; d++) {
				if (d == b)
					continue;
				for (int g = 2; g < 9; g++) {
					if (g == b || g == d)
						continue;
					int c = b + 1;
					if (c == b || c == d || c == g)
						continue;
					if (c + g <= 10)
						continue;
					int sum = 9000 + b * 100 + c * 10 + d + 1000 + g * 10 + b;
					for (int i = 2; i < 9; i++) {
						if (i == b || i == d || i == g || i == c)
							continue;
						int f = 10000 + c * 100 + b * 10 + i;
						int l = 10000 + c * 100 + b * 10 + i;
						if (sum >= f && sum <= l) {
							System.out.printf("%d%d%d%d\n", 1, 0, g, b);
						}
					}
				}
			}
		}
	}

}
