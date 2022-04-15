package �ݹ�;
/**
 * ð�ݣ�����
 * ѡ���������С
 * ���룺Ų������
 * 
 * ϣ�������ǲ��������һ�֡�
 * Ҳ����С����������ֱ�Ӳ��������㷨��һ�ָ���Ч�ĸĽ��汾��ϣ�������Ƿ��ȶ������㷨
 * ˼·��������8 7 6 5 4 3 2 1 0
 * 		ȷ��һ���������У���4��length/2��2 1���Ӵ�Сʹ������
 * 		ʹ�õ�һ�������������л���Ϊ���ɸ������У��±����Ϊ0-4-8��1-5��2-6��3-7
 * 		����Ϊ������ʹ��ֱ�Ӳ�������
 * 		ʹ�õڶ��������������л���Ϊ���ɸ������У�0-2-4-6-8������1-3-5-7��
 * 		һ�ζ�������ʹ��ֱ�Ӳ������򷨣�
 * 		ʹ�õ���������1�����������о���Ԫ���У�0-1-2-3-4-5-6-7-8����ʹ��ֱ�Ӳ��뷨
 * 		�������
 * ʱ�临�Ӷȣ���̫ȷ����O��nlogn)~O(n^2)֮��
 * �ռ临�Ӷȣ�O(1)
 * ԭַ����
 * �ȶ��ԣ�������ͬ��Ԫ�ؿ��ܻᱻ��������ͬ�����е�����������ȶ������޷���֤��--���ȶ�
 */
import java.util.Arrays;

public class _3���������ϣ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {9,9,6,7,5,4,2,2,1};
		shellSart(arr);
		insertSort(arr, 3);
		System.out.println(Arrays.toString(arr));
	}

	static void insertSort(int[]arr,int k) {
		if(k==0) {
			return;
		}
		//��ǰk-1��Ԫ������
		insertSort(arr, k-1);
		//��λ��k��Ԫ�ز��뵽ǰ��Ĳ���
		int x = arr[k];
		int index = k-1;
		while(x<arr[index]) {
			arr[index+1] = arr[index];
			index--;
		}
		arr[index]=x;
	}
	//ϣ�����򣨱Ȳ���������죩
	static void shellSart(int[] arr) {
		//���ϵ���С
		for(int interval=arr.length/2;interval>0;interval=interval/2) {
			//����Ϊ1�Ĳ�������
			for(int i=interval;i<arr.length;i++) {//ԭ����intervalΪ1
				int target=arr[i];
				int j=i-interval;
				while(j>-1&&target<arr[j]) {
					arr[j+interval]=arr[j];
					j-=interval;
				}
				arr[j+interval]=target;
			}
		}
	}
	
	static void test(int[] arr,int k) {
		if(k==0)
			return;
		test(arr,k-1);
		int x=arr[k];
		int y=k-1;
		while(x<arr[y]) {
			arr[y+1]=arr[y];
			y--;
		}
		arr[y]=x;
	}
}
