package 快排_重划分_case;

import java.util.Arrays;

public class _最小可用id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] { 1, 4, 3, 6, 8 };
		System.out.println(find(a));
		System.out.println(find1(a));
		System.out.println(find2(a));
		System.out.println(find3(a, 0, a.length-1));
	}

//O(n^2) 暴力解法：从1开始依次探测每个自然数是否在数组中
	public static int find(int[] arr) {
		int i = 1;
		while (true) {
			if (indexOf(arr, i) == -1)//
				return i;
			i++;
		}
	}
//k与arr数组比较，都不等于时即得id
	public static int indexOf(int[] arr, int k) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == k)
				return i;
		}
		return -1;
	}

	// O(NlogN)
	public static int find1(int[] arr) {
		/**
		 * 打开eclipse，选中要查看的类、方法，
		 * 如下操作： 右键——References——Workspace 
		 * 或者使用快捷键：Ctrl+Shift+G
		 */
		// 对一个数组的所有元素进行排序，并且是按从小到大的顺序。
		Arrays.sort(arr);
		int i = 0;
		while (i < arr.length) {// 不在位的最小的自然数
			if (i + 1 != arr[i])//
				return i + 1;
			i++;
		}
		return i + 1;//arr[arr.length-1]内的元素没间隔，返回arr.length+1
	}
	/**
	 * 改进1：
	 * 新建长为n+1的数组helper，初始值全为false,扫描原数组中的元素，小于n则将helper[arr[i]]记录为true
	 * 最后再扫描helper,返回第一个为false的元素的下标，注：有点类似于计数排序 O(n)但是浪费空间
	 */
	public static int find2(int[] arr) {
		int n=arr.length;
		int[] helper=new int[n+1];
		for(int i=0;i<n;i++) {
			if(arr[i]<n+1)
				helper[arr[i]]=1;
		}
		for(int i=1;i<=n;i++) {
			if(helper[i]==0)
				return i;
		}
		return n+1;
	}
	public static int find3(int[] arr,int p,int r) {
		if(p>r)
			return p+1;
		int mid=p+((r-p)>>1);
		int q = _2乱序数组中第k小的数_超一半的数.quickSort(arr, p, r, mid-p+1);
		int z=mid+1;
		if(q==z) return find3(arr,mid+1,r);
		else return find3(arr, p, mid-1);
	}
}
