package �ݹ�;

//import java.util.Random;

public class _5���ֲ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������ʱ��
		long now = System.currentTimeMillis();
		System.out.println(binarySerach(new int[] {1,3,4,5,8}, 0, 4, 8));//�����������λ��
		//�������ʱ��
		System.out.println(System.currentTimeMillis()-now+"ms");
//		System.out.println(test(new int[] {1,3,4,5,8}, 0, 4, 8));
//		System.out.println(t(0));
	}
	/**
	 * 
	 * @param arr
	 * @param low arr[0]
	 * @param high arr[4]
	 * @param key Ŀ��Ԫ��
	 * @return
	 */

	static int binarySerach(int[]arr,int start,int end,int key) {
		if(start>end)
			return -1;
		//>>1����,<<1�˶�
		int mid = start+((end-start)>>1);//(end-start)>>1=(end-start)/2;��ֹ�������λҲ����Ч
		if(arr[mid]<key)
			return binarySerach(arr, mid+1, end, key);
		else if(arr[mid]>key)
			return binarySerach(arr, start, mid-1, key);
		else
			return mid;//key found
	}
//	static int t(int a) {
//		a=new Random().nextInt(10)+1;
//		return a;
//	}
//	static int test(int[] arr,int begin,int end,int key){
//		if(begin>end) return -1;
//		int mid = begin+(end-begin)/2;
//		if(arr[mid]>key)
//			return test(arr,begin,mid-1,key);
//		if(arr[mid]<key)
//			return test(arr,mid+1,end,key);
//		return mid;
//	}
	//whileѭ��
	public static int binarySearch(int[] arr, int start, int end, int hkey){
	    int result = -1;

	    while (start <= end){
	        int mid = start + (end - start)/2;    //��ֹ��λ
	        if (arr[mid] > hkey)
	            end = mid - 1;
	        else if (arr[mid] < hkey)
	            start = mid + 1;
	        else {
	            result = mid ;  
	            break;
	        }
	    }

	    return result;

	}
}
