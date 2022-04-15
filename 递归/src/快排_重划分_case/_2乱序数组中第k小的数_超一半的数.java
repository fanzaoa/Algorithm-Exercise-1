package ����_�ػ���_case;

import java.util.Arrays;

public class _2���������е�kС����_��һ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,3,6,1,2};
		int[] arr1 = {2,4,5,2,2,2,2,6};
		int k = quickSort(arr, 0, arr.length-1,4);
		System.out.println(k);
		//�������Ǹ����ֳ�����һ��
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
			int q=partition(A,p,r);//��Ԫ���±�
			int qK = q-p+1;//��Ԫ�ǵڼ���Ԫ��
			if(qK==k) return A[q];
			else if(qK>k) return quickSort(A, p, q-1,k);
			else return quickSort(A, q+1, r,k-qK);//���Ϊq+1,��k��Ϊk-qK
	}
	 private static int partition(int[] A, int p, int r) {
		// TODO Auto-generated method stub
		 int pivot=A[p];
		 int left=p+1;
		 int right=r;
		 while(left<=right) {
			 //left��ͣ�����ߣ�ֱ������������Ԫ��Ԫ��
			 while(left<=right&&A[left]<=pivot) left++;//ѭ���˳�ʱ��leftһ����ָ���һ��������Ԫ��λ��
			 while(left<=right&&A[right]>pivot) right--;//ѭ���˳�ʱ��rightһ����ָ�����һ��С�ڵ�����Ԫ��λ��
			 if(left<right)//�߽����⣬if A[right]<=pivot,��left�����
				 /**
				  * 
				  */
				 swap(A,left,right);
		 }
		 /**
		  * rightλ��������leftǰһλ
		  * while�˳�ʱ�����߽�����rightָ��������һ��С�ڵ�����Ԫ��λ��
		  */
		 swap(A,p,right);
		return right;
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
