package 递归;
/**
 * 冒泡：交换
 * 选择：求最大最小
 * 插入：挪动数组
 * 
 * 希尔排序是插入排序的一种。
 * 也称缩小增量排序，是直接插入排序算法的一种更高效的改进版本。希尔排序是非稳定排序算法
 * 思路：如序列8 7 6 5 4 3 2 1 0
 * 		确定一个增量序列，如4（length/2）2 1，从大到小使用增量
 * 		使用第一个增量，将序列划分为若干个子序列，下标组合为0-4-8，1-5，2-6，3-7
 * 		依次为子序列使用直接插入排序法
 * 		使用第二个增量，将序列划分为若干个子序列（0-2-4-6-8），（1-3-5-7）
 * 		一次对子序列使用直接插入排序法：
 * 		使用第三个增量1，这是子序列就是元序列（0-1-2-3-4-5-6-7-8），使用直接插入法
 * 		完成排序
 * 时间复杂度：不太确定在O（nlogn)~O(n^2)之间
 * 空间复杂度：O(1)
 * 原址排序
 * 稳定性：由于相同的元素可能会被划分至不同子序列单独排序，因此稳定性是无法保证的--不稳定
 */
import java.util.Arrays;

public class _3插入排序和希尔排序 {

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
		//对前k-1个元素排序
		insertSort(arr, k-1);
		//把位置k的元素插入到前面的部分
		int x = arr[k];
		int index = k-1;
		while(x<arr[index]) {
			arr[index+1] = arr[index];
			index--;
		}
		arr[index]=x;
	}
	//希尔排序（比插入排序更快）
	static void shellSart(int[] arr) {
		//不断地缩小
		for(int interval=arr.length/2;interval>0;interval=interval/2) {
			//增量为1的插入排序
			for(int i=interval;i<arr.length;i++) {//原插入interval为1
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
