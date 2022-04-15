package 递归;

public class _0什么是递归 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f(10);
		int a = f1(10);//输出需要定义一个变量
		System.out.println(a);
		f2(1,10);
		//一种输出方式
		int res = f3(new int[] {1,2,3,4,5},0);
		System.out.println(res);
		//另一种
		System.out.println(reverse("abcd",3));
	}

	// 注意死循环
	static void f(int i) {
		if (i == 0)
			return;
		f(i - 1);// 调用自身
	}

	/**
	 * f1(n):求n的阶乘-->f1(n-1)求n-1的阶乘 
	 * 找重复：n*(n-1)的阶乘，求n-1的阶乘是原问题的重复（规模更小） --子问题 
	 * 找变化：变化的量应该作为参数 
	 * 找边界：出口
	 * */
	static int f1(int n) {
		if (n == 1)
			return 1;
		return n * f1(n - 1);
	}
	
	//打印i-j
	static void f2(int i,int j) {
		if(i>j)
			return;
		System.out.println(i);
		//我也不知道为啥，反正f2(i+1,j)后面不能输出
		f2(i+1,j);
	}
	
	/**
	 * 对arr的所有元素求和
	 */
	static int f3(int[] arr,int begin) {
		if(begin==arr.length-1) {
			return arr[begin];
		}
		/**不定义begin
		 * return arr[0]+f3(arr);
		 * arr无法变化
		 */
		return arr[begin]+f3(arr,begin+1);
	}
	
	/**
	 * 翻转字符串
	 * 与上一个类似
	 */
	static String reverse(String src,int end) {
		if(end==0) {
			//charAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length() - 1。
			return ""+src.charAt(0);
		}
		return src.charAt(end)+reverse(src,end-1);
	}
}
