package _13;

import java.math.BigDecimal;
import java.math.BigInteger;

//1 1 1/2 2/3 3/5 5/8 ...,쳲�����
/**
 * 1.��Ϊ��쳲�������������ı�ֵ���������Խ��Խ��ȷ��n/n+1�n���������ӣ������ֵ��С�����101λ���ȶ��ģ�Ҳ���ǲ����
 * 2.double�޷���ʾ100λС����BigInteger��BigDecimal
 * 
 * @author hp
 *
 */
public class B4_�ƽ������� {
	public static void main(String[] args) {
		BigInteger a = BigInteger.ONE;
		BigInteger b = BigInteger.ONE;
		for (int i = 3; i < 500; i++) {// �����ʼ
			BigInteger t = b;
			b = a.add(b);
			a = t;
		}
		@SuppressWarnings("deprecation")
		BigDecimal divide = new BigDecimal(a, 110).divide(new BigDecimal(b, 110), BigDecimal.ROUND_HALF_DOWN);// 110Ϊָ�����ȣ��ɱ䣬�����103
		System.out.println(divide.toPlainString().substring(0, 103));// ����0.
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
