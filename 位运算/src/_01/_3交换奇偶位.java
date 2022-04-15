package _01;

import java.util.*;

public class _3½»»»ÆæÅ¼Î» {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int ou = b & 0xaaaaaaaa;
		int ji = b & 0x55555555;
		b = (ou >> 1) ^ (ji << 1);

		// import org.ossertj.core.api.Assertions
//		int a = 9;
//		int b = m(150);
		System.out.println(Integer.toString(150, 2));
		System.out.println(Integer.toString(b, 2));
		System.out.println(b);
	}
//	
//	private static int m(int i) {
//		int ou = i&0xaaaaaaaa;
//		int ji = i&0x55555555;
//		return (ou>>1)^(ji<<1);
//	}

}
