package �ݹ�;

public class _1쳲��������� {
	/**
	 * ��һ��Ϊǰ����֮��
	 * 1 1 2 3 5 8 13 21
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(8));//���8��
	}

	static int fib(int n) {
		if(n==1||n==2)
			return 1;
		return fib(n-1)+fib(n-2);
	}
}
