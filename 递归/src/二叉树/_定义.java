package 二叉树;

public class _定义 {

	public static void main(String[] args) {
		int[] arr = { 78, 56, 34, 43, 4, 1, 15, 2, 23 };
		preOrder(arr, 0);
		System.out.println();
		inOrder(arr, 0);
		System.out.println();
		outOrder(arr, 0);
	}

	//先序遍历
	public static void preOrder(int[] arr, int i) {
		if (i >= arr.length)
			return;
		System.out.print(arr[i] + " ");// 根
		preOrder(arr, i * 2 + 1);// 左
		preOrder(arr, i * 2 + 2);// 右
	}

	// 中序遍历
	public static void inOrder(int[] arr, int i) {
		if (i >= arr.length)
			return;
		inOrder(arr, i * 2 + 1);
		System.out.print(arr[i] + " ");
		inOrder(arr, i * 2 + 2);
	}

	// 后序遍历
	public static void outOrder(int[] arr, int i) {
		if (i >= arr.length)
			return;
		outOrder(arr, i * 2 + 1);
		outOrder(arr, i * 2 + 2);
		System.out.print(arr[i] + " ");
	}
}
