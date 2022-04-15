package 快排_重划分_case;

import java.util.Arrays;

public class _2乱序数组中第k小的数_超一半的数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,3,6,1,2};
		int[] arr1 = {2,4,5,2,2,2,2,6};
		int k = quickSort(arr, 0, arr.length-1,4);
		System.out.println(k);
		//数组中那个数字超过了一半
		sort(arr1, 0, arr1.length-1);
		System.out.println(arr1[arr1.length/2]);
	}
	public static void sort(int[] a,int p,int r) {
		if(p<r) {
		int q = partition(a, p, r);
		sort(a,p,q-1);
		sort(a,q+1,r);
		}
	}
	public static int quickSort(int[] A,int p,int r,int k) {
			int q=partition(A,p,r);//主元的下标
			int qK = q-p+1;//主元是第几个元素
			if(qK==k) return A[q];
			else if(qK>k) return quickSort(A, p, q-1,k);
			else return quickSort(A, q+1, r,k-qK);//起点为q+1,故k变为k-qK
	}
	 private static int partition(int[] A, int p, int r) {
		// TODO Auto-generated method stub
		 int pivot=A[p];
		 int left=p+1;
		 int right=r;
		 while(left<=right) {
			 //left不停往右走，直到遇到大于主元的元素
			 while(left<=right&&A[left]<=pivot) left++;//循环退出时，left一定是指向第一个大于主元的位置
			 while(left<=right&&A[right]>pivot) right--;//循环退出时，right一定是指向最后一个小于等于主元的位置
			 if(left<right)//边界问题，if A[right]<=pivot,则left会出界
				 /**
				  * 
				  */
				 swap(A,left,right);
		 }
		 /**
		  * right位置总是在left前一位
		  * while退出时，两者交错，且right指向的是最后一个小于等于主元的位置
		  */
		 swap(A,p,right);
		return right;
	}
	/**
	   * 获取指定范围指定个数的随机数组成的数组
	   *
	   * @param length
	   * @param min
	   * @param max
	   * @return
	   */
	  public static int[] getRandomArr(int length, int min, int max) {
		  int arr[] = new int[length];
		  for(int i=0;i<length;i++) {
			  arr[i]=(int)(Math.random()*(max+1-min)+min);
		  }
		  return arr;
	  }
	  /**
	   * 在数组内原址交换元素
	   *
	   * @param arr
	   * @param i
	   * @param j
	   */
	  public static void swap(int[] arr, int i, int j) {
		  int tem=arr[i];
		  arr[i]=arr[j];
		  arr[j]=tem;
	  }
	  public static void print(int[] arr) {
		  System.out.println(Arrays.toString(arr));
	  }
}
