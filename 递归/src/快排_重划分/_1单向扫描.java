package 快排_重划分;

import java.util.Arrays;
//import java.util.Random;

public class _1单向扫描 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=getRandomArr(10, 1, 20);
		print(arr);
		quickSort(arr, 0, arr.length-1);
		print(arr);
	}
	 
	public static void quickSort(int[] A,int p,int r) {
		if(p<r) {
			int q=partition(A,p,r);
			//可能主元不能排
			quickSort(A, p, q-1);
			quickSort(A, q+1, r);
		}
	}
	static int partition(int[] A,int p,int r) {
		int pivot=A[p];//主元
		int sp=p+1;//扫描指针
		int bigger=r;//右侧指针
		while(sp<=bigger) {
			if(A[sp]<=pivot)//扫描元素小于主元，左指针向右移
				sp++;
			else {
				/**
				 * 
				 */
				swap(A,sp,bigger);//扫描元素大于主元，二指针的元素交换，右指针左移
				bigger--;
			}
		}
		swap(A,p,bigger);
		return bigger;
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
	    int[] arr = new int[length];
	    for (int i = 0; i < length; i++) {
	      arr[i] = (int) (Math.random() * (max + 1 - min) + min);
	    }
//	    for(int j=0;j<length;j++) {
//	    	arr[j]=new Random().nextInt(30)+1;
//	    }
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
		    int tmp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = tmp;
	  }
	  public static void print(int[] arr) {
		    System.out.println(Arrays.toString(arr));
	  }
}
