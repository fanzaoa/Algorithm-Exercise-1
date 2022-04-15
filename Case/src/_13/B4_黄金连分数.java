package _13;

import java.math.BigDecimal;
import java.math.BigInteger;

//1 1 1/2 2/3 3/5 5/8 ...,斐波拉契
/**
 * 1.化为求斐波那契相邻两项的比值，到多少项？越多越精确，n/n+1项，n再往上增加，这个比值的小数点后101位是稳定的，也就是不变的
 * 2.double无法表示100位小数，BigInteger和BigDecimal
 * 
 * @author hp
 *
 */
public class B4_黄金连分数 {
	public static void main(String[] args) {
		BigInteger a = BigInteger.ONE;
		BigInteger b = BigInteger.ONE;
		for (int i = 3; i < 500; i++) {// 第三项开始
			BigInteger t = b;
			b = a.add(b);
			a = t;
		}
		@SuppressWarnings("deprecation")
		BigDecimal divide = new BigDecimal(a, 110).divide(new BigDecimal(b, 110), BigDecimal.ROUND_HALF_DOWN);// 110为指定长度，可变，需大于103
		System.out.println(divide.toPlainString().substring(0, 103));// 包含0.
		test();
	}

	public static void test() {
		BigInteger i = BigInteger.ONE;
		BigInteger j = BigInteger.ONE;
		for (int m = 3; m < 300; m++) {
			BigInteger t = j;
			j = i.add(j);
			i = t;
		}
		@SuppressWarnings("deprecation")
		BigDecimal divide = new BigDecimal(i, 110).divide(new BigDecimal(j, 110), BigDecimal.ROUND_HALF_DOWN);
		System.out.println(divide.toPlainString().substring(0, 103));
	}
}
