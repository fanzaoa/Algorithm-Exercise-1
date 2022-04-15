package ����_�غϲ�;

import java.util.Arrays;

public class �鲢���� {

	private static int[] helper;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = getRandomArr(10, 0, 20);
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void mergeSort(int[] A,int p,int r) {
		if(p<r) {
			int mid = p+((r-p)>>1);
			mergeSort(A, p, mid);//�������
			mergeSort(A, mid+1, r);//�Ҳ�����
			merge(A,p,mid,r);
		}
	}
	public static void sort(int[] arr) {
		helper = new int[arr.length];
		mergeSort(arr, 0, arr.length-1);
	}
	private static void merge(int[] A, int p, int mid, int r) {
		// TODO Auto-generated method stub
		/**
		 * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		 * src:Դ����;
		 * srcPos:Դ����Ҫ���Ƶ���ʼλ��;
		 * dest:Ŀ������;
		 * destPos:Ŀ��������õ���ʼλ��;
		 * length:���Ƶĳ���.
		 */
		//�����������ռ����ͬλ��
		System.arraycopy(A, p, helper, p, r - p + 1);
		int left = p;
		int right = mid+1;
		int current = p;//ԭ�����ָ�룬ָ����������ݵ�λ��
		while(left<=mid&&right<=r) {
			if(helper[left]<=helper[right]) {
				A[current] = helper[left];
				current++;
				left++;
			}else {
				A[current] = helper[right];
				current++;
				right++;
			}
		}
		while(left<=mid) {
			A[current] = helper[left];
			current++;
			left++;
		}
	}
	 public static int[] getRandomArr(int length, int min, int max) {
		    int[] arr = new int[length];
		    for (int i = 0; i < length; i++) {
		      arr[i] = (int) (Math.random() * (max + 1 - min) + min);
		    }
//		    for(int j=0;j<length;j++) {
//		    	arr[j]=new Random().nextInt(30)+1;
//		    }
		    return arr;
		  }
}
