package 快排_重划分_case;

import java.util.Arrays;

public class _1奇左偶右 {
	public static void main(String[] args) {
		int[] arr=getRandomarr(10, 0, 20);
		System.out.println(Arrays.toString(arr));
		sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static void sort(int[] arr,int q,int r) {
		if(q<r) {
			int p=jo(arr,q,r);
			sort(arr,q,p-1);
			sort(arr, p+1, r);
		}
	}
	public static int jo(int[] arr,int q,int r) {
		int left=q+1;
		int right=r;
		while(left<=right) {
			while(left<=right&&arr[left]%2==1) left++;
			while(left<=right&&arr[right]%2==0) right--;
			if(left<right)
				swap(arr, left, right);
		}
		swap(arr, q, right);
		return right;
	}
	public static void swap(int[] arr,int i,int j) {
		int tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
	}
	public static int[] getRandomarr(int length,int min,int max) {
		int[] arr=new int[length];
		for(int i=0;i<length;i++) {
			arr[i]=(int)(Math.random()*(max+1-min)-min);
		}
		return arr;
	}
}
