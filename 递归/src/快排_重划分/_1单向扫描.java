package ����_�ػ���;

import java.util.Arrays;
//import java.util.Random;

public class _1����ɨ�� {

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
			//������Ԫ������
			quickSort(A, p, q-1);
			quickSort(A, q+1, r);
		}
	}
	static int partition(int[] A,int p,int r) {
		int pivot=A[p];//��Ԫ
		int sp=p+1;//ɨ��ָ��
		int bigger=r;//�Ҳ�ָ��
		while(sp<=bigger) {
			if(A[sp]<=pivot)//ɨ��Ԫ��С����Ԫ����ָ��������
				sp++;
			else {
				/**
				 * 
				 */
				swap(A,sp,bigger);//ɨ��Ԫ�ش�����Ԫ����ָ���Ԫ�ؽ�������ָ������
				bigger--;
			}
		}
		swap(A,p,bigger);
		return bigger;
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
	   * ��������ԭַ����Ԫ��
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
