package test;

import java.util.Arrays;

public class _2 {

	public static void main(String[] args) {
		int[] arr=getRandomArr(5, 0, 10);
		System.out.println(Arrays.toString(arr));
		t(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	static void t(int[] arr,int left,int right) {
		if(left<right) {
			int mid=left+((right-left)>>1);
			t(arr,left,mid);
			t(arr,mid+1,right);
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
