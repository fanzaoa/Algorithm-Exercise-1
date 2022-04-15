package 快排_重划分_case;

public class _水王 {

	public static void main(String[] args) {
		int[] a=new int[] {1,2,3,4,2,2};
		sort(a);
	}
	//不同的数，进行消除，O(N)
	public static void sort(int[] arr) {
		//候选数，先定位第一个元素
		int condit = arr[0];
		//出现的次数
		int iTime=1;
		//扫描数组
		for(int i=1;i<arr.length;i++) {
			//两两消减为0，应该把现在的元素作为候选值
			if(iTime==0) {
				condit=arr[i];
				iTime=1;
				continue;
			}
			//遇到和候选值相同的，次数加1
			if(arr[i]==condit) 
				iTime++;
			else
				iTime--;
		}
		System.out.println(condit);
	}
}
