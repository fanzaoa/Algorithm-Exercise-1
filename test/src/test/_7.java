package test;

public class _7 {
	public static void main(String[] args) {
		char[] arr = { 'A', 'A', '2', '2', '3', '3', '4', '4' };
		f(arr, 0);
	}

	private static void f(char[] arr, int k) {
		// TODO Auto-generated method stub
		if (k == arr.length) {
			String s=new String(arr);
			if(check(s)) {
				System.out.println(s);
			}
		}
		for (int i = k; i < arr.length; i++) {
			char t = arr[i];
			arr[i] = arr[k];
			arr[k] = t;
			f(arr, k + 1);
			t = arr[i];
			arr[i] = arr[k];
			arr[k] = t;
		}
	}

	public static boolean check(String s) {
		if (s.lastIndexOf('A') - s.indexOf('A') == 2 && s.lastIndexOf('2') - s.indexOf('2') == 3
				&& s.lastIndexOf('3') - s.indexOf('3') == 4 && s.lastIndexOf('4') - s.indexOf('4') == 5)
			return true;
		return false;
	}
}
