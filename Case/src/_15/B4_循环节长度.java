package _15;

import java.util.Vector;

public class B4_ѭ���ڳ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(f(11, 13));
		System.out.println(f(7, 18));
	}

	public static int f(int n, int m) {
		n = n % m;
		Vector<Integer> v = new Vector<Integer>();
		for (;;) {//��Ϊ��ѭ��
			v.add(n);
			n *= 10;
			n = n % m;
			if (n == 0)
				return 0;
			if (v.indexOf(n) >= 0)
				// size()����������
				return v.size() - v.indexOf(n);// ���
		}
	}
}
