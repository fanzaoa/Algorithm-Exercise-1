package ����_�ػ���;

import java.util.Arrays;

public class _3��ָ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=getRandomArr(10, 0, 10);
		print(arr);
		quickSort(arr, 0, arr.length-1);
		print(arr);
	}
	public static void quickSort(int[] A,int p,int r) {
		if(p<r) {
			int q=partition(A,p,r);
			quickSort(A, p, q-1);
			quickSort(A, q+1, r);
		}
	}
	private static int partition(int[] A, int p, int r) {
		// TODO Auto-generated method stub
		int pivot=A[p];
		int left=p+1;
		int mid=p+1;
		int right=r;
		while(left<=right) {
			if(A[left]<pivot) { 
				swap(A, left, mid);
				left++;mid++;
			}
			else if(A[left]==pivot) {
				left++;
			}
			else {
				swap(A, left, right);
				right--;
			}
		}
		int b = mid-1;
		swap(A, p, b);
		return b;
	}
	/**
	   * ��ȡָ����Χָ���������������ɵ�����
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
	   * ��������ԭַ����Ԫ��
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
