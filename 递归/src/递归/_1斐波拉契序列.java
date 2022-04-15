package 递归;

public class _1斐波拉契序列 {
	/**
	 * 后一项为前两项之和
	 * 1 1 2 3 5 8 13 21
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(8));//求第8项
	}

	static int fib(int n) {
		if(n==1||n==2)
			return 1;
		return fib(n-1)+fib(n-2);
	}
}
