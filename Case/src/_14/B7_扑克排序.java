package _14;

import java.util.HashSet;
import java.util.Set;

public class B7_扑克排序 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a = { 'A', 'A', '2', '2', '3', '3', '4', '4' };
		f(a, 0);
		/*去重*/
		for (String s : set) {
			System.out.println(s);
		}//
	}

	static Set<String> set = new HashSet<String>();//去重

	private static void f(char[] a, int k) {
		// TODO Auto-generated method stub
		if (k == a.length) {
			String s = new String(a);
			if (check(s))
//				System.out.println(s);
				set.add(s);//去重
		}
		for (int i = k; i < a.length; i++) {
			char t = a[i];
			a[i] = a[k];
			a[k] = t;

			f(a, k + 1);

			t = a[i];
			a[i] = a[k];
			a[k] = t;
		}
	}

	private static boolean check(String s) {
		// TODO Auto-generated method stub
		if (s.lastIndexOf('A') - s.indexOf('A') == 2 && s.lastIndexOf('2') - s.indexOf('2') == 3
				&& s.lastIndexOf('3') - s.indexOf('3') == 4 && s.lastIndexOf('4') - s.indexOf('4') == 5)
			return true;
		return false;
	}

}
